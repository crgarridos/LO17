grammar tal_sql;

SELECT : 'vouloir'
;

COUNT:	'combien' | 'nombre'	
;
ARTICLE : 'article'
;
TITRE :  'titre'
;
RUBRIQUE : 'rubrique'
;

PAGE : 'page'
;

AND 	:	'et' | ','
;

OR	:	'ou'
;

POINT : '.' | '?'
;

MOT : 'mot' | 'contenir' | 'parler'
;

JOUR :('0'..'9')('0'..'9')
;

MOIS: 'janvier' | 'février' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'août' | 'septembre' | 'octobre' | 'novembre' | 'décembre'
;

ANNEE	:	('0'..'9')('0'..'9')('0'..'9')('0'..'9')
;


FULLDATE_DELIMITER:	('-')
	;

ENTRE	:	'entre'
;

WS  : (' ' |'\t' | '\r' | 'je' | 'qui' | 'moi' | 'dont' | 't-il' | 'de' | 'des' |  'du' | 'en' | 'quel' | 'quels' | 'quelles' | 'le' | 'la' ) {skip();} | '\n' 
;

fragment
CHAR
   : 'A'..'Z' | 'a'..'z'
   | '\u00C0'..'\u00D6'
   | '\u00D8'..'\u00F6'
   | '\u00F8'..'\u02FF'
   | '\u0370'..'\u037D'
   | '\u037F'..'\u1FFF'
   | '\u200C'..'\u200D'
   | '\u2070'..'\u218F'
   | '\u2C00'..'\u2FEF'
   | '\u3001'..'\uD7FF'
   | '\uF900'..'\uFDCF'
   | '\uFDF0'..'\uFFFD'
   ;

VAR 	:CHAR CHAR+
;

listerequetes returns [String sql = ""]
	@init	{Arbre lr_arbre;}: 
		r = requete (|POINT)
			{
				lr_arbre = $r.req_arbre;
				sql = lr_arbre.sortArbre();
			}
;

requete returns [Arbre req_arbre = new Arbre("")]
	@init {
		Arbre ps_arbre, dt_arbre, pdate_arbre, pdate_arbre2, pdate_arbre3;
		req_arbre.ajouteFils(new Arbre("","select distinct"));
	} : 
		(| SELECT 
			{
				
			} )
		(| COUNT 
		{
			req_arbre.ajouteFils(new Arbre("","count"));
		} )
		(ARTICLE
			{
				req_arbre.ajouteFils(new Arbre("","t.fichier"));
			}
		 | PAGE
			{
				req_arbre.ajouteFils(new Arbre("","t.numero"));
			})
		(|(TITRE & (MOT)+ {
				req_arbre.ajouteFils(new Arbre("","from titre t"));
			}
		|(MOT)+
			{
				req_arbre.ajouteFils(new Arbre("","from titretexte t"));
			})
			
		ps = params 
			{
				req_arbre.ajouteFils(new Arbre("","where"));
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			})
			
		(|pdate = date
			{
				req_arbre.ajouteFils(new Arbre("","from date t WHERE"));
				pdate_arbre = $pdate.date_arbre;
				req_arbre.ajouteFils(pdate_arbre);
			}
		|(ENTRE & pdate11 = date & AND
			{
				req_arbre.ajouteFils(new Arbre("","from date t WHERE"));
				pdate_arbre2 = $pdate11.date_arbre;
				req_arbre.ajouteFils(pdate_arbre2);
			}
		pdate12 = date
			{				
				req_arbre.ajouteFils(new Arbre("","and-between"));
				pdate_arbre3 = $pdate12.date_arbre;
				req_arbre.ajouteFils(pdate_arbre3);
			}
			))
;

date returns [Arbre date_arbre = new Arbre("")] 
@init {
		Arbre fulldate_sub_arbre;
	} : 
		(fulldate_a = fulldate 
			{
				fulldate_sub_arbre = $fulldate_a.fulldate_arbre;
				date_arbre.ajouteFils(fulldate_sub_arbre);
			}
			)
		| d =ANNEE
			{
				date_arbre.ajouteFils(new Arbre("annee = ", "'"+d.getText()+"'"));
			}
		| c = MOIS
			{
				date_arbre.ajouteFils(new Arbre("mois = ", "'"+c.getText()+"'"));
			}
		|( c = MOIS
			{
				date_arbre.ajouteFils(new Arbre("mois = ", "'"+c.getText()+"'"));
			}
		 d =ANNEE
			{
				date_arbre.ajouteFils(new Arbre("AND annee = ", "'"+d.getText()+"'"));
			})
		|(b = JOUR 
			{
				date_arbre.ajouteFils(new Arbre("jour = ",  "'"+b.getText()+"'"));
			} 
		c = MOIS
			{
				date_arbre.ajouteFils(new Arbre("AND mois = ", "'"+c.getText()+"'"));
			}
		d =ANNEE
			{
				date_arbre.ajouteFils(new Arbre("AND annee = ", "'"+d.getText()+"'"));
			})
;

fulldate returns [Arbre fulldate_arbre = new Arbre("")] :
		b2 = JOUR & FULLDATE_DELIMITER
			{
				fulldate_arbre.ajouteFils(new Arbre("jour = ",  b2.getText()));
			} 
		c2 = JOUR & FULLDATE_DELIMITER
			{
				fulldate_arbre.ajouteFils(new Arbre("AND mois = ", c2.getText()));
			}
		d2 = ANNEE
			{
				fulldate_arbre.ajouteFils(new Arbre("AND annee = ", d2.getText()));
			}
;

params returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre, par3_arbre;} : 
		par1 = param 
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		(par2 = conj 
			{
				par2_arbre = $par2.conj_arbre;
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		 par3 = param
			{
				par3_arbre = $par3.lepar_arbre;
				les_pars_arbre.ajouteFils(par3_arbre);
			}
		)*
;

conj returns [Arbre conj_arbre = new Arbre("")]
	: 
		(AND
			{
				conj_arbre.ajouteFils(new Arbre("", "AND"));
			}
		|OR
			{
				conj_arbre.ajouteFils(new Arbre("", "OR"));
			})
;

param returns [Arbre lepar_arbre = new Arbre("")] :
	a = VAR
		{ lepar_arbre.ajouteFils(new Arbre("mot LIKE", "'"+a.getText()+"\%'"));}
;

