// Generated from /home/ilya/hw/formal_lang/fl_task/src/main/java/PlangGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlangGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, IDENT=7, VAR=8, WS=9;
	public static final int
		RULE_eof = 0, RULE_start = 1, RULE_var = 2, RULE_arg = 3, RULE_abody = 4, 
		RULE_atom = 5, RULE_rhead = 6, RULE_rbody = 7, RULE_rrule = 8, RULE_tar = 9, 
		RULE_prog = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"eof", "start", "var", "arg", "abody", "atom", "rhead", "rbody", "rrule", 
			"tar", "prog"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'->'", "'.'", "'-?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "IDENT", "VAR", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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

	@Override
	public String getGrammarFileName() { return "PlangGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlangGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class EofContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PlangGrammarParser.EOF, 0); }
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlangGrammarListener ) ((PlangGrammarListener)listener).enterEof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlangGrammarListener ) ((PlangGrammarListener)listener).exitEof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlangGrammarVisitor ) return ((PlangGrammarVisitor<? extends T>)visitor).visitEof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EofContext eof() throws RecognitionException {
		EofContext _localctx = new EofContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public EofContext eof() {
			return getRuleContext(EofContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlangGrammarListener ) ((PlangGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlangGrammarListener ) ((PlangGrammarListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlangGrammarVisitor ) return ((PlangGrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			prog();
			setState(25);
			eof();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(PlangGrammarParser.VAR, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlangGrammarListener ) ((PlangGrammarListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlangGrammarListener ) ((PlangGrammarListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlangGrammarVisitor ) return ((PlangGrammarVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlangGrammarListener ) ((PlangGrammarListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlangGrammarListener ) ((PlangGrammarListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlangGrammarVisitor ) return ((PlangGrammarVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arg);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				atom();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbodyContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public AbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlangGrammarListener ) ((PlangGrammarListener)listener).enterAbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlangGrammarListener ) ((PlangGrammarListener)listener).exitAbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlangGrammarVisitor ) return ((PlangGrammarVisitor<? extends T>)visitor).visitAbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbodyContext abody() throws RecognitionException {
		AbodyContext _localctx = new AbodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_abody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__0);
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(34);
					arg();
					setState(35);
					match(T__1);
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(42);
			arg();
			setState(43);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AbodyContext body;
		public TerminalNode IDENT() { return getToken(PlangGrammarParser.IDENT, 0); }
		public AbodyContext abody() {
			return getRuleContext(AbodyContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlangGrammarListener ) ((PlangGrammarListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlangGrammarListener ) ((PlangGrammarListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlangGrammarVisitor ) return ((PlangGrammarVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(IDENT);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(46);
				((AtomContext)_localctx).body = abody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RheadContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public RheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rhead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlangGrammarListener ) ((PlangGrammarListener)listener).enterRhead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlangGrammarListener ) ((PlangGrammarListener)listener).exitRhead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlangGrammarVisitor ) return ((PlangGrammarVisitor<? extends T>)visitor).visitRhead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RheadContext rhead() throws RecognitionException {
		RheadContext _localctx = new RheadContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rhead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			atom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RbodyContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public RbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlangGrammarListener ) ((PlangGrammarListener)listener).enterRbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlangGrammarListener ) ((PlangGrammarListener)listener).exitRbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlangGrammarVisitor ) return ((PlangGrammarVisitor<? extends T>)visitor).visitRbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RbodyContext rbody() throws RecognitionException {
		RbodyContext _localctx = new RbodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rbody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51);
					atom();
					setState(52);
					match(T__1);
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(59);
			atom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RruleContext extends ParserRuleContext {
		public RheadContext rhead() {
			return getRuleContext(RheadContext.class,0);
		}
		public RbodyContext rbody() {
			return getRuleContext(RbodyContext.class,0);
		}
		public RruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rrule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlangGrammarListener ) ((PlangGrammarListener)listener).enterRrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlangGrammarListener ) ((PlangGrammarListener)listener).exitRrule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlangGrammarVisitor ) return ((PlangGrammarVisitor<? extends T>)visitor).visitRrule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RruleContext rrule() throws RecognitionException {
		RruleContext _localctx = new RruleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rrule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			rhead();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(62);
				match(T__3);
				setState(63);
				rbody();
				}
			}

			setState(66);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TarContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlangGrammarListener ) ((PlangGrammarListener)listener).enterTar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlangGrammarListener ) ((PlangGrammarListener)listener).exitTar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlangGrammarVisitor ) return ((PlangGrammarVisitor<? extends T>)visitor).visitTar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TarContext tar() throws RecognitionException {
		TarContext _localctx = new TarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68);
					atom();
					setState(69);
					match(T__1);
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(76);
			atom();
			setState(77);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgContext extends ParserRuleContext {
		public TarContext tar() {
			return getRuleContext(TarContext.class,0);
		}
		public List<RruleContext> rrule() {
			return getRuleContexts(RruleContext.class);
		}
		public RruleContext rrule(int i) {
			return getRuleContext(RruleContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlangGrammarListener ) ((PlangGrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlangGrammarListener ) ((PlangGrammarListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlangGrammarVisitor ) return ((PlangGrammarVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(79);
				rrule();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(T__5);
			setState(86);
			tar();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13[\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\5\5\"\n\5\3\6\3\6\3\6\3\6\7"+
		"\6(\n\6\f\6\16\6+\13\6\3\6\3\6\3\6\3\7\3\7\5\7\62\n\7\3\b\3\b\3\t\3\t"+
		"\3\t\7\t9\n\t\f\t\16\t<\13\t\3\t\3\t\3\n\3\n\3\n\5\nC\n\n\3\n\3\n\3\13"+
		"\3\13\3\13\7\13J\n\13\f\13\16\13M\13\13\3\13\3\13\3\13\3\f\7\fS\n\f\f"+
		"\f\16\fV\13\f\3\f\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2V"+
		"\2\30\3\2\2\2\4\32\3\2\2\2\6\35\3\2\2\2\b!\3\2\2\2\n#\3\2\2\2\f/\3\2\2"+
		"\2\16\63\3\2\2\2\20:\3\2\2\2\22?\3\2\2\2\24K\3\2\2\2\26T\3\2\2\2\30\31"+
		"\7\2\2\3\31\3\3\2\2\2\32\33\5\26\f\2\33\34\5\2\2\2\34\5\3\2\2\2\35\36"+
		"\7\n\2\2\36\7\3\2\2\2\37\"\5\f\7\2 \"\5\6\4\2!\37\3\2\2\2! \3\2\2\2\""+
		"\t\3\2\2\2#)\7\3\2\2$%\5\b\5\2%&\7\4\2\2&(\3\2\2\2\'$\3\2\2\2(+\3\2\2"+
		"\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\5\b\5\2-.\7\5\2\2.\13\3"+
		"\2\2\2/\61\7\t\2\2\60\62\5\n\6\2\61\60\3\2\2\2\61\62\3\2\2\2\62\r\3\2"+
		"\2\2\63\64\5\f\7\2\64\17\3\2\2\2\65\66\5\f\7\2\66\67\7\4\2\2\679\3\2\2"+
		"\28\65\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\5\f"+
		"\7\2>\21\3\2\2\2?B\5\16\b\2@A\7\6\2\2AC\5\20\t\2B@\3\2\2\2BC\3\2\2\2C"+
		"D\3\2\2\2DE\7\7\2\2E\23\3\2\2\2FG\5\f\7\2GH\7\4\2\2HJ\3\2\2\2IF\3\2\2"+
		"\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\5\f\7\2OP\7\7\2"+
		"\2P\25\3\2\2\2QS\5\22\n\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3"+
		"\2\2\2VT\3\2\2\2WX\7\b\2\2XY\5\24\13\2Y\27\3\2\2\2\t!)\61:BKT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}