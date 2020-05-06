// Generated from C:/Users/antho/Desktop/polynomial/grammar\poly.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class polyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, INTEGER=33, ID=34, EXP=35, TERM=36, MONOMIAL=37, POLYNOMIAL=38, 
		STRING=39, FACTOR=40, EXPLIST=41, PROPEXPLIST=42, IDLIST=43, DEF=44, EMPTY=45, 
		BOOL=46, UNOP=47, SIGN=48, BINOP=49, CONDITIONS=50, WS=51, CHARACTER=52, 
		DIGIT=53, DELIMITER=54, OPERATOR=55;
	public static final int
		RULE_program = 0, RULE_exp = 1, RULE_term = 2, RULE_sumpolynomial = 3, 
		RULE_subpolynomial = 4, RULE_monomial = 5, RULE_polynomial = 6, RULE_string = 7, 
		RULE_factor = 8, RULE_expList = 9, RULE_propExpList = 10, RULE_idList = 11, 
		RULE_propIdList = 12, RULE_def = 13, RULE_empty = 14, RULE_bool = 15, 
		RULE_unop = 16, RULE_sign = 17, RULE_binop = 18, RULE_id = 19, RULE_integer = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "exp", "term", "sumpolynomial", "subpolynomial", "monomial", 
			"polynomial", "string", "factor", "expList", "propExpList", "idList", 
			"propIdList", "def", "empty", "bool", "unop", "sign", "binop", "id", 
			"integer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "'if'", "':'", "'else'", "'while'", "'for'", 
			"'in'", "'('", "')'", "'+'", "'-'", "'^'", "'$'", "'\"'", "','", "':='", 
			"';'", "'true'", "'false'", "'~'", "'*'", "'/'", "'='", "'!='", "'<'", 
			"'>'", "'<='", "'>='", "'&'", "'|'", "'integer'", "'id'", "'exp'", "'term'", 
			"'monomial'", "'polynomial'", "'string'", "'factor'", "'expList'", "'propExpList'", 
			"'idList'", "'def'", "'empty'", "'bool'", "'unop'", "'sign'", "'binop'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "INTEGER", "ID", 
			"EXP", "TERM", "MONOMIAL", "POLYNOMIAL", "STRING", "FACTOR", "EXPLIST", 
			"PROPEXPLIST", "IDLIST", "DEF", "EMPTY", "BOOL", "UNOP", "SIGN", "BINOP", 
			"CONDITIONS", "WS", "CHARACTER", "DIGIT", "DELIMITER", "OPERATOR"
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
	public String getGrammarFileName() { return "poly.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public polyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(43);
			id();
			setState(44);
			match(T__1);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << WS) | (1L << CHARACTER) | (1L << DIGIT))) != 0)) {
				{
				{
				setState(45);
				exp();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
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

	public static class ExpContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<BinopContext> binop() {
			return getRuleContexts(BinopContext.class);
		}
		public BinopContext binop(int i) {
			return getRuleContext(BinopContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exp);
		try {
			int _alt;
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				term();
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(54);
						binop();
						setState(55);
						exp();
						}
						} 
					}
					setState(61);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(T__3);
				setState(63);
				exp();
				setState(64);
				match(T__4);
				setState(65);
				exp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(T__3);
				setState(68);
				exp();
				setState(69);
				match(T__4);
				setState(70);
				exp();
				setState(71);
				match(T__5);
				setState(72);
				match(T__4);
				setState(73);
				exp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				match(T__6);
				setState(76);
				exp();
				setState(77);
				match(T__4);
				setState(78);
				exp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				match(T__7);
				setState(81);
				id();
				setState(82);
				match(T__8);
				setState(83);
				term();
				setState(84);
				match(T__4);
				setState(85);
				exp();
				}
				break;
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

	public static class TermContext extends ParserRuleContext {
		public UnopContext unop() {
			return getRuleContext(UnopContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public List<ExpListContext> expList() {
			return getRuleContexts(ExpListContext.class);
		}
		public ExpListContext expList(int i) {
			return getRuleContext(ExpListContext.class,i);
		}
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public SumpolynomialContext sumpolynomial() {
			return getRuleContext(SumpolynomialContext.class,0);
		}
		public SubpolynomialContext subpolynomial() {
			return getRuleContext(SubpolynomialContext.class,0);
		}
		public PolynomialContext polynomial() {
			return getRuleContext(PolynomialContext.class,0);
		}
		public MonomialContext monomial() {
			return getRuleContext(MonomialContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_term);
		try {
			int _alt;
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				unop();
				setState(90);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				factor();
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(93);
						match(T__9);
						setState(94);
						expList();
						setState(95);
						match(T__10);
						}
						} 
					}
					setState(101);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				empty();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				integer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				bool();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
				string();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(106);
				sumpolynomial();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(107);
				subpolynomial();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(108);
				polynomial();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(109);
				monomial();
				}
				break;
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

	public static class SumpolynomialContext extends ParserRuleContext {
		public List<PolynomialContext> polynomial() {
			return getRuleContexts(PolynomialContext.class);
		}
		public PolynomialContext polynomial(int i) {
			return getRuleContext(PolynomialContext.class,i);
		}
		public SumpolynomialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumpolynomial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterSumpolynomial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitSumpolynomial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitSumpolynomial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumpolynomialContext sumpolynomial() throws RecognitionException {
		SumpolynomialContext _localctx = new SumpolynomialContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sumpolynomial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			polynomial();
			setState(113);
			match(T__11);
			setState(114);
			polynomial();
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

	public static class SubpolynomialContext extends ParserRuleContext {
		public List<PolynomialContext> polynomial() {
			return getRuleContexts(PolynomialContext.class);
		}
		public PolynomialContext polynomial(int i) {
			return getRuleContext(PolynomialContext.class,i);
		}
		public SubpolynomialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subpolynomial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterSubpolynomial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitSubpolynomial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitSubpolynomial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubpolynomialContext subpolynomial() throws RecognitionException {
		SubpolynomialContext _localctx = new SubpolynomialContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subpolynomial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			polynomial();
			setState(117);
			match(T__12);
			setState(118);
			polynomial();
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

	public static class MonomialContext extends ParserRuleContext {
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public TerminalNode CHARACTER() { return getToken(polyParser.CHARACTER, 0); }
		public MonomialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monomial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterMonomial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitMonomial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitMonomial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonomialContext monomial() throws RecognitionException {
		MonomialContext _localctx = new MonomialContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_monomial);
		int _la;
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				integer();
				setState(122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(121);
					match(CHARACTER);
					}
					break;
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(124);
					match(T__13);
					setState(125);
					integer();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				integer();
				}
				break;
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

	public static class PolynomialContext extends ParserRuleContext {
		public List<MonomialContext> monomial() {
			return getRuleContexts(MonomialContext.class);
		}
		public MonomialContext monomial(int i) {
			return getRuleContext(MonomialContext.class,i);
		}
		public List<SignContext> sign() {
			return getRuleContexts(SignContext.class);
		}
		public SignContext sign(int i) {
			return getRuleContext(SignContext.class,i);
		}
		public PolynomialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polynomial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterPolynomial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitPolynomial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitPolynomial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolynomialContext polynomial() throws RecognitionException {
		PolynomialContext _localctx = new PolynomialContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_polynomial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__14);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__12) {
				{
				setState(132);
				sign();
				}
			}

			setState(135);
			monomial();
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(136);
				sign();
				setState(137);
				monomial();
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 || _la==T__12 );
			setState(143);
			match(T__14);
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

	public static class StringContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__15);
			setState(146);
			exp();
			setState(147);
			match(T__15);
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

	public static class FactorContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_factor);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(T__9);
				setState(150);
				exp();
				setState(151);
				match(T__10);
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				id();
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

	public static class ExpListContext extends ParserRuleContext {
		public List<PropExpListContext> propExpList() {
			return getRuleContexts(PropExpListContext.class);
		}
		public PropExpListContext propExpList(int i) {
			return getRuleContext(PropExpListContext.class,i);
		}
		public ExpListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterExpList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitExpList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitExpList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpListContext expList() throws RecognitionException {
		ExpListContext _localctx = new ExpListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << WS) | (1L << CHARACTER) | (1L << DIGIT))) != 0)) {
				{
				{
				setState(156);
				propExpList();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PropExpListContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PropExpListContext propExpList() {
			return getRuleContext(PropExpListContext.class,0);
		}
		public PropExpListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propExpList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterPropExpList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitPropExpList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitPropExpList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropExpListContext propExpList() throws RecognitionException {
		PropExpListContext _localctx = new PropExpListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_propExpList);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				exp();
				setState(164);
				match(T__16);
				setState(165);
				propExpList();
				}
				break;
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

	public static class IdListContext extends ParserRuleContext {
		public List<PropIdListContext> propIdList() {
			return getRuleContexts(PropIdListContext.class);
		}
		public PropIdListContext propIdList(int i) {
			return getRuleContext(PropIdListContext.class,i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHARACTER) {
				{
				{
				setState(169);
				propIdList();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PropIdListContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public PropIdListContext propIdList() {
			return getRuleContext(PropIdListContext.class,0);
		}
		public PropIdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propIdList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterPropIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitPropIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitPropIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropIdListContext propIdList() throws RecognitionException {
		PropIdListContext _localctx = new PropIdListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_propIdList);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				id();
				setState(177);
				match(T__16);
				setState(178);
				propIdList();
				}
				break;
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

	public static class DefContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			id();
			setState(183);
			match(T__17);
			setState(184);
			exp();
			setState(185);
			match(T__18);
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

	public static class EmptyContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(polyParser.WS, 0); }
		public EmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyContext empty() throws RecognitionException {
		EmptyContext _localctx = new EmptyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(WS);
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

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__20) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class UnopContext extends ParserRuleContext {
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public UnopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterUnop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitUnop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitUnop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnopContext unop() throws RecognitionException {
		UnopContext _localctx = new UnopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unop);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				sign();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(T__21);
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

	public static class SignContext extends ParserRuleContext {
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BinopContext extends ParserRuleContext {
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitBinop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitBinop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_binop);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				sign();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(T__22);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				match(T__24);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
				match(T__25);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 6);
				{
				setState(202);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 7);
				{
				setState(203);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 8);
				{
				setState(204);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 9);
				{
				setState(205);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 10);
				{
				setState(206);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 11);
				{
				setState(207);
				match(T__31);
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

	public static class IdContext extends ParserRuleContext {
		public List<TerminalNode> CHARACTER() { return getTokens(polyParser.CHARACTER); }
		public TerminalNode CHARACTER(int i) {
			return getToken(polyParser.CHARACTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(polyParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(polyParser.DIGIT, i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_id);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(CHARACTER);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(211);
					_la = _input.LA(1);
					if ( !(_la==CHARACTER || _la==DIGIT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class IntegerContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(polyParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(polyParser.DIGIT, i);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_integer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(217);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(220); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u00e1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\7\2\61\n\2\f"+
		"\2\16\2\64\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3Z\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"d\n\4\f\4\16\4g\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4q\n\4\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\5\7}\n\7\3\7\3\7\5\7\u0081\n\7\3\7\5"+
		"\7\u0084\n\7\3\b\3\b\5\b\u0088\n\b\3\b\3\b\3\b\3\b\6\b\u008e\n\b\r\b\16"+
		"\b\u008f\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u009d\n\n\3\13"+
		"\7\13\u00a0\n\13\f\13\16\13\u00a3\13\13\3\f\3\f\3\f\3\f\3\f\5\f\u00aa"+
		"\n\f\3\r\7\r\u00ad\n\r\f\r\16\r\u00b0\13\r\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00b7\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\5\22\u00c4\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u00d3\n\24\3\25\3\25\7\25\u00d7\n\25\f\25\16\25\u00da"+
		"\13\25\3\26\6\26\u00dd\n\26\r\26\16\26\u00de\3\26\2\2\27\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*\2\5\3\2\26\27\3\2\16\17\3\2\66\67\2\u00f2"+
		"\2,\3\2\2\2\4Y\3\2\2\2\6p\3\2\2\2\br\3\2\2\2\nv\3\2\2\2\f\u0083\3\2\2"+
		"\2\16\u0085\3\2\2\2\20\u0093\3\2\2\2\22\u009c\3\2\2\2\24\u00a1\3\2\2\2"+
		"\26\u00a9\3\2\2\2\30\u00ae\3\2\2\2\32\u00b6\3\2\2\2\34\u00b8\3\2\2\2\36"+
		"\u00bd\3\2\2\2 \u00bf\3\2\2\2\"\u00c3\3\2\2\2$\u00c5\3\2\2\2&\u00d2\3"+
		"\2\2\2(\u00d4\3\2\2\2*\u00dc\3\2\2\2,-\7\3\2\2-.\5(\25\2.\62\7\4\2\2/"+
		"\61\5\4\3\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65"+
		"\3\2\2\2\64\62\3\2\2\2\65\66\7\5\2\2\66\3\3\2\2\2\67=\5\6\4\289\5&\24"+
		"\29:\5\4\3\2:<\3\2\2\2;8\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>Z\3\2\2"+
		"\2?=\3\2\2\2@A\7\6\2\2AB\5\4\3\2BC\7\7\2\2CD\5\4\3\2DZ\3\2\2\2EF\7\6\2"+
		"\2FG\5\4\3\2GH\7\7\2\2HI\5\4\3\2IJ\7\b\2\2JK\7\7\2\2KL\5\4\3\2LZ\3\2\2"+
		"\2MN\7\t\2\2NO\5\4\3\2OP\7\7\2\2PQ\5\4\3\2QZ\3\2\2\2RS\7\n\2\2ST\5(\25"+
		"\2TU\7\13\2\2UV\5\6\4\2VW\7\7\2\2WX\5\4\3\2XZ\3\2\2\2Y\67\3\2\2\2Y@\3"+
		"\2\2\2YE\3\2\2\2YM\3\2\2\2YR\3\2\2\2Z\5\3\2\2\2[\\\5\"\22\2\\]\5\6\4\2"+
		"]q\3\2\2\2^e\5\22\n\2_`\7\f\2\2`a\5\24\13\2ab\7\r\2\2bd\3\2\2\2c_\3\2"+
		"\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fq\3\2\2\2ge\3\2\2\2hq\5\36\20\2iq\5"+
		"*\26\2jq\5 \21\2kq\5\20\t\2lq\5\b\5\2mq\5\n\6\2nq\5\16\b\2oq\5\f\7\2p"+
		"[\3\2\2\2p^\3\2\2\2ph\3\2\2\2pi\3\2\2\2pj\3\2\2\2pk\3\2\2\2pl\3\2\2\2"+
		"pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\7\3\2\2\2rs\5\16\b\2st\7\16\2\2tu\5\16"+
		"\b\2u\t\3\2\2\2vw\5\16\b\2wx\7\17\2\2xy\5\16\b\2y\13\3\2\2\2z|\5*\26\2"+
		"{}\7\66\2\2|{\3\2\2\2|}\3\2\2\2}\u0080\3\2\2\2~\177\7\20\2\2\177\u0081"+
		"\5*\26\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0084\5*\26\2\u0083z\3\2\2\2\u0083\u0082\3\2\2\2\u0084\r\3\2\2\2\u0085"+
		"\u0087\7\21\2\2\u0086\u0088\5$\23\2\u0087\u0086\3\2\2\2\u0087\u0088\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\u008d\5\f\7\2\u008a\u008b\5$\23\2\u008b"+
		"\u008c\5\f\7\2\u008c\u008e\3\2\2\2\u008d\u008a\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\7\21\2\2\u0092\17\3\2\2\2\u0093\u0094\7\22\2\2\u0094\u0095\5\4"+
		"\3\2\u0095\u0096\7\22\2\2\u0096\21\3\2\2\2\u0097\u0098\7\f\2\2\u0098\u0099"+
		"\5\4\3\2\u0099\u009a\7\r\2\2\u009a\u009d\3\2\2\2\u009b\u009d\5(\25\2\u009c"+
		"\u0097\3\2\2\2\u009c\u009b\3\2\2\2\u009d\23\3\2\2\2\u009e\u00a0\5\26\f"+
		"\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\25\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00aa\5\4\3\2\u00a5"+
		"\u00a6\5\4\3\2\u00a6\u00a7\7\23\2\2\u00a7\u00a8\5\26\f\2\u00a8\u00aa\3"+
		"\2\2\2\u00a9\u00a4\3\2\2\2\u00a9\u00a5\3\2\2\2\u00aa\27\3\2\2\2\u00ab"+
		"\u00ad\5\32\16\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3"+
		"\2\2\2\u00ae\u00af\3\2\2\2\u00af\31\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b7\5(\25\2\u00b2\u00b3\5(\25\2\u00b3\u00b4\7\23\2\2\u00b4\u00b5\5"+
		"\32\16\2\u00b5\u00b7\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b7"+
		"\33\3\2\2\2\u00b8\u00b9\5(\25\2\u00b9\u00ba\7\24\2\2\u00ba\u00bb\5\4\3"+
		"\2\u00bb\u00bc\7\25\2\2\u00bc\35\3\2\2\2\u00bd\u00be\7\65\2\2\u00be\37"+
		"\3\2\2\2\u00bf\u00c0\t\2\2\2\u00c0!\3\2\2\2\u00c1\u00c4\5$\23\2\u00c2"+
		"\u00c4\7\30\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4#\3\2\2\2"+
		"\u00c5\u00c6\t\3\2\2\u00c6%\3\2\2\2\u00c7\u00d3\5$\23\2\u00c8\u00d3\7"+
		"\31\2\2\u00c9\u00d3\7\32\2\2\u00ca\u00d3\7\33\2\2\u00cb\u00d3\7\34\2\2"+
		"\u00cc\u00d3\7\35\2\2\u00cd\u00d3\7\36\2\2\u00ce\u00d3\7\37\2\2\u00cf"+
		"\u00d3\7 \2\2\u00d0\u00d3\7!\2\2\u00d1\u00d3\7\"\2\2\u00d2\u00c7\3\2\2"+
		"\2\u00d2\u00c8\3\2\2\2\u00d2\u00c9\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2\u00cb"+
		"\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d2"+
		"\u00cf\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\'\3\2\2\2"+
		"\u00d4\u00d8\7\66\2\2\u00d5\u00d7\t\4\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da"+
		"\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9)\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00dd\7\67\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3"+
		"\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df+\3\2\2\2\25\62=Y"+
		"ep|\u0080\u0083\u0087\u008f\u009c\u00a1\u00a9\u00ae\u00b6\u00c3\u00d2"+
		"\u00d8\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}