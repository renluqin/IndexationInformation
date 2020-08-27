// $ANTLR 3.5.1 E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g 2019-12-13 09:22:24

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ANNEE=4;
	public static final int ARTICLE=5;
	public static final int BULLETIN=6;
	public static final int CONDITION=7;
	public static final int CONJ=8;
	public static final int DATE=9;
	public static final int JOUR=10;
	public static final int MOT=11;
	public static final int NUM=12;
	public static final int NUMERO=13;
	public static final int POINT=14;
	public static final int RUBRIQUE=15;
	public static final int SELECT=16;
	public static final int SIGN=17;
	public static final int VAR=18;
	public static final int WS=19;

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
	@Override public String getGrammarFileName() { return "E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:3:8: ( 'vouloir' )
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:3:10: 'vouloir'
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
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:5:9: ( 'article' )
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:5:11: 'article'
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

	// $ANTLR start "BULLETIN"
	public final void mBULLETIN() throws RecognitionException {
		try {
			int _type = BULLETIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:8:10: ( 'bulletin' )
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:8:12: 'bulletin'
			{
			match("bulletin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BULLETIN"

	// $ANTLR start "CONJ"
	public final void mCONJ() throws RecognitionException {
		try {
			int _type = CONJ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:11:6: ( 'et' | 'ou' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='e') ) {
				alt1=1;
			}
			else if ( (LA1_0=='o') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:11:8: 'et'
					{
					match("et"); 

					}
					break;
				case 2 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:11:15: 'ou'
					{
					match("ou"); 

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
	// $ANTLR end "CONJ"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:14:7: ( '.' )
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:14:9: '.'
			{
			match('.'); 
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
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:17:5: ( 'mot' | 'contenir' | 'parler' )
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
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:17:7: 'mot'
					{
					match("mot"); 

					}
					break;
				case 2 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:17:15: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 3 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:17:28: 'parler'
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

	// $ANTLR start "RUBRIQUE"
	public final void mRUBRIQUE() throws RecognitionException {
		try {
			int _type = RUBRIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:20:10: ( 'rubrique' )
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:20:12: 'rubrique'
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

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:23:6: ( 'date' )
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:23:8: 'date'
			{
			match("date"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE"

	// $ANTLR start "JOUR"
	public final void mJOUR() throws RecognitionException {
		try {
			int _type = JOUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:26:6: ( ( '0' .. '3' ) ( '0' .. '9' ) )
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:26:8: ( '0' .. '3' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
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

	// $ANTLR start "ANNEE"
	public final void mANNEE() throws RecognitionException {
		try {
			int _type = ANNEE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:32:7: ( ( '0' .. '2' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:32:9: ( '0' .. '2' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '2') ) {
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

	// $ANTLR start "NUMERO"
	public final void mNUMERO() throws RecognitionException {
		try {
			int _type = NUMERO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:35:8: ( 'numero' )
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:35:10: 'numero'
			{
			match("numero"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMERO"

	// $ANTLR start "CONDITION"
	public final void mCONDITION() throws RecognitionException {
		try {
			int _type = CONDITION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:38:11: ( 'condition' )
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:38:13: 'condition'
			{
			match("condition"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONDITION"

	// $ANTLR start "SIGN"
	public final void mSIGN() throws RecognitionException {
		try {
			int _type = SIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:41:7: ( 'inferieur' | 'superieur' | 'avant' | 'apres' )
			int alt3=4;
			switch ( input.LA(1) ) {
			case 'i':
				{
				alt3=1;
				}
				break;
			case 's':
				{
				alt3=2;
				}
				break;
			case 'a':
				{
				int LA3_3 = input.LA(2);
				if ( (LA3_3=='v') ) {
					alt3=3;
				}
				else if ( (LA3_3=='p') ) {
					alt3=4;
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
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:41:9: 'inferieur'
					{
					match("inferieur"); 

					}
					break;
				case 2 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:41:23: 'superieur'
					{
					match("superieur"); 

					}
					break;
				case 3 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:41:37: 'avant'
					{
					match("avant"); 

					}
					break;
				case 4 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:41:47: 'apres'
					{
					match("apres"); 

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
	// $ANTLR end "SIGN"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:44:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' ) | '\\n' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='\t'||LA5_0=='\r'||LA5_0==' '||LA5_0=='d'||LA5_0=='j'||LA5_0=='q') ) {
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
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:44:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					{
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:44:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					int alt4=6;
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
						alt4=5;
						}
						break;
					case 'd':
						{
						alt4=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}
					switch (alt4) {
						case 1 :
							// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:44:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:44:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:44:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:44:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:44:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:44:42: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:44:62: '\\n'
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

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:47:6: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+ )
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:47:8: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:47:30: ( 'a' .. 'z' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:50:6: ( ( '0' .. '9' )+ )
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:50:8: ( '0' .. '9' )+
			{
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:50:8: ( '0' .. '9' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
	// $ANTLR end "NUM"

	@Override
	public void mTokens() throws RecognitionException {
		// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:1:8: ( SELECT | ARTICLE | BULLETIN | CONJ | POINT | MOT | RUBRIQUE | DATE | JOUR | ANNEE | NUMERO | CONDITION | SIGN | WS | VAR | NUM )
		int alt8=16;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:1:17: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 3 :
				// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:1:25: BULLETIN
				{
				mBULLETIN(); 

				}
				break;
			case 4 :
				// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:1:34: CONJ
				{
				mCONJ(); 

				}
				break;
			case 5 :
				// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:1:39: POINT
				{
				mPOINT(); 

				}
				break;
			case 6 :
				// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:1:45: MOT
				{
				mMOT(); 

				}
				break;
			case 7 :
				// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:1:49: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 8 :
				// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:1:58: DATE
				{
				mDATE(); 

				}
				break;
			case 9 :
				// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:1:63: JOUR
				{
				mJOUR(); 

				}
				break;
			case 10 :
				// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:1:68: ANNEE
				{
				mANNEE(); 

				}
				break;
			case 11 :
				// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:1:74: NUMERO
				{
				mNUMERO(); 

				}
				break;
			case 12 :
				// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:1:81: CONDITION
				{
				mCONDITION(); 

				}
				break;
			case 13 :
				// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:1:91: SIGN
				{
				mSIGN(); 

				}
				break;
			case 14 :
				// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:1:96: WS
				{
				mWS(); 

				}
				break;
			case 15 :
				// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:1:99: VAR
				{
				mVAR(); 

				}
				break;
			case 16 :
				// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:1:103: NUM
				{
				mNUM(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\14\uffff\2\25\10\uffff\5\24\2\57\6\24\2\67\3\24\1\21\6\24\1\uffff\1\101"+
		"\5\24\1\25\1\uffff\3\24\1\21\5\24\1\uffff\4\24\1\125\1\21\1\126\5\24\2"+
		"\134\5\24\2\uffff\5\24\1\uffff\3\24\1\101\1\24\1\153\2\24\1\156\1\157"+
		"\4\24\1\uffff\2\24\2\uffff\1\166\1\101\1\24\1\170\2\24\1\uffff\1\173\1"+
		"\uffff\2\134\1\uffff";
	static final String DFA8_eofS =
		"\174\uffff";
	static final String DFA8_minS =
		"\1\11\5\141\1\uffff\5\141\2\60\3\141\1\uffff\2\141\2\uffff\1\165\1\164"+
		"\1\141\1\162\1\154\2\141\1\164\1\156\1\162\1\142\1\164\1\156\2\60\1\155"+
		"\1\146\1\160\1\141\1\151\1\154\1\151\1\156\1\145\1\154\1\uffff\1\141\1"+
		"\144\1\154\1\162\1\145\1\164\1\60\1\uffff\3\145\1\141\1\157\1\143\1\164"+
		"\1\163\1\145\1\uffff\1\145\1\151\1\145\1\151\2\141\1\60\3\162\1\151\1"+
		"\154\2\141\1\164\1\156\1\164\1\162\1\161\2\uffff\1\157\2\151\1\162\1\145"+
		"\1\uffff\3\151\1\141\1\165\1\141\2\145\2\141\1\156\1\162\1\157\1\145\1"+
		"\uffff\2\165\2\uffff\2\141\1\156\1\141\2\162\1\uffff\1\141\1\uffff\2\141"+
		"\1\uffff";
	static final String DFA8_maxS =
		"\6\172\1\uffff\5\172\2\71\3\172\1\uffff\2\172\2\uffff\1\165\1\164\1\141"+
		"\1\162\1\154\2\172\1\164\1\156\1\162\1\142\1\164\1\156\2\71\1\155\1\146"+
		"\1\160\1\172\1\151\1\154\1\151\1\156\1\145\1\154\1\uffff\1\172\1\164\1"+
		"\154\1\162\1\145\1\164\1\71\1\uffff\3\145\1\172\1\157\1\143\1\164\1\163"+
		"\1\145\1\uffff\1\145\1\151\1\145\1\151\2\172\1\71\3\162\1\151\1\154\2"+
		"\172\1\164\1\156\1\164\1\162\1\161\2\uffff\1\157\2\151\1\162\1\145\1\uffff"+
		"\3\151\1\172\1\165\1\172\2\145\2\172\1\156\1\162\1\157\1\145\1\uffff\2"+
		"\165\2\uffff\2\172\1\156\1\172\2\162\1\uffff\1\172\1\uffff\2\172\1\uffff";
	static final String DFA8_acceptS =
		"\6\uffff\1\5\12\uffff\1\16\2\uffff\1\17\1\20\31\uffff\1\4\7\uffff\1\11"+
		"\11\uffff\1\6\23\uffff\1\10\1\12\5\uffff\1\15\16\uffff\1\13\2\uffff\1"+
		"\1\1\2\6\uffff\1\3\1\uffff\1\7\2\uffff\1\14";
	static final String DFA8_specialS =
		"\174\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\21\2\uffff\1\21\22\uffff\1\21\15\uffff\1\6\1\uffff\3\14\1\15\6\25"+
			"\7\uffff\32\24\6\uffff\1\2\1\3\1\10\1\13\1\4\3\24\1\17\1\22\2\24\1\7"+
			"\1\16\1\5\1\11\1\23\1\12\1\20\2\24\1\1\4\24",
			"\16\24\1\26\13\24",
			"\17\24\1\31\1\24\1\27\3\24\1\30\4\24",
			"\24\24\1\32\5\24",
			"\23\24\1\33\6\24",
			"\24\24\1\34\5\24",
			"",
			"\16\24\1\35\13\24",
			"\16\24\1\36\13\24",
			"\1\37\31\24",
			"\24\24\1\40\5\24",
			"\1\41\15\24\1\42\13\24",
			"\12\43",
			"\12\44",
			"\24\24\1\45\5\24",
			"\15\24\1\46\14\24",
			"\24\24\1\47\5\24",
			"",
			"\4\24\1\50\25\24",
			"\24\24\1\51\5\24",
			"",
			"",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\32\24",
			"\32\24",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\12\66",
			"\12\25",
			"\1\70",
			"\1\71",
			"\1\72",
			"\32\24",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"",
			"\32\24",
			"\1\103\17\uffff\1\102",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\12\110",
			"",
			"\1\111",
			"\1\112",
			"\1\113",
			"\32\24",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\32\24",
			"\32\24",
			"\12\25",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\32\24",
			"\32\24",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"",
			"",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"",
			"\1\147",
			"\1\150",
			"\1\151",
			"\32\24",
			"\1\152",
			"\32\24",
			"\1\154",
			"\1\155",
			"\32\24",
			"\32\24",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"",
			"\1\164",
			"\1\165",
			"",
			"",
			"\32\24",
			"\32\24",
			"\1\167",
			"\32\24",
			"\1\171",
			"\1\172",
			"",
			"\32\24",
			"",
			"\32\24",
			"\32\24",
			""
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
			return "1:1: Tokens : ( SELECT | ARTICLE | BULLETIN | CONJ | POINT | MOT | RUBRIQUE | DATE | JOUR | ANNEE | NUMERO | CONDITION | SIGN | WS | VAR | NUM );";
		}
	}

}
