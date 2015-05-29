// $ANTLR 3.5.1 /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g 2015-05-29 16:38:18

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

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:6:9: ( 'article' )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:6:11: 'article'
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
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:8:7: ( 'titre' )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:8:10: 'titre'
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

	// $ANTLR start "PAGE"
	public final void mPAGE() throws RecognitionException {
		try {
			int _type = PAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:11:6: ( 'page' )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:11:8: 'page'
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
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:14:6: ( 'et' | ',' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='e') ) {
				alt1=1;
			}
			else if ( (LA1_0==',') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:14:8: 'et'
					{
					match("et"); 

					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:14:15: ','
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
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:17:4: ( 'ou' )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:17:6: 'ou'
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
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:20:7: ( '.' | '?' )
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
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:23:5: ( 'mot' | 'contenir' | 'parler' )
			int alt2=3;
			switch ( input.LA(1) ) {
			case 'm':
				{
				alt2=1;
				}
				break;
			case 'c':
				{
				alt2=2;
				}
				break;
			case 'p':
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:23:7: 'mot'
					{
					match("mot"); 

					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:23:15: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 3 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:23:28: 'parler'
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
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:26:6: ( ( '0' .. '9' ) ( '0' .. '9' ) )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:26:7: ( '0' .. '9' ) ( '0' .. '9' )
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
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:29:5: ( 'janvier' | 'février' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'août' | 'septembre' | 'octobre' | 'novembre' | 'décembre' )
			int alt3=12;
			switch ( input.LA(1) ) {
			case 'j':
				{
				int LA3_1 = input.LA(2);
				if ( (LA3_1=='a') ) {
					alt3=1;
				}
				else if ( (LA3_1=='u') ) {
					int LA3_10 = input.LA(3);
					if ( (LA3_10=='i') ) {
						int LA3_14 = input.LA(4);
						if ( (LA3_14=='n') ) {
							alt3=6;
						}
						else if ( (LA3_14=='l') ) {
							alt3=7;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 14, input);
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
								new NoViableAltException("", 3, 10, input);
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
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'f':
				{
				alt3=2;
				}
				break;
			case 'm':
				{
				int LA3_3 = input.LA(2);
				if ( (LA3_3=='a') ) {
					int LA3_11 = input.LA(3);
					if ( (LA3_11=='r') ) {
						alt3=3;
					}
					else if ( (LA3_11=='i') ) {
						alt3=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 11, input);
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
							new NoViableAltException("", 3, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'a':
				{
				int LA3_4 = input.LA(2);
				if ( (LA3_4=='v') ) {
					alt3=4;
				}
				else if ( (LA3_4=='o') ) {
					alt3=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 's':
				{
				alt3=9;
				}
				break;
			case 'o':
				{
				alt3=10;
				}
				break;
			case 'n':
				{
				alt3=11;
				}
				break;
			case 'd':
				{
				alt3=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:29:7: 'janvier'
					{
					match("janvier"); 

					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:29:19: 'février'
					{
					match("février"); 

					}
					break;
				case 3 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:29:31: 'mars'
					{
					match("mars"); 

					}
					break;
				case 4 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:29:40: 'avril'
					{
					match("avril"); 

					}
					break;
				case 5 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:29:50: 'mai'
					{
					match("mai"); 

					}
					break;
				case 6 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:29:58: 'juin'
					{
					match("juin"); 

					}
					break;
				case 7 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:29:67: 'juillet'
					{
					match("juillet"); 

					}
					break;
				case 8 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:29:79: 'août'
					{
					match("août"); 

					}
					break;
				case 9 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:29:88: 'septembre'
					{
					match("septembre"); 

					}
					break;
				case 10 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:29:102: 'octobre'
					{
					match("octobre"); 

					}
					break;
				case 11 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:29:114: 'novembre'
					{
					match("novembre"); 

					}
					break;
				case 12 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:29:127: 'décembre'
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
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:32:7: ( ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:32:9: ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:35:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'moi' | 'dont' | 't-il' | 'de' | 'des' | 'du' | 'en' | 'quel' | 'quels' | 'quelles' | 'le' | 'la' ) | '\\n' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='\t'||LA5_0=='\r'||LA5_0==' '||(LA5_0 >= 'd' && LA5_0 <= 'e')||LA5_0=='j'||(LA5_0 >= 'l' && LA5_0 <= 'm')||LA5_0=='q'||LA5_0=='t') ) {
				alt5=1;
			}
			else if ( (LA5_0=='\n') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:35:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'moi' | 'dont' | 't-il' | 'de' | 'des' | 'du' | 'en' | 'quel' | 'quels' | 'quelles' | 'le' | 'la' )
					{
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:35:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'moi' | 'dont' | 't-il' | 'de' | 'des' | 'du' | 'en' | 'quel' | 'quels' | 'quelles' | 'le' | 'la' )
					int alt4=17;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt4=1;
						}
						break;
					case '\t':
						{
						alt4=2;
						}
						break;
					case '\r':
						{
						alt4=3;
						}
						break;
					case 'j':
						{
						alt4=4;
						}
						break;
					case 'q':
						{
						int LA4_5 = input.LA(2);
						if ( (LA4_5=='u') ) {
							int LA4_11 = input.LA(3);
							if ( (LA4_11=='i') ) {
								alt4=5;
							}
							else if ( (LA4_11=='e') ) {
								int LA4_18 = input.LA(4);
								if ( (LA4_18=='l') ) {
									switch ( input.LA(5) ) {
									case 's':
										{
										alt4=14;
										}
										break;
									case 'l':
										{
										alt4=15;
										}
										break;
									default:
										alt4=13;
									}
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 4, 18, input);
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
									new NoViableAltException("", 4, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 'm':
						{
						alt4=6;
						}
						break;
					case 'd':
						{
						switch ( input.LA(2) ) {
						case 'o':
							{
							alt4=7;
							}
							break;
						case 'e':
							{
							int LA4_13 = input.LA(3);
							if ( (LA4_13=='s') ) {
								alt4=10;
							}

							else {
								alt4=9;
							}

							}
							break;
						case 'u':
							{
							alt4=11;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 4, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case 't':
						{
						alt4=8;
						}
						break;
					case 'e':
						{
						alt4=12;
						}
						break;
					case 'l':
						{
						int LA4_10 = input.LA(2);
						if ( (LA4_10=='e') ) {
							alt4=16;
						}
						else if ( (LA4_10=='a') ) {
							alt4=17;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 4, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}
					switch (alt4) {
						case 1 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:35:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:35:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:35:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:35:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:35:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:35:42: 'moi'
							{
							match("moi"); 

							}
							break;
						case 7 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:35:50: 'dont'
							{
							match("dont"); 

							}
							break;
						case 8 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:35:59: 't-il'
							{
							match("t-il"); 

							}
							break;
						case 9 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:35:68: 'de'
							{
							match("de"); 

							}
							break;
						case 10 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:35:75: 'des'
							{
							match("des"); 

							}
							break;
						case 11 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:35:84: 'du'
							{
							match("du"); 

							}
							break;
						case 12 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:35:91: 'en'
							{
							match("en"); 

							}
							break;
						case 13 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:35:98: 'quel'
							{
							match("quel"); 

							}
							break;
						case 14 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:35:107: 'quels'
							{
							match("quels"); 

							}
							break;
						case 15 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:35:117: 'quelles'
							{
							match("quelles"); 

							}
							break;
						case 16 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:35:129: 'le'
							{
							match("le"); 

							}
							break;
						case 17 :
							// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:35:136: 'la'
							{
							match("la"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:35:155: '\\n'
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
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:41:4: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' )
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
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:54:6: ( CHAR ( CHAR )+ )
			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:54:7: CHAR ( CHAR )+
			{
			mCHAR(); 

			// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:54:12: ( CHAR )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= 'A' && LA6_0 <= 'Z')||(LA6_0 >= 'a' && LA6_0 <= 'z')||(LA6_0 >= '\u00C0' && LA6_0 <= '\u00D6')||(LA6_0 >= '\u00D8' && LA6_0 <= '\u00F6')||(LA6_0 >= '\u00F8' && LA6_0 <= '\u02FF')||(LA6_0 >= '\u0370' && LA6_0 <= '\u037D')||(LA6_0 >= '\u037F' && LA6_0 <= '\u1FFF')||(LA6_0 >= '\u200C' && LA6_0 <= '\u200D')||(LA6_0 >= '\u2070' && LA6_0 <= '\u218F')||(LA6_0 >= '\u2C00' && LA6_0 <= '\u2FEF')||(LA6_0 >= '\u3001' && LA6_0 <= '\uD7FF')||(LA6_0 >= '\uF900' && LA6_0 <= '\uFDCF')||(LA6_0 >= '\uFDF0' && LA6_0 <= '\uFFFD')) ) {
					alt6=1;
				}

				switch (alt6) {
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
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
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
		// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:8: ( SELECT | ARTICLE | TITRE | PAGE | AND | OR | POINT | MOT | JOUR | MOIS | ANNEE | WS | VAR )
		int alt7=13;
		alt7 = dfa7.predict(input);
		switch (alt7) {
			case 1 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:17: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 3 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:25: TITRE
				{
				mTITRE(); 

				}
				break;
			case 4 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:31: PAGE
				{
				mPAGE(); 

				}
				break;
			case 5 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:36: AND
				{
				mAND(); 

				}
				break;
			case 6 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:40: OR
				{
				mOR(); 

				}
				break;
			case 7 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:43: POINT
				{
				mPOINT(); 

				}
				break;
			case 8 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:49: MOT
				{
				mMOT(); 

				}
				break;
			case 9 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:53: JOUR
				{
				mJOUR(); 

				}
				break;
			case 10 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:58: MOIS
				{
				mMOIS(); 

				}
				break;
			case 11 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:63: ANNEE
				{
				mANNEE(); 

				}
				break;
			case 12 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:69: WS
				{
				mWS(); 

				}
				break;
			case 13 :
				// /volsme/users/lo17p016/Documents/INDEX/LO17/TD4/tal_sql.g:1:72: VAR
				{
				mVAR(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\25\uffff\6\24\1\6\1\21\1\67\4\24\1\77\2\24\1\21\5\24\2\21\1\24\2\21\7"+
		"\24\1\uffff\1\24\1\122\1\21\1\24\1\124\1\24\2\uffff\7\24\2\21\4\24\1\124"+
		"\1\24\1\143\2\24\1\uffff\1\124\1\uffff\2\24\1\124\5\24\2\21\2\24\1\124"+
		"\1\161\1\uffff\11\24\1\21\3\24\1\uffff\1\122\11\24\1\u0087\1\u0088\1\124"+
		"\1\24\3\124\3\24\1\21\2\uffff\1\122\1\24\3\124";
	static final String DFA7_eofS =
		"\u008e\uffff";
	static final String DFA7_minS =
		"\1\11\2\101\1\55\2\101\1\uffff\1\101\1\uffff\2\101\1\60\5\101\1\uffff"+
		"\2\101\1\uffff\1\165\1\164\1\162\1\u00fb\1\164\1\147\3\101\1\164\2\151"+
		"\1\156\1\60\1\156\1\151\1\101\1\166\1\160\1\166\1\143\1\156\2\101\1\145"+
		"\2\101\1\154\2\151\1\164\1\162\1\145\1\154\1\uffff\1\157\2\101\1\163\1"+
		"\101\1\164\2\uffff\1\166\1\154\1\162\1\164\2\145\1\164\2\101\1\154\1\157"+
		"\1\143\1\154\1\101\1\145\1\101\1\145\1\142\1\uffff\1\101\1\uffff\1\145"+
		"\1\151\1\101\1\154\1\151\1\145\2\155\2\101\1\151\1\154\2\101\1\uffff\2"+
		"\162\1\156\3\145\1\155\2\142\1\101\1\145\1\162\1\145\1\uffff\1\101\1\145"+
		"\1\151\1\162\1\164\1\162\1\142\2\162\1\163\3\101\1\162\3\101\1\162\2\145"+
		"\1\101\2\uffff\1\101\1\145\3\101";
	static final String DFA7_maxS =
		"\6\ufffd\1\uffff\1\ufffd\1\uffff\2\ufffd\1\71\5\ufffd\1\uffff\2\ufffd"+
		"\1\uffff\1\165\1\164\1\162\1\u00fb\1\164\1\162\3\ufffd\2\164\1\162\1\156"+
		"\1\71\1\156\1\151\1\ufffd\1\166\1\160\1\166\1\143\1\156\2\ufffd\1\151"+
		"\2\ufffd\1\154\2\151\1\164\1\162\1\145\1\154\1\uffff\1\157\2\ufffd\1\163"+
		"\1\ufffd\1\164\2\uffff\1\166\1\156\1\162\1\164\2\145\1\164\2\ufffd\1\154"+
		"\1\157\1\143\1\154\1\ufffd\1\145\1\ufffd\1\145\1\142\1\uffff\1\ufffd\1"+
		"\uffff\1\145\1\151\1\ufffd\1\154\1\151\1\145\2\155\2\ufffd\1\151\1\154"+
		"\2\ufffd\1\uffff\2\162\1\156\3\145\1\155\2\142\1\ufffd\1\145\1\162\1\145"+
		"\1\uffff\1\ufffd\1\145\1\151\1\162\1\164\1\162\1\142\2\162\1\163\3\ufffd"+
		"\1\162\3\ufffd\1\162\2\145\1\ufffd\2\uffff\1\ufffd\1\145\3\ufffd";
	static final String DFA7_acceptS =
		"\6\uffff\1\5\1\uffff\1\7\10\uffff\1\14\2\uffff\1\15\42\uffff\1\6\6\uffff"+
		"\1\13\1\11\22\uffff\1\10\1\uffff\1\12\16\uffff\1\4\15\uffff\1\3\25\uffff"+
		"\1\1\1\2\5\uffff";
	static final String DFA7_specialS =
		"\u008e\uffff}>";
	static final String[] DFA7_transitionS = {
			"\2\21\2\uffff\1\21\22\uffff\1\21\13\uffff\1\6\1\uffff\1\10\1\uffff\12"+
			"\13\5\uffff\1\10\1\uffff\32\24\6\uffff\1\2\1\24\1\12\1\20\1\5\1\15\3"+
			"\24\1\14\1\24\1\23\1\11\1\17\1\7\1\4\1\22\1\24\1\16\1\3\1\24\1\1\4\24"+
			"\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24\160\uffff\16\24\1\uffff"+
			"\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70\uffff\u03f0\24\21\uffff"+
			"\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e\24",
			"\32\24\6\uffff\16\24\1\25\13\24\105\uffff\27\24\1\uffff\37\24\1\uffff"+
			"\u0208\24\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120"+
			"\24\u0a70\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff"+
			"\u020e\24",
			"\32\24\6\uffff\16\24\1\30\2\24\1\26\3\24\1\27\4\24\105\uffff\27\24\1"+
			"\uffff\37\24\1\uffff\u0208\24\160\uffff\16\24\1\uffff\u1c81\24\14\uffff"+
			"\2\24\142\uffff\u0120\24\u0a70\uffff\u03f0\24\21\uffff\ua7ff\24\u2100"+
			"\uffff\u04d0\24\40\uffff\u020e\24",
			"\1\21\23\uffff\32\24\6\uffff\10\24\1\31\21\24\105\uffff\27\24\1\uffff"+
			"\37\24\1\uffff\u0208\24\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24"+
			"\142\uffff\u0120\24\u0a70\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff"+
			"\u04d0\24\40\uffff\u020e\24",
			"\32\24\6\uffff\1\32\31\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208"+
			"\24\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24"+
			"\u0a70\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff"+
			"\u020e\24",
			"\32\24\6\uffff\15\24\1\34\5\24\1\33\6\24\105\uffff\27\24\1\uffff\37"+
			"\24\1\uffff\u0208\24\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142"+
			"\uffff\u0120\24\u0a70\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0"+
			"\24\40\uffff\u020e\24",
			"",
			"\32\24\6\uffff\2\24\1\36\21\24\1\35\5\24\105\uffff\27\24\1\uffff\37"+
			"\24\1\uffff\u0208\24\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142"+
			"\uffff\u0120\24\u0a70\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0"+
			"\24\40\uffff\u020e\24",
			"",
			"\32\24\6\uffff\1\40\15\24\1\37\13\24\105\uffff\27\24\1\uffff\37\24\1"+
			"\uffff\u0208\24\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff"+
			"\u0120\24\u0a70\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24"+
			"\40\uffff\u020e\24",
			"\32\24\6\uffff\16\24\1\41\13\24\105\uffff\27\24\1\uffff\37\24\1\uffff"+
			"\u0208\24\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120"+
			"\24\u0a70\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff"+
			"\u020e\24",
			"\12\42",
			"\32\24\6\uffff\1\43\3\24\1\45\17\24\1\44\5\24\105\uffff\27\24\1\uffff"+
			"\37\24\1\uffff\u0208\24\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24"+
			"\142\uffff\u0120\24\u0a70\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff"+
			"\u04d0\24\40\uffff\u020e\24",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\21\24\1\46\15\24\1\uffff"+
			"\u0208\24\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120"+
			"\24\u0a70\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff"+
			"\u020e\24",
			"\32\24\6\uffff\4\24\1\47\25\24\105\uffff\27\24\1\uffff\37\24\1\uffff"+
			"\u0208\24\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120"+
			"\24\u0a70\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff"+
			"\u020e\24",
			"\32\24\6\uffff\16\24\1\50\13\24\105\uffff\27\24\1\uffff\37\24\1\uffff"+
			"\u0208\24\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120"+
			"\24\u0a70\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff"+
			"\u020e\24",
			"\32\24\6\uffff\4\24\1\53\11\24\1\52\5\24\1\54\5\24\105\uffff\27\24\1"+
			"\uffff\21\24\1\51\15\24\1\uffff\u0208\24\160\uffff\16\24\1\uffff\u1c81"+
			"\24\14\uffff\2\24\142\uffff\u0120\24\u0a70\uffff\u03f0\24\21\uffff\ua7ff"+
			"\24\u2100\uffff\u04d0\24\40\uffff\u020e\24",
			"",
			"\32\24\6\uffff\24\24\1\55\5\24\105\uffff\27\24\1\uffff\37\24\1\uffff"+
			"\u0208\24\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120"+
			"\24\u0a70\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff"+
			"\u020e\24",
			"\32\24\6\uffff\1\57\3\24\1\56\25\24\105\uffff\27\24\1\uffff\37\24\1"+
			"\uffff\u0208\24\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff"+
			"\u0120\24\u0a70\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24"+
			"\40\uffff\u020e\24",
			"",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65\12\uffff\1\66",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\1\70",
			"\1\72\12\uffff\1\71",
			"\1\74\10\uffff\1\73",
			"\1\75",
			"\12\76",
			"\1\100",
			"\1\101",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\32\24\6\uffff\22\24\1\107\7\24\105\uffff\27\24\1\uffff\37\24\1\uffff"+
			"\u0208\24\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120"+
			"\24\u0a70\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff"+
			"\u020e\24",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\1\111\3\uffff\1\110",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"",
			"\1\121",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\1\123",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\1\125",
			"",
			"",
			"\1\126",
			"\1\130\1\uffff\1\127",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\1\142",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\1\144",
			"\1\145",
			"",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"",
			"\1\146",
			"\1\147",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\32\24\6\uffff\13\24\1\156\6\24\1\155\7\24\105\uffff\27\24\1\uffff\37"+
			"\24\1\uffff\u0208\24\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142"+
			"\uffff\u0120\24\u0a70\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0"+
			"\24\40\uffff\u020e\24",
			"\1\157",
			"\1\160",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\1\173",
			"\1\174",
			"\1\175",
			"",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\1\u0089",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"",
			"",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\1\u008d",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24",
			"\32\24\6\uffff\32\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u0208\24"+
			"\160\uffff\16\24\1\uffff\u1c81\24\14\uffff\2\24\142\uffff\u0120\24\u0a70"+
			"\uffff\u03f0\24\21\uffff\ua7ff\24\u2100\uffff\u04d0\24\40\uffff\u020e"+
			"\24"
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | ARTICLE | TITRE | PAGE | AND | OR | POINT | MOT | JOUR | MOIS | ANNEE | WS | VAR );";
		}
	}

}
