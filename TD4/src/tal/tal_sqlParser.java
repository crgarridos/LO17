// $ANTLR 3.5.1 /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g 2015-05-29 16:38:18
package tal;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ANNEE", "ARTICLE", "CHAR", 
		"JOUR", "MOIS", "MOT", "OR", "PAGE", "POINT", "SELECT", "TITRE", "VAR", 
		"WS"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ANNEE=5;
	public static final int ARTICLE=6;
	public static final int CHAR=7;
	public static final int JOUR=8;
	public static final int MOIS=9;
	public static final int MOT=10;
	public static final int OR=11;
	public static final int PAGE=12;
	public static final int POINT=13;
	public static final int SELECT=14;
	public static final int TITRE=15;
	public static final int VAR=16;
	public static final int WS=17;

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
	// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:57:1: listerequetes returns [String sql = \"\"] : r= requete (| POINT ) ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:58:25: (r= requete (| POINT ) )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:59:3: r= requete (| POINT )
			{
			pushFollow(FOLLOW_requete_in_listerequetes432);
			r=requete();
			state._fsp--;

			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:59:15: (| POINT )
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
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:59:16: 
					{
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:59:17: POINT
					{
					match(input,POINT,FOLLOW_POINT_in_listerequetes436); 
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
	// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:66:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : (| SELECT ) ( ARTICLE | PAGE ) ( TITRE ( MOT )+ | ( MOT )+ ) ps= params ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;

		Arbre ps_arbre, dt_arbre;
		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:67:36: ( (| SELECT ) ( ARTICLE | PAGE ) ( TITRE ( MOT )+ | ( MOT )+ ) ps= params )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:68:3: (| SELECT ) ( ARTICLE | PAGE ) ( TITRE ( MOT )+ | ( MOT )+ ) ps= params
			{
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:68:3: (| SELECT )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==ARTICLE||LA2_0==PAGE) ) {
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
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:68:4: 
					{
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:68:6: SELECT
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete467); 

									req_arbre.ajouteFils(new Arbre("","select distinct"));
								
					}
					break;

			}

			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:72:3: ( ARTICLE | PAGE )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==ARTICLE) ) {
				alt3=1;
			}
			else if ( (LA3_0==PAGE) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:72:4: ARTICLE
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete480); 

									req_arbre.ajouteFils(new Arbre("","fichier"));
								
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:76:6: PAGE
					{
					match(input,PAGE,FOLLOW_PAGE_in_requete492); 

									req_arbre.ajouteFils(new Arbre("","numero"));
								
					}
					break;

			}

			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:80:3: ( TITRE ( MOT )+ | ( MOT )+ )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==TITRE) ) {
				alt6=1;
			}
			else if ( (LA6_0==MOT) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:80:4: TITRE ( MOT )+
					{
					match(input,TITRE,FOLLOW_TITRE_in_requete503); 
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:80:12: ( MOT )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==MOT) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:80:13: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_requete507); 
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}


									req_arbre.ajouteFils(new Arbre("","from titre"));
								
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:83:4: ( MOT )+
					{
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:83:4: ( MOT )+
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
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:83:5: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_requete517); 
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}


									req_arbre.ajouteFils(new Arbre("","from titretexte"));
								
					}
					break;

			}

			pushFollow(FOLLOW_params_in_requete537);
			ps=params();
			state._fsp--;


							req_arbre.ajouteFils(new Arbre("","where"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
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
	// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:96:1: date returns [Arbre date_arbre = new Arbre(\"\")] : ( JOUR | MOIS | ANNEE ) ;
	public final Arbre date() throws RecognitionException {
		Arbre date_arbre =  new Arbre("");


		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:96:49: ( ( JOUR | MOIS | ANNEE ) )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:97:3: ( JOUR | MOIS | ANNEE )
			{
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:97:3: ( JOUR | MOIS | ANNEE )
			int alt7=3;
			switch ( input.LA(1) ) {
			case JOUR:
				{
				alt7=1;
				}
				break;
			case MOIS:
				{
				alt7=2;
				}
				break;
			case ANNEE:
				{
				alt7=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:97:4: JOUR
					{
					match(input,JOUR,FOLLOW_JOUR_in_date559); 

									date_arbre.ajouteFils(new Arbre("","jour"));
								
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:101:5: MOIS
					{
					match(input,MOIS,FOLLOW_MOIS_in_date572); 

									date_arbre.ajouteFils(new Arbre("","mois"));
								
					}
					break;
				case 3 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:105:5: ANNEE
					{
					match(input,ANNEE,FOLLOW_ANNEE_in_date583); 

									date_arbre.ajouteFils(new Arbre("","annee"));
								
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
		return date_arbre;
	}
	// $ANTLR end "date"



	// $ANTLR start "params"
	// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:111:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param (par2= conj par3= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;
		Arbre par3 =null;

		Arbre par1_arbre, par2_arbre, par3_arbre;
		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:112:52: (par1= param (par2= conj par3= param )* )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:113:3: par1= param (par2= conj par3= param )*
			{
			pushFollow(FOLLOW_param_in_params615);
			par1=param();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:118:3: (par2= conj par3= param )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==AND||LA8_0==OR) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:118:4: par2= conj par3= param
					{
					pushFollow(FOLLOW_conj_in_params630);
					par2=conj();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(par2_arbre);
								
					pushFollow(FOLLOW_param_in_params645);
					par3=param();
					state._fsp--;


									par3_arbre = par3;
									les_pars_arbre.ajouteFils(par3_arbre);
								
					}
					break;

				default :
					break loop8;
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
	// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:131:1: conj returns [Arbre conj_arbre = new Arbre(\"\")] : ( AND | OR ) ;
	public final Arbre conj() throws RecognitionException {
		Arbre conj_arbre =  new Arbre("");


		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:132:2: ( ( AND | OR ) )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:133:3: ( AND | OR )
			{
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:133:3: ( AND | OR )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==AND) ) {
				alt9=1;
			}
			else if ( (LA9_0==OR) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:133:4: AND
					{
					match(input,AND,FOLLOW_AND_in_conj673); 

									conj_arbre.ajouteFils(new Arbre("", "AND"));
								
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:137:4: OR
					{
					match(input,OR,FOLLOW_OR_in_conj683); 

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
	// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:143:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:143:51: (a= VAR )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:144:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_param707); 
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



	public static final BitSet FOLLOW_requete_in_listerequetes432 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_POINT_in_listerequetes436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete467 = new BitSet(new long[]{0x0000000000001040L});
	public static final BitSet FOLLOW_ARTICLE_in_requete480 = new BitSet(new long[]{0x0000000000008400L});
	public static final BitSet FOLLOW_PAGE_in_requete492 = new BitSet(new long[]{0x0000000000008400L});
	public static final BitSet FOLLOW_TITRE_in_requete503 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_MOT_in_requete507 = new BitSet(new long[]{0x0000000000010400L});
	public static final BitSet FOLLOW_MOT_in_requete517 = new BitSet(new long[]{0x0000000000010400L});
	public static final BitSet FOLLOW_params_in_requete537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_date559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_date572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNEE_in_date583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params615 = new BitSet(new long[]{0x0000000000000812L});
	public static final BitSet FOLLOW_conj_in_params630 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_param_in_params645 = new BitSet(new long[]{0x0000000000000812L});
	public static final BitSet FOLLOW_AND_in_conj673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_conj683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param707 = new BitSet(new long[]{0x0000000000000002L});
}
