// Generated from src/main/java/Calculator.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, DOUBLE=2, ABS=3, SQRT=4, WS=5, PLUS=6, EQUAL=7, MINUS=8, MULT=9, 
		DIV=10, LPAR=11, RPAR=12;
	public static final int
		RULE_input = 0, RULE_lhs = 1, RULE_rhs = 2, RULE_abs = 3, RULE_sqrt = 4, 
		RULE_unaryAtom = 5, RULE_atom = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"input", "lhs", "rhs", "abs", "sqrt", "unaryAtom", "atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'ABS'", "'SQRT'", null, "'+'", "'='", "'-'", "'*'", 
			"'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "DOUBLE", "ABS", "SQRT", "WS", "PLUS", "EQUAL", "MINUS", 
			"MULT", "DIV", "LPAR", "RPAR"
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
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	 
		public InputContext() { }
		public void copyFrom(InputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CalculateContext extends InputContext {
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CalculatorParser.EOF, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public CalculateContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitCalculate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		int _la;
		try {
			_localctx = new CalculateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			lhs(0);
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << ABS) | (1L << SQRT) | (1L << MINUS) | (1L << LPAR))) != 0)) {
				{
				setState(15);
				input();
				}
			}

			setState(18);
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

	public static class LhsContext extends ParserRuleContext {
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
	 
		public LhsContext() { }
		public void copyFrom(LhsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToMultOrDivContext extends LhsContext {
		public RhsContext rhs() {
			return getRuleContext(RhsContext.class,0);
		}
		public ToMultOrDivContext(LhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitToMultOrDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends LhsContext {
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CalculatorParser.PLUS, 0); }
		public RhsContext rhs() {
			return getRuleContext(RhsContext.class,0);
		}
		public PlusContext(LhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends LhsContext {
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CalculatorParser.MINUS, 0); }
		public RhsContext rhs() {
			return getRuleContext(RhsContext.class,0);
		}
		public MinusContext(LhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		return lhs(0);
	}

	private LhsContext lhs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LhsContext _localctx = new LhsContext(_ctx, _parentState);
		LhsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_lhs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToMultOrDivContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(21);
			rhs(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(31);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(29);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new PlusContext(new LhsContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_lhs);
						setState(23);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(24);
						match(PLUS);
						setState(25);
						rhs(0);
						}
						break;
					case 2:
						{
						_localctx = new MinusContext(new LhsContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_lhs);
						setState(26);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(27);
						match(MINUS);
						setState(28);
						rhs(0);
						}
						break;
					}
					} 
				}
				setState(33);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RhsContext extends ParserRuleContext {
		public RhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rhs; }
	 
		public RhsContext() { }
		public void copyFrom(RhsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToSqrtContext extends RhsContext {
		public SqrtContext sqrt() {
			return getRuleContext(SqrtContext.class,0);
		}
		public ToSqrtContext(RhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitToSqrt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationContext extends RhsContext {
		public RhsContext rhs() {
			return getRuleContext(RhsContext.class,0);
		}
		public TerminalNode MULT() { return getToken(CalculatorParser.MULT, 0); }
		public UnaryAtomContext unaryAtom() {
			return getRuleContext(UnaryAtomContext.class,0);
		}
		public MultiplicationContext(RhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToAbsContext extends RhsContext {
		public AbsContext abs() {
			return getRuleContext(AbsContext.class,0);
		}
		public ToAbsContext(RhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitToAbs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomRhsContext extends RhsContext {
		public UnaryAtomContext unaryAtom() {
			return getRuleContext(UnaryAtomContext.class,0);
		}
		public AtomRhsContext(RhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitAtomRhs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends RhsContext {
		public RhsContext rhs() {
			return getRuleContext(RhsContext.class,0);
		}
		public TerminalNode DIV() { return getToken(CalculatorParser.DIV, 0); }
		public UnaryAtomContext unaryAtom() {
			return getRuleContext(UnaryAtomContext.class,0);
		}
		public DivisionContext(RhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RhsContext rhs() throws RecognitionException {
		return rhs(0);
	}

	private RhsContext rhs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RhsContext _localctx = new RhsContext(_ctx, _parentState);
		RhsContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_rhs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case MINUS:
			case LPAR:
				{
				_localctx = new AtomRhsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(35);
				unaryAtom();
				}
				break;
			case ABS:
				{
				_localctx = new ToAbsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				abs();
				}
				break;
			case SQRT:
				{
				_localctx = new ToSqrtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				sqrt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(46);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new RhsContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rhs);
						setState(40);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(41);
						match(MULT);
						setState(42);
						unaryAtom();
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new RhsContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rhs);
						setState(43);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(44);
						match(DIV);
						setState(45);
						unaryAtom();
						}
						break;
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AbsContext extends ParserRuleContext {
		public AbsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abs; }
	 
		public AbsContext() { }
		public void copyFrom(AbsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AbsCalcContext extends AbsContext {
		public TerminalNode ABS() { return getToken(CalculatorParser.ABS, 0); }
		public TerminalNode LPAR() { return getToken(CalculatorParser.LPAR, 0); }
		public UnaryAtomContext unaryAtom() {
			return getRuleContext(UnaryAtomContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CalculatorParser.RPAR, 0); }
		public AbsCalcContext(AbsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitAbsCalc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsContext abs() throws RecognitionException {
		AbsContext _localctx = new AbsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_abs);
		try {
			_localctx = new AbsCalcContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(ABS);
			setState(52);
			match(LPAR);
			setState(53);
			unaryAtom();
			setState(54);
			match(RPAR);
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

	public static class SqrtContext extends ParserRuleContext {
		public SqrtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqrt; }
	 
		public SqrtContext() { }
		public void copyFrom(SqrtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SqrtCalcContext extends SqrtContext {
		public TerminalNode SQRT() { return getToken(CalculatorParser.SQRT, 0); }
		public TerminalNode LPAR() { return getToken(CalculatorParser.LPAR, 0); }
		public UnaryAtomContext unaryAtom() {
			return getRuleContext(UnaryAtomContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CalculatorParser.RPAR, 0); }
		public SqrtCalcContext(SqrtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitSqrtCalc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqrtContext sqrt() throws RecognitionException {
		SqrtContext _localctx = new SqrtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sqrt);
		try {
			_localctx = new SqrtCalcContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(SQRT);
			setState(57);
			match(LPAR);
			setState(58);
			unaryAtom();
			setState(59);
			match(RPAR);
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

	public static class UnaryAtomContext extends ParserRuleContext {
		public UnaryAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryAtom; }
	 
		public UnaryAtomContext() { }
		public void copyFrom(UnaryAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChangeSignContext extends UnaryAtomContext {
		public TerminalNode MINUS() { return getToken(CalculatorParser.MINUS, 0); }
		public UnaryAtomContext unaryAtom() {
			return getRuleContext(UnaryAtomContext.class,0);
		}
		public ChangeSignContext(UnaryAtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitChangeSign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToAtomContext extends UnaryAtomContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ToAtomContext(UnaryAtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitToAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryAtomContext unaryAtom() throws RecognitionException {
		UnaryAtomContext _localctx = new UnaryAtomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unaryAtom);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				_localctx = new ChangeSignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(MINUS);
				setState(62);
				unaryAtom();
				}
				break;
			case INT:
			case DOUBLE:
			case LPAR:
				_localctx = new ToAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				atom();
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BracesContext extends AtomContext {
		public TerminalNode LPAR() { return getToken(CalculatorParser.LPAR, 0); }
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CalculatorParser.RPAR, 0); }
		public BracesContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitBraces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleContext extends AtomContext {
		public TerminalNode DOUBLE() { return getToken(CalculatorParser.DOUBLE, 0); }
		public DoubleContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends AtomContext {
		public TerminalNode INT() { return getToken(CalculatorParser.INT, 0); }
		public IntContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atom);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
				_localctx = new DoubleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(DOUBLE);
				}
				break;
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(INT);
				}
				break;
			case LPAR:
				_localctx = new BracesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				match(LPAR);
				setState(69);
				lhs(0);
				setState(70);
				match(RPAR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return lhs_sempred((LhsContext)_localctx, predIndex);
		case 2:
			return rhs_sempred((RhsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean lhs_sempred(LhsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rhs_sempred(RhsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16M\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\5\2\23\n\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3\3\4\3\4\3"+
		"\4\3\4\5\4)\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\61\n\4\f\4\16\4\64\13\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7C\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\bK\n\b\3\b\2\4\4\6\t\2\4\6\b\n\f\16\2\2\2O\2\20\3\2\2"+
		"\2\4\26\3\2\2\2\6(\3\2\2\2\b\65\3\2\2\2\n:\3\2\2\2\fB\3\2\2\2\16J\3\2"+
		"\2\2\20\22\5\4\3\2\21\23\5\2\2\2\22\21\3\2\2\2\22\23\3\2\2\2\23\24\3\2"+
		"\2\2\24\25\7\2\2\3\25\3\3\2\2\2\26\27\b\3\1\2\27\30\5\6\4\2\30!\3\2\2"+
		"\2\31\32\f\5\2\2\32\33\7\b\2\2\33 \5\6\4\2\34\35\f\4\2\2\35\36\7\n\2\2"+
		"\36 \5\6\4\2\37\31\3\2\2\2\37\34\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2"+
		"\2\2\"\5\3\2\2\2#!\3\2\2\2$%\b\4\1\2%)\5\f\7\2&)\5\b\5\2\')\5\n\6\2($"+
		"\3\2\2\2(&\3\2\2\2(\'\3\2\2\2)\62\3\2\2\2*+\f\7\2\2+,\7\13\2\2,\61\5\f"+
		"\7\2-.\f\6\2\2./\7\f\2\2/\61\5\f\7\2\60*\3\2\2\2\60-\3\2\2\2\61\64\3\2"+
		"\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\7\3\2\2\2\64\62\3\2\2\2\65\66\7\5"+
		"\2\2\66\67\7\r\2\2\678\5\f\7\289\7\16\2\29\t\3\2\2\2:;\7\6\2\2;<\7\r\2"+
		"\2<=\5\f\7\2=>\7\16\2\2>\13\3\2\2\2?@\7\n\2\2@C\5\f\7\2AC\5\16\b\2B?\3"+
		"\2\2\2BA\3\2\2\2C\r\3\2\2\2DK\7\4\2\2EK\7\3\2\2FG\7\r\2\2GH\5\4\3\2HI"+
		"\7\16\2\2IK\3\2\2\2JD\3\2\2\2JE\3\2\2\2JF\3\2\2\2K\17\3\2\2\2\n\22\37"+
		"!(\60\62BJ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}