// Generated from CoolLexer.g4 by ANTLR 4.5
package cool;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, TYPEID=2, OBJECTID=3, BOOL_CONST=4, INT_CONST=5, STR_CONST=6, 
		LPAREN=7, RPAREN=8, COLON=9, ATSYM=10, SEMICOLON=11, COMMA=12, PLUS=13, 
		MINUS=14, STAR=15, SLASH=16, TILDE=17, LT=18, EQUALS=19, LBRACE=20, RBRACE=21, 
		DOT=22, DARROW=23, LE=24, ASSIGN=25, CLASS=26, ELSE=27, FI=28, IF=29, 
		IN=30, INHERITS=31, LET=32, LOOP=33, POOL=34, THEN=35, WHILE=36, CASE=37, 
		ESAC=38, OF=39, NEW=40, ISVOID=41, NOT=42, WHITESPACE=43, SINGLE_LINE_COMMENT=44, 
		STRAY_COMMENT=45, START_COMMENT=46, STRING_EOF=47, STRING_START=48, OTHER_CHARACTERS=49, 
		COMMENT_START=50, COMMENT_END=51, ERR1=52, EOF_IN_COMMENT=53, ANYTHING=54, 
		ERR2=55, OCOM=56, ERR3=57, ERR4=58, CCOM=59, INCOM_TEXT=60, STRING_END=61, 
		NEWLINE_UNESC=62, EOF_IN_STR=63;
	public static final int COMMENT_MODE = 1;
	public static final int COMMENT_MODE2 = 2;
	public static final int STRING_MODE = 3;
	public static String[] modeNames = {
		"DEFAULT_MODE", "COMMENT_MODE", "COMMENT_MODE2", "STRING_MODE"
	};

	public static final String[] ruleNames = {
		"SEMICOLON", "DARROW", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", 
		"LET", "LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", "ISVOID", 
		"NOT", "BOOL_CONST", "OBJECTID", "TYPEID", "INT_CONST", "LPAREN", "RPAREN", 
		"COLON", "ATSYM", "COMMA", "PLUS", "MINUS", "STAR", "SLASH", "TILDE", 
		"LT", "EQUALS", "LBRACE", "RBRACE", "DOT", "LE", "ASSIGN", "WHITESPACE", 
		"SINGLE_LINE_COMMENT", "STRAY_COMMENT", "START_COMMENT", "STRING_EOF", 
		"STRING_START", "OTHER_CHARACTERS", "COMMENT_START", "COMMENT_END", "ERR1", 
		"EOF_IN_COMMENT", "ANYTHING", "ERR2", "OCOM", "ERR3", "ERR4", "CCOM", 
		"INCOM_TEXT", "STRING_END", "NEWLINE_UNESC", "EOF_IN_STR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'('", "')'", "':'", "'@'", 
		"';'", "','", "'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'='", "'{'", 
		"'}'", "'.'", "'=>'", "'<='", "'<-'", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ERROR", "TYPEID", "OBJECTID", "BOOL_CONST", "INT_CONST", "STR_CONST", 
		"LPAREN", "RPAREN", "COLON", "ATSYM", "SEMICOLON", "COMMA", "PLUS", "MINUS", 
		"STAR", "SLASH", "TILDE", "LT", "EQUALS", "LBRACE", "RBRACE", "DOT", "DARROW", 
		"LE", "ASSIGN", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", "LET", 
		"LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", "ISVOID", 
		"NOT", "WHITESPACE", "SINGLE_LINE_COMMENT", "STRAY_COMMENT", "START_COMMENT", 
		"STRING_EOF", "STRING_START", "OTHER_CHARACTERS", "COMMENT_START", "COMMENT_END", 
		"ERR1", "EOF_IN_COMMENT", "ANYTHING", "ERR2", "OCOM", "ERR3", "ERR4", 
		"CCOM", "INCOM_TEXT", "STRING_END", "NEWLINE_UNESC", "EOF_IN_STR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}



		/*
			YOU CAN ADD YOUR MEMBER VARIABLES AND METHODS HERE
		*/

		/**
		* Function to report errors.
		* Use this function whenever your lexer encounters any erroneous input
		* DO NOT EDIT THIS FUNCTION
		*/
		public void reportError(String errorString){
			setText(errorString);
			setType(ERROR);
		}

		public void processString() {
			Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
			String text = t.getText();

			StringBuilder str = new StringBuilder(0);
			//write your code to test strings here

			//the case where the last character of the text is \n
			if (text.charAt(text.length()-1)=='\n')
			{
				int j = 0;
				for(j = 0; j<(text.length()-1); j++)	//loop through for errors
				{
					if(text.charAt(j)=='\\')	//....\'\u0000'...
					{
						if (text.charAt(j+1)=='\u0000')
						{
							reportError("String contains escaped null character.");
							return;
						}
						j++;
						if(j==text.length()-1)	//misc case where the last \n is escaped, this contains EOF
						{
							reportError("EOF in string constant");
							return;
						}
					}
					if (text.charAt(j)=='\u0000')
					{
						reportError("String contains null character.");
						return;
					}
				}
				if(j>1024)	//when string constant is longer than 1024 effective characters
				{
					if ((j == 1025) && (text.charAt(j)=='\n'))	//accounting for the misc case of 1025 character string
					{
						reportError("Unterminated string constant");
						return;
					}
					reportError("String constant too long");
					return;
				}
				reportError("Unterminated string constant");
				//if no other error is encountered, then this is unterminated string
			}
			else
			{	//the case where it is not an unterminated string
			int i = 0;
			while( i < text.length() ) {
				//while iterating, since \ comes in pairs, the program is bound to reach 
				//either the last character or the last but one character
				if(i == text.length()-2) {	//iterator reaching the last but one character
					if(text.charAt(i)=='\\') {
						if(text.charAt(i+1) == '\u0000') {
							reportError("String contains escaped null character.");
							return;
						}
						//when the last but one character is \ , the last character is escaped
						//so whatever the last character, the string contains EOF
						reportError("EOF in string constant");
						return;
					}
				}
				if(i == text.length()-1) {	//iterator reaching the last character
					if(text.charAt(i)=='\\') {
						//if this case occurs, it means that this \ is not escaped by any other
						//and it does not have any other character next to it for escaping.
						//This is a backslash error.
						reportError("Backslash at end of file");
						return;
					} 
					else if(text.charAt(i) == '\u0000') {	//the misc case where last character is null followed by EOF
						reportError("String contains null character.");
						return;
					}
					else if(text.charAt(i)!='\"') {	// The case where the last character is anything but \"
						reportError("EOF in string constant");
						return;
					}//If the last character is \", this is a terminated string and execution of it follows.
				}
				if(text.charAt(i) == '\\') {	//special escaped characters
					if(text.charAt(i+1) == '\u0000') {
						reportError("String contains escaped null character.");
						return;
					}
					else if(text.charAt(i+1) == '\"')
						str.append('\"');
					else if(text.charAt(i+1) == 'b')
						str.append('\b');
					else if(text.charAt(i+1) == 't')
						str.append('\t');
					else if(text.charAt(i+1) == 'f')
						str.append('\f');
					else if(text.charAt(i+1) == 'n')
						str.append('\n');
					else
						str.append(text.charAt(i+1));
					i++;
				}
				else {
					if(text.charAt(i) == '\u0000') {
						reportError("String contains null character.");
						return;
					}
					str.append(text.charAt(i));	//remove the backslash if it is not a special escaped character
				}
				i++;
				if (str.length() > 1025)	//this string length here includes the last \"
				{
					reportError("String constant too long");
					return;
				}
			}
			String outText = str.toString();
			outText = outText.substring(0,outText.length()-1);	//removing the last \"

			setText(outText);
			setType(STR_CONST);	//terminated correct string constant
			}
		}

		public void errorChar() {	//function for processing invalid characters
			Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
			String text = t.getText();
			reportError(text);
		}


	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CoolLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 42:
			STRAY_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 44:
			STRING_EOF_action((RuleContext)_localctx, actionIndex);
			break;
		case 46:
			OTHER_CHARACTERS_action((RuleContext)_localctx, actionIndex);
			break;
		case 49:
			ERR1_action((RuleContext)_localctx, actionIndex);
			break;
		case 50:
			EOF_IN_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 52:
			ERR2_action((RuleContext)_localctx, actionIndex);
			break;
		case 54:
			ERR3_action((RuleContext)_localctx, actionIndex);
			break;
		case 55:
			ERR4_action((RuleContext)_localctx, actionIndex);
			break;
		case 58:
			STRING_END_action((RuleContext)_localctx, actionIndex);
			break;
		case 59:
			NEWLINE_UNESC_action((RuleContext)_localctx, actionIndex);
			break;
		case 60:
			EOF_IN_STR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STRAY_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			reportError("Unmatched *)");
			break;
		}
	}
	private void STRING_EOF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			reportError("EOF in string constant");
			break;
		}
	}
	private void OTHER_CHARACTERS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			errorChar();
			break;
		}
	}
	private void ERR1_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 reportError("EOF in comment"); 
			break;
		}
	}
	private void EOF_IN_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			 reportError("EOF in comment"); 
			break;
		}
	}
	private void ERR2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			 reportError("EOF in comment"); 
			break;
		}
	}
	private void ERR3_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			 reportError("EOF in comment"); 
			break;
		}
	}
	private void ERR4_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			 reportError("EOF in comment"); 
			break;
		}
	}
	private void STRING_END_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			processString();
			break;
		}
	}
	private void NEWLINE_UNESC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			processString();
			break;
		}
	}
	private void EOF_IN_STR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			processString();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2A\u01ad\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00e1\n\25\3\26\3\26\7\26\u00e5\n"+
		"\26\f\26\16\26\u00e8\13\26\3\27\3\27\7\27\u00ec\n\27\f\27\16\27\u00ef"+
		"\13\27\3\30\6\30\u00f2\n\30\r\30\16\30\u00f3\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\6*\u011b\n*\r*\16*\u011c"+
		"\3*\3*\3+\3+\3+\3+\7+\u0125\n+\f+\16+\u0128\13+\3+\5+\u012b\n+\3+\3+\3"+
		",\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3"+
		"\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\64\5\64\u0159\n\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\38\38\38\38\38\38\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3<"+
		"\3<\3<\7<\u0187\n<\f<\16<\u018a\13<\3<\3<\3<\3<\3<\3=\3=\3=\7=\u0194\n"+
		"=\f=\16=\u0197\13=\3=\3=\3=\3=\3=\3>\3>\3>\7>\u01a1\n>\f>\16>\u01a4\13"+
		">\3>\5>\u01a7\n>\3>\3>\3>\3>\3>\6\u0126\u0188\u0195\u01a2\2?\6\r\b\31"+
		"\n\34\f\35\16\36\20\37\22 \24!\26\"\30#\32$\34%\36& \'\"($)&*(+*,,\6."+
		"\5\60\4\62\7\64\t\66\n8\13:\f<\16>\17@\20B\21D\22F\23H\24J\25L\26N\27"+
		"P\30R\32T\33V-X.Z/\\\60^\61`\62b\63d\64f\65h\66j\67l8n9p:r;t<v=x>z?|@"+
		"~A\6\2\3\4\5\32\4\2EEee\4\2NNnn\4\2CCcc\4\2UUuu\4\2GGgg\4\2HHhh\4\2KK"+
		"kk\4\2PPpp\4\2JJjj\4\2TTtt\4\2VVvv\4\2QQqq\4\2RRrr\4\2YYyy\4\2XXxx\4\2"+
		"FFff\4\2WWww\3\2c|\7\2\62;C\\aac|~~\3\2C\\\3\2\62;\4\2\n\17\"\"\3\3\f"+
		"\f\6\2\f\f\34\34$$^^\u01b7\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2"+
		"\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2"+
		"\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3"+
		"\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2"+
		"\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3"+
		"\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2"+
		"\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2"+
		"T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2^\3\2\2\2\2`\3"+
		"\2\2\2\2b\3\2\2\2\3d\3\2\2\2\3f\3\2\2\2\3h\3\2\2\2\3j\3\2\2\2\3l\3\2\2"+
		"\2\4n\3\2\2\2\4p\3\2\2\2\4r\3\2\2\2\4t\3\2\2\2\4v\3\2\2\2\4x\3\2\2\2\5"+
		"z\3\2\2\2\5|\3\2\2\2\5~\3\2\2\2\6\u0080\3\2\2\2\b\u0082\3\2\2\2\n\u0085"+
		"\3\2\2\2\f\u008b\3\2\2\2\16\u0090\3\2\2\2\20\u0093\3\2\2\2\22\u0096\3"+
		"\2\2\2\24\u0099\3\2\2\2\26\u00a2\3\2\2\2\30\u00a6\3\2\2\2\32\u00ab\3\2"+
		"\2\2\34\u00b0\3\2\2\2\36\u00b5\3\2\2\2 \u00bb\3\2\2\2\"\u00c0\3\2\2\2"+
		"$\u00c5\3\2\2\2&\u00c8\3\2\2\2(\u00cc\3\2\2\2*\u00d3\3\2\2\2,\u00e0\3"+
		"\2\2\2.\u00e2\3\2\2\2\60\u00e9\3\2\2\2\62\u00f1\3\2\2\2\64\u00f5\3\2\2"+
		"\2\66\u00f7\3\2\2\28\u00f9\3\2\2\2:\u00fb\3\2\2\2<\u00fd\3\2\2\2>\u00ff"+
		"\3\2\2\2@\u0101\3\2\2\2B\u0103\3\2\2\2D\u0105\3\2\2\2F\u0107\3\2\2\2H"+
		"\u0109\3\2\2\2J\u010b\3\2\2\2L\u010d\3\2\2\2N\u010f\3\2\2\2P\u0111\3\2"+
		"\2\2R\u0113\3\2\2\2T\u0116\3\2\2\2V\u011a\3\2\2\2X\u0120\3\2\2\2Z\u012e"+
		"\3\2\2\2\\\u0133\3\2\2\2^\u0139\3\2\2\2`\u013d\3\2\2\2b\u0142\3\2\2\2"+
		"d\u0145\3\2\2\2f\u014b\3\2\2\2h\u0151\3\2\2\2j\u0158\3\2\2\2l\u015f\3"+
		"\2\2\2n\u0163\3\2\2\2p\u0167\3\2\2\2r\u016d\3\2\2\2t\u0173\3\2\2\2v\u0179"+
		"\3\2\2\2x\u017f\3\2\2\2z\u0188\3\2\2\2|\u0195\3\2\2\2~\u01a2\3\2\2\2\u0080"+
		"\u0081\7=\2\2\u0081\7\3\2\2\2\u0082\u0083\7?\2\2\u0083\u0084\7@\2\2\u0084"+
		"\t\3\2\2\2\u0085\u0086\t\2\2\2\u0086\u0087\t\3\2\2\u0087\u0088\t\4\2\2"+
		"\u0088\u0089\t\5\2\2\u0089\u008a\t\5\2\2\u008a\13\3\2\2\2\u008b\u008c"+
		"\t\6\2\2\u008c\u008d\t\3\2\2\u008d\u008e\t\5\2\2\u008e\u008f\t\6\2\2\u008f"+
		"\r\3\2\2\2\u0090\u0091\t\7\2\2\u0091\u0092\t\b\2\2\u0092\17\3\2\2\2\u0093"+
		"\u0094\t\b\2\2\u0094\u0095\t\7\2\2\u0095\21\3\2\2\2\u0096\u0097\t\b\2"+
		"\2\u0097\u0098\t\t\2\2\u0098\23\3\2\2\2\u0099\u009a\t\b\2\2\u009a\u009b"+
		"\t\t\2\2\u009b\u009c\t\n\2\2\u009c\u009d\t\6\2\2\u009d\u009e\t\13\2\2"+
		"\u009e\u009f\t\b\2\2\u009f\u00a0\t\f\2\2\u00a0\u00a1\t\5\2\2\u00a1\25"+
		"\3\2\2\2\u00a2\u00a3\t\3\2\2\u00a3\u00a4\t\6\2\2\u00a4\u00a5\t\f\2\2\u00a5"+
		"\27\3\2\2\2\u00a6\u00a7\t\3\2\2\u00a7\u00a8\t\r\2\2\u00a8\u00a9\t\r\2"+
		"\2\u00a9\u00aa\t\16\2\2\u00aa\31\3\2\2\2\u00ab\u00ac\t\16\2\2\u00ac\u00ad"+
		"\t\r\2\2\u00ad\u00ae\t\r\2\2\u00ae\u00af\t\3\2\2\u00af\33\3\2\2\2\u00b0"+
		"\u00b1\t\f\2\2\u00b1\u00b2\t\n\2\2\u00b2\u00b3\t\6\2\2\u00b3\u00b4\t\t"+
		"\2\2\u00b4\35\3\2\2\2\u00b5\u00b6\t\17\2\2\u00b6\u00b7\t\n\2\2\u00b7\u00b8"+
		"\t\b\2\2\u00b8\u00b9\t\3\2\2\u00b9\u00ba\t\6\2\2\u00ba\37\3\2\2\2\u00bb"+
		"\u00bc\t\2\2\2\u00bc\u00bd\t\4\2\2\u00bd\u00be\t\5\2\2\u00be\u00bf\t\6"+
		"\2\2\u00bf!\3\2\2\2\u00c0\u00c1\t\6\2\2\u00c1\u00c2\t\5\2\2\u00c2\u00c3"+
		"\t\4\2\2\u00c3\u00c4\t\2\2\2\u00c4#\3\2\2\2\u00c5\u00c6\t\r\2\2\u00c6"+
		"\u00c7\t\7\2\2\u00c7%\3\2\2\2\u00c8\u00c9\t\t\2\2\u00c9\u00ca\t\6\2\2"+
		"\u00ca\u00cb\t\17\2\2\u00cb\'\3\2\2\2\u00cc\u00cd\t\b\2\2\u00cd\u00ce"+
		"\t\5\2\2\u00ce\u00cf\t\20\2\2\u00cf\u00d0\t\r\2\2\u00d0\u00d1\t\b\2\2"+
		"\u00d1\u00d2\t\21\2\2\u00d2)\3\2\2\2\u00d3\u00d4\t\t\2\2\u00d4\u00d5\t"+
		"\r\2\2\u00d5\u00d6\t\f\2\2\u00d6+\3\2\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9"+
		"\t\13\2\2\u00d9\u00da\t\22\2\2\u00da\u00e1\t\6\2\2\u00db\u00dc\7h\2\2"+
		"\u00dc\u00dd\t\4\2\2\u00dd\u00de\t\3\2\2\u00de\u00df\t\5\2\2\u00df\u00e1"+
		"\t\6\2\2\u00e0\u00d7\3\2\2\2\u00e0\u00db\3\2\2\2\u00e1-\3\2\2\2\u00e2"+
		"\u00e6\t\23\2\2\u00e3\u00e5\t\24\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3"+
		"\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7/\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e9\u00ed\t\25\2\2\u00ea\u00ec\t\24\2\2\u00eb\u00ea\3\2\2\2"+
		"\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\61"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f2\t\26\2\2\u00f1\u00f0\3\2\2\2"+
		"\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\63"+
		"\3\2\2\2\u00f5\u00f6\7*\2\2\u00f6\65\3\2\2\2\u00f7\u00f8\7+\2\2\u00f8"+
		"\67\3\2\2\2\u00f9\u00fa\7<\2\2\u00fa9\3\2\2\2\u00fb\u00fc\7B\2\2\u00fc"+
		";\3\2\2\2\u00fd\u00fe\7.\2\2\u00fe=\3\2\2\2\u00ff\u0100\7-\2\2\u0100?"+
		"\3\2\2\2\u0101\u0102\7/\2\2\u0102A\3\2\2\2\u0103\u0104\7,\2\2\u0104C\3"+
		"\2\2\2\u0105\u0106\7\61\2\2\u0106E\3\2\2\2\u0107\u0108\7\u0080\2\2\u0108"+
		"G\3\2\2\2\u0109\u010a\7>\2\2\u010aI\3\2\2\2\u010b\u010c\7?\2\2\u010cK"+
		"\3\2\2\2\u010d\u010e\7}\2\2\u010eM\3\2\2\2\u010f\u0110\7\177\2\2\u0110"+
		"O\3\2\2\2\u0111\u0112\7\60\2\2\u0112Q\3\2\2\2\u0113\u0114\7>\2\2\u0114"+
		"\u0115\7?\2\2\u0115S\3\2\2\2\u0116\u0117\7>\2\2\u0117\u0118\7/\2\2\u0118"+
		"U\3\2\2\2\u0119\u011b\t\27\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2"+
		"\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f"+
		"\b*\2\2\u011fW\3\2\2\2\u0120\u0121\7/\2\2\u0121\u0122\7/\2\2\u0122\u0126"+
		"\3\2\2\2\u0123\u0125\13\2\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2"+
		"\u0126\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126"+
		"\3\2\2\2\u0129\u012b\t\30\2\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2\2"+
		"\u012c\u012d\b+\2\2\u012dY\3\2\2\2\u012e\u012f\7,\2\2\u012f\u0130\7+\2"+
		"\2\u0130\u0131\3\2\2\2\u0131\u0132\b,\3\2\u0132[\3\2\2\2\u0133\u0134\7"+
		"*\2\2\u0134\u0135\7,\2\2\u0135\u0136\3\2\2\2\u0136\u0137\b-\2\2\u0137"+
		"\u0138\b-\4\2\u0138]\3\2\2\2\u0139\u013a\7$\2\2\u013a\u013b\7\2\2\3\u013b"+
		"\u013c\b.\5\2\u013c_\3\2\2\2\u013d\u013e\7$\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0140\b/\2\2\u0140\u0141\b/\6\2\u0141a\3\2\2\2\u0142\u0143\13\2\2\2\u0143"+
		"\u0144\b\60\7\2\u0144c\3\2\2\2\u0145\u0146\7*\2\2\u0146\u0147\7,\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u0149\b\61\2\2\u0149\u014a\b\61\b\2\u014ae\3\2\2"+
		"\2\u014b\u014c\7,\2\2\u014c\u014d\7+\2\2\u014d\u014e\3\2\2\2\u014e\u014f"+
		"\b\62\2\2\u014f\u0150\b\62\t\2\u0150g\3\2\2\2\u0151\u0152\7*\2\2\u0152"+
		"\u0153\7,\2\2\u0153\u0154\3\2\2\2\u0154\u0155\7\2\2\3\u0155\u0156\b\63"+
		"\n\2\u0156i\3\2\2\2\u0157\u0159\13\2\2\2\u0158\u0157\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\7\2\2\3\u015b\u015c\b\64\13\2"+
		"\u015c\u015d\3\2\2\2\u015d\u015e\b\64\f\2\u015ek\3\2\2\2\u015f\u0160\13"+
		"\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\b\65\2\2\u0162m\3\2\2\2\u0163\u0164"+
		"\13\2\2\2\u0164\u0165\7\2\2\3\u0165\u0166\b\66\r\2\u0166o\3\2\2\2\u0167"+
		"\u0168\7*\2\2\u0168\u0169\7,\2\2\u0169\u016a\3\2\2\2\u016a\u016b\b\67"+
		"\b\2\u016b\u016c\b\67\2\2\u016cq\3\2\2\2\u016d\u016e\7*\2\2\u016e\u016f"+
		"\7,\2\2\u016f\u0170\3\2\2\2\u0170\u0171\7\2\2\3\u0171\u0172\b8\16\2\u0172"+
		"s\3\2\2\2\u0173\u0174\7,\2\2\u0174\u0175\7+\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u0177\7\2\2\3\u0177\u0178\b9\17\2\u0178u\3\2\2\2\u0179\u017a\7,\2\2\u017a"+
		"\u017b\7+\2\2\u017b\u017c\3\2\2\2\u017c\u017d\b:\2\2\u017d\u017e\b:\t"+
		"\2\u017ew\3\2\2\2\u017f\u0180\13\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182"+
		"\b;\2\2\u0182y\3\2\2\2\u0183\u0187\n\31\2\2\u0184\u0185\7^\2\2\u0185\u0187"+
		"\13\2\2\2\u0186\u0183\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u018a\3\2\2\2"+
		"\u0188\u0189\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u0188"+
		"\3\2\2\2\u018b\u018c\7$\2\2\u018c\u018d\b<\20\2\u018d\u018e\3\2\2\2\u018e"+
		"\u018f\b<\f\2\u018f{\3\2\2\2\u0190\u0194\n\31\2\2\u0191\u0192\7^\2\2\u0192"+
		"\u0194\13\2\2\2\u0193\u0190\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0197\3"+
		"\2\2\2\u0195\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0198\3\2\2\2\u0197"+
		"\u0195\3\2\2\2\u0198\u0199\7\f\2\2\u0199\u019a\b=\21\2\u019a\u019b\3\2"+
		"\2\2\u019b\u019c\b=\f\2\u019c}\3\2\2\2\u019d\u01a1\n\31\2\2\u019e\u019f"+
		"\7^\2\2\u019f\u01a1\13\2\2\2\u01a0\u019d\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1"+
		"\u01a4\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a6\3\2"+
		"\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a7\7^\2\2\u01a6\u01a5\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\7\2\2\3\u01a9\u01aa\b>"+
		"\22\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\b>\f\2\u01ac\177\3\2\2\2\25\2\3"+
		"\4\5\u00e0\u00e6\u00ed\u00f3\u011c\u0126\u012a\u0158\u0186\u0188\u0193"+
		"\u0195\u01a0\u01a2\u01a6\23\b\2\2\3,\2\7\3\2\3.\3\7\5\2\3\60\4\7\4\2\6"+
		"\2\2\3\63\5\3\64\6\4\2\2\3\66\7\38\b\39\t\3<\n\3=\13\3>\f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}