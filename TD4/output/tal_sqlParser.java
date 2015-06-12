// $ANTLR 3.5.1 /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g 2015-06-12 15:49:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ANNEE", "ARTICLE", "CHAR", 
		"COUNT", "ENTRE", "FULLDATE_DELIMITER", "JOUR", "MOIS", "MOT", "OR", "PAGE", 
		"POINT", "RUBRIQUE", "SELECT", "TITRE", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ANNEE=5;
	public static final int ARTICLE=6;
	public static final int CHAR=7;
	public static final int COUNT=8;
	public static final int ENTRE=9;
	public static final int FULLDATE_DELIMITER=10;
	public static final int JOUR=11;
	public static final int MOIS=12;
	public static final int MOT=13;
	public static final int OR=14;
	public static final int PAGE=15;
	public static final int POINT=16;
	public static final int RUBRIQUE=17;
	public static final int SELECT=18;
	public static final int TITRE=19;
	public static final int VAR=20;
	public static final int WS=21;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public tal_sqlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return tal_sqlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g"; }



	// $ANTLR start "listerequetes"
	// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:68:1: listerequetes returns [String sql = \"\"] : r= requete (| POINT ) ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:69:25: (r= requete (| POINT ) )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:70:3: r= requete (| POINT )
			{
			pushFollow(FOLLOW_requete_in_listerequetes473);
			r=requete();
			state._fsp--;

			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:70:15: (| POINT )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==EOF) ) {
				alt1=1;
			}
			else if ( (LA1_0==POINT) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:70:16: 
					{
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:70:17: POINT
					{
					match(input,POINT,FOLLOW_POINT_in_listerequetes477); 
					}
					break;

			}


							lr_arbre = r;
							sql = lr_arbre.sortArbre();
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return sql;
	}
	// $ANTLR end "listerequetes"



	// $ANTLR start "requete"
	// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:77:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : (| SELECT ) (| COUNT ) ( ARTICLE | PAGE ) (| ( TITRE ( MOT )+ | ( MOT )+ ) ps= params ) (|pdate= date | ( ENTRE pdate11= date AND pdate12= date ) ) ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;
		Arbre pdate =null;
		Arbre pdate11 =null;
		Arbre pdate12 =null;


				Arbre ps_arbre, dt_arbre, pdate_arbre, pdate_arbre2, pdate_arbre3;
				req_arbre.ajouteFils(new Arbre("","select distinct"));
			
		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:81:4: ( (| SELECT ) (| COUNT ) ( ARTICLE | PAGE ) (| ( TITRE ( MOT )+ | ( MOT )+ ) ps= params ) (|pdate= date | ( ENTRE pdate11= date AND pdate12= date ) ) )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:82:3: (| SELECT ) (| COUNT ) ( ARTICLE | PAGE ) (| ( TITRE ( MOT )+ | ( MOT )+ ) ps= params ) (|pdate= date | ( ENTRE pdate11= date AND pdate12= date ) )
			{
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:82:3: (| SELECT )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==ARTICLE||LA2_0==COUNT||LA2_0==PAGE) ) {
				alt2=1;
			}
			else if ( (LA2_0==SELECT) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:82:4: 
					{
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:82:6: SELECT
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete508); 

									
								
					}
					break;

			}

			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:86:3: (| COUNT )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==ARTICLE||LA3_0==PAGE) ) {
				alt3=1;
			}
			else if ( (LA3_0==COUNT) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:86:4: 
					{
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:86:6: COUNT
					{
					match(input,COUNT,FOLLOW_COUNT_in_requete523); 

								req_arbre.ajouteFils(new Arbre("","count"));
							
					}
					break;

			}

			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:90:3: ( ARTICLE | PAGE )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==ARTICLE) ) {
				alt4=1;
			}
			else if ( (LA4_0==PAGE) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:90:4: ARTICLE
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete535); 

									req_arbre.ajouteFils(new Arbre("","t.fichier"));
								
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:94:6: PAGE
					{
					match(input,PAGE,FOLLOW_PAGE_in_requete547); 

									req_arbre.ajouteFils(new Arbre("","t.numero"));
								
					}
					break;

			}

			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:98:3: (| ( TITRE ( MOT )+ | ( MOT )+ ) ps= params )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==EOF||LA8_0==ANNEE||LA8_0==ENTRE||(LA8_0 >= JOUR && LA8_0 <= MOIS)||LA8_0==POINT) ) {
				alt8=1;
			}
			else if ( (LA8_0==MOT||LA8_0==TITRE) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:98:4: 
					{
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:98:5: ( TITRE ( MOT )+ | ( MOT )+ ) ps= params
					{
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:98:5: ( TITRE ( MOT )+ | ( MOT )+ )
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==TITRE) ) {
						alt7=1;
					}
					else if ( (LA7_0==MOT) ) {
						alt7=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}

					switch (alt7) {
						case 1 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:98:6: TITRE ( MOT )+
							{
							match(input,TITRE,FOLLOW_TITRE_in_requete560); 
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:98:14: ( MOT )+
							int cnt5=0;
							loop5:
							while (true) {
								int alt5=2;
								int LA5_0 = input.LA(1);
								if ( (LA5_0==MOT) ) {
									alt5=1;
								}

								switch (alt5) {
								case 1 :
									// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:98:15: MOT
									{
									match(input,MOT,FOLLOW_MOT_in_requete564); 
									}
									break;

								default :
									if ( cnt5 >= 1 ) break loop5;
									EarlyExitException eee = new EarlyExitException(5, input);
									throw eee;
								}
								cnt5++;
							}


											req_arbre.ajouteFils(new Arbre("","from titre t"));
										
							}
							break;
						case 2 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:101:4: ( MOT )+
							{
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:101:4: ( MOT )+
							int cnt6=0;
							loop6:
							while (true) {
								int alt6=2;
								int LA6_0 = input.LA(1);
								if ( (LA6_0==MOT) ) {
									alt6=1;
								}

								switch (alt6) {
								case 1 :
									// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:101:5: MOT
									{
									match(input,MOT,FOLLOW_MOT_in_requete574); 
									}
									break;

								default :
									if ( cnt6 >= 1 ) break loop6;
									EarlyExitException eee = new EarlyExitException(6, input);
									throw eee;
								}
								cnt6++;
							}


											req_arbre.ajouteFils(new Arbre("","from titretexte t"));
										
							}
							break;

					}

					pushFollow(FOLLOW_params_in_requete594);
					ps=params();
					state._fsp--;


									req_arbre.ajouteFils(new Arbre("","where"));
									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								
					}
					break;

			}

			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:113:3: (|pdate= date | ( ENTRE pdate11= date AND pdate12= date ) )
			int alt9=3;
			switch ( input.LA(1) ) {
			case EOF:
			case POINT:
				{
				alt9=1;
				}
				break;
			case ANNEE:
			case JOUR:
			case MOIS:
				{
				alt9=2;
				}
				break;
			case ENTRE:
				{
				alt9=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:113:4: 
					{
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:113:5: pdate= date
					{
					pushFollow(FOLLOW_date_in_requete615);
					pdate=date();
					state._fsp--;


									req_arbre.ajouteFils(new Arbre("","from date t WHERE"));
									pdate_arbre = pdate;
									req_arbre.ajouteFils(pdate_arbre);
								
					}
					break;
				case 3 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:119:4: ( ENTRE pdate11= date AND pdate12= date )
					{
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:119:4: ( ENTRE pdate11= date AND pdate12= date )
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:119:5: ENTRE pdate11= date AND pdate12= date
					{
					match(input,ENTRE,FOLLOW_ENTRE_in_requete626); 
					pushFollow(FOLLOW_date_in_requete633);
					pdate11=date();
					state._fsp--;

					match(input,AND,FOLLOW_AND_in_requete636); 

									req_arbre.ajouteFils(new Arbre("","from date t WHERE"));
									pdate_arbre2 = pdate11;
									req_arbre.ajouteFils(pdate_arbre2);
								
					pushFollow(FOLLOW_date_in_requete649);
					pdate12=date();
					state._fsp--;

									
									req_arbre.ajouteFils(new Arbre("","and-between"));
									pdate_arbre3 = pdate12;
									req_arbre.ajouteFils(pdate_arbre3);
								
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return req_arbre;
	}
	// $ANTLR end "requete"



	// $ANTLR start "date"
	// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:134:1: date returns [Arbre date_arbre = new Arbre(\"\")] : ( (fulldate_a= fulldate ) |d= ANNEE |c= MOIS | (c= MOIS d= ANNEE ) | (b= JOUR c= MOIS d= ANNEE ) );
	public final Arbre date() throws RecognitionException {
		Arbre date_arbre =  new Arbre("");


		Token d=null;
		Token c=null;
		Token b=null;
		Arbre fulldate_a =null;


				Arbre fulldate_sub_arbre;
			
		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:137:4: ( (fulldate_a= fulldate ) |d= ANNEE |c= MOIS | (c= MOIS d= ANNEE ) | (b= JOUR c= MOIS d= ANNEE ) )
			int alt10=5;
			switch ( input.LA(1) ) {
			case JOUR:
				{
				int LA10_1 = input.LA(2);
				if ( (LA10_1==FULLDATE_DELIMITER) ) {
					alt10=1;
				}
				else if ( (LA10_1==MOIS) ) {
					alt10=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ANNEE:
				{
				alt10=2;
				}
				break;
			case MOIS:
				{
				int LA10_3 = input.LA(2);
				if ( (LA10_3==EOF||LA10_3==AND||LA10_3==POINT) ) {
					alt10=3;
				}
				else if ( (LA10_3==ANNEE) ) {
					alt10=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:138:3: (fulldate_a= fulldate )
					{
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:138:3: (fulldate_a= fulldate )
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:138:4: fulldate_a= fulldate
					{
					pushFollow(FOLLOW_fulldate_in_date687);
					fulldate_a=fulldate();
					state._fsp--;


									fulldate_sub_arbre = fulldate_a;
									date_arbre.ajouteFils(fulldate_sub_arbre);
								
					}

					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:144:5: d= ANNEE
					{
					d=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date707); 

									date_arbre.ajouteFils(new Arbre("annee = ", "'"+d.getText()+"'"));
								
					}
					break;
				case 3 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:148:5: c= MOIS
					{
					c=(Token)match(input,MOIS,FOLLOW_MOIS_in_date722); 

									date_arbre.ajouteFils(new Arbre("mois = ", "'"+c.getText()+"'"));
								
					}
					break;
				case 4 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:152:4: (c= MOIS d= ANNEE )
					{
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:152:4: (c= MOIS d= ANNEE )
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:152:6: c= MOIS d= ANNEE
					{
					c=(Token)match(input,MOIS,FOLLOW_MOIS_in_date738); 

									date_arbre.ajouteFils(new Arbre("mois = ", "'"+c.getText()+"'"));
								
					d=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date751); 

									date_arbre.ajouteFils(new Arbre("AND annee = ", "'"+d.getText()+"'"));
								
					}

					}
					break;
				case 5 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:160:4: (b= JOUR c= MOIS d= ANNEE )
					{
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:160:4: (b= JOUR c= MOIS d= ANNEE )
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:160:5: b= JOUR c= MOIS d= ANNEE
					{
					b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date767); 

									date_arbre.ajouteFils(new Arbre("jour = ",  "'"+b.getText()+"'"));
								
					c=(Token)match(input,MOIS,FOLLOW_MOIS_in_date782); 

									date_arbre.ajouteFils(new Arbre("AND mois = ", "'"+c.getText()+"'"));
								
					d=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date794); 

									date_arbre.ajouteFils(new Arbre("AND annee = ", "'"+d.getText()+"'"));
								
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return date_arbre;
	}
	// $ANTLR end "date"



	// $ANTLR start "fulldate"
	// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:174:1: fulldate returns [Arbre fulldate_arbre = new Arbre(\"\")] : b2= JOUR FULLDATE_DELIMITER c2= JOUR FULLDATE_DELIMITER d2= ANNEE ;
	public final Arbre fulldate() throws RecognitionException {
		Arbre fulldate_arbre =  new Arbre("");


		Token b2=null;
		Token c2=null;
		Token d2=null;

		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:174:57: (b2= JOUR FULLDATE_DELIMITER c2= JOUR FULLDATE_DELIMITER d2= ANNEE )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:175:3: b2= JOUR FULLDATE_DELIMITER c2= JOUR FULLDATE_DELIMITER d2= ANNEE
			{
			b2=(Token)match(input,JOUR,FOLLOW_JOUR_in_fulldate819); 
			match(input,FULLDATE_DELIMITER,FOLLOW_FULLDATE_DELIMITER_in_fulldate822); 

							fulldate_arbre.ajouteFils(new Arbre("jour = ",  b2.getText()));
						
			c2=(Token)match(input,JOUR,FOLLOW_JOUR_in_fulldate836); 
			match(input,FULLDATE_DELIMITER,FOLLOW_FULLDATE_DELIMITER_in_fulldate839); 

							fulldate_arbre.ajouteFils(new Arbre("AND mois = ", c2.getText()));
						
			d2=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_fulldate852); 

							fulldate_arbre.ajouteFils(new Arbre("AND annee = ", d2.getText()));
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return fulldate_arbre;
	}
	// $ANTLR end "fulldate"



	// $ANTLR start "params"
	// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:189:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param (par2= conj par3= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;
		Arbre par3 =null;

		Arbre par1_arbre, par2_arbre, par3_arbre;
		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:190:52: (par1= param (par2= conj par3= param )* )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:191:3: par1= param (par2= conj par3= param )*
			{
			pushFollow(FOLLOW_param_in_params883);
			par1=param();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:196:3: (par2= conj par3= param )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==AND||LA11_0==OR) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:196:4: par2= conj par3= param
					{
					pushFollow(FOLLOW_conj_in_params898);
					par2=conj();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(par2_arbre);
								
					pushFollow(FOLLOW_param_in_params913);
					par3=param();
					state._fsp--;


									par3_arbre = par3;
									les_pars_arbre.ajouteFils(par3_arbre);
								
					}
					break;

				default :
					break loop11;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params"



	// $ANTLR start "conj"
	// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:209:1: conj returns [Arbre conj_arbre = new Arbre(\"\")] : ( AND | OR ) ;
	public final Arbre conj() throws RecognitionException {
		Arbre conj_arbre =  new Arbre("");


		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:210:2: ( ( AND | OR ) )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:211:3: ( AND | OR )
			{
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:211:3: ( AND | OR )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==AND) ) {
				alt12=1;
			}
			else if ( (LA12_0==OR) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:211:4: AND
					{
					match(input,AND,FOLLOW_AND_in_conj941); 

									conj_arbre.ajouteFils(new Arbre("", "AND"));
								
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:215:4: OR
					{
					match(input,OR,FOLLOW_OR_in_conj951); 

									conj_arbre.ajouteFils(new Arbre("", "OR"));
								
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return conj_arbre;
	}
	// $ANTLR end "conj"



	// $ANTLR start "param"
	// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:221:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:221:51: (a= VAR )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:222:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_param975); 
			 lepar_arbre.ajouteFils(new Arbre("mot LIKE", "'"+a.getText()+"%'"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param"

	// Delegated rules



	public static final BitSet FOLLOW_requete_in_listerequetes473 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_POINT_in_listerequetes477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete508 = new BitSet(new long[]{0x0000000000008140L});
	public static final BitSet FOLLOW_COUNT_in_requete523 = new BitSet(new long[]{0x0000000000008040L});
	public static final BitSet FOLLOW_ARTICLE_in_requete535 = new BitSet(new long[]{0x0000000000083A22L});
	public static final BitSet FOLLOW_PAGE_in_requete547 = new BitSet(new long[]{0x0000000000083A22L});
	public static final BitSet FOLLOW_TITRE_in_requete560 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOT_in_requete564 = new BitSet(new long[]{0x0000000000102000L});
	public static final BitSet FOLLOW_MOT_in_requete574 = new BitSet(new long[]{0x0000000000102000L});
	public static final BitSet FOLLOW_params_in_requete594 = new BitSet(new long[]{0x0000000000001A22L});
	public static final BitSet FOLLOW_date_in_requete615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ENTRE_in_requete626 = new BitSet(new long[]{0x0000000000001820L});
	public static final BitSet FOLLOW_date_in_requete633 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AND_in_requete636 = new BitSet(new long[]{0x0000000000001820L});
	public static final BitSet FOLLOW_date_in_requete649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fulldate_in_date687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNEE_in_date707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_date722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_date738 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ANNEE_in_date751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_date767 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_MOIS_in_date782 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ANNEE_in_date794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_fulldate819 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_FULLDATE_DELIMITER_in_fulldate822 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_JOUR_in_fulldate836 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_FULLDATE_DELIMITER_in_fulldate839 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ANNEE_in_fulldate852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params883 = new BitSet(new long[]{0x0000000000004012L});
	public static final BitSet FOLLOW_conj_in_params898 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_param_in_params913 = new BitSet(new long[]{0x0000000000004012L});
	public static final BitSet FOLLOW_AND_in_conj941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_conj951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param975 = new BitSet(new long[]{0x0000000000000002L});
}
