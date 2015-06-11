// $ANTLR 3.5.1 /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g 2015-06-11 19:58:15

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ANNEE", "ARTICLE", "CHAR", 
		"COUNT", "DATE", "ENTRE", "JOUR", "MOIS", "MOT", "OR", "PAGE", "POINT", 
		"RUBRIQUE", "SELECT", "TITRE", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ANNEE=5;
	public static final int ARTICLE=6;
	public static final int CHAR=7;
	public static final int COUNT=8;
	public static final int DATE=9;
	public static final int ENTRE=10;
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
	// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:67:1: listerequetes returns [String sql = \"\"] : r= requete (| POINT ) ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:68:25: (r= requete (| POINT ) )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:69:3: r= requete (| POINT )
			{
			pushFollow(FOLLOW_requete_in_listerequetes491);
			r=requete();
			state._fsp--;

			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:69:15: (| POINT )
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
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:69:16: 
					{
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:69:17: POINT
					{
					match(input,POINT,FOLLOW_POINT_in_listerequetes495); 
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
	// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:76:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : (| SELECT ) (| COUNT ) ( ARTICLE | PAGE ) ( TITRE ( MOT )+ | ( MOT )+ ) ps= params (|pdate= date | ( ENTRE pdate11= date AND pdate12= date ) ) ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;
		Arbre pdate =null;
		Arbre pdate11 =null;
		Arbre pdate12 =null;


				Arbre ps_arbre, dt_arbre, pdate_arbre;
				req_arbre.ajouteFils(new Arbre("","select distinct"));
			
		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:80:4: ( (| SELECT ) (| COUNT ) ( ARTICLE | PAGE ) ( TITRE ( MOT )+ | ( MOT )+ ) ps= params (|pdate= date | ( ENTRE pdate11= date AND pdate12= date ) ) )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:81:3: (| SELECT ) (| COUNT ) ( ARTICLE | PAGE ) ( TITRE ( MOT )+ | ( MOT )+ ) ps= params (|pdate= date | ( ENTRE pdate11= date AND pdate12= date ) )
			{
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:81:3: (| SELECT )
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
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:81:4: 
					{
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:81:6: SELECT
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete526); 

									
								
					}
					break;

			}

			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:85:3: (| COUNT )
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
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:85:4: 
					{
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:85:6: COUNT
					{
					match(input,COUNT,FOLLOW_COUNT_in_requete541); 

								req_arbre.ajouteFils(new Arbre("","count"));
							
					}
					break;

			}

			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:89:3: ( ARTICLE | PAGE )
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
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:89:4: ARTICLE
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete553); 

									req_arbre.ajouteFils(new Arbre("","fichier"));
								
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:93:6: PAGE
					{
					match(input,PAGE,FOLLOW_PAGE_in_requete565); 

									req_arbre.ajouteFils(new Arbre("","numero"));
								
					}
					break;

			}

			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:97:3: ( TITRE ( MOT )+ | ( MOT )+ )
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
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:97:4: TITRE ( MOT )+
					{
					match(input,TITRE,FOLLOW_TITRE_in_requete576); 
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:97:12: ( MOT )+
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
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:97:13: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_requete580); 
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}


									req_arbre.ajouteFils(new Arbre("","from titre"));
								
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:100:4: ( MOT )+
					{
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:100:4: ( MOT )+
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
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:100:5: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_requete590); 
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}


									req_arbre.ajouteFils(new Arbre("","from titretexte"));
								
					}
					break;

			}

			pushFollow(FOLLOW_params_in_requete610);
			ps=params();
			state._fsp--;


							req_arbre.ajouteFils(new Arbre("","where"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:112:3: (|pdate= date | ( ENTRE pdate11= date AND pdate12= date ) )
			int alt8=3;
			switch ( input.LA(1) ) {
			case EOF:
			case POINT:
				{
				alt8=1;
				}
				break;
			case ANNEE:
			case DATE:
			case JOUR:
			case MOIS:
				{
				alt8=2;
				}
				break;
			case ENTRE:
				{
				alt8=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:112:4: 
					{
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:112:5: pdate= date
					{
					pushFollow(FOLLOW_date_in_requete630);
					pdate=date();
					state._fsp--;


									req_arbre.ajouteFils(new Arbre("","from date"));
									pdate_arbre = pdate;
									req_arbre.ajouteFils(pdate_arbre);
								
					}
					break;
				case 3 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:118:4: ( ENTRE pdate11= date AND pdate12= date )
					{
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:118:4: ( ENTRE pdate11= date AND pdate12= date )
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:118:5: ENTRE pdate11= date AND pdate12= date
					{
					match(input,ENTRE,FOLLOW_ENTRE_in_requete641); 
					pushFollow(FOLLOW_date_in_requete648);
					pdate11=date();
					state._fsp--;

					match(input,AND,FOLLOW_AND_in_requete651); 
					pushFollow(FOLLOW_date_in_requete658);
					pdate12=date();
					state._fsp--;


									req_arbre.ajouteFils(new Arbre("","from date"));
									pdate_arbre = pdate11;
									req_arbre.ajouteFils(pdate_arbre);
									
									req_arbre.ajouteFils(new Arbre("","and-between"));
									pdate_arbre = pdate12;
									req_arbre.ajouteFils(pdate_arbre);
								
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
	// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:130:1: date returns [Arbre date_arbre = new Arbre(\"\")] : ( (a= DATE ) | (b= JOUR |c= MOIS |d= ANNEE )+ );
	public final Arbre date() throws RecognitionException {
		Arbre date_arbre =  new Arbre("");


		Token a=null;
		Token b=null;
		Token c=null;
		Token d=null;

		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:130:49: ( (a= DATE ) | (b= JOUR |c= MOIS |d= ANNEE )+ )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==DATE) ) {
				alt10=1;
			}
			else if ( (LA10_0==ANNEE||(LA10_0 >= JOUR && LA10_0 <= MOIS)) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:131:3: (a= DATE )
					{
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:131:3: (a= DATE )
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:131:4: a= DATE
					{
					a=(Token)match(input,DATE,FOLLOW_DATE_in_date685); 

									date_arbre.ajouteFils(new Arbre("date", a.getText()));
								
					}

					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:135:4: (b= JOUR |c= MOIS |d= ANNEE )+
					{
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:135:4: (b= JOUR |c= MOIS |d= ANNEE )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=4;
						switch ( input.LA(1) ) {
						case JOUR:
							{
							alt9=1;
							}
							break;
						case MOIS:
							{
							alt9=2;
							}
							break;
						case ANNEE:
							{
							alt9=3;
							}
							break;
						}
						switch (alt9) {
						case 1 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:135:5: b= JOUR
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date702); 

											date_arbre.ajouteFils(new Arbre("jour = ",  b.getText()));
										
							}
							break;
						case 2 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:139:5: c= MOIS
							{
							c=(Token)match(input,MOIS,FOLLOW_MOIS_in_date719); 

											date_arbre.ajouteFils(new Arbre("mois = ", c.getText()));
										
							}
							break;
						case 3 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:143:5: d= ANNEE
							{
							d=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date733); 

											date_arbre.ajouteFils(new Arbre("annee = ", d.getText()));
										
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
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



	// $ANTLR start "params"
	// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:149:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param (par2= conj par3= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;
		Arbre par3 =null;

		Arbre par1_arbre, par2_arbre, par3_arbre;
		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:150:52: (par1= param (par2= conj par3= param )* )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:151:3: par1= param (par2= conj par3= param )*
			{
			pushFollow(FOLLOW_param_in_params766);
			par1=param();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:156:3: (par2= conj par3= param )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==AND||LA11_0==OR) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:156:4: par2= conj par3= param
					{
					pushFollow(FOLLOW_conj_in_params781);
					par2=conj();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(par2_arbre);
								
					pushFollow(FOLLOW_param_in_params796);
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
	// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:169:1: conj returns [Arbre conj_arbre = new Arbre(\"\")] : ( AND | OR ) ;
	public final Arbre conj() throws RecognitionException {
		Arbre conj_arbre =  new Arbre("");


		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:170:2: ( ( AND | OR ) )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:171:3: ( AND | OR )
			{
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:171:3: ( AND | OR )
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
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:171:4: AND
					{
					match(input,AND,FOLLOW_AND_in_conj824); 

									conj_arbre.ajouteFils(new Arbre("", "AND"));
								
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:175:4: OR
					{
					match(input,OR,FOLLOW_OR_in_conj834); 

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
	// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:181:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:181:51: (a= VAR )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:182:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_param858); 
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



	public static final BitSet FOLLOW_requete_in_listerequetes491 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_POINT_in_listerequetes495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete526 = new BitSet(new long[]{0x0000000000008140L});
	public static final BitSet FOLLOW_COUNT_in_requete541 = new BitSet(new long[]{0x0000000000008040L});
	public static final BitSet FOLLOW_ARTICLE_in_requete553 = new BitSet(new long[]{0x0000000000082000L});
	public static final BitSet FOLLOW_PAGE_in_requete565 = new BitSet(new long[]{0x0000000000082000L});
	public static final BitSet FOLLOW_TITRE_in_requete576 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOT_in_requete580 = new BitSet(new long[]{0x0000000000102000L});
	public static final BitSet FOLLOW_MOT_in_requete590 = new BitSet(new long[]{0x0000000000102000L});
	public static final BitSet FOLLOW_params_in_requete610 = new BitSet(new long[]{0x0000000000001E22L});
	public static final BitSet FOLLOW_date_in_requete630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ENTRE_in_requete641 = new BitSet(new long[]{0x0000000000001A20L});
	public static final BitSet FOLLOW_date_in_requete648 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AND_in_requete651 = new BitSet(new long[]{0x0000000000001A20L});
	public static final BitSet FOLLOW_date_in_requete658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_date685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_date702 = new BitSet(new long[]{0x0000000000001822L});
	public static final BitSet FOLLOW_MOIS_in_date719 = new BitSet(new long[]{0x0000000000001822L});
	public static final BitSet FOLLOW_ANNEE_in_date733 = new BitSet(new long[]{0x0000000000001822L});
	public static final BitSet FOLLOW_param_in_params766 = new BitSet(new long[]{0x0000000000004012L});
	public static final BitSet FOLLOW_conj_in_params781 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_param_in_params796 = new BitSet(new long[]{0x0000000000004012L});
	public static final BitSet FOLLOW_AND_in_conj824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_conj834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param858 = new BitSet(new long[]{0x0000000000000002L});
}
