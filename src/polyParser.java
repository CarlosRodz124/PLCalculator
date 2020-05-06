// Generated from C:/Users/User/git/PLCalculator/grammar\poly.g4 by ANTLR 4.8
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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, INTEGER=37, ID=38, EXP=39, 
		TERM=40, MONOMIAL=41, POLYNOMIAL=42, STRING=43, FACTOR=44, EXPLIST=45, 
		PROPEXPLIST=46, IDLIST=47, DEF=48, EMPTY=49, BOOL=50, UNOP=51, SIGN=52, 
		BINOP=53, CONDITIONS=54, WS=55, CHARACTER=56, DIGIT=57, DELIMITER=58, 
		OPERATOR=59;
	public static final int
		RULE_program = 0, RULE_exp = 1, RULE_term = 2, RULE_sumpolynomial = 3, 
		RULE_subpolynomial = 4, RULE_mulpolynomial = 5, RULE_mulcpolynomial = 6, 
		RULE_derpolynomial = 7, RULE_defintegralpolynomial = 8, RULE_integralpolynomial = 9, 
		RULE_evalpolynomial = 10, RULE_degree = 11, RULE_equalpolynomial = 12, 
		RULE_monomial = 13, RULE_polynomial = 14, RULE_string = 15, RULE_factor = 16, 
		RULE_expList = 17, RULE_propExpList = 18, RULE_idList = 19, RULE_propIdList = 20, 
		RULE_def = 21, RULE_empty = 22, RULE_bool = 23, RULE_unop = 24, RULE_sign = 25, 
		RULE_binop = 26, RULE_id = 27, RULE_integer = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "exp", "term", "sumpolynomial", "subpolynomial", "mulpolynomial", 
			"mulcpolynomial", "derpolynomial", "defintegralpolynomial", "integralpolynomial", 
			"evalpolynomial", "degree", "equalpolynomial", "monomial", "polynomial", 
			"string", "factor", "expList", "propExpList", "idList", "propIdList", 
			"def", "empty", "bool", "unop", "sign", "binop", "id", "integer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "'if'", "':'", "'else'", "'while'", "'for'", 
			"'in'", "'('", "')'", "'+'", "'-'", "'*'", "'der'", "'integral'", "','", 
			"'eval'", "'degree'", "'='", "'^'", "'$'", "'\"'", "':='", "';'", "'true'", 
			"'false'", "'~'", "'/'", "'!='", "'<'", "'>'", "'<='", "'>='", "'&'", 
			"'|'", "'integer'", "'id'", "'exp'", "'term'", "'monomial'", "'polynomial'", 
			"'string'", "'factor'", "'expList'", "'propExpList'", "'idList'", "'def'", 
			"'empty'", "'bool'", "'unop'", "'sign'", "'binop'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "INTEGER", "ID", "EXP", "TERM", "MONOMIAL", "POLYNOMIAL", "STRING", 
			"FACTOR", "EXPLIST", "PROPEXPLIST", "IDLIST", "DEF", "EMPTY", "BOOL", 
			"UNOP", "SIGN", "BINOP", "CONDITIONS", "WS", "CHARACTER", "DIGIT", "DELIMITER", 
			"OPERATOR"
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
			setState(58);
			match(T__0);
			setState(59);
			id();
			setState(60);
			match(T__1);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << WS) | (1L << CHARACTER) | (1L << DIGIT))) != 0)) {
				{
				{
				setState(61);
				exp();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
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
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				term();
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(70);
						binop();
						setState(71);
						exp();
						}
						} 
					}
					setState(77);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(T__3);
				setState(79);
				exp();
				setState(80);
				match(T__4);
				setState(81);
				exp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(T__3);
				setState(84);
				exp();
				setState(85);
				match(T__4);
				setState(86);
				exp();
				setState(87);
				match(T__5);
				setState(88);
				match(T__4);
				setState(89);
				exp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				match(T__6);
				setState(92);
				exp();
				setState(93);
				match(T__4);
				setState(94);
				exp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				match(T__7);
				setState(97);
				id();
				setState(98);
				match(T__8);
				setState(99);
				term();
				setState(100);
				match(T__4);
				setState(101);
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
		public MulpolynomialContext mulpolynomial() {
			return getRuleContext(MulpolynomialContext.class,0);
		}
		public MulcpolynomialContext mulcpolynomial() {
			return getRuleContext(MulcpolynomialContext.class,0);
		}
		public DerpolynomialContext derpolynomial() {
			return getRuleContext(DerpolynomialContext.class,0);
		}
		public DefintegralpolynomialContext defintegralpolynomial() {
			return getRuleContext(DefintegralpolynomialContext.class,0);
		}
		public IntegralpolynomialContext integralpolynomial() {
			return getRuleContext(IntegralpolynomialContext.class,0);
		}
		public EvalpolynomialContext evalpolynomial() {
			return getRuleContext(EvalpolynomialContext.class,0);
		}
		public DegreeContext degree() {
			return getRuleContext(DegreeContext.class,0);
		}
		public EqualpolynomialContext equalpolynomial() {
			return getRuleContext(EqualpolynomialContext.class,0);
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
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				unop();
				setState(106);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				factor();
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(109);
						match(T__9);
						setState(110);
						expList();
						setState(111);
						match(T__10);
						}
						} 
					}
					setState(117);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				empty();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				integer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				bool();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(121);
				string();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(122);
				sumpolynomial();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(123);
				subpolynomial();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(124);
				mulpolynomial();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(125);
				mulcpolynomial();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(126);
				derpolynomial();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(127);
				defintegralpolynomial();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(128);
				integralpolynomial();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(129);
				evalpolynomial();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(130);
				degree();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(131);
				equalpolynomial();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(132);
				polynomial();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(133);
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
			setState(136);
			polynomial();
			setState(137);
			match(T__11);
			setState(138);
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
			setState(140);
			polynomial();
			setState(141);
			match(T__12);
			setState(142);
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

	public static class MulpolynomialContext extends ParserRuleContext {
		public List<PolynomialContext> polynomial() {
			return getRuleContexts(PolynomialContext.class);
		}
		public PolynomialContext polynomial(int i) {
			return getRuleContext(PolynomialContext.class,i);
		}
		public MulpolynomialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulpolynomial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterMulpolynomial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitMulpolynomial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitMulpolynomial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulpolynomialContext mulpolynomial() throws RecognitionException {
		MulpolynomialContext _localctx = new MulpolynomialContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mulpolynomial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			polynomial();
			setState(145);
			match(T__13);
			setState(146);
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

	public static class MulcpolynomialContext extends ParserRuleContext {
		public PolynomialContext polynomial() {
			return getRuleContext(PolynomialContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public MulcpolynomialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulcpolynomial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterMulcpolynomial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitMulcpolynomial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitMulcpolynomial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulcpolynomialContext mulcpolynomial() throws RecognitionException {
		MulcpolynomialContext _localctx = new MulcpolynomialContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mulcpolynomial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			polynomial();
			setState(149);
			match(T__13);
			setState(150);
			integer();
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

	public static class DerpolynomialContext extends ParserRuleContext {
		public PolynomialContext polynomial() {
			return getRuleContext(PolynomialContext.class,0);
		}
		public DerpolynomialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derpolynomial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterDerpolynomial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitDerpolynomial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitDerpolynomial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DerpolynomialContext derpolynomial() throws RecognitionException {
		DerpolynomialContext _localctx = new DerpolynomialContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_derpolynomial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__14);
			setState(153);
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

	public static class DefintegralpolynomialContext extends ParserRuleContext {
		public PolynomialContext polynomial() {
			return getRuleContext(PolynomialContext.class,0);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public DefintegralpolynomialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defintegralpolynomial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterDefintegralpolynomial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitDefintegralpolynomial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitDefintegralpolynomial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefintegralpolynomialContext defintegralpolynomial() throws RecognitionException {
		DefintegralpolynomialContext _localctx = new DefintegralpolynomialContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_defintegralpolynomial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__15);
			setState(156);
			polynomial();
			setState(157);
			integer();
			setState(158);
			match(T__16);
			setState(159);
			integer();
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

	public static class IntegralpolynomialContext extends ParserRuleContext {
		public PolynomialContext polynomial() {
			return getRuleContext(PolynomialContext.class,0);
		}
		public IntegralpolynomialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralpolynomial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterIntegralpolynomial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitIntegralpolynomial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitIntegralpolynomial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegralpolynomialContext integralpolynomial() throws RecognitionException {
		IntegralpolynomialContext _localctx = new IntegralpolynomialContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_integralpolynomial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__15);
			setState(162);
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

	public static class EvalpolynomialContext extends ParserRuleContext {
		public PolynomialContext polynomial() {
			return getRuleContext(PolynomialContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public EvalpolynomialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evalpolynomial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterEvalpolynomial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitEvalpolynomial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitEvalpolynomial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvalpolynomialContext evalpolynomial() throws RecognitionException {
		EvalpolynomialContext _localctx = new EvalpolynomialContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_evalpolynomial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__17);
			setState(165);
			polynomial();
			setState(166);
			integer();
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

	public static class DegreeContext extends ParserRuleContext {
		public PolynomialContext polynomial() {
			return getRuleContext(PolynomialContext.class,0);
		}
		public MonomialContext monomial() {
			return getRuleContext(MonomialContext.class,0);
		}
		public DegreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_degree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterDegree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitDegree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitDegree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DegreeContext degree() throws RecognitionException {
		DegreeContext _localctx = new DegreeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_degree);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(T__18);
				setState(169);
				polynomial();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(T__18);
				setState(171);
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

	public static class EqualpolynomialContext extends ParserRuleContext {
		public List<PolynomialContext> polynomial() {
			return getRuleContexts(PolynomialContext.class);
		}
		public PolynomialContext polynomial(int i) {
			return getRuleContext(PolynomialContext.class,i);
		}
		public EqualpolynomialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalpolynomial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterEqualpolynomial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitEqualpolynomial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitEqualpolynomial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualpolynomialContext equalpolynomial() throws RecognitionException {
		EqualpolynomialContext _localctx = new EqualpolynomialContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_equalpolynomial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			polynomial();
			setState(175);
			match(T__19);
			setState(176);
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
		enterRule(_localctx, 26, RULE_monomial);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				integer();
				setState(180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(179);
					match(CHARACTER);
					}
					break;
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(182);
					match(T__20);
					setState(183);
					integer();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
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
		enterRule(_localctx, 28, RULE_polynomial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__21);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__12) {
				{
				setState(190);
				sign();
				}
			}

			setState(193);
			monomial();
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(194);
				sign();
				setState(195);
				monomial();
				}
				}
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 || _la==T__12 );
			setState(201);
			match(T__21);
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
		enterRule(_localctx, 30, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__22);
			setState(204);
			exp();
			setState(205);
			match(T__22);
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
		enterRule(_localctx, 32, RULE_factor);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(T__9);
				setState(208);
				exp();
				setState(209);
				match(T__10);
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
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
		enterRule(_localctx, 34, RULE_expList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << WS) | (1L << CHARACTER) | (1L << DIGIT))) != 0)) {
				{
				{
				setState(214);
				propExpList();
				}
				}
				setState(219);
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
		enterRule(_localctx, 36, RULE_propExpList);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				exp();
				setState(222);
				match(T__16);
				setState(223);
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
		enterRule(_localctx, 38, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHARACTER) {
				{
				{
				setState(227);
				propIdList();
				}
				}
				setState(232);
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
		enterRule(_localctx, 40, RULE_propIdList);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				id();
				setState(235);
				match(T__16);
				setState(236);
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
		enterRule(_localctx, 42, RULE_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			id();
			setState(241);
			match(T__23);
			setState(242);
			exp();
			setState(243);
			match(T__24);
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
		enterRule(_localctx, 44, RULE_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
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
		enterRule(_localctx, 46, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==T__26) ) {
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
		enterRule(_localctx, 48, RULE_unop);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				sign();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(T__27);
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
		enterRule(_localctx, 50, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
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
		enterRule(_localctx, 52, RULE_binop);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				sign();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(T__13);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				match(T__28);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				match(T__19);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(259);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 6);
				{
				setState(260);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 7);
				{
				setState(261);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 8);
				{
				setState(262);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 9);
				{
				setState(263);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 10);
				{
				setState(264);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 11);
				{
				setState(265);
				match(T__35);
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
		enterRule(_localctx, 54, RULE_id);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(CHARACTER);
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269);
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
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 56, RULE_integer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(275);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(278); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u011b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\7\2"+
		"A\n\2\f\2\16\2D\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3j\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4t\n\4\f\4\16\4w\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4\u0089\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00af\n\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\5\17\u00b7\n\17\3\17\3\17\5\17\u00bb\n\17\3\17\5\17\u00be"+
		"\n\17\3\20\3\20\5\20\u00c2\n\20\3\20\3\20\3\20\3\20\6\20\u00c8\n\20\r"+
		"\20\16\20\u00c9\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00d7\n\22\3\23\7\23\u00da\n\23\f\23\16\23\u00dd\13\23\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u00e4\n\24\3\25\7\25\u00e7\n\25\f\25\16\25\u00ea"+
		"\13\25\3\26\3\26\3\26\3\26\3\26\5\26\u00f1\n\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\5\32\u00fe\n\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u010d\n\34\3\35\3\35"+
		"\7\35\u0111\n\35\f\35\16\35\u0114\13\35\3\36\6\36\u0117\n\36\r\36\16\36"+
		"\u0118\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:\2\5\3\2\34\35\3\2\16\17\3\2:;\2\u012d\2<\3\2\2\2\4i\3\2\2"+
		"\2\6\u0088\3\2\2\2\b\u008a\3\2\2\2\n\u008e\3\2\2\2\f\u0092\3\2\2\2\16"+
		"\u0096\3\2\2\2\20\u009a\3\2\2\2\22\u009d\3\2\2\2\24\u00a3\3\2\2\2\26\u00a6"+
		"\3\2\2\2\30\u00ae\3\2\2\2\32\u00b0\3\2\2\2\34\u00bd\3\2\2\2\36\u00bf\3"+
		"\2\2\2 \u00cd\3\2\2\2\"\u00d6\3\2\2\2$\u00db\3\2\2\2&\u00e3\3\2\2\2(\u00e8"+
		"\3\2\2\2*\u00f0\3\2\2\2,\u00f2\3\2\2\2.\u00f7\3\2\2\2\60\u00f9\3\2\2\2"+
		"\62\u00fd\3\2\2\2\64\u00ff\3\2\2\2\66\u010c\3\2\2\28\u010e\3\2\2\2:\u0116"+
		"\3\2\2\2<=\7\3\2\2=>\58\35\2>B\7\4\2\2?A\5\4\3\2@?\3\2\2\2AD\3\2\2\2B"+
		"@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\5\2\2F\3\3\2\2\2GM\5\6\4\2"+
		"HI\5\66\34\2IJ\5\4\3\2JL\3\2\2\2KH\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2"+
		"\2Nj\3\2\2\2OM\3\2\2\2PQ\7\6\2\2QR\5\4\3\2RS\7\7\2\2ST\5\4\3\2Tj\3\2\2"+
		"\2UV\7\6\2\2VW\5\4\3\2WX\7\7\2\2XY\5\4\3\2YZ\7\b\2\2Z[\7\7\2\2[\\\5\4"+
		"\3\2\\j\3\2\2\2]^\7\t\2\2^_\5\4\3\2_`\7\7\2\2`a\5\4\3\2aj\3\2\2\2bc\7"+
		"\n\2\2cd\58\35\2de\7\13\2\2ef\5\6\4\2fg\7\7\2\2gh\5\4\3\2hj\3\2\2\2iG"+
		"\3\2\2\2iP\3\2\2\2iU\3\2\2\2i]\3\2\2\2ib\3\2\2\2j\5\3\2\2\2kl\5\62\32"+
		"\2lm\5\6\4\2m\u0089\3\2\2\2nu\5\"\22\2op\7\f\2\2pq\5$\23\2qr\7\r\2\2r"+
		"t\3\2\2\2so\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\u0089\3\2\2\2wu\3\2"+
		"\2\2x\u0089\5.\30\2y\u0089\5:\36\2z\u0089\5\60\31\2{\u0089\5 \21\2|\u0089"+
		"\5\b\5\2}\u0089\5\n\6\2~\u0089\5\f\7\2\177\u0089\5\16\b\2\u0080\u0089"+
		"\5\20\t\2\u0081\u0089\5\22\n\2\u0082\u0089\5\24\13\2\u0083\u0089\5\26"+
		"\f\2\u0084\u0089\5\30\r\2\u0085\u0089\5\32\16\2\u0086\u0089\5\36\20\2"+
		"\u0087\u0089\5\34\17\2\u0088k\3\2\2\2\u0088n\3\2\2\2\u0088x\3\2\2\2\u0088"+
		"y\3\2\2\2\u0088z\3\2\2\2\u0088{\3\2\2\2\u0088|\3\2\2\2\u0088}\3\2\2\2"+
		"\u0088~\3\2\2\2\u0088\177\3\2\2\2\u0088\u0080\3\2\2\2\u0088\u0081\3\2"+
		"\2\2\u0088\u0082\3\2\2\2\u0088\u0083\3\2\2\2\u0088\u0084\3\2\2\2\u0088"+
		"\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\7\3\2\2\2"+
		"\u008a\u008b\5\36\20\2\u008b\u008c\7\16\2\2\u008c\u008d\5\36\20\2\u008d"+
		"\t\3\2\2\2\u008e\u008f\5\36\20\2\u008f\u0090\7\17\2\2\u0090\u0091\5\36"+
		"\20\2\u0091\13\3\2\2\2\u0092\u0093\5\36\20\2\u0093\u0094\7\20\2\2\u0094"+
		"\u0095\5\36\20\2\u0095\r\3\2\2\2\u0096\u0097\5\36\20\2\u0097\u0098\7\20"+
		"\2\2\u0098\u0099\5:\36\2\u0099\17\3\2\2\2\u009a\u009b\7\21\2\2\u009b\u009c"+
		"\5\36\20\2\u009c\21\3\2\2\2\u009d\u009e\7\22\2\2\u009e\u009f\5\36\20\2"+
		"\u009f\u00a0\5:\36\2\u00a0\u00a1\7\23\2\2\u00a1\u00a2\5:\36\2\u00a2\23"+
		"\3\2\2\2\u00a3\u00a4\7\22\2\2\u00a4\u00a5\5\36\20\2\u00a5\25\3\2\2\2\u00a6"+
		"\u00a7\7\24\2\2\u00a7\u00a8\5\36\20\2\u00a8\u00a9\5:\36\2\u00a9\27\3\2"+
		"\2\2\u00aa\u00ab\7\25\2\2\u00ab\u00af\5\36\20\2\u00ac\u00ad\7\25\2\2\u00ad"+
		"\u00af\5\34\17\2\u00ae\u00aa\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\31\3\2"+
		"\2\2\u00b0\u00b1\5\36\20\2\u00b1\u00b2\7\26\2\2\u00b2\u00b3\5\36\20\2"+
		"\u00b3\33\3\2\2\2\u00b4\u00b6\5:\36\2\u00b5\u00b7\7:\2\2\u00b6\u00b5\3"+
		"\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b9\7\27\2\2\u00b9"+
		"\u00bb\5:\36\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00be\3\2"+
		"\2\2\u00bc\u00be\5:\36\2\u00bd\u00b4\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\35\3\2\2\2\u00bf\u00c1\7\30\2\2\u00c0\u00c2\5\64\33\2\u00c1\u00c0\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c7\5\34\17\2\u00c4"+
		"\u00c5\5\64\33\2\u00c5\u00c6\5\34\17\2\u00c6\u00c8\3\2\2\2\u00c7\u00c4"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\7\30\2\2\u00cc\37\3\2\2\2\u00cd\u00ce\7\31"+
		"\2\2\u00ce\u00cf\5\4\3\2\u00cf\u00d0\7\31\2\2\u00d0!\3\2\2\2\u00d1\u00d2"+
		"\7\f\2\2\u00d2\u00d3\5\4\3\2\u00d3\u00d4\7\r\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d7\58\35\2\u00d6\u00d1\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7#\3\2\2\2"+
		"\u00d8\u00da\5&\24\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc%\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00e4\5\4\3\2\u00df\u00e0\5\4\3\2\u00e0\u00e1\7\23\2\2\u00e1\u00e2\5"+
		"&\24\2\u00e2\u00e4\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4"+
		"\'\3\2\2\2\u00e5\u00e7\5*\26\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2"+
		"\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9)\3\2\2\2\u00ea\u00e8\3"+
		"\2\2\2\u00eb\u00f1\58\35\2\u00ec\u00ed\58\35\2\u00ed\u00ee\7\23\2\2\u00ee"+
		"\u00ef\5*\26\2\u00ef\u00f1\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f0\u00ec\3\2"+
		"\2\2\u00f1+\3\2\2\2\u00f2\u00f3\58\35\2\u00f3\u00f4\7\32\2\2\u00f4\u00f5"+
		"\5\4\3\2\u00f5\u00f6\7\33\2\2\u00f6-\3\2\2\2\u00f7\u00f8\79\2\2\u00f8"+
		"/\3\2\2\2\u00f9\u00fa\t\2\2\2\u00fa\61\3\2\2\2\u00fb\u00fe\5\64\33\2\u00fc"+
		"\u00fe\7\36\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\63\3\2\2"+
		"\2\u00ff\u0100\t\3\2\2\u0100\65\3\2\2\2\u0101\u010d\5\64\33\2\u0102\u010d"+
		"\7\20\2\2\u0103\u010d\7\37\2\2\u0104\u010d\7\26\2\2\u0105\u010d\7 \2\2"+
		"\u0106\u010d\7!\2\2\u0107\u010d\7\"\2\2\u0108\u010d\7#\2\2\u0109\u010d"+
		"\7$\2\2\u010a\u010d\7%\2\2\u010b\u010d\7&\2\2\u010c\u0101\3\2\2\2\u010c"+
		"\u0102\3\2\2\2\u010c\u0103\3\2\2\2\u010c\u0104\3\2\2\2\u010c\u0105\3\2"+
		"\2\2\u010c\u0106\3\2\2\2\u010c\u0107\3\2\2\2\u010c\u0108\3\2\2\2\u010c"+
		"\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d\67\3\2\2"+
		"\2\u010e\u0112\7:\2\2\u010f\u0111\t\4\2\2\u0110\u010f\3\2\2\2\u0111\u0114"+
		"\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u01139\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0115\u0117\7;\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119;\3\2\2\2\26BMiu\u0088"+
		"\u00ae\u00b6\u00ba\u00bd\u00c1\u00c9\u00d6\u00db\u00e3\u00e8\u00f0\u00fd"+
		"\u010c\u0112\u0118";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}