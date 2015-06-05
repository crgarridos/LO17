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

DATE	:	JOUR ('/') ('0'..'9')('0'..'9') ('/') ANNEE
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
		Arbre ps_arbre, dt_arbre;
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
				req_arbre.ajouteFils(new Arbre("","fichier"));
			}
		 | PAGE
			{
				req_arbre.ajouteFils(new Arbre("","numero"));
			})
		(TITRE & (MOT)+ {
				req_arbre.ajouteFils(new Arbre("","from titre"));
			}
		|(MOT)+
			{
				req_arbre.ajouteFils(new Arbre("","from titretexte"));
			})
			
		ps = params 
			{
				req_arbre.ajouteFils(new Arbre("","where"));
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
			
		(|date
			{
				req_arbre.ajouteFils(new Arbre("","from date"));
			}
		|(ENTRE & date & AND & date
			{
				req_arbre.ajouteFils(new Arbre("","from date"));
			}))
;

date returns [Arbre date_arbre = new Arbre("")] :
		(DATE 
			{
				date_arbre.ajouteFils(new Arbre("","date"));
			})
		|(JOUR 
			{
				date_arbre.ajouteFils(new Arbre("","jour"));
			} 
		| MOIS
			{
				date_arbre.ajouteFils(new Arbre("","mois"));
			}
		| ANNEE
			{
				date_arbre.ajouteFils(new Arbre("","annee"));
			})+
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

