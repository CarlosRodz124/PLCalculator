// Generated from /home/anthony/IdeaProjects/PLCalculator/grammar/poly.g4 by ANTLR 4.8

import java.util.Map;
import java.util.HashMap;

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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, INTEGER=38, 
		ID=39, EXP=40, TERM=41, MONOMIAL=42, POLYNOMIAL=43, STRING=44, FACTOR=45, 
		EXPLIST=46, PROPEXPLIST=47, IDLIST=48, DEF=49, EMPTY=50, BOOL=51, UNOP=52, 
		SIGN=53, BINOP=54, CONDITIONS=55, WS=56, CHARACTER=57, DIGIT=58, DELIMITER=59, 
		OPERATOR=60;
	public static final int
		RULE_program = 0, RULE_exp = 1, RULE_term = 2, RULE_print = 3, RULE_idop = 4, 
		RULE_sumpolynomial = 5, RULE_subpolynomial = 6, RULE_mulpolynomial = 7, 
		RULE_mulcpolynomial = 8, RULE_derpolynomial = 9, RULE_defintegralpolynomial = 10, 
		RULE_integralpolynomial = 11, RULE_evalpolynomial = 12, RULE_degree = 13, 
		RULE_equalpolynomial = 14, RULE_monomial = 15, RULE_polynomial = 16, RULE_string = 17, 
		RULE_factor = 18, RULE_expList = 19, RULE_propExpList = 20, RULE_idList = 21, 
		RULE_propIdList = 22, RULE_def = 23, RULE_empty = 24, RULE_bool = 25, 
		RULE_unop = 26, RULE_sign = 27, RULE_binop = 28, RULE_id = 29, RULE_integer = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "exp", "term", "print", "idop", "sumpolynomial", "subpolynomial", 
			"mulpolynomial", "mulcpolynomial", "derpolynomial", "defintegralpolynomial", 
			"integralpolynomial", "evalpolynomial", "degree", "equalpolynomial", 
			"monomial", "polynomial", "string", "factor", "expList", "propExpList", 
			"idList", "propIdList", "def", "empty", "bool", "unop", "sign", "binop", 
			"id", "integer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "'if'", "':'", "'else'", "'while'", "'for'", 
			"'in'", "'('", "')'", "'print:'", "';'", "'+'", "'-'", "'*'", "'der'", 
			"'integral'", "','", "'eval'", "'degree'", "'=='", "'^'", "'$'", "'\"'", 
			"'='", "'true'", "'false'", "'~'", "'/'", "'!='", "'<'", "'>'", "'<='", 
			"'>='", "'&'", "'|'", "'integer'", "'id'", "'exp'", "'term'", "'monomial'", 
			"'polynomial'", "'string'", "'factor'", "'expList'", "'propExpList'", 
			"'idList'", "'def'", "'empty'", "'bool'", "'unop'", "'sign'", "'binop'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "INTEGER", "ID", "EXP", "TERM", "MONOMIAL", "POLYNOMIAL", 
			"STRING", "FACTOR", "EXPLIST", "PROPEXPLIST", "IDLIST", "DEF", "EMPTY", 
			"BOOL", "UNOP", "SIGN", "BINOP", "CONDITIONS", "WS", "CHARACTER", "DIGIT", 
			"DELIMITER", "OPERATOR"
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


	Map<String,Object> symbolTable = new HashMap<String,Object>();

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
			setState(62);
			match(T__0);
			setState(63);
			id();
			setState(64);
			match(T__1);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << WS) | (1L << CHARACTER) | (1L << DIGIT))) != 0)) {
				{
				{
				setState(65);
				exp();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
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
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public IdopContext idop() {
			return getRuleContext(IdopContext.class,0);
		}
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
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				idop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				term();
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(76);
						binop();
						setState(77);
						exp();
						}
						} 
					}
					setState(83);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				match(T__3);
				setState(85);
				exp();
				setState(86);
				match(T__4);
				setState(87);
				exp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				match(T__3);
				setState(90);
				exp();
				setState(91);
				match(T__4);
				setState(92);
				exp();
				setState(93);
				match(T__5);
				setState(94);
				match(T__4);
				setState(95);
				exp();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				match(T__6);
				setState(98);
				exp();
				setState(99);
				match(T__4);
				setState(100);
				exp();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(102);
				match(T__7);
				setState(103);
				id();
				setState(104);
				match(T__8);
				setState(105);
				term();
				setState(106);
				match(T__4);
				setState(107);
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
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
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
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				unop();
				setState(112);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				factor();
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(115);
						match(T__9);
						setState(116);
						expList();
						setState(117);
						match(T__10);
						}
						} 
					}
					setState(123);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				empty();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				integer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				bool();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(127);
				string();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(128);
				print();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(129);
				sumpolynomial();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(130);
				subpolynomial();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(131);
				mulpolynomial();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(132);
				mulcpolynomial();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(133);
				derpolynomial();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(134);
				defintegralpolynomial();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(135);
				integralpolynomial();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(136);
				evalpolynomial();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(137);
				degree();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(138);
				equalpolynomial();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(139);
				polynomial();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(140);
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

	public static class PrintContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__11);
			setState(144);
			exp();
			setState(145);
			match(T__12);
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

	public static class IdopContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public IdopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).enterIdop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polyListener ) ((polyListener)listener).exitIdop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof polyVisitor ) return ((polyVisitor<? extends T>)visitor).visitIdop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdopContext idop() throws RecognitionException {
		IdopContext _localctx = new IdopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_idop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			id();
			setState(148);
			binop();
			setState(149);
			id();
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
		enterRule(_localctx, 10, RULE_sumpolynomial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			polynomial();
			setState(152);
			match(T__13);
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
		enterRule(_localctx, 12, RULE_subpolynomial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			polynomial();
			setState(156);
			match(T__14);
			setState(157);
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
		enterRule(_localctx, 14, RULE_mulpolynomial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			polynomial();
			setState(160);
			match(T__15);
			setState(161);
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
		enterRule(_localctx, 16, RULE_mulcpolynomial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			polynomial();
			setState(164);
			match(T__15);
			setState(165);
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
		enterRule(_localctx, 18, RULE_derpolynomial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__16);
			setState(168);
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
		enterRule(_localctx, 20, RULE_defintegralpolynomial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__17);
			setState(171);
			polynomial();
			setState(172);
			integer();
			setState(173);
			match(T__18);
			setState(174);
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
		enterRule(_localctx, 22, RULE_integralpolynomial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__17);
			setState(177);
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
		enterRule(_localctx, 24, RULE_evalpolynomial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__19);
			setState(180);
			polynomial();
			setState(181);
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
		enterRule(_localctx, 26, RULE_degree);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(T__20);
				setState(184);
				polynomial();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(T__20);
				setState(186);
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
		enterRule(_localctx, 28, RULE_equalpolynomial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			polynomial();
			setState(190);
			match(T__21);
			setState(191);
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
		enterRule(_localctx, 30, RULE_monomial);
		int _la;
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				integer();
				setState(195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(194);
					match(CHARACTER);
					}
					break;
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(197);
					match(T__22);
					setState(198);
					integer();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
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
		enterRule(_localctx, 32, RULE_polynomial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__23);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__14) {
				{
				setState(205);
				sign();
				}
			}

			setState(208);
			monomial();
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(209);
				sign();
				setState(210);
				monomial();
				}
				}
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__13 || _la==T__14 );
			setState(216);
			match(T__23);
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
		enterRule(_localctx, 34, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__24);
			setState(219);
			exp();
			setState(220);
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
		enterRule(_localctx, 36, RULE_factor);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(T__9);
				setState(223);
				exp();
				setState(224);
				match(T__10);
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
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
		enterRule(_localctx, 38, RULE_expList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << WS) | (1L << CHARACTER) | (1L << DIGIT))) != 0)) {
				{
				{
				setState(229);
				propExpList();
				}
				}
				setState(234);
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
		enterRule(_localctx, 40, RULE_propExpList);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				exp();
				setState(237);
				match(T__18);
				setState(238);
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
		enterRule(_localctx, 42, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHARACTER) {
				{
				{
				setState(242);
				propIdList();
				}
				}
				setState(247);
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
		enterRule(_localctx, 44, RULE_propIdList);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				id();
				setState(250);
				match(T__18);
				setState(251);
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
		enterRule(_localctx, 46, RULE_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			id();
			setState(256);
			match(T__25);
			setState(257);
			exp();
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
		enterRule(_localctx, 48, RULE_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
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
		enterRule(_localctx, 50, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==T__27) ) {
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
		enterRule(_localctx, 52, RULE_unop);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				sign();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(T__28);
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
		enterRule(_localctx, 54, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
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
		enterRule(_localctx, 56, RULE_binop);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				sign();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(T__15);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				match(T__29);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				match(T__25);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 5);
				{
				setState(273);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 6);
				{
				setState(274);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 7);
				{
				setState(275);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 8);
				{
				setState(276);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 9);
				{
				setState(277);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 10);
				{
				setState(278);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 11);
				{
				setState(279);
				match(T__36);
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
		enterRule(_localctx, 58, RULE_id);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(CHARACTER);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(283);
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
				setState(288);
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
		enterRule(_localctx, 60, RULE_integer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(290); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(289);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(292); 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u0129\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7"+
		"\3R\n\3\f\3\16\3U\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3p\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\7\4z\n\4\f\4\16\4}\13\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0090\n\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00be\n\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\5\21\u00c6\n\21\3\21\3\21\5\21\u00ca\n\21\3\21\5\21\u00cd"+
		"\n\21\3\22\3\22\5\22\u00d1\n\22\3\22\3\22\3\22\3\22\6\22\u00d7\n\22\r"+
		"\22\16\22\u00d8\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u00e6\n\24\3\25\7\25\u00e9\n\25\f\25\16\25\u00ec\13\25\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u00f3\n\26\3\27\7\27\u00f6\n\27\f\27\16\27\u00f9"+
		"\13\27\3\30\3\30\3\30\3\30\3\30\5\30\u0100\n\30\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\5\34\u010c\n\34\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u011b\n\36\3\37\3\37\7\37"+
		"\u011f\n\37\f\37\16\37\u0122\13\37\3 \6 \u0125\n \r \16 \u0126\3 \2\2"+
		"!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\5"+
		"\3\2\35\36\3\2\20\21\3\2;<\2\u013c\2@\3\2\2\2\4o\3\2\2\2\6\u008f\3\2\2"+
		"\2\b\u0091\3\2\2\2\n\u0095\3\2\2\2\f\u0099\3\2\2\2\16\u009d\3\2\2\2\20"+
		"\u00a1\3\2\2\2\22\u00a5\3\2\2\2\24\u00a9\3\2\2\2\26\u00ac\3\2\2\2\30\u00b2"+
		"\3\2\2\2\32\u00b5\3\2\2\2\34\u00bd\3\2\2\2\36\u00bf\3\2\2\2 \u00cc\3\2"+
		"\2\2\"\u00ce\3\2\2\2$\u00dc\3\2\2\2&\u00e5\3\2\2\2(\u00ea\3\2\2\2*\u00f2"+
		"\3\2\2\2,\u00f7\3\2\2\2.\u00ff\3\2\2\2\60\u0101\3\2\2\2\62\u0105\3\2\2"+
		"\2\64\u0107\3\2\2\2\66\u010b\3\2\2\28\u010d\3\2\2\2:\u011a\3\2\2\2<\u011c"+
		"\3\2\2\2>\u0124\3\2\2\2@A\7\3\2\2AB\5<\37\2BF\7\4\2\2CE\5\4\3\2DC\3\2"+
		"\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\5\2\2J\3\3"+
		"\2\2\2Kp\5\60\31\2Lp\5\n\6\2MS\5\6\4\2NO\5:\36\2OP\5\4\3\2PR\3\2\2\2Q"+
		"N\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2Tp\3\2\2\2US\3\2\2\2VW\7\6\2\2"+
		"WX\5\4\3\2XY\7\7\2\2YZ\5\4\3\2Zp\3\2\2\2[\\\7\6\2\2\\]\5\4\3\2]^\7\7\2"+
		"\2^_\5\4\3\2_`\7\b\2\2`a\7\7\2\2ab\5\4\3\2bp\3\2\2\2cd\7\t\2\2de\5\4\3"+
		"\2ef\7\7\2\2fg\5\4\3\2gp\3\2\2\2hi\7\n\2\2ij\5<\37\2jk\7\13\2\2kl\5\6"+
		"\4\2lm\7\7\2\2mn\5\4\3\2np\3\2\2\2oK\3\2\2\2oL\3\2\2\2oM\3\2\2\2oV\3\2"+
		"\2\2o[\3\2\2\2oc\3\2\2\2oh\3\2\2\2p\5\3\2\2\2qr\5\66\34\2rs\5\6\4\2s\u0090"+
		"\3\2\2\2t{\5&\24\2uv\7\f\2\2vw\5(\25\2wx\7\r\2\2xz\3\2\2\2yu\3\2\2\2z"+
		"}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0090\3\2\2\2}{\3\2\2\2~\u0090\5\62\32"+
		"\2\177\u0090\5> \2\u0080\u0090\5\64\33\2\u0081\u0090\5$\23\2\u0082\u0090"+
		"\5\b\5\2\u0083\u0090\5\f\7\2\u0084\u0090\5\16\b\2\u0085\u0090\5\20\t\2"+
		"\u0086\u0090\5\22\n\2\u0087\u0090\5\24\13\2\u0088\u0090\5\26\f\2\u0089"+
		"\u0090\5\30\r\2\u008a\u0090\5\32\16\2\u008b\u0090\5\34\17\2\u008c\u0090"+
		"\5\36\20\2\u008d\u0090\5\"\22\2\u008e\u0090\5 \21\2\u008fq\3\2\2\2\u008f"+
		"t\3\2\2\2\u008f~\3\2\2\2\u008f\177\3\2\2\2\u008f\u0080\3\2\2\2\u008f\u0081"+
		"\3\2\2\2\u008f\u0082\3\2\2\2\u008f\u0083\3\2\2\2\u008f\u0084\3\2\2\2\u008f"+
		"\u0085\3\2\2\2\u008f\u0086\3\2\2\2\u008f\u0087\3\2\2\2\u008f\u0088\3\2"+
		"\2\2\u008f\u0089\3\2\2\2\u008f\u008a\3\2\2\2\u008f\u008b\3\2\2\2\u008f"+
		"\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\7\3\2\2\2"+
		"\u0091\u0092\7\16\2\2\u0092\u0093\5\4\3\2\u0093\u0094\7\17\2\2\u0094\t"+
		"\3\2\2\2\u0095\u0096\5<\37\2\u0096\u0097\5:\36\2\u0097\u0098\5<\37\2\u0098"+
		"\13\3\2\2\2\u0099\u009a\5\"\22\2\u009a\u009b\7\20\2\2\u009b\u009c\5\""+
		"\22\2\u009c\r\3\2\2\2\u009d\u009e\5\"\22\2\u009e\u009f\7\21\2\2\u009f"+
		"\u00a0\5\"\22\2\u00a0\17\3\2\2\2\u00a1\u00a2\5\"\22\2\u00a2\u00a3\7\22"+
		"\2\2\u00a3\u00a4\5\"\22\2\u00a4\21\3\2\2\2\u00a5\u00a6\5\"\22\2\u00a6"+
		"\u00a7\7\22\2\2\u00a7\u00a8\5> \2\u00a8\23\3\2\2\2\u00a9\u00aa\7\23\2"+
		"\2\u00aa\u00ab\5\"\22\2\u00ab\25\3\2\2\2\u00ac\u00ad\7\24\2\2\u00ad\u00ae"+
		"\5\"\22\2\u00ae\u00af\5> \2\u00af\u00b0\7\25\2\2\u00b0\u00b1\5> \2\u00b1"+
		"\27\3\2\2\2\u00b2\u00b3\7\24\2\2\u00b3\u00b4\5\"\22\2\u00b4\31\3\2\2\2"+
		"\u00b5\u00b6\7\26\2\2\u00b6\u00b7\5\"\22\2\u00b7\u00b8\5> \2\u00b8\33"+
		"\3\2\2\2\u00b9\u00ba\7\27\2\2\u00ba\u00be\5\"\22\2\u00bb\u00bc\7\27\2"+
		"\2\u00bc\u00be\5 \21\2\u00bd\u00b9\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\35"+
		"\3\2\2\2\u00bf\u00c0\5\"\22\2\u00c0\u00c1\7\30\2\2\u00c1\u00c2\5\"\22"+
		"\2\u00c2\37\3\2\2\2\u00c3\u00c5\5> \2\u00c4\u00c6\7;\2\2\u00c5\u00c4\3"+
		"\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c8\7\31\2\2\u00c8"+
		"\u00ca\5> \2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cd\3\2\2"+
		"\2\u00cb\u00cd\5> \2\u00cc\u00c3\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd!\3"+
		"\2\2\2\u00ce\u00d0\7\32\2\2\u00cf\u00d1\58\35\2\u00d0\u00cf\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d6\5 \21\2\u00d3\u00d4\58"+
		"\35\2\u00d4\u00d5\5 \21\2\u00d5\u00d7\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00db\7\32\2\2\u00db#\3\2\2\2\u00dc\u00dd\7\33\2\2\u00dd\u00de"+
		"\5\4\3\2\u00de\u00df\7\33\2\2\u00df%\3\2\2\2\u00e0\u00e1\7\f\2\2\u00e1"+
		"\u00e2\5\4\3\2\u00e2\u00e3\7\r\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e6\5<"+
		"\37\2\u00e5\u00e0\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\'\3\2\2\2\u00e7\u00e9"+
		"\5*\26\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb)\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f3\5\4\3\2"+
		"\u00ee\u00ef\5\4\3\2\u00ef\u00f0\7\25\2\2\u00f0\u00f1\5*\26\2\u00f1\u00f3"+
		"\3\2\2\2\u00f2\u00ed\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f3+\3\2\2\2\u00f4"+
		"\u00f6\5.\30\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8-\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u0100"+
		"\5<\37\2\u00fb\u00fc\5<\37\2\u00fc\u00fd\7\25\2\2\u00fd\u00fe\5.\30\2"+
		"\u00fe\u0100\3\2\2\2\u00ff\u00fa\3\2\2\2\u00ff\u00fb\3\2\2\2\u0100/\3"+
		"\2\2\2\u0101\u0102\5<\37\2\u0102\u0103\7\34\2\2\u0103\u0104\5\4\3\2\u0104"+
		"\61\3\2\2\2\u0105\u0106\7:\2\2\u0106\63\3\2\2\2\u0107\u0108\t\2\2\2\u0108"+
		"\65\3\2\2\2\u0109\u010c\58\35\2\u010a\u010c\7\37\2\2\u010b\u0109\3\2\2"+
		"\2\u010b\u010a\3\2\2\2\u010c\67\3\2\2\2\u010d\u010e\t\3\2\2\u010e9\3\2"+
		"\2\2\u010f\u011b\58\35\2\u0110\u011b\7\22\2\2\u0111\u011b\7 \2\2\u0112"+
		"\u011b\7\34\2\2\u0113\u011b\7!\2\2\u0114\u011b\7\"\2\2\u0115\u011b\7#"+
		"\2\2\u0116\u011b\7$\2\2\u0117\u011b\7%\2\2\u0118\u011b\7&\2\2\u0119\u011b"+
		"\7\'\2\2\u011a\u010f\3\2\2\2\u011a\u0110\3\2\2\2\u011a\u0111\3\2\2\2\u011a"+
		"\u0112\3\2\2\2\u011a\u0113\3\2\2\2\u011a\u0114\3\2\2\2\u011a\u0115\3\2"+
		"\2\2\u011a\u0116\3\2\2\2\u011a\u0117\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u0119\3\2\2\2\u011b;\3\2\2\2\u011c\u0120\7;\2\2\u011d\u011f\t\4\2\2\u011e"+
		"\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121=\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0125\7<\2\2\u0124\u0123"+
		"\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"?\3\2\2\2\26FSo{\u008f\u00bd\u00c5\u00c9\u00cc\u00d0\u00d8\u00e5\u00ea"+
		"\u00f2\u00f7\u00ff\u010b\u011a\u0120\u0126";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}