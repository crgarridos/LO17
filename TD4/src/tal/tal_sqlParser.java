package tal;
// $ANTLR 3.5.1 /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g 2015-05-15 14:16:19

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ANNEE", "ARTICLE", "CHAR", 
		"JOUR", "MOIS", "MOT", "OR", "PAGE", "POINT", "SELECT", "VAR", "WS"
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
	public static final int VAR=15;
	public static final int WS=16;

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
	// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:55:1: listerequetes returns [String sql = \"\"] : r= requete (| POINT ) ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:56:25: (r= requete (| POINT ) )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:57:3: r= requete (| POINT )
			{
			pushFollow(FOLLOW_requete_in_listerequetes423);
			r=requete();
			state._fsp--;

			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:57:15: (| POINT )
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
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:57:16: 
					{
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:57:17: POINT
					{
					match(input,POINT,FOLLOW_POINT_in_listerequetes427); 
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
	// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:64:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : (| SELECT ) ( ARTICLE | PAGE ) (dt= date | MOT )+ ps= params ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre dt =null;
		Arbre ps =null;

		Arbre ps_arbre, dt_arbre;
		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:65:36: ( (| SELECT ) ( ARTICLE | PAGE ) (dt= date | MOT )+ ps= params )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:66:3: (| SELECT ) ( ARTICLE | PAGE ) (dt= date | MOT )+ ps= params
			{
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:66:3: (| SELECT )
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
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:66:4: 
					{
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:66:5: SELECT
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete457); 

									req_arbre.ajouteFils(new Arbre("","select distinct"));
								
					}
					break;

			}

			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:70:3: ( ARTICLE | PAGE )
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
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:70:4: ARTICLE
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete470); 

									req_arbre.ajouteFils(new Arbre("","article"));
								
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:74:6: PAGE
					{
					match(input,PAGE,FOLLOW_PAGE_in_requete482); 

									req_arbre.ajouteFils(new Arbre("","page"));
								
					}
					break;

			}

			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:79:3: (dt= date | MOT )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ANNEE||(LA4_0 >= JOUR && LA4_0 <= MOIS)) ) {
					alt4=1;
				}
				else if ( (LA4_0==MOT) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:79:5: dt= date
					{
					pushFollow(FOLLOW_date_in_requete502);
					dt=date();
					state._fsp--;


									dt_arbre = dt;
									req_arbre.ajouteFils(dt_arbre);
								
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:84:4: MOT
					{
					match(input,MOT,FOLLOW_MOT_in_requete513); 

									req_arbre.ajouteFils(new Arbre("","from titreresume"));
									req_arbre.ajouteFils(new Arbre("","where"));
								
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			pushFollow(FOLLOW_params_in_requete532);
			ps=params();
			state._fsp--;


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
	// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:97:1: date returns [Arbre date_arbre = new Arbre(\"\")] : ( JOUR | MOIS | ANNEE )+ ;
	public final Arbre date() throws RecognitionException {
		Arbre date_arbre =  new Arbre("");


		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:97:49: ( ( JOUR | MOIS | ANNEE )+ )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:98:3: ( JOUR | MOIS | ANNEE )+
			{
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:98:3: ( JOUR | MOIS | ANNEE )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=4;
				switch ( input.LA(1) ) {
				case JOUR:
					{
					alt5=1;
					}
					break;
				case MOIS:
					{
					alt5=2;
					}
					break;
				case ANNEE:
					{
					alt5=3;
					}
					break;
				}
				switch (alt5) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:98:4: JOUR
					{
					match(input,JOUR,FOLLOW_JOUR_in_date554); 

									date_arbre.ajouteFils(new Arbre("","jour"));
								
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:102:5: MOIS
					{
					match(input,MOIS,FOLLOW_MOIS_in_date567); 

									date_arbre.ajouteFils(new Arbre("","mois"));
								
					}
					break;
				case 3 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:106:5: ANNEE
					{
					match(input,ANNEE,FOLLOW_ANNEE_in_date578); 

									date_arbre.ajouteFils(new Arbre("","annee"));
								
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
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
	// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:112:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param (par2= conj par3= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;
		Arbre par3 =null;

		Arbre par1_arbre, par2_arbre, par3_arbre;
		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:113:52: (par1= param (par2= conj par3= param )* )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:114:3: par1= param (par2= conj par3= param )*
			{
			pushFollow(FOLLOW_param_in_params611);
			par1=param();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:119:3: (par2= conj par3= param )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==AND||LA6_0==OR) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:119:4: par2= conj par3= param
					{
					pushFollow(FOLLOW_conj_in_params626);
					par2=conj();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(par2_arbre);
								
					pushFollow(FOLLOW_param_in_params641);
					par3=param();
					state._fsp--;


									par3_arbre = par3;
									les_pars_arbre.ajouteFils(par3_arbre);
								
					}
					break;

				default :
					break loop6;
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
	// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:132:1: conj returns [Arbre conj_arbre = new Arbre(\"\")] : ( AND | OR ) ;
	public final Arbre conj() throws RecognitionException {
		Arbre conj_arbre =  new Arbre("");


		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:133:2: ( ( AND | OR ) )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:134:3: ( AND | OR )
			{
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:134:3: ( AND | OR )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==AND) ) {
				alt7=1;
			}
			else if ( (LA7_0==OR) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:134:4: AND
					{
					match(input,AND,FOLLOW_AND_in_conj669); 

									conj_arbre.ajouteFils(new Arbre("", "AND"));
								
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:138:4: OR
					{
					match(input,OR,FOLLOW_OR_in_conj679); 

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
	// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:144:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:144:51: (a= VAR )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:145:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_param703); 
			 lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));
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



	public static final BitSet FOLLOW_requete_in_listerequetes423 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_POINT_in_listerequetes427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete457 = new BitSet(new long[]{0x0000000000001040L});
	public static final BitSet FOLLOW_ARTICLE_in_requete470 = new BitSet(new long[]{0x0000000000000720L});
	public static final BitSet FOLLOW_PAGE_in_requete482 = new BitSet(new long[]{0x0000000000000720L});
	public static final BitSet FOLLOW_date_in_requete502 = new BitSet(new long[]{0x0000000000008720L});
	public static final BitSet FOLLOW_MOT_in_requete513 = new BitSet(new long[]{0x0000000000008720L});
	public static final BitSet FOLLOW_params_in_requete532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_date554 = new BitSet(new long[]{0x0000000000000322L});
	public static final BitSet FOLLOW_MOIS_in_date567 = new BitSet(new long[]{0x0000000000000322L});
	public static final BitSet FOLLOW_ANNEE_in_date578 = new BitSet(new long[]{0x0000000000000322L});
	public static final BitSet FOLLOW_param_in_params611 = new BitSet(new long[]{0x0000000000000812L});
	public static final BitSet FOLLOW_conj_in_params626 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_param_in_params641 = new BitSet(new long[]{0x0000000000000812L});
	public static final BitSet FOLLOW_AND_in_conj669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_conj679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param703 = new BitSet(new long[]{0x0000000000000002L});
}
