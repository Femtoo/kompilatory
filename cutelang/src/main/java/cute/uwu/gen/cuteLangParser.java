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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		TOINT=10, TOFLOAT=11, FTYPE=12, WRITE=13, READ=14, FUNCTION=15, ENDFUNCTION=16, 
		REPEAT=17, ENDREPEAT=18, IF=19, THEN=20, ENDIF=21, STRING=22, BOOL=23, 
		ID=24, INT=25, FLOAT=26, ADD=27, MULT=28, DIV=29, SUB=30, AND=31, OR=32, 
		XOR=33, NEG=34, NEWLINE=35, WS=36, START=37, END=38;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_operation = 2, RULE_repetitions = 3, 
		RULE_repvalue = 4, RULE_ifblock = 5, RULE_cond = 6, RULE_expr0 = 7, RULE_expr1 = 8, 
		RULE_expr2 = 9, RULE_expr3 = 10, RULE_expr4 = 11, RULE_funccall = 12, 
		RULE_boolExpr0 = 13, RULE_boolExpr1 = 14, RULE_boolExpr2 = 15, RULE_boolExpr3 = 16, 
		RULE_boolExpr4 = 17, RULE_arrayExpr = 18, RULE_function = 19, RULE_fname = 20, 
		RULE_fparam = 21, RULE_fblock = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "operation", "repetitions", "repvalue", "ifblock", 
			"cond", "expr0", "expr1", "expr2", "expr3", "expr4", "funccall", "boolExpr0", 
			"boolExpr1", "boolExpr2", "boolExpr3", "boolExpr4", "arrayExpr", "function", 
			"fname", "fparam", "fblock"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'=='", "'('", "')'", "','", "'['", "']'", "'):'", "'return'", 
			"'(int)'", "'(float)'", null, "'write'", "'read'", "'function'", "'endfunction'", 
			"'repeat'", "'endrepeat'", "'if'", "'then'", "'endif'", null, null, null, 
			null, null, "'+'", "'*'", "'/'", "'-'", "'&&'", "'||'", "'^'", "'!'", 
			null, null, "':D'", "':C'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "TOINT", 
			"TOFLOAT", "FTYPE", "WRITE", "READ", "FUNCTION", "ENDFUNCTION", "REPEAT", 
			"ENDREPEAT", "IF", "THEN", "ENDIF", "STRING", "BOOL", "ID", "INT", "FLOAT", 
			"ADD", "MULT", "DIV", "SUB", "AND", "OR", "XOR", "NEG", "NEWLINE", "WS", 
			"START", "END"
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(cuteLangParser.END, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(START);
			setState(47);
			block();
			setState(48);
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
	public static class BlockContext extends ParserRuleContext {
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
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34377228288L) != 0)) {
				{
				{
				setState(52);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WRITE:
				case READ:
				case REPEAT:
				case IF:
				case ID:
					{
					setState(50);
					operation();
					}
					break;
				case FUNCTION:
					{
					setState(51);
					function();
					}
					break;
				case NEWLINE:
					break;
				default:
					break;
				}
				setState(54);
				match(NEWLINE);
				}
				}
				setState(59);
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
	public static class RepeatContext extends OperationContext {
		public TerminalNode REPEAT() { return getToken(cuteLangParser.REPEAT, 0); }
		public RepetitionsContext repetitions() {
			return getRuleContext(RepetitionsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ENDREPEAT() { return getToken(cuteLangParser.ENDREPEAT, 0); }
		public RepeatContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends OperationContext {
		public TerminalNode IF() { return getToken(cuteLangParser.IF, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode THEN() { return getToken(cuteLangParser.THEN, 0); }
		public IfblockContext ifblock() {
			return getRuleContext(IfblockContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(cuteLangParser.ENDIF, 0); }
		public IfContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitIf(this);
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
		enterRule(_localctx, 4, RULE_operation);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPEAT:
				_localctx = new RepeatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(REPEAT);
				setState(61);
				repetitions();
				setState(62);
				block();
				setState(63);
				match(ENDREPEAT);
				}
				break;
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(IF);
				setState(66);
				cond();
				setState(67);
				match(THEN);
				setState(68);
				ifblock();
				setState(69);
				match(ENDIF);
				}
				break;
			case WRITE:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(WRITE);
				setState(72);
				match(ID);
				}
				break;
			case ID:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				match(ID);
				setState(74);
				match(T__0);
				setState(75);
				expr0();
				}
				break;
			case READ:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				match(READ);
				setState(77);
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
	public static class RepetitionsContext extends ParserRuleContext {
		public RepvalueContext repvalue() {
			return getRuleContext(RepvalueContext.class,0);
		}
		public RepetitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterRepetitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitRepetitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitRepetitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetitionsContext repetitions() throws RecognitionException {
		RepetitionsContext _localctx = new RepetitionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_repetitions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			repvalue();
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
	public static class RepvalueContext extends ParserRuleContext {
		public RepvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repvalue; }
	 
		public RepvalueContext() { }
		public void copyFrom(RepvalueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Int2Context extends RepvalueContext {
		public TerminalNode INT() { return getToken(cuteLangParser.INT, 0); }
		public Int2Context(RepvalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterInt2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitInt2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitInt2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Id3Context extends RepvalueContext {
		public TerminalNode ID() { return getToken(cuteLangParser.ID, 0); }
		public Id3Context(RepvalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterId3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitId3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitId3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepvalueContext repvalue() throws RecognitionException {
		RepvalueContext _localctx = new RepvalueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_repvalue);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new Id3Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(ID);
				}
				break;
			case INT:
				_localctx = new Int2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(INT);
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
	public static class IfblockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterIfblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitIfblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitIfblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfblockContext ifblock() throws RecognitionException {
		IfblockContext _localctx = new IfblockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			block();
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
	public static class CondContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(cuteLangParser.ID, 0); }
		public TerminalNode INT() { return getToken(cuteLangParser.INT, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ID);
			setState(89);
			match(T__1);
			setState(90);
			match(INT);
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
		enterRule(_localctx, 14, RULE_expr0);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new Single0Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				expr1();
				}
				break;
			case 2:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				expr1();
				setState(94);
				match(ADD);
				setState(95);
				expr1();
				}
				break;
			case 3:
				_localctx = new BoolexprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
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
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends Expr1Context {
		public TerminalNode STRING() { return getToken(cuteLangParser.STRING, 0); }
		public StringContext(Expr1Context ctx) { copyFrom(ctx); }
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

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr1);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new Single1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				expr2();
				}
				break;
			case 2:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(STRING);
				}
				break;
			case 3:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				expr2();
				setState(103);
				match(MULT);
				setState(104);
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
		enterRule(_localctx, 18, RULE_expr2);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Single2Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				expr3();
				}
				break;
			case 2:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				expr3();
				setState(110);
				match(SUB);
				setState(111);
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
		enterRule(_localctx, 20, RULE_expr3);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new Single3Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				expr4();
				}
				break;
			case 2:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				expr4();
				setState(117);
				match(DIV);
				setState(118);
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
	public static class FunctioncallContext extends Expr4Context {
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public FunctioncallContext(Expr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitFunctioncall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Id1Context extends Expr4Context {
		public TerminalNode ID() { return getToken(cuteLangParser.ID, 0); }
		public Id1Context(Expr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterId1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitId1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitId1(this);
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
		enterRule(_localctx, 22, RULE_expr4);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(INT);
				}
				break;
			case 2:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(FLOAT);
				}
				break;
			case 3:
				_localctx = new Id1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				match(ID);
				}
				break;
			case 4:
				_localctx = new ArrayContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				arrayExpr();
				}
				break;
			case 5:
				_localctx = new TointContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				match(TOINT);
				setState(127);
				expr4();
				}
				break;
			case 6:
				_localctx = new TofloatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(128);
				match(TOFLOAT);
				setState(129);
				expr4();
				}
				break;
			case 7:
				_localctx = new FunctioncallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				funccall();
				}
				break;
			case 8:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(131);
				match(T__2);
				setState(132);
				expr0();
				setState(133);
				match(T__3);
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
	public static class FunccallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(cuteLangParser.ID, 0); }
		public List<Expr4Context> expr4() {
			return getRuleContexts(Expr4Context.class);
		}
		public Expr4Context expr4(int i) {
			return getRuleContext(Expr4Context.class,i);
		}
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterFunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitFunccall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitFunccall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funccall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(ID);
			setState(138);
			match(T__2);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 117443656L) != 0)) {
				{
				setState(139);
				expr4();
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(140);
					match(T__4);
					setState(141);
					expr4();
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(149);
			match(T__3);
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
		enterRule(_localctx, 26, RULE_boolExpr0);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Singlebool0Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				boolExpr1();
				}
				break;
			case 2:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				boolExpr1();
				setState(153);
				match(AND);
				setState(154);
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
		enterRule(_localctx, 28, RULE_boolExpr1);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new Singlebool1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				boolExpr2();
				}
				break;
			case 2:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				boolExpr2();
				setState(160);
				match(OR);
				setState(161);
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
		enterRule(_localctx, 30, RULE_boolExpr2);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new Singlebool2Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				boolExpr3();
				}
				break;
			case 2:
				_localctx = new XorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				boolExpr3();
				setState(167);
				match(XOR);
				setState(168);
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
		enterRule(_localctx, 32, RULE_boolExpr3);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case BOOL:
			case ID:
				_localctx = new Singlebool3Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				boolExpr4();
				}
				break;
			case NEG:
				_localctx = new NegContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(NEG);
				setState(174);
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
	public static class BoolContext extends BoolExpr4Context {
		public TerminalNode BOOL() { return getToken(cuteLangParser.BOOL, 0); }
		public BoolContext(BoolExpr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Id2Context extends BoolExpr4Context {
		public TerminalNode ID() { return getToken(cuteLangParser.ID, 0); }
		public Id2Context(BoolExpr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterId2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitId2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitId2(this);
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
		enterRule(_localctx, 34, RULE_boolExpr4);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(BOOL);
				}
				break;
			case ID:
				_localctx = new Id2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(ID);
				}
				break;
			case T__2:
				_localctx = new BoolparContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(T__2);
				setState(180);
				boolExpr0();
				setState(181);
				match(T__3);
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
		enterRule(_localctx, 36, RULE_arrayExpr);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new IntarrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(T__5);
				setState(186);
				match(INT);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(187);
					match(T__4);
					setState(188);
					match(INT);
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(194);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new FloatarrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(T__5);
				setState(196);
				match(FLOAT);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(197);
					match(T__4);
					setState(198);
					match(FLOAT);
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				match(T__6);
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(cuteLangParser.FUNCTION, 0); }
		public FnameContext fname() {
			return getRuleContext(FnameContext.class,0);
		}
		public FparamContext fparam() {
			return getRuleContext(FparamContext.class,0);
		}
		public FblockContext fblock() {
			return getRuleContext(FblockContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(cuteLangParser.NEWLINE, 0); }
		public TerminalNode ENDFUNCTION() { return getToken(cuteLangParser.ENDFUNCTION, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(FUNCTION);
			setState(208);
			fname();
			setState(209);
			match(T__2);
			setState(210);
			fparam();
			setState(211);
			match(T__7);
			setState(212);
			fblock();
			setState(213);
			match(NEWLINE);
			setState(214);
			match(ENDFUNCTION);
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
	public static class FnameContext extends ParserRuleContext {
		public TerminalNode FTYPE() { return getToken(cuteLangParser.FTYPE, 0); }
		public TerminalNode ID() { return getToken(cuteLangParser.ID, 0); }
		public FnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterFname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitFname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitFname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnameContext fname() throws RecognitionException {
		FnameContext _localctx = new FnameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(FTYPE);
			setState(217);
			match(ID);
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
	public static class FparamContext extends ParserRuleContext {
		public List<TerminalNode> FTYPE() { return getTokens(cuteLangParser.FTYPE); }
		public TerminalNode FTYPE(int i) {
			return getToken(cuteLangParser.FTYPE, i);
		}
		public List<TerminalNode> ID() { return getTokens(cuteLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(cuteLangParser.ID, i);
		}
		public FparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterFparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitFparam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitFparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FparamContext fparam() throws RecognitionException {
		FparamContext _localctx = new FparamContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fparam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FTYPE) {
				{
				setState(219);
				match(FTYPE);
				setState(220);
				match(ID);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(221);
					match(T__4);
					setState(222);
					match(FTYPE);
					setState(223);
					match(ID);
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FblockContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(cuteLangParser.ID, 0); }
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
		public FblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).enterFblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cuteLangListener ) ((cuteLangListener)listener).exitFblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cuteLangVisitor) return ((cuteLangVisitor<? extends T>)visitor).visitFblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FblockContext fblock() throws RecognitionException {
		FblockContext _localctx = new FblockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34377195520L) != 0)) {
				{
				{
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17457152L) != 0)) {
					{
					setState(231);
					operation();
					}
				}

				setState(234);
				match(NEWLINE);
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			match(T__8);
			setState(241);
			match(ID);
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
		"\u0004\u0001&\u00f4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0003\u00015\b\u0001\u0001\u0001\u0005\u0001"+
		"8\b\u0001\n\u0001\f\u0001;\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002O\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004U\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"c\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bk\b\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tr\b\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0003\ny\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0088\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u008f\b\f\n\f\f\f\u0092"+
		"\t\f\u0003\f\u0094\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u009d\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00a4\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00ab\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00b0\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00b8\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00be\b\u0012\n\u0012"+
		"\f\u0012\u00c1\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u00c8\b\u0012\n\u0012\f\u0012\u00cb\t\u0012\u0001"+
		"\u0012\u0003\u0012\u00ce\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u00e1\b\u0015\n\u0015\f\u0015\u00e4\t\u0015"+
		"\u0003\u0015\u00e6\b\u0015\u0001\u0016\u0003\u0016\u00e9\b\u0016\u0001"+
		"\u0016\u0005\u0016\u00ec\b\u0016\n\u0016\f\u0016\u00ef\t\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,\u0000\u0000\u0100\u0000.\u0001\u0000\u0000\u0000\u00029\u0001\u0000"+
		"\u0000\u0000\u0004N\u0001\u0000\u0000\u0000\u0006P\u0001\u0000\u0000\u0000"+
		"\bT\u0001\u0000\u0000\u0000\nV\u0001\u0000\u0000\u0000\fX\u0001\u0000"+
		"\u0000\u0000\u000eb\u0001\u0000\u0000\u0000\u0010j\u0001\u0000\u0000\u0000"+
		"\u0012q\u0001\u0000\u0000\u0000\u0014x\u0001\u0000\u0000\u0000\u0016\u0087"+
		"\u0001\u0000\u0000\u0000\u0018\u0089\u0001\u0000\u0000\u0000\u001a\u009c"+
		"\u0001\u0000\u0000\u0000\u001c\u00a3\u0001\u0000\u0000\u0000\u001e\u00aa"+
		"\u0001\u0000\u0000\u0000 \u00af\u0001\u0000\u0000\u0000\"\u00b7\u0001"+
		"\u0000\u0000\u0000$\u00cd\u0001\u0000\u0000\u0000&\u00cf\u0001\u0000\u0000"+
		"\u0000(\u00d8\u0001\u0000\u0000\u0000*\u00e5\u0001\u0000\u0000\u0000,"+
		"\u00ed\u0001\u0000\u0000\u0000./\u0005%\u0000\u0000/0\u0003\u0002\u0001"+
		"\u000001\u0005&\u0000\u00001\u0001\u0001\u0000\u0000\u000025\u0003\u0004"+
		"\u0002\u000035\u0003&\u0013\u000042\u0001\u0000\u0000\u000043\u0001\u0000"+
		"\u0000\u000045\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000068\u0005"+
		"#\u0000\u000074\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:\u0003\u0001\u0000\u0000"+
		"\u0000;9\u0001\u0000\u0000\u0000<=\u0005\u0011\u0000\u0000=>\u0003\u0006"+
		"\u0003\u0000>?\u0003\u0002\u0001\u0000?@\u0005\u0012\u0000\u0000@O\u0001"+
		"\u0000\u0000\u0000AB\u0005\u0013\u0000\u0000BC\u0003\f\u0006\u0000CD\u0005"+
		"\u0014\u0000\u0000DE\u0003\n\u0005\u0000EF\u0005\u0015\u0000\u0000FO\u0001"+
		"\u0000\u0000\u0000GH\u0005\r\u0000\u0000HO\u0005\u0018\u0000\u0000IJ\u0005"+
		"\u0018\u0000\u0000JK\u0005\u0001\u0000\u0000KO\u0003\u000e\u0007\u0000"+
		"LM\u0005\u000e\u0000\u0000MO\u0005\u0018\u0000\u0000N<\u0001\u0000\u0000"+
		"\u0000NA\u0001\u0000\u0000\u0000NG\u0001\u0000\u0000\u0000NI\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000O\u0005\u0001\u0000\u0000\u0000"+
		"PQ\u0003\b\u0004\u0000Q\u0007\u0001\u0000\u0000\u0000RU\u0005\u0018\u0000"+
		"\u0000SU\u0005\u0019\u0000\u0000TR\u0001\u0000\u0000\u0000TS\u0001\u0000"+
		"\u0000\u0000U\t\u0001\u0000\u0000\u0000VW\u0003\u0002\u0001\u0000W\u000b"+
		"\u0001\u0000\u0000\u0000XY\u0005\u0018\u0000\u0000YZ\u0005\u0002\u0000"+
		"\u0000Z[\u0005\u0019\u0000\u0000[\r\u0001\u0000\u0000\u0000\\c\u0003\u0010"+
		"\b\u0000]^\u0003\u0010\b\u0000^_\u0005\u001b\u0000\u0000_`\u0003\u0010"+
		"\b\u0000`c\u0001\u0000\u0000\u0000ac\u0003\u001a\r\u0000b\\\u0001\u0000"+
		"\u0000\u0000b]\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000c\u000f"+
		"\u0001\u0000\u0000\u0000dk\u0003\u0012\t\u0000ek\u0005\u0016\u0000\u0000"+
		"fg\u0003\u0012\t\u0000gh\u0005\u001c\u0000\u0000hi\u0003\u0012\t\u0000"+
		"ik\u0001\u0000\u0000\u0000jd\u0001\u0000\u0000\u0000je\u0001\u0000\u0000"+
		"\u0000jf\u0001\u0000\u0000\u0000k\u0011\u0001\u0000\u0000\u0000lr\u0003"+
		"\u0014\n\u0000mn\u0003\u0014\n\u0000no\u0005\u001e\u0000\u0000op\u0003"+
		"\u0014\n\u0000pr\u0001\u0000\u0000\u0000ql\u0001\u0000\u0000\u0000qm\u0001"+
		"\u0000\u0000\u0000r\u0013\u0001\u0000\u0000\u0000sy\u0003\u0016\u000b"+
		"\u0000tu\u0003\u0016\u000b\u0000uv\u0005\u001d\u0000\u0000vw\u0003\u0016"+
		"\u000b\u0000wy\u0001\u0000\u0000\u0000xs\u0001\u0000\u0000\u0000xt\u0001"+
		"\u0000\u0000\u0000y\u0015\u0001\u0000\u0000\u0000z\u0088\u0005\u0019\u0000"+
		"\u0000{\u0088\u0005\u001a\u0000\u0000|\u0088\u0005\u0018\u0000\u0000}"+
		"\u0088\u0003$\u0012\u0000~\u007f\u0005\n\u0000\u0000\u007f\u0088\u0003"+
		"\u0016\u000b\u0000\u0080\u0081\u0005\u000b\u0000\u0000\u0081\u0088\u0003"+
		"\u0016\u000b\u0000\u0082\u0088\u0003\u0018\f\u0000\u0083\u0084\u0005\u0003"+
		"\u0000\u0000\u0084\u0085\u0003\u000e\u0007\u0000\u0085\u0086\u0005\u0004"+
		"\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087z\u0001\u0000\u0000"+
		"\u0000\u0087{\u0001\u0000\u0000\u0000\u0087|\u0001\u0000\u0000\u0000\u0087"+
		"}\u0001\u0000\u0000\u0000\u0087~\u0001\u0000\u0000\u0000\u0087\u0080\u0001"+
		"\u0000\u0000\u0000\u0087\u0082\u0001\u0000\u0000\u0000\u0087\u0083\u0001"+
		"\u0000\u0000\u0000\u0088\u0017\u0001\u0000\u0000\u0000\u0089\u008a\u0005"+
		"\u0018\u0000\u0000\u008a\u0093\u0005\u0003\u0000\u0000\u008b\u0090\u0003"+
		"\u0016\u000b\u0000\u008c\u008d\u0005\u0005\u0000\u0000\u008d\u008f\u0003"+
		"\u0016\u000b\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0092\u0001"+
		"\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0093\u008b\u0001\u0000\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"\u0004\u0000\u0000\u0096\u0019\u0001\u0000\u0000\u0000\u0097\u009d\u0003"+
		"\u001c\u000e\u0000\u0098\u0099\u0003\u001c\u000e\u0000\u0099\u009a\u0005"+
		"\u001f\u0000\u0000\u009a\u009b\u0003\u001c\u000e\u0000\u009b\u009d\u0001"+
		"\u0000\u0000\u0000\u009c\u0097\u0001\u0000\u0000\u0000\u009c\u0098\u0001"+
		"\u0000\u0000\u0000\u009d\u001b\u0001\u0000\u0000\u0000\u009e\u00a4\u0003"+
		"\u001e\u000f\u0000\u009f\u00a0\u0003\u001e\u000f\u0000\u00a0\u00a1\u0005"+
		" \u0000\u0000\u00a1\u00a2\u0003\u001e\u000f\u0000\u00a2\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a3\u009e\u0001\u0000\u0000\u0000\u00a3\u009f\u0001\u0000"+
		"\u0000\u0000\u00a4\u001d\u0001\u0000\u0000\u0000\u00a5\u00ab\u0003 \u0010"+
		"\u0000\u00a6\u00a7\u0003 \u0010\u0000\u00a7\u00a8\u0005!\u0000\u0000\u00a8"+
		"\u00a9\u0003 \u0010\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a5"+
		"\u0001\u0000\u0000\u0000\u00aa\u00a6\u0001\u0000\u0000\u0000\u00ab\u001f"+
		"\u0001\u0000\u0000\u0000\u00ac\u00b0\u0003\"\u0011\u0000\u00ad\u00ae\u0005"+
		"\"\u0000\u0000\u00ae\u00b0\u0003\"\u0011\u0000\u00af\u00ac\u0001\u0000"+
		"\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0!\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b8\u0005\u0017\u0000\u0000\u00b2\u00b8\u0005\u0018\u0000"+
		"\u0000\u00b3\u00b4\u0005\u0003\u0000\u0000\u00b4\u00b5\u0003\u001a\r\u0000"+
		"\u00b5\u00b6\u0005\u0004\u0000\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b1\u0001\u0000\u0000\u0000\u00b7\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b3\u0001\u0000\u0000\u0000\u00b8#\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0005\u0006\u0000\u0000\u00ba\u00bf\u0005\u0019\u0000\u0000\u00bb"+
		"\u00bc\u0005\u0005\u0000\u0000\u00bc\u00be\u0005\u0019\u0000\u0000\u00bd"+
		"\u00bb\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2"+
		"\u00ce\u0005\u0007\u0000\u0000\u00c3\u00c4\u0005\u0006\u0000\u0000\u00c4"+
		"\u00c9\u0005\u001a\u0000\u0000\u00c5\u00c6\u0005\u0005\u0000\u0000\u00c6"+
		"\u00c8\u0005\u001a\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8"+
		"\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cc\u00ce\u0005\u0007\u0000\u0000\u00cd"+
		"\u00b9\u0001\u0000\u0000\u0000\u00cd\u00c3\u0001\u0000\u0000\u0000\u00ce"+
		"%\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u000f\u0000\u0000\u00d0\u00d1"+
		"\u0003(\u0014\u0000\u00d1\u00d2\u0005\u0003\u0000\u0000\u00d2\u00d3\u0003"+
		"*\u0015\u0000\u00d3\u00d4\u0005\b\u0000\u0000\u00d4\u00d5\u0003,\u0016"+
		"\u0000\u00d5\u00d6\u0005#\u0000\u0000\u00d6\u00d7\u0005\u0010\u0000\u0000"+
		"\u00d7\'\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\f\u0000\u0000\u00d9"+
		"\u00da\u0005\u0018\u0000\u0000\u00da)\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0005\f\u0000\u0000\u00dc\u00e2\u0005\u0018\u0000\u0000\u00dd\u00de\u0005"+
		"\u0005\u0000\u0000\u00de\u00df\u0005\f\u0000\u0000\u00df\u00e1\u0005\u0018"+
		"\u0000\u0000\u00e0\u00dd\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e5\u00db\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e6+\u0001\u0000\u0000\u0000\u00e7\u00e9\u0003\u0004\u0002"+
		"\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00ec\u0005#\u0000\u0000"+
		"\u00eb\u00e8\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0005\t\u0000\u0000\u00f1\u00f2\u0005\u0018\u0000\u0000\u00f2"+
		"-\u0001\u0000\u0000\u0000\u001749NTbjqx\u0087\u0090\u0093\u009c\u00a3"+
		"\u00aa\u00af\u00b7\u00bf\u00c9\u00cd\u00e2\u00e5\u00e8\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}