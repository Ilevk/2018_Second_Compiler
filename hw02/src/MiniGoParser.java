// Generated from /Users/Kyle/Documents/Git/2018_Second_Compiler/hw02/src/MiniGo.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniGoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, VAR=21, FUNC=22, FMT=23, INT=24, FOR=25, 
		IF=26, ELSE=27, RETURN=28, OR=29, AND=30, LE=31, GE=32, EQ=33, NE=34, 
		IDENT=35, LITERAL=36, DecimalConstant=37, OctalConstant=38, HexadecimalConstant=39, 
		WS=40;
	public static final int
		RULE_program = 0, RULE_decl = 1, RULE_var_decl = 2, RULE_dec_spec = 3, 
		RULE_type_spec = 4, RULE_fun_decl = 5, RULE_params = 6, RULE_param = 7, 
		RULE_stmt = 8, RULE_expr_stmt = 9, RULE_for_stmt = 10, RULE_compound_stmt = 11, 
		RULE_local_decl = 12, RULE_if_stmt = 13, RULE_return_stmt = 14, RULE_loop_expr = 15, 
		RULE_expr = 16, RULE_args = 17;
	public static final String[] ruleNames = {
		"program", "decl", "var_decl", "dec_spec", "type_spec", "fun_decl", "params", 
		"param", "stmt", "expr_stmt", "for_stmt", "compound_stmt", "local_decl", 
		"if_stmt", "return_stmt", "loop_expr", "expr", "args"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'['", "']'", "'('", "')'", "','", "'{'", "'}'", "';'", "'++'", 
		"'--'", "'.'", "'-'", "'+'", "'!'", "'*'", "'/'", "'%'", "'<'", "'>'", 
		"'var'", "'func'", "'fmt'", "'int'", "'for'", "'if'", "'else'", "'return'", 
		"'or'", "'and'", "'<='", "'>='", "'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "VAR", "FUNC", "FMT", 
		"INT", "FOR", "IF", "ELSE", "RETURN", "OR", "AND", "LE", "GE", "EQ", "NE", 
		"IDENT", "LITERAL", "DecimalConstant", "OctalConstant", "HexadecimalConstant", 
		"WS"
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

	@Override
	public String getGrammarFileName() { return "MiniGo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniGoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				decl();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAR || _la==FUNC );
			System.out.println("201504278 Rule 0 program");
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

	public static class DeclContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Fun_declContext fun_decl() {
			return getRuleContext(Fun_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				var_decl();
				System.out.println("201504278 Rule 1-0 var_decl");
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				fun_decl();
				System.out.println("201504278 Rule 1-1 fun_decl");
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

	public static class Var_declContext extends ParserRuleContext {
		public Dec_specContext dec_spec() {
			return getRuleContext(Dec_specContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniGoParser.IDENT, 0); }
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode LITERAL() { return getToken(MiniGoParser.LITERAL, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				dec_spec();
				setState(52);
				match(IDENT);
				setState(53);
				type_spec();
				System.out.println("201504278 Rule 2-0 dec_spec IDENT type_spec");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				dec_spec();
				setState(57);
				match(IDENT);
				setState(58);
				type_spec();
				setState(59);
				match(T__0);
				setState(60);
				match(LITERAL);
				System.out.println("201504278 Rule 2-1 dec_spec IDENT type_spec '=' LITERAL");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				dec_spec();
				setState(64);
				match(IDENT);
				setState(65);
				match(T__1);
				setState(66);
				match(LITERAL);
				setState(67);
				match(T__2);
				setState(68);
				type_spec();
				System.out.println("201504278 Rule 2-2 dec_spec IDENT '[' LITERAL ']' type_spec");
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

	public static class Dec_specContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MiniGoParser.VAR, 0); }
		public Dec_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterDec_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitDec_spec(this);
		}
	}

	public final Dec_specContext dec_spec() throws RecognitionException {
		Dec_specContext _localctx = new Dec_specContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dec_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(VAR);
			System.out.println("201504278 Rule 3 VAR");
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

	public static class Type_specContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MiniGoParser.INT, 0); }
		public Type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterType_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitType_spec(this);
		}
	}

	public final Type_specContext type_spec() throws RecognitionException {
		Type_specContext _localctx = new Type_specContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type_spec);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(INT);
				System.out.println("201504278 Rule 4-0 INT");
				}
				break;
			case EOF:
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__9:
			case T__10:
			case T__12:
			case T__13:
			case T__14:
			case VAR:
			case FUNC:
			case FMT:
			case FOR:
			case IF:
			case RETURN:
			case IDENT:
			case LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				System.out.println("201504278 Rule 4-1 e");
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

	public static class Fun_declContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(MiniGoParser.FUNC, 0); }
		public TerminalNode IDENT() { return getToken(MiniGoParser.IDENT, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public List<Type_specContext> type_spec() {
			return getRuleContexts(Type_specContext.class);
		}
		public Type_specContext type_spec(int i) {
			return getRuleContext(Type_specContext.class,i);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Fun_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterFun_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitFun_decl(this);
		}
	}

	public final Fun_declContext fun_decl() throws RecognitionException {
		Fun_declContext _localctx = new Fun_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fun_decl);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(FUNC);
				setState(82);
				match(IDENT);
				setState(83);
				match(T__3);
				setState(84);
				params();
				setState(85);
				match(T__4);
				setState(86);
				type_spec();
				setState(87);
				compound_stmt();
				System.out.println("201504278 Rule 5-0 FUNC IDENT '(' params ')' type_spec compound_stmt");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(FUNC);
				setState(91);
				match(IDENT);
				setState(92);
				match(T__3);
				setState(93);
				params();
				setState(94);
				match(T__4);
				setState(95);
				match(T__3);
				setState(96);
				type_spec();
				setState(97);
				match(T__5);
				setState(98);
				type_spec();
				setState(99);
				match(T__4);
				setState(100);
				compound_stmt();
				System.out.println("201504278 Rule 5-1 FUNC IDENT '(' params ')' '(' type_spec ',' type_spec ')' compound_stmt");
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

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_params);
		int _la;
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				param();
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(106);
					match(T__5);
					setState(107);
					param();
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				System.out.println("201504278 Rule 6-0 param(',' param)*");
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				System.out.println("201504278 Rule 6-1 e");
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(MiniGoParser.IDENT, 0); }
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_param);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(IDENT);
				System.out.println("201504278 Rule 7-0 IDENT");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(IDENT);
				setState(121);
				type_spec();
				System.out.println("201504278 Rule 7-1 IDENT type_spec");
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

	public static class StmtContext extends ParserRuleContext {
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__9:
			case T__10:
			case T__12:
			case T__13:
			case T__14:
			case FMT:
			case IDENT:
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				expr_stmt();
				System.out.println("201504278 Rule 8-0 expr_stmt");
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				compound_stmt();
				System.out.println("201504278 Rule 8-1 compound_stmt");
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				if_stmt();
				System.out.println("201504278 Rule 8-2 if_stmt");
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				for_stmt();
				System.out.println("201504278 Rule 8-3 for_stmt");
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				return_stmt();
				System.out.println("201504278 Rule 8-4 return_stmt");
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

	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitExpr_stmt(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			expr(0);
			System.out.println("201504278 Rule 9 expr");
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

	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MiniGoParser.FOR, 0); }
		public Loop_exprContext loop_expr() {
			return getRuleContext(Loop_exprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitFor_stmt(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for_stmt);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(FOR);
				setState(147);
				loop_expr();
				setState(148);
				stmt();
				System.out.println("201504278 Rule 10-0 FOR loop_expr stmt");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(FOR);
				setState(152);
				expr(0);
				setState(153);
				stmt();
				System.out.println("201504278 Rule 10-1 FOR expr stmt");
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

	public static class Compound_stmtContext extends ParserRuleContext {
		public List<Local_declContext> local_decl() {
			return getRuleContexts(Local_declContext.class);
		}
		public Local_declContext local_decl(int i) {
			return getRuleContext(Local_declContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterCompound_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitCompound_stmt(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compound_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__6);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(159);
				local_decl();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << FMT) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << IDENT) | (1L << LITERAL))) != 0)) {
				{
				{
				setState(165);
				stmt();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(T__7);
			System.out.println("201504278 Rule 11 '{' local_decl* stmt* '}'");
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

	public static class Local_declContext extends ParserRuleContext {
		public Dec_specContext dec_spec() {
			return getRuleContext(Dec_specContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniGoParser.IDENT, 0); }
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode LITERAL() { return getToken(MiniGoParser.LITERAL, 0); }
		public Local_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterLocal_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitLocal_decl(this);
		}
	}

	public final Local_declContext local_decl() throws RecognitionException {
		Local_declContext _localctx = new Local_declContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_local_decl);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				dec_spec();
				setState(175);
				match(IDENT);
				setState(176);
				type_spec();
				System.out.println("201504278 Rule 12-0 dec_spec IDENT type_spec");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				dec_spec();
				setState(180);
				match(IDENT);
				setState(181);
				type_spec();
				setState(182);
				match(T__0);
				setState(183);
				match(LITERAL);
				System.out.println("201504278 Rule 12-1 dec_spec IDENT type_spec '=' LITERAL");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				dec_spec();
				setState(187);
				match(IDENT);
				setState(188);
				match(T__1);
				setState(189);
				match(LITERAL);
				setState(190);
				match(T__2);
				setState(191);
				type_spec();
				System.out.println("201504278 Rule 12-2 dec_spec IDENT '[' LITERAL ']' type_spec");
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiniGoParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniGoParser.ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_stmt);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(IF);
				setState(197);
				expr(0);
				setState(198);
				stmt();
				System.out.println("201504278 Rule 13-0 IF expr stmt");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(IF);
				setState(202);
				expr(0);
				setState(203);
				stmt();
				setState(204);
				match(ELSE);
				setState(205);
				stmt();
				System.out.println("201504278 Rule 13-1 IF expr stmt ELSE stmt");
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

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MiniGoParser.RETURN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitReturn_stmt(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_return_stmt);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(RETURN);
				setState(211);
				expr(0);
				System.out.println("201504278 Rule 14-0 RETURN expr");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(RETURN);
				setState(215);
				expr(0);
				setState(216);
				match(T__5);
				setState(217);
				expr(0);
				System.out.println("201504278 Rule 14-1 RETURN expr ',' expr");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(RETURN);
				System.out.println("201504278 Rule 14-2 RETURN");
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

	public static class Loop_exprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Loop_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterLoop_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitLoop_expr(this);
		}
	}

	public final Loop_exprContext loop_expr() throws RecognitionException {
		Loop_exprContext _localctx = new Loop_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_loop_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			expr(0);
			setState(225);
			match(T__8);
			setState(226);
			expr(0);
			setState(227);
			match(T__8);
			setState(228);
			expr(0);
			setState(229);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			System.out.println("201504278 Rule 15 expr ';' expr ';' expr ('++'|'--')");
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public TerminalNode LITERAL() { return getToken(MiniGoParser.LITERAL, 0); }
		public TerminalNode IDENT() { return getToken(MiniGoParser.IDENT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode FMT() { return getToken(MiniGoParser.FMT, 0); }
		public TerminalNode EQ() { return getToken(MiniGoParser.EQ, 0); }
		public TerminalNode NE() { return getToken(MiniGoParser.NE, 0); }
		public TerminalNode LE() { return getToken(MiniGoParser.LE, 0); }
		public TerminalNode GE() { return getToken(MiniGoParser.GE, 0); }
		public TerminalNode AND() { return getToken(MiniGoParser.AND, 0); }
		public TerminalNode OR() { return getToken(MiniGoParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(233);
				_la = _input.LA(1);
				if ( !(_la==IDENT || _la==LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				System.out.println("201504278 Rule 16-0 (LITERAL|IDENT)");
				}
				break;
			case 2:
				{
				setState(235);
				match(T__3);
				setState(236);
				expr(0);
				setState(237);
				match(T__4);
				System.out.println("201504278 Rule 16-1 '(' expr ')'");
				}
				break;
			case 3:
				{
				setState(240);
				match(IDENT);
				setState(241);
				match(T__1);
				setState(242);
				expr(0);
				setState(243);
				match(T__2);
				System.out.println("201504278 Rule 16-2 IDENT '[' expr ']'");
				}
				break;
			case 4:
				{
				setState(246);
				match(IDENT);
				setState(247);
				match(T__3);
				setState(248);
				args();
				setState(249);
				match(T__4);
				System.out.println("201504278 Rule 16-3 IDENT '(' args ')'");
				}
				break;
			case 5:
				{
				setState(252);
				match(FMT);
				setState(253);
				match(T__11);
				setState(254);
				match(IDENT);
				setState(255);
				match(T__3);
				setState(256);
				args();
				setState(257);
				match(T__4);
				System.out.println("201504278 Rule 16-4 FMT '.' IDENT '(' args ')'");
				}
				break;
			case 6:
				{
				setState(260);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(261);
				expr(6);
				System.out.println("201504278 Rule 16-5 op=('-'|'+'|'--'|'++'|'!') expr");
				}
				break;
			case 7:
				{
				setState(264);
				match(IDENT);
				setState(265);
				match(T__0);
				setState(266);
				expr(2);
				System.out.println("201504278 Rule 16-9 IDENT '=' expr");
				}
				break;
			case 8:
				{
				setState(269);
				match(IDENT);
				setState(270);
				match(T__1);
				setState(271);
				expr(0);
				setState(272);
				match(T__2);
				setState(273);
				match(T__0);
				setState(274);
				expr(1);
				System.out.println("201504278 Rule 16-10 IDENT '[' expr ']' '=' expr");
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(294);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(279);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(280);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(281);
						((ExprContext)_localctx).right = expr(6);
						System.out.println("201504278 Rule 16-6 left=expr op=('*'|'/') right=expr");
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(284);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(285);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__17))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(286);
						((ExprContext)_localctx).right = expr(5);
						System.out.println("201504278 Rule 16-7 left=expr op=('%'|'+'|'-') right=expr");
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(289);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(290);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << OR) | (1L << AND) | (1L << LE) | (1L << GE) | (1L << EQ) | (1L << NE))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(291);
						((ExprContext)_localctx).right = expr(4);
						System.out.println("201504278 Rule 16-8 left=expr op=(EQ|NE|LE|'<'|GE|'>'|AND|OR) right=expr");
						}
						break;
					}
					} 
				}
				setState(298);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_args);
		int _la;
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__9:
			case T__10:
			case T__12:
			case T__13:
			case T__14:
			case FMT:
			case IDENT:
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				expr(0);
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(300);
					match(T__5);
					setState(301);
					expr(0);
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				System.out.println("201504278 Rule 17-0 expr (',' expr) * ");
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				System.out.println("201504278 Rule 17-1 e");
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
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u013b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\6\2(\n\2\r\2\16\2)\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\64\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\6\3\6\3\6\5\6R\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7j\n\7\3\b\3\b\3\b\7\bo\n\b\f\b\16\br\13\b\3\b\3\b\3\b\5\b"+
		"w\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\177\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0090\n\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009f\n\f\3\r\3\r\7\r\u00a3\n\r\f"+
		"\r\16\r\u00a6\13\r\3\r\7\r\u00a9\n\r\f\r\16\r\u00ac\13\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u00c5\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d3\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e1\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0118\n\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0129"+
		"\n\22\f\22\16\22\u012c\13\22\3\23\3\23\3\23\7\23\u0131\n\23\f\23\16\23"+
		"\u0134\13\23\3\23\3\23\3\23\5\23\u0139\n\23\3\23\2\3\"\24\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$\2\b\3\2\f\r\3\2%&\4\2\f\r\17\21\3\2\22"+
		"\23\4\2\17\20\24\24\4\2\25\26\37$\2\u0149\2\'\3\2\2\2\4\63\3\2\2\2\6I"+
		"\3\2\2\2\bK\3\2\2\2\nQ\3\2\2\2\fi\3\2\2\2\16v\3\2\2\2\20~\3\2\2\2\22\u008f"+
		"\3\2\2\2\24\u0091\3\2\2\2\26\u009e\3\2\2\2\30\u00a0\3\2\2\2\32\u00c4\3"+
		"\2\2\2\34\u00d2\3\2\2\2\36\u00e0\3\2\2\2 \u00e2\3\2\2\2\"\u0117\3\2\2"+
		"\2$\u0138\3\2\2\2&(\5\4\3\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2"+
		"*+\3\2\2\2+,\b\2\1\2,\3\3\2\2\2-.\5\6\4\2./\b\3\1\2/\64\3\2\2\2\60\61"+
		"\5\f\7\2\61\62\b\3\1\2\62\64\3\2\2\2\63-\3\2\2\2\63\60\3\2\2\2\64\5\3"+
		"\2\2\2\65\66\5\b\5\2\66\67\7%\2\2\678\5\n\6\289\b\4\1\29J\3\2\2\2:;\5"+
		"\b\5\2;<\7%\2\2<=\5\n\6\2=>\7\3\2\2>?\7&\2\2?@\b\4\1\2@J\3\2\2\2AB\5\b"+
		"\5\2BC\7%\2\2CD\7\4\2\2DE\7&\2\2EF\7\5\2\2FG\5\n\6\2GH\b\4\1\2HJ\3\2\2"+
		"\2I\65\3\2\2\2I:\3\2\2\2IA\3\2\2\2J\7\3\2\2\2KL\7\27\2\2LM\b\5\1\2M\t"+
		"\3\2\2\2NO\7\32\2\2OR\b\6\1\2PR\b\6\1\2QN\3\2\2\2QP\3\2\2\2R\13\3\2\2"+
		"\2ST\7\30\2\2TU\7%\2\2UV\7\6\2\2VW\5\16\b\2WX\7\7\2\2XY\5\n\6\2YZ\5\30"+
		"\r\2Z[\b\7\1\2[j\3\2\2\2\\]\7\30\2\2]^\7%\2\2^_\7\6\2\2_`\5\16\b\2`a\7"+
		"\7\2\2ab\7\6\2\2bc\5\n\6\2cd\7\b\2\2de\5\n\6\2ef\7\7\2\2fg\5\30\r\2gh"+
		"\b\7\1\2hj\3\2\2\2iS\3\2\2\2i\\\3\2\2\2j\r\3\2\2\2kp\5\20\t\2lm\7\b\2"+
		"\2mo\5\20\t\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2"+
		"\2\2st\b\b\1\2tw\3\2\2\2uw\b\b\1\2vk\3\2\2\2vu\3\2\2\2w\17\3\2\2\2xy\7"+
		"%\2\2y\177\b\t\1\2z{\7%\2\2{|\5\n\6\2|}\b\t\1\2}\177\3\2\2\2~x\3\2\2\2"+
		"~z\3\2\2\2\177\21\3\2\2\2\u0080\u0081\5\24\13\2\u0081\u0082\b\n\1\2\u0082"+
		"\u0090\3\2\2\2\u0083\u0084\5\30\r\2\u0084\u0085\b\n\1\2\u0085\u0090\3"+
		"\2\2\2\u0086\u0087\5\34\17\2\u0087\u0088\b\n\1\2\u0088\u0090\3\2\2\2\u0089"+
		"\u008a\5\26\f\2\u008a\u008b\b\n\1\2\u008b\u0090\3\2\2\2\u008c\u008d\5"+
		"\36\20\2\u008d\u008e\b\n\1\2\u008e\u0090\3\2\2\2\u008f\u0080\3\2\2\2\u008f"+
		"\u0083\3\2\2\2\u008f\u0086\3\2\2\2\u008f\u0089\3\2\2\2\u008f\u008c\3\2"+
		"\2\2\u0090\23\3\2\2\2\u0091\u0092\5\"\22\2\u0092\u0093\b\13\1\2\u0093"+
		"\25\3\2\2\2\u0094\u0095\7\33\2\2\u0095\u0096\5 \21\2\u0096\u0097\5\22"+
		"\n\2\u0097\u0098\b\f\1\2\u0098\u009f\3\2\2\2\u0099\u009a\7\33\2\2\u009a"+
		"\u009b\5\"\22\2\u009b\u009c\5\22\n\2\u009c\u009d\b\f\1\2\u009d\u009f\3"+
		"\2\2\2\u009e\u0094\3\2\2\2\u009e\u0099\3\2\2\2\u009f\27\3\2\2\2\u00a0"+
		"\u00a4\7\t\2\2\u00a1\u00a3\5\32\16\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3"+
		"\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00aa\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\u00a9\5\22\n\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3"+
		"\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00ae\7\n\2\2\u00ae\u00af\b\r\1\2\u00af\31\3\2\2"+
		"\2\u00b0\u00b1\5\b\5\2\u00b1\u00b2\7%\2\2\u00b2\u00b3\5\n\6\2\u00b3\u00b4"+
		"\b\16\1\2\u00b4\u00c5\3\2\2\2\u00b5\u00b6\5\b\5\2\u00b6\u00b7\7%\2\2\u00b7"+
		"\u00b8\5\n\6\2\u00b8\u00b9\7\3\2\2\u00b9\u00ba\7&\2\2\u00ba\u00bb\b\16"+
		"\1\2\u00bb\u00c5\3\2\2\2\u00bc\u00bd\5\b\5\2\u00bd\u00be\7%\2\2\u00be"+
		"\u00bf\7\4\2\2\u00bf\u00c0\7&\2\2\u00c0\u00c1\7\5\2\2\u00c1\u00c2\5\n"+
		"\6\2\u00c2\u00c3\b\16\1\2\u00c3\u00c5\3\2\2\2\u00c4\u00b0\3\2\2\2\u00c4"+
		"\u00b5\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c5\33\3\2\2\2\u00c6\u00c7\7\34\2"+
		"\2\u00c7\u00c8\5\"\22\2\u00c8\u00c9\5\22\n\2\u00c9\u00ca\b\17\1\2\u00ca"+
		"\u00d3\3\2\2\2\u00cb\u00cc\7\34\2\2\u00cc\u00cd\5\"\22\2\u00cd\u00ce\5"+
		"\22\n\2\u00ce\u00cf\7\35\2\2\u00cf\u00d0\5\22\n\2\u00d0\u00d1\b\17\1\2"+
		"\u00d1\u00d3\3\2\2\2\u00d2\u00c6\3\2\2\2\u00d2\u00cb\3\2\2\2\u00d3\35"+
		"\3\2\2\2\u00d4\u00d5\7\36\2\2\u00d5\u00d6\5\"\22\2\u00d6\u00d7\b\20\1"+
		"\2\u00d7\u00e1\3\2\2\2\u00d8\u00d9\7\36\2\2\u00d9\u00da\5\"\22\2\u00da"+
		"\u00db\7\b\2\2\u00db\u00dc\5\"\22\2\u00dc\u00dd\b\20\1\2\u00dd\u00e1\3"+
		"\2\2\2\u00de\u00df\7\36\2\2\u00df\u00e1\b\20\1\2\u00e0\u00d4\3\2\2\2\u00e0"+
		"\u00d8\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\37\3\2\2\2\u00e2\u00e3\5\"\22"+
		"\2\u00e3\u00e4\7\13\2\2\u00e4\u00e5\5\"\22\2\u00e5\u00e6\7\13\2\2\u00e6"+
		"\u00e7\5\"\22\2\u00e7\u00e8\t\2\2\2\u00e8\u00e9\b\21\1\2\u00e9!\3\2\2"+
		"\2\u00ea\u00eb\b\22\1\2\u00eb\u00ec\t\3\2\2\u00ec\u0118\b\22\1\2\u00ed"+
		"\u00ee\7\6\2\2\u00ee\u00ef\5\"\22\2\u00ef\u00f0\7\7\2\2\u00f0\u00f1\b"+
		"\22\1\2\u00f1\u0118\3\2\2\2\u00f2\u00f3\7%\2\2\u00f3\u00f4\7\4\2\2\u00f4"+
		"\u00f5\5\"\22\2\u00f5\u00f6\7\5\2\2\u00f6\u00f7\b\22\1\2\u00f7\u0118\3"+
		"\2\2\2\u00f8\u00f9\7%\2\2\u00f9\u00fa\7\6\2\2\u00fa\u00fb\5$\23\2\u00fb"+
		"\u00fc\7\7\2\2\u00fc\u00fd\b\22\1\2\u00fd\u0118\3\2\2\2\u00fe\u00ff\7"+
		"\31\2\2\u00ff\u0100\7\16\2\2\u0100\u0101\7%\2\2\u0101\u0102\7\6\2\2\u0102"+
		"\u0103\5$\23\2\u0103\u0104\7\7\2\2\u0104\u0105\b\22\1\2\u0105\u0118\3"+
		"\2\2\2\u0106\u0107\t\4\2\2\u0107\u0108\5\"\22\b\u0108\u0109\b\22\1\2\u0109"+
		"\u0118\3\2\2\2\u010a\u010b\7%\2\2\u010b\u010c\7\3\2\2\u010c\u010d\5\""+
		"\22\4\u010d\u010e\b\22\1\2\u010e\u0118\3\2\2\2\u010f\u0110\7%\2\2\u0110"+
		"\u0111\7\4\2\2\u0111\u0112\5\"\22\2\u0112\u0113\7\5\2\2\u0113\u0114\7"+
		"\3\2\2\u0114\u0115\5\"\22\3\u0115\u0116\b\22\1\2\u0116\u0118\3\2\2\2\u0117"+
		"\u00ea\3\2\2\2\u0117\u00ed\3\2\2\2\u0117\u00f2\3\2\2\2\u0117\u00f8\3\2"+
		"\2\2\u0117\u00fe\3\2\2\2\u0117\u0106\3\2\2\2\u0117\u010a\3\2\2\2\u0117"+
		"\u010f\3\2\2\2\u0118\u012a\3\2\2\2\u0119\u011a\f\7\2\2\u011a\u011b\t\5"+
		"\2\2\u011b\u011c\5\"\22\b\u011c\u011d\b\22\1\2\u011d\u0129\3\2\2\2\u011e"+
		"\u011f\f\6\2\2\u011f\u0120\t\6\2\2\u0120\u0121\5\"\22\7\u0121\u0122\b"+
		"\22\1\2\u0122\u0129\3\2\2\2\u0123\u0124\f\5\2\2\u0124\u0125\t\7\2\2\u0125"+
		"\u0126\5\"\22\6\u0126\u0127\b\22\1\2\u0127\u0129\3\2\2\2\u0128\u0119\3"+
		"\2\2\2\u0128\u011e\3\2\2\2\u0128\u0123\3\2\2\2\u0129\u012c\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b#\3\2\2\2\u012c\u012a\3\2\2\2"+
		"\u012d\u0132\5\"\22\2\u012e\u012f\7\b\2\2\u012f\u0131\5\"\22\2\u0130\u012e"+
		"\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\b\23\1\2\u0136\u0139\3"+
		"\2\2\2\u0137\u0139\b\23\1\2\u0138\u012d\3\2\2\2\u0138\u0137\3\2\2\2\u0139"+
		"%\3\2\2\2\26)\63IQipv~\u008f\u009e\u00a4\u00aa\u00c4\u00d2\u00e0\u0117"+
		"\u0128\u012a\u0132\u0138";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}