// $ANTLR 3.5.1 /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g 2015-06-11 19:58:15

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public tal_sqlLexer() {} 
	public tal_sqlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:3:8: ( 'vouloir' )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:3:10: 'vouloir'
			{
			match("vouloir"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "COUNT"
	public final void mCOUNT() throws RecognitionException {
		try {
			int _type = COUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:6:6: ( 'combien' | 'nombre' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='c') ) {
				alt1=1;
			}
			else if ( (LA1_0=='n') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:6:8: 'combien'
					{
					match("combien"); 

					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:6:20: 'nombre'
					{
					match("nombre"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COUNT"

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:8:9: ( 'article' )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:8:11: 'article'
			{
			match("article"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARTICLE"

	// $ANTLR start "TITRE"
	public final void mTITRE() throws RecognitionException {
		try {
			int _type = TITRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:10:7: ( 'titre' )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:10:10: 'titre'
			{
			match("titre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TITRE"

	// $ANTLR start "RUBRIQUE"
	public final void mRUBRIQUE() throws RecognitionException {
		try {
			int _type = RUBRIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:12:10: ( 'rubrique' )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:12:12: 'rubrique'
			{
			match("rubrique"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RUBRIQUE"

	// $ANTLR start "PAGE"
	public final void mPAGE() throws RecognitionException {
		try {
			int _type = PAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:15:6: ( 'page' )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:15:8: 'page'
			{
			match("page"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PAGE"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:18:6: ( 'et' | ',' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='e') ) {
				alt2=1;
			}
			else if ( (LA2_0==',') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:18:8: 'et'
					{
					match("et"); 

					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:18:15: ','
					{
					match(','); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:21:4: ( 'ou' )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:21:6: 'ou'
			{
			match("ou"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:24:7: ( '.' | '?' )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:
			{
			if ( input.LA(1)=='.'||input.LA(1)=='?' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINT"

	// $ANTLR start "MOT"
	public final void mMOT() throws RecognitionException {
		try {
			int _type = MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:27:5: ( 'mot' | 'contenir' | 'parler' )
			int alt3=3;
			switch ( input.LA(1) ) {
			case 'm':
				{
				alt3=1;
				}
				break;
			case 'c':
				{
				alt3=2;
				}
				break;
			case 'p':
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:27:7: 'mot'
					{
					match("mot"); 

					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:27:15: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 3 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:27:28: 'parler'
					{
					match("parler"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOT"

	// $ANTLR start "JOUR"
	public final void mJOUR() throws RecognitionException {
		try {
			int _type = JOUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:30:6: ( ( '0' .. '9' ) ( '0' .. '9' ) )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:30:7: ( '0' .. '9' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JOUR"

	// $ANTLR start "MOIS"
	public final void mMOIS() throws RecognitionException {
		try {
			int _type = MOIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:33:5: ( 'janvier' | 'février' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'août' | 'septembre' | 'octobre' | 'novembre' | 'décembre' )
			int alt4=12;
			switch ( input.LA(1) ) {
			case 'j':
				{
				int LA4_1 = input.LA(2);
				if ( (LA4_1=='a') ) {
					alt4=1;
				}
				else if ( (LA4_1=='u') ) {
					int LA4_10 = input.LA(3);
					if ( (LA4_10=='i') ) {
						int LA4_14 = input.LA(4);
						if ( (LA4_14=='n') ) {
							alt4=6;
						}
						else if ( (LA4_14=='l') ) {
							alt4=7;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 14, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'f':
				{
				alt4=2;
				}
				break;
			case 'm':
				{
				int LA4_3 = input.LA(2);
				if ( (LA4_3=='a') ) {
					int LA4_11 = input.LA(3);
					if ( (LA4_11=='r') ) {
						alt4=3;
					}
					else if ( (LA4_11=='i') ) {
						alt4=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'a':
				{
				int LA4_4 = input.LA(2);
				if ( (LA4_4=='v') ) {
					alt4=4;
				}
				else if ( (LA4_4=='o') ) {
					alt4=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 's':
				{
				alt4=9;
				}
				break;
			case 'o':
				{
				alt4=10;
				}
				break;
			case 'n':
				{
				alt4=11;
				}
				break;
			case 'd':
				{
				alt4=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:33:7: 'janvier'
					{
					match("janvier"); 

					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:33:19: 'février'
					{
					match("février"); 

					}
					break;
				case 3 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:33:31: 'mars'
					{
					match("mars"); 

					}
					break;
				case 4 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:33:40: 'avril'
					{
					match("avril"); 

					}
					break;
				case 5 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:33:50: 'mai'
					{
					match("mai"); 

					}
					break;
				case 6 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:33:58: 'juin'
					{
					match("juin"); 

					}
					break;
				case 7 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:33:67: 'juillet'
					{
					match("juillet"); 

					}
					break;
				case 8 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:33:79: 'août'
					{
					match("août"); 

					}
					break;
				case 9 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:33:88: 'septembre'
					{
					match("septembre"); 

					}
					break;
				case 10 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:33:102: 'octobre'
					{
					match("octobre"); 

					}
					break;
				case 11 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:33:114: 'novembre'
					{
					match("novembre"); 

					}
					break;
				case 12 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:33:127: 'décembre'
					{
					match("décembre"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOIS"

	// $ANTLR start "ANNEE"
	public final void mANNEE() throws RecognitionException {
		try {
			int _type = ANNEE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:36:7: ( ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:36:9: ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANNEE"

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:39:6: ( JOUR ( '/' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '/' ) ANNEE )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:39:8: JOUR ( '/' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '/' ) ANNEE
			{
			mJOUR(); 

			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:39:13: ( '/' )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:39:14: '/'
			{
			match('/'); 
			}

			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:39:40: ( '/' )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:39:41: '/'
			{
			match('/'); 
			}

			mANNEE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE"

	// $ANTLR start "ENTRE"
	public final void mENTRE() throws RecognitionException {
		try {
			int _type = ENTRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:42:7: ( 'entre' )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:42:9: 'entre'
			{
			match("entre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENTRE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:45:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'moi' | 'dont' | 't-il' | 'de' | 'des' | 'du' | 'en' | 'quel' | 'quels' | 'quelles' | 'le' | 'la' ) | '\\n' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='\t'||LA6_0=='\r'||LA6_0==' '||(LA6_0 >= 'd' && LA6_0 <= 'e')||LA6_0=='j'||(LA6_0 >= 'l' && LA6_0 <= 'm')||LA6_0=='q'||LA6_0=='t') ) {
				alt6=1;
			}
			else if ( (LA6_0=='\n') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:45:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'moi' | 'dont' | 't-il' | 'de' | 'des' | 'du' | 'en' | 'quel' | 'quels' | 'quelles' | 'le' | 'la' )
					{
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:45:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'moi' | 'dont' | 't-il' | 'de' | 'des' | 'du' | 'en' | 'quel' | 'quels' | 'quelles' | 'le' | 'la' )
					int alt5=17;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt5=1;
						}
						break;
					case '\t':
						{
						alt5=2;
						}
						break;
					case '\r':
						{
						alt5=3;
						}
						break;
					case 'j':
						{
						alt5=4;
						}
						break;
					case 'q':
						{
						int LA5_5 = input.LA(2);
						if ( (LA5_5=='u') ) {
							int LA5_11 = input.LA(3);
							if ( (LA5_11=='i') ) {
								alt5=5;
							}
							else if ( (LA5_11=='e') ) {
								int LA5_18 = input.LA(4);
								if ( (LA5_18=='l') ) {
									switch ( input.LA(5) ) {
									case 's':
										{
										alt5=14;
										}
										break;
									case 'l':
										{
										alt5=15;
										}
										break;
									default:
										alt5=13;
									}
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 5, 18, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 5, 11, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 5, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 'm':
						{
						alt5=6;
						}
						break;
					case 'd':
						{
						switch ( input.LA(2) ) {
						case 'o':
							{
							alt5=7;
							}
							break;
						case 'e':
							{
							int LA5_13 = input.LA(3);
							if ( (LA5_13=='s') ) {
								alt5=10;
							}

							else {
								alt5=9;
							}

							}
							break;
						case 'u':
							{
							alt5=11;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 5, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case 't':
						{
						alt5=8;
						}
						break;
					case 'e':
						{
						alt5=12;
						}
						break;
					case 'l':
						{
						int LA5_10 = input.LA(2);
						if ( (LA5_10=='e') ) {
							alt5=16;
						}
						else if ( (LA5_10=='a') ) {
							alt5=17;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 5, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}
					switch (alt5) {
						case 1 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:45:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:45:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:45:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:45:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:45:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:45:42: 'moi'
							{
							match("moi"); 

							}
							break;
						case 7 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:45:50: 'dont'
							{
							match("dont"); 

							}
							break;
						case 8 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:45:59: 't-il'
							{
							match("t-il"); 

							}
							break;
						case 9 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:45:68: 'de'
							{
							match("de"); 

							}
							break;
						case 10 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:45:75: 'des'
							{
							match("des"); 

							}
							break;
						case 11 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:45:84: 'du'
							{
							match("du"); 

							}
							break;
						case 12 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:45:91: 'en'
							{
							match("en"); 

							}
							break;
						case 13 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:45:98: 'quel'
							{
							match("quel"); 

							}
							break;
						case 14 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:45:107: 'quels'
							{
							match("quels"); 

							}
							break;
						case 15 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:45:117: 'quelles'
							{
							match("quelles"); 

							}
							break;
						case 16 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:45:129: 'le'
							{
							match("le"); 

							}
							break;
						case 17 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:45:136: 'la'
							{
							match("la"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:45:155: '\\n'
					{
					match('\n'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:51:4: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u02FF')||(input.LA(1) >= '\u0370' && input.LA(1) <= '\u037D')||(input.LA(1) >= '\u037F' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u200C' && input.LA(1) <= '\u200D')||(input.LA(1) >= '\u2070' && input.LA(1) <= '\u218F')||(input.LA(1) >= '\u2C00' && input.LA(1) <= '\u2FEF')||(input.LA(1) >= '\u3001' && input.LA(1) <= '\uD7FF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFDCF')||(input.LA(1) >= '\uFDF0' && input.LA(1) <= '\uFFFD') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:64:6: ( CHAR ( CHAR )+ )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:64:7: CHAR ( CHAR )+
			{
			mCHAR(); 

			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:64:12: ( CHAR )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= 'A' && LA7_0 <= 'Z')||(LA7_0 >= 'a' && LA7_0 <= 'z')||(LA7_0 >= '\u00C0' && LA7_0 <= '\u00D6')||(LA7_0 >= '\u00D8' && LA7_0 <= '\u00F6')||(LA7_0 >= '\u00F8' && LA7_0 <= '\u02FF')||(LA7_0 >= '\u0370' && LA7_0 <= '\u037D')||(LA7_0 >= '\u037F' && LA7_0 <= '\u1FFF')||(LA7_0 >= '\u200C' && LA7_0 <= '\u200D')||(LA7_0 >= '\u2070' && LA7_0 <= '\u218F')||(LA7_0 >= '\u2C00' && LA7_0 <= '\u2FEF')||(LA7_0 >= '\u3001' && LA7_0 <= '\uD7FF')||(LA7_0 >= '\uF900' && LA7_0 <= '\uFDCF')||(LA7_0 >= '\uFDF0' && LA7_0 <= '\uFFFD')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u02FF')||(input.LA(1) >= '\u0370' && input.LA(1) <= '\u037D')||(input.LA(1) >= '\u037F' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u200C' && input.LA(1) <= '\u200D')||(input.LA(1) >= '\u2070' && input.LA(1) <= '\u218F')||(input.LA(1) >= '\u2C00' && input.LA(1) <= '\u2FEF')||(input.LA(1) >= '\u3001' && input.LA(1) <= '\uD7FF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFDCF')||(input.LA(1) >= '\uFDF0' && input.LA(1) <= '\uFFFD') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	@Override
	public void mTokens() throws RecognitionException {
		// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:8: ( SELECT | COUNT | ARTICLE | TITRE | RUBRIQUE | PAGE | AND | OR | POINT | MOT | JOUR | MOIS | ANNEE | DATE | ENTRE | WS | VAR )
		int alt8=17;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:17: COUNT
				{
				mCOUNT(); 

				}
				break;
			case 3 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:23: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 4 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:31: TITRE
				{
				mTITRE(); 

				}
				break;
			case 5 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:37: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 6 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:46: PAGE
				{
				mPAGE(); 

				}
				break;
			case 7 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:51: AND
				{
				mAND(); 

				}
				break;
			case 8 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:55: OR
				{
				mOR(); 

				}
				break;
			case 9 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:58: POINT
				{
				mPOINT(); 

				}
				break;
			case 10 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:64: MOT
				{
				mMOT(); 

				}
				break;
			case 11 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:68: JOUR
				{
				mJOUR(); 

				}
				break;
			case 12 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:73: MOIS
				{
				mMOIS(); 

				}
				break;
			case 13 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:78: ANNEE
				{
				mANNEE(); 

				}
				break;
			case 14 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:84: DATE
				{
				mDATE(); 

				}
				break;
			case 15 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:89: ENTRE
				{
				mENTRE(); 

				}
				break;
			case 16 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:95: WS
				{
				mWS(); 

				}
				break;
			case 17 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:98: VAR
				{
				mVAR(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\26\uffff\11\25\1\11\1\22\1\77\3\25\1\106\2\25\1\22\4\25\2\22\1\25\2\22"+
		"\15\25\1\uffff\1\25\1\137\1\22\1\25\1\141\3\uffff\6\25\2\22\10\25\1\141"+
		"\2\25\1\163\3\25\1\uffff\1\141\1\uffff\1\25\1\141\4\25\2\22\6\25\1\141"+
		"\1\u0084\1\25\1\uffff\1\25\1\u0087\6\25\1\22\4\25\1\u0092\2\25\1\uffff"+
		"\1\25\1\137\1\uffff\7\25\1\u009d\1\u0092\1\25\1\uffff\1\25\1\u00a0\1\25"+
		"\4\141\2\25\1\22\1\uffff\1\137\1\141\1\uffff\1\u00a4\1\25\1\141\1\uffff"+
		"\1\141";
	static final String DFA8_eofS =
		"\u00a6\uffff";
	static final String DFA8_minS =
		"\1\11\4\101\1\55\3\101\1\uffff\1\101\1\uffff\1\101\1\60\4\101\1\uffff"+
		"\2\101\1\uffff\1\165\2\155\1\164\1\162\1\u00fb\1\164\1\142\1\147\3\101"+
		"\1\164\2\151\1\57\1\156\1\151\1\101\1\166\1\160\1\143\1\156\2\101\1\145"+
		"\2\101\1\154\1\142\1\164\1\142\1\145\2\151\1\164\2\162\1\145\1\154\1\162"+
		"\1\uffff\1\157\2\101\1\163\1\101\3\uffff\1\166\1\154\1\162\1\164\1\145"+
		"\1\164\2\101\1\154\1\157\1\151\1\145\1\162\1\155\1\143\1\154\1\101\1\145"+
		"\1\151\1\101\2\145\1\142\1\uffff\1\101\1\uffff\1\151\1\101\1\154\1\151"+
		"\1\145\1\155\2\101\1\151\1\145\1\156\1\145\1\142\1\154\2\101\1\161\1\uffff"+
		"\1\162\1\101\1\162\3\145\1\155\1\142\1\101\1\145\1\162\1\156\1\151\1\101"+
		"\1\162\1\145\1\uffff\1\165\1\101\1\uffff\1\145\1\162\1\164\1\162\1\142"+
		"\1\162\1\163\2\101\1\162\1\uffff\1\145\1\101\1\145\4\101\1\162\1\145\1"+
		"\101\1\uffff\2\101\1\uffff\1\101\1\145\1\101\1\uffff\1\101";
	static final String DFA8_maxS =
		"\11\ufffd\1\uffff\1\ufffd\1\uffff\1\ufffd\1\71\4\ufffd\1\uffff\2\ufffd"+
		"\1\uffff\1\165\1\156\1\166\1\164\1\162\1\u00fb\1\164\1\142\1\162\3\ufffd"+
		"\2\164\1\162\1\71\1\156\1\151\1\ufffd\1\166\1\160\1\143\1\156\2\ufffd"+
		"\1\151\2\ufffd\1\154\1\142\1\164\1\142\1\145\2\151\1\164\2\162\1\145\1"+
		"\154\1\162\1\uffff\1\157\2\ufffd\1\163\1\ufffd\3\uffff\1\166\1\156\1\162"+
		"\1\164\1\145\1\164\2\ufffd\1\154\1\157\1\151\1\145\1\162\1\155\1\143\1"+
		"\154\1\ufffd\1\145\1\151\1\ufffd\2\145\1\142\1\uffff\1\ufffd\1\uffff\1"+
		"\151\1\ufffd\1\154\1\151\1\145\1\155\2\ufffd\1\151\1\145\1\156\1\145\1"+
		"\142\1\154\2\ufffd\1\161\1\uffff\1\162\1\ufffd\1\162\3\145\1\155\1\142"+
		"\1\ufffd\1\145\1\162\1\156\1\151\1\ufffd\1\162\1\145\1\uffff\1\165\1\ufffd"+
		"\1\uffff\1\145\1\162\1\164\1\162\1\142\1\162\1\163\2\ufffd\1\162\1\uffff"+
		"\1\145\1\ufffd\1\145\4\ufffd\1\162\1\145\1\ufffd\1\uffff\2\ufffd\1\uffff"+
		"\1\ufffd\1\145\1\ufffd\1\uffff\1\ufffd";
	static final String DFA8_acceptS =
		"\11\uffff\1\7\1\uffff\1\11\6\uffff\1\20\2\uffff\1\21\51\uffff\1\10\5\uffff"+
		"\1\15\1\13\1\16\27\uffff\1\12\1\uffff\1\14\21\uffff\1\6\20\uffff\1\4\2"+
		"\uffff\1\17\12\uffff\1\2\12\uffff\1\1\2\uffff\1\3\3\uffff\1\5\1\uffff";
	static final String DFA8_specialS =
		"\u00a6\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\22\2\uffff\1\22\22\uffff\1\22\13\uffff\1\11\1\uffff\1\13\1\uffff\12"+
			"\15\5\uffff\1\13\1\uffff\32\25\6\uffff\1\4\1\25\1\2\1\21\1\10\1\17\3"+
			"\25\1\16\1\25\1\24\1\14\1\3\1\12\1\7\1\23\1\6\1\20\1\5\1\25\1\1\4\25"+
			"\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25\160\uffff\16\25\1\uffff"+
			"\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70\uffff\u03f0\25\21\uffff"+
			"\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e\25",
			"\32\25\6\uffff\16\25\1\26\13\25\105\uffff\27\25\1\uffff\37\25\1\uffff"+
			"\u0208\25\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120"+
			"\25\u0a70\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff"+
			"\u020e\25",
			"\32\25\6\uffff\16\25\1\27\13\25\105\uffff\27\25\1\uffff\37\25\1\uffff"+
			"\u0208\25\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120"+
			"\25\u0a70\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff"+
			"\u020e\25",
			"\32\25\6\uffff\16\25\1\30\13\25\105\uffff\27\25\1\uffff\37\25\1\uffff"+
			"\u0208\25\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120"+
			"\25\u0a70\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff"+
			"\u020e\25",
			"\32\25\6\uffff\16\25\1\33\2\25\1\31\3\25\1\32\4\25\105\uffff\27\25\1"+
			"\uffff\37\25\1\uffff\u0208\25\160\uffff\16\25\1\uffff\u1c81\25\14\uffff"+
			"\2\25\142\uffff\u0120\25\u0a70\uffff\u03f0\25\21\uffff\ua7ff\25\u2100"+
			"\uffff\u04d0\25\40\uffff\u020e\25",
			"\1\22\23\uffff\32\25\6\uffff\10\25\1\34\21\25\105\uffff\27\25\1\uffff"+
			"\37\25\1\uffff\u0208\25\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25"+
			"\142\uffff\u0120\25\u0a70\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff"+
			"\u04d0\25\40\uffff\u020e\25",
			"\32\25\6\uffff\24\25\1\35\5\25\105\uffff\27\25\1\uffff\37\25\1\uffff"+
			"\u0208\25\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120"+
			"\25\u0a70\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff"+
			"\u020e\25",
			"\32\25\6\uffff\1\36\31\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208"+
			"\25\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25"+
			"\u0a70\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff"+
			"\u020e\25",
			"\32\25\6\uffff\15\25\1\40\5\25\1\37\6\25\105\uffff\27\25\1\uffff\37"+
			"\25\1\uffff\u0208\25\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142"+
			"\uffff\u0120\25\u0a70\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0"+
			"\25\40\uffff\u020e\25",
			"",
			"\32\25\6\uffff\2\25\1\42\21\25\1\41\5\25\105\uffff\27\25\1\uffff\37"+
			"\25\1\uffff\u0208\25\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142"+
			"\uffff\u0120\25\u0a70\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0"+
			"\25\40\uffff\u020e\25",
			"",
			"\32\25\6\uffff\1\44\15\25\1\43\13\25\105\uffff\27\25\1\uffff\37\25\1"+
			"\uffff\u0208\25\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff"+
			"\u0120\25\u0a70\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25"+
			"\40\uffff\u020e\25",
			"\12\45",
			"\32\25\6\uffff\1\46\3\25\1\50\17\25\1\47\5\25\105\uffff\27\25\1\uffff"+
			"\37\25\1\uffff\u0208\25\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25"+
			"\142\uffff\u0120\25\u0a70\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff"+
			"\u04d0\25\40\uffff\u020e\25",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\21\25\1\51\15\25\1\uffff"+
			"\u0208\25\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120"+
			"\25\u0a70\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff"+
			"\u020e\25",
			"\32\25\6\uffff\4\25\1\52\25\25\105\uffff\27\25\1\uffff\37\25\1\uffff"+
			"\u0208\25\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120"+
			"\25\u0a70\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff"+
			"\u020e\25",
			"\32\25\6\uffff\4\25\1\55\11\25\1\54\5\25\1\56\5\25\105\uffff\27\25\1"+
			"\uffff\21\25\1\53\15\25\1\uffff\u0208\25\160\uffff\16\25\1\uffff\u1c81"+
			"\25\14\uffff\2\25\142\uffff\u0120\25\u0a70\uffff\u03f0\25\21\uffff\ua7ff"+
			"\25\u2100\uffff\u04d0\25\40\uffff\u020e\25",
			"",
			"\32\25\6\uffff\24\25\1\57\5\25\105\uffff\27\25\1\uffff\37\25\1\uffff"+
			"\u0208\25\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120"+
			"\25\u0a70\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff"+
			"\u020e\25",
			"\32\25\6\uffff\1\61\3\25\1\60\25\25\105\uffff\27\25\1\uffff\37\25\1"+
			"\uffff\u0208\25\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff"+
			"\u0120\25\u0a70\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25"+
			"\40\uffff\u020e\25",
			"",
			"\1\62",
			"\1\63\1\64",
			"\1\65\10\uffff\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74\12\uffff\1\75",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\32\25\6\uffff\23\25\1\76\6\25\105\uffff\27\25\1\uffff\37\25\1\uffff"+
			"\u0208\25\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120"+
			"\25\u0a70\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff"+
			"\u020e\25",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\1\100",
			"\1\102\12\uffff\1\101",
			"\1\104\10\uffff\1\103",
			"\1\107\12\105",
			"\1\110",
			"\1\111",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\32\25\6\uffff\22\25\1\116\7\25\105\uffff\27\25\1\uffff\37\25\1\uffff"+
			"\u0208\25\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120"+
			"\25\u0a70\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff"+
			"\u020e\25",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\1\120\3\uffff\1\117",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"",
			"\1\136",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\1\140",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"",
			"",
			"",
			"\1\142",
			"\1\144\1\uffff\1\143",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\1\161",
			"\1\162",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\1\164",
			"\1\165",
			"\1\166",
			"",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"",
			"\1\167",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\32\25\6\uffff\13\25\1\175\6\25\1\174\7\25\105\uffff\27\25\1\uffff\37"+
			"\25\1\uffff\u0208\25\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142"+
			"\uffff\u0120\25\u0a70\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0"+
			"\25\40\uffff\u020e\25",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\1\u0085",
			"",
			"\1\u0086",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\1\u0093",
			"\1\u0094",
			"",
			"\1\u0095",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\1\u009e",
			"",
			"\1\u009f",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\1\u00a1",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\1\u00a2",
			"\1\u00a3",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"\1\u00a5",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25",
			"",
			"\32\25\6\uffff\32\25\105\uffff\27\25\1\uffff\37\25\1\uffff\u0208\25"+
			"\160\uffff\16\25\1\uffff\u1c81\25\14\uffff\2\25\142\uffff\u0120\25\u0a70"+
			"\uffff\u03f0\25\21\uffff\ua7ff\25\u2100\uffff\u04d0\25\40\uffff\u020e"+
			"\25"
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | COUNT | ARTICLE | TITRE | RUBRIQUE | PAGE | AND | OR | POINT | MOT | JOUR | MOIS | ANNEE | DATE | ENTRE | WS | VAR );";
		}
	}

}
