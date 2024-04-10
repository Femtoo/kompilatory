package cute.uwu.gen;// Generated from D:/Studia/sem8/kompilatory/projekt/kompilatory/cutelang/grammar/cuteLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class cuteLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TOINT=7, TOFLOAT=8, WRITE=9, 
		READ=10, STRING=11, ID=12, INT=13, FLOAT=14, TRUE=15, FALSE=16, ADD=17, 
		MULT=18, DIV=19, SUB=20, AND=21, OR=22, XOR=23, NEG=24, NEWLINE=25, WS=26, 
		START=27, END=28;
	public static final int
		RULE_program = 0, RULE_operation = 1, RULE_expr0 = 2, RULE_expr1 = 3, 
		RULE_expr2 = 4, RULE_expr3 = 5, RULE_expr4 = 6, RULE_boolExpr0 = 7, RULE_boolExpr1 = 8, 
		RULE_boolExpr2 = 9, RULE_boolExpr3 = 10, RULE_boolExpr4 = 11, RULE_arrayExpr = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "operation", "expr0", "expr1", "expr2", "expr3", "expr4", 
			"boolExpr0", "boolExpr1", "boolExpr2", "boolExpr3", "boolExpr4", "arrayExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'['", "','", "']'", "'(int)'", "'(float)'", 
			"'write'", "'read'", null, null, null, null, "'true'", "'false'", "'+'", 
			"'*'", "'/'", "'-'", "'&&'", "'||'", "'^'", "'!'", null, null, "':D'", 
			"':C'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "TOINT", "TOFLOAT", "WRITE", 
			"READ", "STRING", "ID", "INT", "FLOAT", "TRUE", "FALSE", "ADD", "MULT", 
			"DIV", "SUB", "AND", "OR", "XOR", "NEG", "NEWLINE", "WS", "START", "END"
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
	public String getGrammarFileName() { return "cuteLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public cuteLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(cuteLangParser.START, 0); }
		public TerminalNode END() { return getToken(cuteLangParser.END, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(cuteLangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(cuteLangParser.NEWLINE, i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(26);
			match(START);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33560064L) != 0)) {
				{
				{
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5632L) != 0)) {
					{
					setState(27);
					operation();
					}
				}

				setState(30);
				match(NEWLINE);
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	 
		public OperationContext() { }
		public void copyFrom(OperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadContext extends OperationContext {
		public TerminalNode READ() { return getToken(cuteLangParser.READ, 0); }
		public TerminalNode ID() { return getToken(cuteLangParser.ID, 0); }
		public ReadContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WriteContext extends OperationContext {
		public TerminalNode WRITE() { return getToken(cuteLangParser.WRITE, 0); }
		public TerminalNode ID() { return getToken(cuteLangParser.ID, 0); }
		public WriteContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends OperationContext {
		public TerminalNode ID() { return getToken(cuteLangParser.ID, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public AssignContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_operation);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRITE:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(WRITE);
				setState(39);
				match(ID);
				}
				break;
			case ID:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(ID);
				setState(41);
				match(T__0);
				setState(42);
				expr0();
				}
				break;
			case READ:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				match(READ);
				setState(44);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr0Context extends ParserRuleContext {
		public Expr0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr0; }
	 
		public Expr0Context() { }
		public void copyFrom(Expr0Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Single0Context extends Expr0Context {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Single0Context(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterSingle0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitSingle0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitSingle0(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends Expr0Context {
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public TerminalNode ADD() { return getToken(cuteLangParser.ADD, 0); }
		public AddContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends Expr0Context {
		public TerminalNode STRING() { return getToken(cuteLangParser.STRING, 0); }
		public StringContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolexprContext extends Expr0Context {
		public BoolExpr0Context boolExpr0() {
			return getRuleContext(BoolExpr0Context.class,0);
		}
		public BoolexprContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterBoolexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitBoolexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitBoolexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr0Context expr0() throws RecognitionException {
		Expr0Context _localctx = new Expr0Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr0);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Single0Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				expr1();
				}
				break;
			case 2:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				match(STRING);
				}
				break;
			case 3:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				expr1();
				setState(50);
				match(ADD);
				setState(51);
				expr1();
				}
				break;
			case 4:
				_localctx = new BoolexprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				boolExpr0();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr1Context extends ParserRuleContext {
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	 
		public Expr1Context() { }
		public void copyFrom(Expr1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Single1Context extends Expr1Context {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Single1Context(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterSingle1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitSingle1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitSingle1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultContext extends Expr1Context {
		public List<Expr2Context> expr2() {
			return getRuleContexts(Expr2Context.class);
		}
		public Expr2Context expr2(int i) {
			return getRuleContext(Expr2Context.class,i);
		}
		public TerminalNode MULT() { return getToken(cuteLangParser.MULT, 0); }
		public MultContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr1);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new Single1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				expr2();
				}
				break;
			case 2:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				expr2();
				setState(58);
				match(MULT);
				setState(59);
				expr2();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr2Context extends ParserRuleContext {
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	 
		public Expr2Context() { }
		public void copyFrom(Expr2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubContext extends Expr2Context {
		public List<Expr3Context> expr3() {
			return getRuleContexts(Expr3Context.class);
		}
		public Expr3Context expr3(int i) {
			return getRuleContext(Expr3Context.class,i);
		}
		public TerminalNode SUB() { return getToken(cuteLangParser.SUB, 0); }
		public SubContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Single2Context extends Expr2Context {
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public Single2Context(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterSingle2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitSingle2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitSingle2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr2);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new Single2Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				expr3();
				}
				break;
			case 2:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				expr3();
				setState(65);
				match(SUB);
				setState(66);
				expr3();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr3Context extends ParserRuleContext {
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3; }
	 
		public Expr3Context() { }
		public void copyFrom(Expr3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivContext extends Expr3Context {
		public List<Expr4Context> expr4() {
			return getRuleContexts(Expr4Context.class);
		}
		public Expr4Context expr4(int i) {
			return getRuleContext(Expr4Context.class,i);
		}
		public TerminalNode DIV() { return getToken(cuteLangParser.DIV, 0); }
		public DivContext(Expr3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Single3Context extends Expr3Context {
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public Single3Context(Expr3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterSingle3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitSingle3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitSingle3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr3Context expr3() throws RecognitionException {
		Expr3Context _localctx = new Expr3Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr3);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Single3Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				expr4();
				}
				break;
			case 2:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				expr4();
				setState(72);
				match(DIV);
				setState(73);
				expr4();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr4Context extends ParserRuleContext {
		public Expr4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr4; }
	 
		public Expr4Context() { }
		public void copyFrom(Expr4Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParContext extends Expr4Context {
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public ParContext(Expr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TointContext extends Expr4Context {
		public TerminalNode TOINT() { return getToken(cuteLangParser.TOINT, 0); }
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public TointContext(Expr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterToint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitToint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitToint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends Expr4Context {
		public ArrayExprContext arrayExpr() {
			return getRuleContext(ArrayExprContext.class,0);
		}
		public ArrayContext(Expr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends Expr4Context {
		public TerminalNode FLOAT() { return getToken(cuteLangParser.FLOAT, 0); }
		public FloatContext(Expr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TofloatContext extends Expr4Context {
		public TerminalNode TOFLOAT() { return getToken(cuteLangParser.TOFLOAT, 0); }
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public TofloatContext(Expr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterTofloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitTofloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitTofloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends Expr4Context {
		public TerminalNode INT() { return getToken(cuteLangParser.INT, 0); }
		public IntContext(Expr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr4Context expr4() throws RecognitionException {
		Expr4Context _localctx = new Expr4Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr4);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(FLOAT);
				}
				break;
			case T__3:
				_localctx = new ArrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				arrayExpr();
				}
				break;
			case TOINT:
				_localctx = new TointContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				match(TOINT);
				setState(81);
				expr4();
				}
				break;
			case TOFLOAT:
				_localctx = new TofloatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				match(TOFLOAT);
				setState(83);
				expr4();
				}
				break;
			case T__1:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				match(T__1);
				setState(85);
				expr0();
				setState(86);
				match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolExpr0Context extends ParserRuleContext {
		public BoolExpr0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr0; }
	 
		public BoolExpr0Context() { }
		public void copyFrom(BoolExpr0Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends BoolExpr0Context {
		public List<BoolExpr1Context> boolExpr1() {
			return getRuleContexts(BoolExpr1Context.class);
		}
		public BoolExpr1Context boolExpr1(int i) {
			return getRuleContext(BoolExpr1Context.class,i);
		}
		public TerminalNode AND() { return getToken(cuteLangParser.AND, 0); }
		public AndContext(BoolExpr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Singlebool0Context extends BoolExpr0Context {
		public BoolExpr1Context boolExpr1() {
			return getRuleContext(BoolExpr1Context.class,0);
		}
		public Singlebool0Context(BoolExpr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterSinglebool0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitSinglebool0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitSinglebool0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpr0Context boolExpr0() throws RecognitionException {
		BoolExpr0Context _localctx = new BoolExpr0Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_boolExpr0);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new Singlebool0Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				boolExpr1();
				}
				break;
			case 2:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				boolExpr1();
				setState(92);
				match(AND);
				setState(93);
				boolExpr1();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolExpr1Context extends ParserRuleContext {
		public BoolExpr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr1; }
	 
		public BoolExpr1Context() { }
		public void copyFrom(BoolExpr1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends BoolExpr1Context {
		public List<BoolExpr2Context> boolExpr2() {
			return getRuleContexts(BoolExpr2Context.class);
		}
		public BoolExpr2Context boolExpr2(int i) {
			return getRuleContext(BoolExpr2Context.class,i);
		}
		public TerminalNode OR() { return getToken(cuteLangParser.OR, 0); }
		public OrContext(BoolExpr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Singlebool1Context extends BoolExpr1Context {
		public BoolExpr2Context boolExpr2() {
			return getRuleContext(BoolExpr2Context.class,0);
		}
		public Singlebool1Context(BoolExpr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterSinglebool1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitSinglebool1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitSinglebool1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpr1Context boolExpr1() throws RecognitionException {
		BoolExpr1Context _localctx = new BoolExpr1Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_boolExpr1);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new Singlebool1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				boolExpr2();
				}
				break;
			case 2:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				boolExpr2();
				setState(99);
				match(OR);
				setState(100);
				boolExpr2();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolExpr2Context extends ParserRuleContext {
		public BoolExpr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr2; }
	 
		public BoolExpr2Context() { }
		public void copyFrom(BoolExpr2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Singlebool2Context extends BoolExpr2Context {
		public BoolExpr3Context boolExpr3() {
			return getRuleContext(BoolExpr3Context.class,0);
		}
		public Singlebool2Context(BoolExpr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterSinglebool2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitSinglebool2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitSinglebool2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XorContext extends BoolExpr2Context {
		public List<BoolExpr3Context> boolExpr3() {
			return getRuleContexts(BoolExpr3Context.class);
		}
		public BoolExpr3Context boolExpr3(int i) {
			return getRuleContext(BoolExpr3Context.class,i);
		}
		public TerminalNode XOR() { return getToken(cuteLangParser.XOR, 0); }
		public XorContext(BoolExpr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitXor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitXor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpr2Context boolExpr2() throws RecognitionException {
		BoolExpr2Context _localctx = new BoolExpr2Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_boolExpr2);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new Singlebool2Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				boolExpr3();
				}
				break;
			case 2:
				_localctx = new XorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				boolExpr3();
				setState(106);
				match(XOR);
				setState(107);
				boolExpr3();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolExpr3Context extends ParserRuleContext {
		public BoolExpr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr3; }
	 
		public BoolExpr3Context() { }
		public void copyFrom(BoolExpr3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Singlebool3Context extends BoolExpr3Context {
		public BoolExpr4Context boolExpr4() {
			return getRuleContext(BoolExpr4Context.class,0);
		}
		public Singlebool3Context(BoolExpr3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterSinglebool3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitSinglebool3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitSinglebool3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegContext extends BoolExpr3Context {
		public TerminalNode NEG() { return getToken(cuteLangParser.NEG, 0); }
		public BoolExpr4Context boolExpr4() {
			return getRuleContext(BoolExpr4Context.class,0);
		}
		public NegContext(BoolExpr3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitNeg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpr3Context boolExpr3() throws RecognitionException {
		BoolExpr3Context _localctx = new BoolExpr3Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_boolExpr3);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case TRUE:
			case FALSE:
				_localctx = new Singlebool3Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				boolExpr4();
				}
				break;
			case NEG:
				_localctx = new NegContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(NEG);
				setState(113);
				boolExpr4();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolExpr4Context extends ParserRuleContext {
		public BoolExpr4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr4; }
	 
		public BoolExpr4Context() { }
		public void copyFrom(BoolExpr4Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueContext extends BoolExpr4Context {
		public TerminalNode TRUE() { return getToken(cuteLangParser.TRUE, 0); }
		public TrueContext(BoolExpr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseContext extends BoolExpr4Context {
		public TerminalNode FALSE() { return getToken(cuteLangParser.FALSE, 0); }
		public FalseContext(BoolExpr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolparContext extends BoolExpr4Context {
		public BoolExpr0Context boolExpr0() {
			return getRuleContext(BoolExpr0Context.class,0);
		}
		public BoolparContext(BoolExpr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterBoolpar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitBoolpar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitBoolpar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpr4Context boolExpr4() throws RecognitionException {
		BoolExpr4Context _localctx = new BoolExpr4Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_boolExpr4);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(FALSE);
				}
				break;
			case T__1:
				_localctx = new BoolparContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(T__1);
				setState(119);
				boolExpr0();
				setState(120);
				match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExprContext extends ParserRuleContext {
		public ArrayExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpr; }
	 
		public ArrayExprContext() { }
		public void copyFrom(ArrayExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatarrayContext extends ArrayExprContext {
		public List<TerminalNode> FLOAT() { return getTokens(cuteLangParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(cuteLangParser.FLOAT, i);
		}
		public FloatarrayContext(ArrayExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterFloatarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitFloatarray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitFloatarray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntarrayContext extends ArrayExprContext {
		public List<TerminalNode> INT() { return getTokens(cuteLangParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(cuteLangParser.INT, i);
		}
		public IntarrayContext(ArrayExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterIntarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitIntarray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitIntarray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayExprContext arrayExpr() throws RecognitionException {
		ArrayExprContext _localctx = new ArrayExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrayExpr);
		int _la;
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new IntarrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__3);
				setState(125);
				match(INT);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(126);
					match(T__4);
					setState(127);
					match(INT);
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new FloatarrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(T__3);
				setState(135);
				match(FLOAT);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(136);
					match(T__4);
					setState(137);
					match(FLOAT);
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				match(T__5);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001c\u0093\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0003\u0000\u001d\b\u0000\u0001"+
		"\u0000\u0005\u0000 \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001.\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00027\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003>\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004E\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005L\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006Y\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007`\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bg\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\tn\b\t\u0001\n\u0001\n\u0001\n\u0003\ns\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b{\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0081\b\f\n\f"+
		"\f\f\u0084\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u008b\b"+
		"\f\n\f\f\f\u008e\t\f\u0001\f\u0003\f\u0091\b\f\u0001\f\u0000\u0000\r\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0000"+
		"\u009d\u0000\u001a\u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000"+
		"\u00046\u0001\u0000\u0000\u0000\u0006=\u0001\u0000\u0000\u0000\bD\u0001"+
		"\u0000\u0000\u0000\nK\u0001\u0000\u0000\u0000\fX\u0001\u0000\u0000\u0000"+
		"\u000e_\u0001\u0000\u0000\u0000\u0010f\u0001\u0000\u0000\u0000\u0012m"+
		"\u0001\u0000\u0000\u0000\u0014r\u0001\u0000\u0000\u0000\u0016z\u0001\u0000"+
		"\u0000\u0000\u0018\u0090\u0001\u0000\u0000\u0000\u001a!\u0005\u001b\u0000"+
		"\u0000\u001b\u001d\u0003\u0002\u0001\u0000\u001c\u001b\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e \u0005\u0019\u0000\u0000\u001f\u001c\u0001\u0000\u0000\u0000"+
		" #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0005"+
		"\u001c\u0000\u0000%\u0001\u0001\u0000\u0000\u0000&\'\u0005\t\u0000\u0000"+
		"\'.\u0005\f\u0000\u0000()\u0005\f\u0000\u0000)*\u0005\u0001\u0000\u0000"+
		"*.\u0003\u0004\u0002\u0000+,\u0005\n\u0000\u0000,.\u0005\f\u0000\u0000"+
		"-&\u0001\u0000\u0000\u0000-(\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000"+
		"\u0000.\u0003\u0001\u0000\u0000\u0000/7\u0003\u0006\u0003\u000007\u0005"+
		"\u000b\u0000\u000012\u0003\u0006\u0003\u000023\u0005\u0011\u0000\u0000"+
		"34\u0003\u0006\u0003\u000047\u0001\u0000\u0000\u000057\u0003\u000e\u0007"+
		"\u00006/\u0001\u0000\u0000\u000060\u0001\u0000\u0000\u000061\u0001\u0000"+
		"\u0000\u000065\u0001\u0000\u0000\u00007\u0005\u0001\u0000\u0000\u0000"+
		"8>\u0003\b\u0004\u00009:\u0003\b\u0004\u0000:;\u0005\u0012\u0000\u0000"+
		";<\u0003\b\u0004\u0000<>\u0001\u0000\u0000\u0000=8\u0001\u0000\u0000\u0000"+
		"=9\u0001\u0000\u0000\u0000>\u0007\u0001\u0000\u0000\u0000?E\u0003\n\u0005"+
		"\u0000@A\u0003\n\u0005\u0000AB\u0005\u0014\u0000\u0000BC\u0003\n\u0005"+
		"\u0000CE\u0001\u0000\u0000\u0000D?\u0001\u0000\u0000\u0000D@\u0001\u0000"+
		"\u0000\u0000E\t\u0001\u0000\u0000\u0000FL\u0003\f\u0006\u0000GH\u0003"+
		"\f\u0006\u0000HI\u0005\u0013\u0000\u0000IJ\u0003\f\u0006\u0000JL\u0001"+
		"\u0000\u0000\u0000KF\u0001\u0000\u0000\u0000KG\u0001\u0000\u0000\u0000"+
		"L\u000b\u0001\u0000\u0000\u0000MY\u0005\r\u0000\u0000NY\u0005\u000e\u0000"+
		"\u0000OY\u0003\u0018\f\u0000PQ\u0005\u0007\u0000\u0000QY\u0003\f\u0006"+
		"\u0000RS\u0005\b\u0000\u0000SY\u0003\f\u0006\u0000TU\u0005\u0002\u0000"+
		"\u0000UV\u0003\u0004\u0002\u0000VW\u0005\u0003\u0000\u0000WY\u0001\u0000"+
		"\u0000\u0000XM\u0001\u0000\u0000\u0000XN\u0001\u0000\u0000\u0000XO\u0001"+
		"\u0000\u0000\u0000XP\u0001\u0000\u0000\u0000XR\u0001\u0000\u0000\u0000"+
		"XT\u0001\u0000\u0000\u0000Y\r\u0001\u0000\u0000\u0000Z`\u0003\u0010\b"+
		"\u0000[\\\u0003\u0010\b\u0000\\]\u0005\u0015\u0000\u0000]^\u0003\u0010"+
		"\b\u0000^`\u0001\u0000\u0000\u0000_Z\u0001\u0000\u0000\u0000_[\u0001\u0000"+
		"\u0000\u0000`\u000f\u0001\u0000\u0000\u0000ag\u0003\u0012\t\u0000bc\u0003"+
		"\u0012\t\u0000cd\u0005\u0016\u0000\u0000de\u0003\u0012\t\u0000eg\u0001"+
		"\u0000\u0000\u0000fa\u0001\u0000\u0000\u0000fb\u0001\u0000\u0000\u0000"+
		"g\u0011\u0001\u0000\u0000\u0000hn\u0003\u0014\n\u0000ij\u0003\u0014\n"+
		"\u0000jk\u0005\u0017\u0000\u0000kl\u0003\u0014\n\u0000ln\u0001\u0000\u0000"+
		"\u0000mh\u0001\u0000\u0000\u0000mi\u0001\u0000\u0000\u0000n\u0013\u0001"+
		"\u0000\u0000\u0000os\u0003\u0016\u000b\u0000pq\u0005\u0018\u0000\u0000"+
		"qs\u0003\u0016\u000b\u0000ro\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000"+
		"\u0000s\u0015\u0001\u0000\u0000\u0000t{\u0005\u000f\u0000\u0000u{\u0005"+
		"\u0010\u0000\u0000vw\u0005\u0002\u0000\u0000wx\u0003\u000e\u0007\u0000"+
		"xy\u0005\u0003\u0000\u0000y{\u0001\u0000\u0000\u0000zt\u0001\u0000\u0000"+
		"\u0000zu\u0001\u0000\u0000\u0000zv\u0001\u0000\u0000\u0000{\u0017\u0001"+
		"\u0000\u0000\u0000|}\u0005\u0004\u0000\u0000}\u0082\u0005\r\u0000\u0000"+
		"~\u007f\u0005\u0005\u0000\u0000\u007f\u0081\u0005\r\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0085"+
		"\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0091"+
		"\u0005\u0006\u0000\u0000\u0086\u0087\u0005\u0004\u0000\u0000\u0087\u008c"+
		"\u0005\u000e\u0000\u0000\u0088\u0089\u0005\u0005\u0000\u0000\u0089\u008b"+
		"\u0005\u000e\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008e"+
		"\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u008c"+
		"\u0001\u0000\u0000\u0000\u008f\u0091\u0005\u0006\u0000\u0000\u0090|\u0001"+
		"\u0000\u0000\u0000\u0090\u0086\u0001\u0000\u0000\u0000\u0091\u0019\u0001"+
		"\u0000\u0000\u0000\u0010\u001c!-6=DKX_fmrz\u0082\u008c\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}