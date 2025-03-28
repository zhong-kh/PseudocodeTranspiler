// Generated from /Users/zhong/IdeaProjects/PseudocodeTranspiler/src/main/java/PseudocodePaper2.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PseudocodePaper2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DCL=1, ASN=2, CST=3, INT=4, REL=5, STR=6, CHR=7, BOL=8, ARR=9, RCD=10, 
		ERC=11, ADD=12, MIN=13, MUL=14, MOD=15, EXP=16, DIV=17, CCN=18, AND=19, 
		ORR=20, NOT=21, EQS=22, NEQ=23, GRT=24, LSS=25, GOE=26, LOE=27, RPT=28, 
		UTL=29, FOR=30, FTO=31, STP=32, NXT=33, WHL=34, EWH=35, WDO=36, IIF=37, 
		THN=38, EIF=39, ELS=40, EDF=41, CSE=42, OFF=43, OTW=44, ECS=45, FTN=46, 
		EFT=47, RTT=48, RTN=49, PCD=50, EPC=51, BRF=52, OPF=53, WRT=54, RED=55, 
		APD=56, WRF=57, RDF=58, CLF=59, LPR=60, RPR=61, CMA=62, DOT=63, COL=64, 
		LBR=65, RBR=66, INP=67, OUP=68, CHAR_Literal=69, STRING_Literal=70, ESCAPE_SEQUENCE=71, 
		Literal=72, IntegerLiteral=73, RealLiteral=74, BooleanLiteral=75, CharLiteral=76, 
		Identifier=77, WS=78, COMMENT=79, LINE_COMMENT=80;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_primaryExpression = 2, RULE_arrayExpression = 3, 
		RULE_recordExpression = 4, RULE_binaryOp = 5, RULE_statement = 6, RULE_outputStatement = 7, 
		RULE_inputStatement = 8, RULE_variableDeclaration = 9, RULE_recordVarDeclaration = 10, 
		RULE_constDeclaration = 11, RULE_parameter = 12, RULE_parameters = 13, 
		RULE_functionDeclaration = 14, RULE_procedureDeclaration = 15, RULE_oneDArrayDeclaration = 16, 
		RULE_twoDArrayDeclaration = 17, RULE_assignment = 18, RULE_whileStatement = 19, 
		RULE_repeatStatement = 20, RULE_recordDeclaration = 21, RULE_forStatement = 22, 
		RULE_elseIfExpression = 23, RULE_elseExpression = 24, RULE_ifStatement = 25, 
		RULE_switchStatement = 26, RULE_switchTerm = 27, RULE_otherwiseExpression = 28, 
		RULE_returnStatement = 29, RULE_fileOpen = 30, RULE_fileClose = 31, RULE_readFile = 32, 
		RULE_writeFile = 33, RULE_functionCall = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "primaryExpression", "arrayExpression", "recordExpression", 
			"binaryOp", "statement", "outputStatement", "inputStatement", "variableDeclaration", 
			"recordVarDeclaration", "constDeclaration", "parameter", "parameters", 
			"functionDeclaration", "procedureDeclaration", "oneDArrayDeclaration", 
			"twoDArrayDeclaration", "assignment", "whileStatement", "repeatStatement", 
			"recordDeclaration", "forStatement", "elseIfExpression", "elseExpression", 
			"ifStatement", "switchStatement", "switchTerm", "otherwiseExpression", 
			"returnStatement", "fileOpen", "fileClose", "readFile", "writeFile", 
			"functionCall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DECLARE'", "'<-'", "'CONST'", "'INTEGER'", "'REAL'", "'STRING'", 
			"'CHAR'", "'BOOLEAN'", "'ARRAY'", "'TYPE'", "'ENDTYPE'", "'+'", "'-'", 
			"'*'", "'MOD'", "'^'", null, "'&'", "'AND'", "'OR'", "'NOT'", "'='", 
			"'<>'", "'>'", "'<'", "'>='", "'<='", "'REPEAT'", "'UNTIL'", "'FOR'", 
			"'TO'", "'STEP'", "'NEXT'", "'WHILE'", "'ENDWHILE'", "'DO'", "'IF'", 
			"'THEN'", "'ELSE IF'", "'ELSE'", "'ENDIF'", "'CASE'", "'OF'", "'OTHERWISE'", 
			"'ENDCASE'", "'FUNCTION'", "'ENDFUNCTION'", "'RETURNS'", "'RETURN'", 
			"'PROCEDURE'", "'ENDPROCEDURE'", "'BYREF'", "'OPENFILE'", "'WRITE'", 
			"'READ'", "'APPEND'", "'WRITEFILE'", "'READFILE'", "'CLOSEFILE'", "'('", 
			"')'", "','", "'.'", "':'", "'['", "']'", "'INPUT'", "'OUTPUT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DCL", "ASN", "CST", "INT", "REL", "STR", "CHR", "BOL", "ARR", 
			"RCD", "ERC", "ADD", "MIN", "MUL", "MOD", "EXP", "DIV", "CCN", "AND", 
			"ORR", "NOT", "EQS", "NEQ", "GRT", "LSS", "GOE", "LOE", "RPT", "UTL", 
			"FOR", "FTO", "STP", "NXT", "WHL", "EWH", "WDO", "IIF", "THN", "EIF", 
			"ELS", "EDF", "CSE", "OFF", "OTW", "ECS", "FTN", "EFT", "RTT", "RTN", 
			"PCD", "EPC", "BRF", "OPF", "WRT", "RED", "APD", "WRF", "RDF", "CLF", 
			"LPR", "RPR", "CMA", "DOT", "COL", "LBR", "RBR", "INP", "OUP", "CHAR_Literal", 
			"STRING_Literal", "ESCAPE_SEQUENCE", "Literal", "IntegerLiteral", "RealLiteral", 
			"BooleanLiteral", "CharLiteral", "Identifier", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "PseudocodePaper2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PseudocodePaper2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PseudocodePaper2Parser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitProgram(this);
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
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2172498793004532746L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1071L) != 0)) {
				{
				{
				setState(70);
				statement();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<BinaryOpContext> binaryOp() {
			return getRuleContexts(BinaryOpContext.class);
		}
		public BinaryOpContext binaryOp(int i) {
			return getRuleContext(BinaryOpContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			primaryExpression();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 266334208L) != 0)) {
				{
				{
				setState(79);
				binaryOp();
				setState(80);
				primaryExpression();
				}
				}
				setState(86);
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
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudocodePaper2Parser.Identifier, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode STRING_Literal() { return getToken(PseudocodePaper2Parser.STRING_Literal, 0); }
		public TerminalNode CHAR_Literal() { return getToken(PseudocodePaper2Parser.CHAR_Literal, 0); }
		public TerminalNode Literal() { return getToken(PseudocodePaper2Parser.Literal, 0); }
		public RecordExpressionContext recordExpression() {
			return getRuleContext(RecordExpressionContext.class,0);
		}
		public ArrayExpressionContext arrayExpression() {
			return getRuleContext(ArrayExpressionContext.class,0);
		}
		public TerminalNode LPR() { return getToken(PseudocodePaper2Parser.LPR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPR() { return getToken(PseudocodePaper2Parser.RPR, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_primaryExpression);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(STRING_Literal);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				match(CHAR_Literal);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				match(Literal);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				recordExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(93);
				arrayExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(94);
				match(LPR);
				setState(95);
				expression();
				setState(96);
				match(RPR);
				}
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
	public static class ArrayExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudocodePaper2Parser.Identifier, 0); }
		public TerminalNode LBR() { return getToken(PseudocodePaper2Parser.LBR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBR() { return getToken(PseudocodePaper2Parser.RBR, 0); }
		public TerminalNode CMA() { return getToken(PseudocodePaper2Parser.CMA, 0); }
		public ArrayExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayExpressionContext arrayExpression() throws RecognitionException {
		ArrayExpressionContext _localctx = new ArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arrayExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(Identifier);
			setState(101);
			match(LBR);
			setState(102);
			expression();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CMA) {
				{
				setState(103);
				match(CMA);
				setState(104);
				expression();
				}
			}

			setState(107);
			match(RBR);
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
	public static class RecordExpressionContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(PseudocodePaper2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PseudocodePaper2Parser.Identifier, i);
		}
		public TerminalNode DOT() { return getToken(PseudocodePaper2Parser.DOT, 0); }
		public RecordExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitRecordExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordExpressionContext recordExpression() throws RecognitionException {
		RecordExpressionContext _localctx = new RecordExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_recordExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(Identifier);
			setState(110);
			match(DOT);
			setState(111);
			match(Identifier);
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
	public static class BinaryOpContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(PseudocodePaper2Parser.ADD, 0); }
		public TerminalNode MIN() { return getToken(PseudocodePaper2Parser.MIN, 0); }
		public TerminalNode MOD() { return getToken(PseudocodePaper2Parser.MOD, 0); }
		public TerminalNode DIV() { return getToken(PseudocodePaper2Parser.DIV, 0); }
		public TerminalNode EXP() { return getToken(PseudocodePaper2Parser.EXP, 0); }
		public TerminalNode MUL() { return getToken(PseudocodePaper2Parser.MUL, 0); }
		public TerminalNode EQS() { return getToken(PseudocodePaper2Parser.EQS, 0); }
		public TerminalNode NEQ() { return getToken(PseudocodePaper2Parser.NEQ, 0); }
		public TerminalNode GRT() { return getToken(PseudocodePaper2Parser.GRT, 0); }
		public TerminalNode LSS() { return getToken(PseudocodePaper2Parser.LSS, 0); }
		public TerminalNode GOE() { return getToken(PseudocodePaper2Parser.GOE, 0); }
		public TerminalNode LOE() { return getToken(PseudocodePaper2Parser.LOE, 0); }
		public TerminalNode AND() { return getToken(PseudocodePaper2Parser.AND, 0); }
		public TerminalNode ORR() { return getToken(PseudocodePaper2Parser.ORR, 0); }
		public TerminalNode CCN() { return getToken(PseudocodePaper2Parser.CCN, 0); }
		public BinaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitBinaryOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOpContext binaryOp() throws RecognitionException {
		BinaryOpContext _localctx = new BinaryOpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_binaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 266334208L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ProcedureDeclarationContext procedureDeclaration() {
			return getRuleContext(ProcedureDeclarationContext.class,0);
		}
		public OneDArrayDeclarationContext oneDArrayDeclaration() {
			return getRuleContext(OneDArrayDeclarationContext.class,0);
		}
		public TwoDArrayDeclarationContext twoDArrayDeclaration() {
			return getRuleContext(TwoDArrayDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public RepeatStatementContext repeatStatement() {
			return getRuleContext(RepeatStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FileOpenContext fileOpen() {
			return getRuleContext(FileOpenContext.class,0);
		}
		public FileCloseContext fileClose() {
			return getRuleContext(FileCloseContext.class,0);
		}
		public ReadFileContext readFile() {
			return getRuleContext(ReadFileContext.class,0);
		}
		public WriteFileContext writeFile() {
			return getRuleContext(WriteFileContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public RecordVarDeclarationContext recordVarDeclaration() {
			return getRuleContext(RecordVarDeclarationContext.class,0);
		}
		public OutputStatementContext outputStatement() {
			return getRuleContext(OutputStatementContext.class,0);
		}
		public InputStatementContext inputStatement() {
			return getRuleContext(InputStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				procedureDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				oneDArrayDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				twoDArrayDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				recordDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(121);
				assignment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(122);
				whileStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(123);
				repeatStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(124);
				forStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(125);
				ifStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(126);
				switchStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(127);
				returnStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(128);
				fileOpen();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(129);
				fileClose();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(130);
				readFile();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(131);
				writeFile();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(132);
				functionCall();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(133);
				constDeclaration();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(134);
				recordVarDeclaration();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(135);
				outputStatement();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(136);
				inputStatement();
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
	public static class OutputStatementContext extends ParserRuleContext {
		public TerminalNode OUP() { return getToken(PseudocodePaper2Parser.OUP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> CMA() { return getTokens(PseudocodePaper2Parser.CMA); }
		public TerminalNode CMA(int i) {
			return getToken(PseudocodePaper2Parser.CMA, i);
		}
		public OutputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitOutputStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputStatementContext outputStatement() throws RecognitionException {
		OutputStatementContext _localctx = new OutputStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_outputStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(OUP);
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(140);
				expression();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CMA) {
					{
					{
					setState(141);
					match(CMA);
					setState(142);
					expression();
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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
	public static class InputStatementContext extends ParserRuleContext {
		public TerminalNode INP() { return getToken(PseudocodePaper2Parser.INP, 0); }
		public TerminalNode Identifier() { return getToken(PseudocodePaper2Parser.Identifier, 0); }
		public InputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitInputStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStatementContext inputStatement() throws RecognitionException {
		InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_inputStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(INP);
			setState(151);
			match(Identifier);
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode DCL() { return getToken(PseudocodePaper2Parser.DCL, 0); }
		public List<TerminalNode> Identifier() { return getTokens(PseudocodePaper2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PseudocodePaper2Parser.Identifier, i);
		}
		public TerminalNode COL() { return getToken(PseudocodePaper2Parser.COL, 0); }
		public TerminalNode INT() { return getToken(PseudocodePaper2Parser.INT, 0); }
		public TerminalNode REL() { return getToken(PseudocodePaper2Parser.REL, 0); }
		public TerminalNode STR() { return getToken(PseudocodePaper2Parser.STR, 0); }
		public TerminalNode CHR() { return getToken(PseudocodePaper2Parser.CHR, 0); }
		public TerminalNode BOL() { return getToken(PseudocodePaper2Parser.BOL, 0); }
		public List<TerminalNode> CMA() { return getTokens(PseudocodePaper2Parser.CMA); }
		public TerminalNode CMA(int i) {
			return getToken(PseudocodePaper2Parser.CMA, i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(DCL);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					match(Identifier);
					setState(155);
					match(CMA);
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(161);
			match(Identifier);
			setState(162);
			match(COL);
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 496L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class RecordVarDeclarationContext extends ParserRuleContext {
		public TerminalNode DCL() { return getToken(PseudocodePaper2Parser.DCL, 0); }
		public List<TerminalNode> Identifier() { return getTokens(PseudocodePaper2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PseudocodePaper2Parser.Identifier, i);
		}
		public TerminalNode COL() { return getToken(PseudocodePaper2Parser.COL, 0); }
		public RecordVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordVarDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitRecordVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordVarDeclarationContext recordVarDeclaration() throws RecognitionException {
		RecordVarDeclarationContext _localctx = new RecordVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_recordVarDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(DCL);
			setState(166);
			match(Identifier);
			setState(167);
			match(COL);
			setState(168);
			match(Identifier);
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
	public static class ConstDeclarationContext extends ParserRuleContext {
		public TerminalNode CST() { return getToken(PseudocodePaper2Parser.CST, 0); }
		public TerminalNode Identifier() { return getToken(PseudocodePaper2Parser.Identifier, 0); }
		public TerminalNode EQS() { return getToken(PseudocodePaper2Parser.EQS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(CST);
			setState(171);
			match(Identifier);
			setState(172);
			match(EQS);
			setState(173);
			expression();
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
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudocodePaper2Parser.Identifier, 0); }
		public TerminalNode COL() { return getToken(PseudocodePaper2Parser.COL, 0); }
		public TerminalNode INT() { return getToken(PseudocodePaper2Parser.INT, 0); }
		public TerminalNode REL() { return getToken(PseudocodePaper2Parser.REL, 0); }
		public TerminalNode STR() { return getToken(PseudocodePaper2Parser.STR, 0); }
		public TerminalNode CHR() { return getToken(PseudocodePaper2Parser.CHR, 0); }
		public TerminalNode BOL() { return getToken(PseudocodePaper2Parser.BOL, 0); }
		public TerminalNode ARR() { return getToken(PseudocodePaper2Parser.ARR, 0); }
		public TerminalNode BRF() { return getToken(PseudocodePaper2Parser.BRF, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRF) {
				{
				setState(175);
				match(BRF);
				}
			}

			setState(178);
			match(Identifier);
			setState(179);
			match(COL);
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode LPR() { return getToken(PseudocodePaper2Parser.LPR, 0); }
		public TerminalNode RPR() { return getToken(PseudocodePaper2Parser.RPR, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> CMA() { return getTokens(PseudocodePaper2Parser.CMA); }
		public TerminalNode CMA(int i) {
			return getToken(PseudocodePaper2Parser.CMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(LPR);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRF || _la==Identifier) {
				{
				setState(183);
				parameter();
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CMA) {
					{
					{
					setState(184);
					match(CMA);
					setState(185);
					parameter();
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(193);
			match(RPR);
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FTN() { return getToken(PseudocodePaper2Parser.FTN, 0); }
		public TerminalNode Identifier() { return getToken(PseudocodePaper2Parser.Identifier, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode RTT() { return getToken(PseudocodePaper2Parser.RTT, 0); }
		public TerminalNode EFT() { return getToken(PseudocodePaper2Parser.EFT, 0); }
		public TerminalNode INT() { return getToken(PseudocodePaper2Parser.INT, 0); }
		public TerminalNode REL() { return getToken(PseudocodePaper2Parser.REL, 0); }
		public TerminalNode STR() { return getToken(PseudocodePaper2Parser.STR, 0); }
		public TerminalNode CHR() { return getToken(PseudocodePaper2Parser.CHR, 0); }
		public TerminalNode BOL() { return getToken(PseudocodePaper2Parser.BOL, 0); }
		public TerminalNode ARR() { return getToken(PseudocodePaper2Parser.ARR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(FTN);
			setState(196);
			match(Identifier);
			setState(197);
			parameters();
			setState(198);
			match(RTT);
			setState(199);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(201); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(200);
				statement();
				}
				}
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2172498793004532746L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1071L) != 0) );
			setState(205);
			match(EFT);
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
	public static class ProcedureDeclarationContext extends ParserRuleContext {
		public TerminalNode PCD() { return getToken(PseudocodePaper2Parser.PCD, 0); }
		public TerminalNode Identifier() { return getToken(PseudocodePaper2Parser.Identifier, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode EPC() { return getToken(PseudocodePaper2Parser.EPC, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProcedureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitProcedureDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureDeclarationContext procedureDeclaration() throws RecognitionException {
		ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(PCD);
			setState(208);
			match(Identifier);
			setState(209);
			parameters();
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(210);
				statement();
				}
				}
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2172498793004532746L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1071L) != 0) );
			setState(215);
			match(EPC);
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
	public static class OneDArrayDeclarationContext extends ParserRuleContext {
		public TerminalNode DCL() { return getToken(PseudocodePaper2Parser.DCL, 0); }
		public TerminalNode Identifier() { return getToken(PseudocodePaper2Parser.Identifier, 0); }
		public List<TerminalNode> COL() { return getTokens(PseudocodePaper2Parser.COL); }
		public TerminalNode COL(int i) {
			return getToken(PseudocodePaper2Parser.COL, i);
		}
		public List<TerminalNode> ARR() { return getTokens(PseudocodePaper2Parser.ARR); }
		public TerminalNode ARR(int i) {
			return getToken(PseudocodePaper2Parser.ARR, i);
		}
		public TerminalNode LBR() { return getToken(PseudocodePaper2Parser.LBR, 0); }
		public TerminalNode RBR() { return getToken(PseudocodePaper2Parser.RBR, 0); }
		public TerminalNode OFF() { return getToken(PseudocodePaper2Parser.OFF, 0); }
		public TerminalNode INT() { return getToken(PseudocodePaper2Parser.INT, 0); }
		public TerminalNode REL() { return getToken(PseudocodePaper2Parser.REL, 0); }
		public TerminalNode STR() { return getToken(PseudocodePaper2Parser.STR, 0); }
		public TerminalNode CHR() { return getToken(PseudocodePaper2Parser.CHR, 0); }
		public TerminalNode BOL() { return getToken(PseudocodePaper2Parser.BOL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OneDArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneDArrayDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitOneDArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneDArrayDeclarationContext oneDArrayDeclaration() throws RecognitionException {
		OneDArrayDeclarationContext _localctx = new OneDArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_oneDArrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(DCL);
			setState(218);
			match(Identifier);
			setState(219);
			match(COL);
			setState(220);
			match(ARR);
			setState(221);
			match(LBR);
			{
			setState(222);
			expression();
			}
			setState(223);
			match(COL);
			{
			setState(224);
			expression();
			}
			setState(225);
			match(RBR);
			setState(226);
			match(OFF);
			setState(227);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TwoDArrayDeclarationContext extends ParserRuleContext {
		public TerminalNode DCL() { return getToken(PseudocodePaper2Parser.DCL, 0); }
		public TerminalNode Identifier() { return getToken(PseudocodePaper2Parser.Identifier, 0); }
		public List<TerminalNode> COL() { return getTokens(PseudocodePaper2Parser.COL); }
		public TerminalNode COL(int i) {
			return getToken(PseudocodePaper2Parser.COL, i);
		}
		public List<TerminalNode> ARR() { return getTokens(PseudocodePaper2Parser.ARR); }
		public TerminalNode ARR(int i) {
			return getToken(PseudocodePaper2Parser.ARR, i);
		}
		public TerminalNode LBR() { return getToken(PseudocodePaper2Parser.LBR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CMA() { return getToken(PseudocodePaper2Parser.CMA, 0); }
		public TerminalNode RBR() { return getToken(PseudocodePaper2Parser.RBR, 0); }
		public TerminalNode OFF() { return getToken(PseudocodePaper2Parser.OFF, 0); }
		public TerminalNode INT() { return getToken(PseudocodePaper2Parser.INT, 0); }
		public TerminalNode REL() { return getToken(PseudocodePaper2Parser.REL, 0); }
		public TerminalNode STR() { return getToken(PseudocodePaper2Parser.STR, 0); }
		public TerminalNode CHR() { return getToken(PseudocodePaper2Parser.CHR, 0); }
		public TerminalNode BOL() { return getToken(PseudocodePaper2Parser.BOL, 0); }
		public TwoDArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_twoDArrayDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitTwoDArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TwoDArrayDeclarationContext twoDArrayDeclaration() throws RecognitionException {
		TwoDArrayDeclarationContext _localctx = new TwoDArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_twoDArrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(DCL);
			setState(230);
			match(Identifier);
			setState(231);
			match(COL);
			setState(232);
			match(ARR);
			setState(233);
			match(LBR);
			setState(234);
			expression();
			setState(235);
			match(COL);
			setState(236);
			expression();
			setState(237);
			match(CMA);
			setState(238);
			expression();
			setState(239);
			match(COL);
			setState(240);
			expression();
			setState(241);
			match(RBR);
			setState(242);
			match(OFF);
			setState(243);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASN() { return getToken(PseudocodePaper2Parser.ASN, 0); }
		public TerminalNode Identifier() { return getToken(PseudocodePaper2Parser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Literal() { return getToken(PseudocodePaper2Parser.Literal, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(245);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(246);
				expression();
				}
				break;
			}
			setState(249);
			match(ASN);
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(250);
				expression();
				}
				break;
			case 2:
				{
				setState(251);
				match(Literal);
				}
				break;
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHL() { return getToken(PseudocodePaper2Parser.WHL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EWH() { return getToken(PseudocodePaper2Parser.EWH, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(WHL);
			setState(255);
			expression();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2172498793004532746L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1071L) != 0)) {
				{
				{
				setState(256);
				statement();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			match(EWH);
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
	public static class RepeatStatementContext extends ParserRuleContext {
		public TerminalNode RPT() { return getToken(PseudocodePaper2Parser.RPT, 0); }
		public TerminalNode UTL() { return getToken(PseudocodePaper2Parser.UTL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public RepeatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitRepeatStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatStatementContext repeatStatement() throws RecognitionException {
		RepeatStatementContext _localctx = new RepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_repeatStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(RPT);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2172498793004532746L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1071L) != 0)) {
				{
				{
				setState(265);
				statement();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
			match(UTL);
			{
			setState(272);
			expression();
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
	public static class RecordDeclarationContext extends ParserRuleContext {
		public TerminalNode RCD() { return getToken(PseudocodePaper2Parser.RCD, 0); }
		public TerminalNode Identifier() { return getToken(PseudocodePaper2Parser.Identifier, 0); }
		public TerminalNode ERC() { return getToken(PseudocodePaper2Parser.ERC, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public RecordDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitRecordDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordDeclarationContext recordDeclaration() throws RecognitionException {
		RecordDeclarationContext _localctx = new RecordDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_recordDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(RCD);
			setState(275);
			match(Identifier);
			setState(277); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(276);
				variableDeclaration();
				}
				}
				setState(279); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DCL );
			setState(281);
			match(ERC);
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
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PseudocodePaper2Parser.FOR, 0); }
		public List<TerminalNode> Identifier() { return getTokens(PseudocodePaper2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PseudocodePaper2Parser.Identifier, i);
		}
		public TerminalNode ASN() { return getToken(PseudocodePaper2Parser.ASN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FTO() { return getToken(PseudocodePaper2Parser.FTO, 0); }
		public TerminalNode NXT() { return getToken(PseudocodePaper2Parser.NXT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(FOR);
			setState(284);
			match(Identifier);
			setState(285);
			match(ASN);
			setState(286);
			expression();
			setState(287);
			match(FTO);
			setState(288);
			expression();
			setState(290); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(289);
				statement();
				}
				}
				setState(292); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2172498793004532746L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1071L) != 0) );
			setState(294);
			match(NXT);
			setState(295);
			match(Identifier);
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
	public static class ElseIfExpressionContext extends ParserRuleContext {
		public TerminalNode EIF() { return getToken(PseudocodePaper2Parser.EIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseIfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitElseIfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfExpressionContext elseIfExpression() throws RecognitionException {
		ElseIfExpressionContext _localctx = new ElseIfExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elseIfExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(EIF);
			setState(298);
			expression();
			setState(300); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(299);
				statement();
				}
				}
				setState(302); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2172498793004532746L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1071L) != 0) );
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
	public static class ElseExpressionContext extends ParserRuleContext {
		public TerminalNode ELS() { return getToken(PseudocodePaper2Parser.ELS, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitElseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseExpressionContext elseExpression() throws RecognitionException {
		ElseExpressionContext _localctx = new ElseExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_elseExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(ELS);
			setState(306); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(305);
				statement();
				}
				}
				setState(308); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2172498793004532746L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1071L) != 0) );
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IIF() { return getToken(PseudocodePaper2Parser.IIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THN() { return getToken(PseudocodePaper2Parser.THN, 0); }
		public TerminalNode EDF() { return getToken(PseudocodePaper2Parser.EDF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ElseIfExpressionContext> elseIfExpression() {
			return getRuleContexts(ElseIfExpressionContext.class);
		}
		public ElseIfExpressionContext elseIfExpression(int i) {
			return getRuleContext(ElseIfExpressionContext.class,i);
		}
		public ElseExpressionContext elseExpression() {
			return getRuleContext(ElseExpressionContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(IIF);
			setState(311);
			expression();
			setState(312);
			match(THN);
			setState(314); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(313);
				statement();
				}
				}
				setState(316); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2172498793004532746L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1071L) != 0) );
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EIF) {
				{
				{
				setState(318);
				elseIfExpression();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELS) {
				{
				setState(324);
				elseExpression();
				}
			}

			setState(327);
			match(EDF);
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
	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode CSE() { return getToken(PseudocodePaper2Parser.CSE, 0); }
		public TerminalNode OFF() { return getToken(PseudocodePaper2Parser.OFF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ECS() { return getToken(PseudocodePaper2Parser.ECS, 0); }
		public List<SwitchTermContext> switchTerm() {
			return getRuleContexts(SwitchTermContext.class);
		}
		public SwitchTermContext switchTerm(int i) {
			return getRuleContext(SwitchTermContext.class,i);
		}
		public OtherwiseExpressionContext otherwiseExpression() {
			return getRuleContext(OtherwiseExpressionContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(CSE);
			setState(330);
			match(OFF);
			setState(331);
			expression();
			setState(333); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(332);
				switchTerm();
				}
				}
				setState(335); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 136705L) != 0) );
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OTW) {
				{
				setState(337);
				otherwiseExpression();
				}
			}

			setState(340);
			match(ECS);
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
	public static class SwitchTermContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COL() { return getToken(PseudocodePaper2Parser.COL, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode FTO() { return getToken(PseudocodePaper2Parser.FTO, 0); }
		public SwitchTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchTerm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitSwitchTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchTermContext switchTerm() throws RecognitionException {
		SwitchTermContext _localctx = new SwitchTermContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_switchTerm);
		try {
			int _alt;
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				expression();
				setState(343);
				match(COL);
				setState(345); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(344);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(347); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				expression();
				setState(350);
				match(FTO);
				setState(351);
				expression();
				setState(352);
				match(COL);
				setState(354); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(353);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(356); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class OtherwiseExpressionContext extends ParserRuleContext {
		public TerminalNode OTW() { return getToken(PseudocodePaper2Parser.OTW, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public OtherwiseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherwiseExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitOtherwiseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherwiseExpressionContext otherwiseExpression() throws RecognitionException {
		OtherwiseExpressionContext _localctx = new OtherwiseExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_otherwiseExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(OTW);
			setState(362); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(361);
				statement();
				}
				}
				setState(364); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2172498793004532746L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1071L) != 0) );
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RTN() { return getToken(PseudocodePaper2Parser.RTN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(RTN);
			setState(367);
			expression();
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
	public static class FileOpenContext extends ParserRuleContext {
		public TerminalNode OPF() { return getToken(PseudocodePaper2Parser.OPF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FOR() { return getToken(PseudocodePaper2Parser.FOR, 0); }
		public TerminalNode WRT() { return getToken(PseudocodePaper2Parser.WRT, 0); }
		public TerminalNode RED() { return getToken(PseudocodePaper2Parser.RED, 0); }
		public TerminalNode APD() { return getToken(PseudocodePaper2Parser.APD, 0); }
		public FileOpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileOpen; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitFileOpen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileOpenContext fileOpen() throws RecognitionException {
		FileOpenContext _localctx = new FileOpenContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fileOpen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(OPF);
			setState(370);
			expression();
			setState(371);
			match(FOR);
			setState(372);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 126100789566373888L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class FileCloseContext extends ParserRuleContext {
		public TerminalNode CLF() { return getToken(PseudocodePaper2Parser.CLF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FileCloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileClose; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitFileClose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileCloseContext fileClose() throws RecognitionException {
		FileCloseContext _localctx = new FileCloseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fileClose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(CLF);
			setState(375);
			expression();
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
	public static class ReadFileContext extends ParserRuleContext {
		public TerminalNode RDF() { return getToken(PseudocodePaper2Parser.RDF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CMA() { return getToken(PseudocodePaper2Parser.CMA, 0); }
		public TerminalNode Identifier() { return getToken(PseudocodePaper2Parser.Identifier, 0); }
		public ReadFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readFile; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitReadFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadFileContext readFile() throws RecognitionException {
		ReadFileContext _localctx = new ReadFileContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_readFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(RDF);
			setState(378);
			expression();
			setState(379);
			match(CMA);
			setState(380);
			match(Identifier);
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
	public static class WriteFileContext extends ParserRuleContext {
		public TerminalNode WRF() { return getToken(PseudocodePaper2Parser.WRF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CMA() { return getToken(PseudocodePaper2Parser.CMA, 0); }
		public WriteFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeFile; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitWriteFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteFileContext writeFile() throws RecognitionException {
		WriteFileContext _localctx = new WriteFileContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_writeFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(WRF);
			setState(383);
			expression();
			setState(384);
			match(CMA);
			setState(385);
			expression();
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudocodePaper2Parser.Identifier, 0); }
		public TerminalNode LPR() { return getToken(PseudocodePaper2Parser.LPR, 0); }
		public TerminalNode RPR() { return getToken(PseudocodePaper2Parser.RPR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> CMA() { return getTokens(PseudocodePaper2Parser.CMA); }
		public TerminalNode CMA(int i) {
			return getToken(PseudocodePaper2Parser.CMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodePaper2Visitor ) return ((PseudocodePaper2Visitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(387);
			match(Identifier);
			setState(388);
			match(LPR);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 136705L) != 0)) {
				{
				setState(389);
				expression();
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CMA) {
					{
					{
					setState(390);
					match(CMA);
					{
					setState(391);
					expression();
					}
					}
					}
					setState(396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(399);
			match(RPR);
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

	public static final String _serializedATN =
		"\u0004\u0001P\u0192\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001"+
		"\u0000\u0005\u0000H\b\u0000\n\u0000\f\u0000K\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001S\b"+
		"\u0001\n\u0001\f\u0001V\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002c\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003j\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u008a"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0090"+
		"\b\u0007\n\u0007\f\u0007\u0093\t\u0007\u0003\u0007\u0095\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u009d\b\t\n\t\f\t\u00a0"+
		"\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0003\f\u00b1\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u00bb\b\r\n\r\f\r\u00be\t\r\u0003\r\u00c0\b\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0004\u000e\u00ca\b\u000e\u000b\u000e\f\u000e\u00cb\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004"+
		"\u000f\u00d4\b\u000f\u000b\u000f\f\u000f\u00d5\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00f8\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00fd\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0102\b"+
		"\u0013\n\u0013\f\u0013\u0105\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u010b\b\u0014\n\u0014\f\u0014\u010e\t\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0004"+
		"\u0015\u0116\b\u0015\u000b\u0015\f\u0015\u0117\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0004\u0016\u0123\b\u0016\u000b\u0016\f\u0016\u0124\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0004"+
		"\u0017\u012d\b\u0017\u000b\u0017\f\u0017\u012e\u0001\u0018\u0001\u0018"+
		"\u0004\u0018\u0133\b\u0018\u000b\u0018\f\u0018\u0134\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0004\u0019\u013b\b\u0019\u000b\u0019\f"+
		"\u0019\u013c\u0001\u0019\u0005\u0019\u0140\b\u0019\n\u0019\f\u0019\u0143"+
		"\t\u0019\u0001\u0019\u0003\u0019\u0146\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0004\u001a\u014e\b\u001a"+
		"\u000b\u001a\f\u001a\u014f\u0001\u001a\u0003\u001a\u0153\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0004\u001b\u015a"+
		"\b\u001b\u000b\u001b\f\u001b\u015b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0004\u001b\u0163\b\u001b\u000b\u001b\f\u001b"+
		"\u0164\u0003\u001b\u0167\b\u001b\u0001\u001c\u0001\u001c\u0004\u001c\u016b"+
		"\b\u001c\u000b\u001c\f\u001c\u016c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\""+
		"\u0189\b\"\n\"\f\"\u018c\t\"\u0003\"\u018e\b\"\u0001\"\u0001\"\u0001\""+
		"\u0000\u0000#\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BD\u0000\u0004\u0002\u0000\f"+
		"\u0014\u0016\u001b\u0001\u0000\u0004\b\u0001\u0000\u0004\t\u0001\u0000"+
		"68\u01a8\u0000I\u0001\u0000\u0000\u0000\u0002N\u0001\u0000\u0000\u0000"+
		"\u0004b\u0001\u0000\u0000\u0000\u0006d\u0001\u0000\u0000\u0000\bm\u0001"+
		"\u0000\u0000\u0000\nq\u0001\u0000\u0000\u0000\f\u0089\u0001\u0000\u0000"+
		"\u0000\u000e\u008b\u0001\u0000\u0000\u0000\u0010\u0096\u0001\u0000\u0000"+
		"\u0000\u0012\u0099\u0001\u0000\u0000\u0000\u0014\u00a5\u0001\u0000\u0000"+
		"\u0000\u0016\u00aa\u0001\u0000\u0000\u0000\u0018\u00b0\u0001\u0000\u0000"+
		"\u0000\u001a\u00b6\u0001\u0000\u0000\u0000\u001c\u00c3\u0001\u0000\u0000"+
		"\u0000\u001e\u00cf\u0001\u0000\u0000\u0000 \u00d9\u0001\u0000\u0000\u0000"+
		"\"\u00e5\u0001\u0000\u0000\u0000$\u00f7\u0001\u0000\u0000\u0000&\u00fe"+
		"\u0001\u0000\u0000\u0000(\u0108\u0001\u0000\u0000\u0000*\u0112\u0001\u0000"+
		"\u0000\u0000,\u011b\u0001\u0000\u0000\u0000.\u0129\u0001\u0000\u0000\u0000"+
		"0\u0130\u0001\u0000\u0000\u00002\u0136\u0001\u0000\u0000\u00004\u0149"+
		"\u0001\u0000\u0000\u00006\u0166\u0001\u0000\u0000\u00008\u0168\u0001\u0000"+
		"\u0000\u0000:\u016e\u0001\u0000\u0000\u0000<\u0171\u0001\u0000\u0000\u0000"+
		">\u0176\u0001\u0000\u0000\u0000@\u0179\u0001\u0000\u0000\u0000B\u017e"+
		"\u0001\u0000\u0000\u0000D\u0183\u0001\u0000\u0000\u0000FH\u0003\f\u0006"+
		"\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000LM\u0005\u0000\u0000\u0001M\u0001\u0001\u0000\u0000"+
		"\u0000NT\u0003\u0004\u0002\u0000OP\u0003\n\u0005\u0000PQ\u0003\u0004\u0002"+
		"\u0000QS\u0001\u0000\u0000\u0000RO\u0001\u0000\u0000\u0000SV\u0001\u0000"+
		"\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\u0003"+
		"\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000Wc\u0005M\u0000\u0000"+
		"Xc\u0003D\"\u0000Yc\u0005F\u0000\u0000Zc\u0005E\u0000\u0000[c\u0005H\u0000"+
		"\u0000\\c\u0003\b\u0004\u0000]c\u0003\u0006\u0003\u0000^_\u0005<\u0000"+
		"\u0000_`\u0003\u0002\u0001\u0000`a\u0005=\u0000\u0000ac\u0001\u0000\u0000"+
		"\u0000bW\u0001\u0000\u0000\u0000bX\u0001\u0000\u0000\u0000bY\u0001\u0000"+
		"\u0000\u0000bZ\u0001\u0000\u0000\u0000b[\u0001\u0000\u0000\u0000b\\\u0001"+
		"\u0000\u0000\u0000b]\u0001\u0000\u0000\u0000b^\u0001\u0000\u0000\u0000"+
		"c\u0005\u0001\u0000\u0000\u0000de\u0005M\u0000\u0000ef\u0005A\u0000\u0000"+
		"fi\u0003\u0002\u0001\u0000gh\u0005>\u0000\u0000hj\u0003\u0002\u0001\u0000"+
		"ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000kl\u0005B\u0000\u0000l\u0007\u0001\u0000\u0000\u0000mn\u0005M\u0000"+
		"\u0000no\u0005?\u0000\u0000op\u0005M\u0000\u0000p\t\u0001\u0000\u0000"+
		"\u0000qr\u0007\u0000\u0000\u0000r\u000b\u0001\u0000\u0000\u0000s\u008a"+
		"\u0003\u0012\t\u0000t\u008a\u0003\u001c\u000e\u0000u\u008a\u0003\u001e"+
		"\u000f\u0000v\u008a\u0003 \u0010\u0000w\u008a\u0003\"\u0011\u0000x\u008a"+
		"\u0003*\u0015\u0000y\u008a\u0003$\u0012\u0000z\u008a\u0003&\u0013\u0000"+
		"{\u008a\u0003(\u0014\u0000|\u008a\u0003,\u0016\u0000}\u008a\u00032\u0019"+
		"\u0000~\u008a\u00034\u001a\u0000\u007f\u008a\u0003:\u001d\u0000\u0080"+
		"\u008a\u0003<\u001e\u0000\u0081\u008a\u0003>\u001f\u0000\u0082\u008a\u0003"+
		"@ \u0000\u0083\u008a\u0003B!\u0000\u0084\u008a\u0003D\"\u0000\u0085\u008a"+
		"\u0003\u0016\u000b\u0000\u0086\u008a\u0003\u0014\n\u0000\u0087\u008a\u0003"+
		"\u000e\u0007\u0000\u0088\u008a\u0003\u0010\b\u0000\u0089s\u0001\u0000"+
		"\u0000\u0000\u0089t\u0001\u0000\u0000\u0000\u0089u\u0001\u0000\u0000\u0000"+
		"\u0089v\u0001\u0000\u0000\u0000\u0089w\u0001\u0000\u0000\u0000\u0089x"+
		"\u0001\u0000\u0000\u0000\u0089y\u0001\u0000\u0000\u0000\u0089z\u0001\u0000"+
		"\u0000\u0000\u0089{\u0001\u0000\u0000\u0000\u0089|\u0001\u0000\u0000\u0000"+
		"\u0089}\u0001\u0000\u0000\u0000\u0089~\u0001\u0000\u0000\u0000\u0089\u007f"+
		"\u0001\u0000\u0000\u0000\u0089\u0080\u0001\u0000\u0000\u0000\u0089\u0081"+
		"\u0001\u0000\u0000\u0000\u0089\u0082\u0001\u0000\u0000\u0000\u0089\u0083"+
		"\u0001\u0000\u0000\u0000\u0089\u0084\u0001\u0000\u0000\u0000\u0089\u0085"+
		"\u0001\u0000\u0000\u0000\u0089\u0086\u0001\u0000\u0000\u0000\u0089\u0087"+
		"\u0001\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\r\u0001"+
		"\u0000\u0000\u0000\u008b\u0094\u0005D\u0000\u0000\u008c\u0091\u0003\u0002"+
		"\u0001\u0000\u008d\u008e\u0005>\u0000\u0000\u008e\u0090\u0003\u0002\u0001"+
		"\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000"+
		"\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0094\u008c\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u000f\u0001\u0000\u0000\u0000\u0096\u0097\u0005C\u0000\u0000"+
		"\u0097\u0098\u0005M\u0000\u0000\u0098\u0011\u0001\u0000\u0000\u0000\u0099"+
		"\u009e\u0005\u0001\u0000\u0000\u009a\u009b\u0005M\u0000\u0000\u009b\u009d"+
		"\u0005>\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u00a0\u0001"+
		"\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001"+
		"\u0000\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009e\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0005M\u0000\u0000\u00a2\u00a3\u0005@\u0000"+
		"\u0000\u00a3\u00a4\u0007\u0001\u0000\u0000\u00a4\u0013\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0005\u0001\u0000\u0000\u00a6\u00a7\u0005M\u0000\u0000"+
		"\u00a7\u00a8\u0005@\u0000\u0000\u00a8\u00a9\u0005M\u0000\u0000\u00a9\u0015"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0003\u0000\u0000\u00ab\u00ac"+
		"\u0005M\u0000\u0000\u00ac\u00ad\u0005\u0016\u0000\u0000\u00ad\u00ae\u0003"+
		"\u0002\u0001\u0000\u00ae\u0017\u0001\u0000\u0000\u0000\u00af\u00b1\u0005"+
		"4\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005M\u0000"+
		"\u0000\u00b3\u00b4\u0005@\u0000\u0000\u00b4\u00b5\u0007\u0002\u0000\u0000"+
		"\u00b5\u0019\u0001\u0000\u0000\u0000\u00b6\u00bf\u0005<\u0000\u0000\u00b7"+
		"\u00bc\u0003\u0018\f\u0000\u00b8\u00b9\u0005>\u0000\u0000\u00b9\u00bb"+
		"\u0003\u0018\f\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00be\u0001"+
		"\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bf\u00b7\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005"+
		"=\u0000\u0000\u00c2\u001b\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005.\u0000"+
		"\u0000\u00c4\u00c5\u0005M\u0000\u0000\u00c5\u00c6\u0003\u001a\r\u0000"+
		"\u00c6\u00c7\u00050\u0000\u0000\u00c7\u00c9\u0007\u0002\u0000\u0000\u00c8"+
		"\u00ca\u0003\f\u0006\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0005/\u0000\u0000\u00ce\u001d\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005"+
		"2\u0000\u0000\u00d0\u00d1\u0005M\u0000\u0000\u00d1\u00d3\u0003\u001a\r"+
		"\u0000\u00d2\u00d4\u0003\f\u0006\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u00053\u0000\u0000\u00d8\u001f\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0005\u0001\u0000\u0000\u00da\u00db\u0005M\u0000\u0000\u00db\u00dc"+
		"\u0005@\u0000\u0000\u00dc\u00dd\u0005\t\u0000\u0000\u00dd\u00de\u0005"+
		"A\u0000\u0000\u00de\u00df\u0003\u0002\u0001\u0000\u00df\u00e0\u0005@\u0000"+
		"\u0000\u00e0\u00e1\u0003\u0002\u0001\u0000\u00e1\u00e2\u0005B\u0000\u0000"+
		"\u00e2\u00e3\u0005+\u0000\u0000\u00e3\u00e4\u0007\u0002\u0000\u0000\u00e4"+
		"!\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\u0001\u0000\u0000\u00e6\u00e7"+
		"\u0005M\u0000\u0000\u00e7\u00e8\u0005@\u0000\u0000\u00e8\u00e9\u0005\t"+
		"\u0000\u0000\u00e9\u00ea\u0005A\u0000\u0000\u00ea\u00eb\u0003\u0002\u0001"+
		"\u0000\u00eb\u00ec\u0005@\u0000\u0000\u00ec\u00ed\u0003\u0002\u0001\u0000"+
		"\u00ed\u00ee\u0005>\u0000\u0000\u00ee\u00ef\u0003\u0002\u0001\u0000\u00ef"+
		"\u00f0\u0005@\u0000\u0000\u00f0\u00f1\u0003\u0002\u0001\u0000\u00f1\u00f2"+
		"\u0005B\u0000\u0000\u00f2\u00f3\u0005+\u0000\u0000\u00f3\u00f4\u0007\u0002"+
		"\u0000\u0000\u00f4#\u0001\u0000\u0000\u0000\u00f5\u00f8\u0005M\u0000\u0000"+
		"\u00f6\u00f8\u0003\u0002\u0001\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fc\u0005\u0002\u0000\u0000\u00fa\u00fd\u0003\u0002\u0001\u0000"+
		"\u00fb\u00fd\u0005H\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fd%\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0005\"\u0000\u0000\u00ff\u0103\u0003\u0002\u0001\u0000\u0100\u0102\u0003"+
		"\f\u0006\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000"+
		"\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000"+
		"\u0000\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0005#\u0000\u0000\u0107\'\u0001\u0000\u0000"+
		"\u0000\u0108\u010c\u0005\u001c\u0000\u0000\u0109\u010b\u0003\f\u0006\u0000"+
		"\u010a\u0109\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000"+
		"\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000"+
		"\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0005\u001d\u0000\u0000\u0110\u0111\u0003\u0002\u0001\u0000"+
		"\u0111)\u0001\u0000\u0000\u0000\u0112\u0113\u0005\n\u0000\u0000\u0113"+
		"\u0115\u0005M\u0000\u0000\u0114\u0116\u0003\u0012\t\u0000\u0115\u0114"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0115"+
		"\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0001\u0000\u0000\u0000\u0119\u011a\u0005\u000b\u0000\u0000\u011a+\u0001"+
		"\u0000\u0000\u0000\u011b\u011c\u0005\u001e\u0000\u0000\u011c\u011d\u0005"+
		"M\u0000\u0000\u011d\u011e\u0005\u0002\u0000\u0000\u011e\u011f\u0003\u0002"+
		"\u0001\u0000\u011f\u0120\u0005\u001f\u0000\u0000\u0120\u0122\u0003\u0002"+
		"\u0001\u0000\u0121\u0123\u0003\f\u0006\u0000\u0122\u0121\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000"+
		"\u0000\u0126\u0127\u0005!\u0000\u0000\u0127\u0128\u0005M\u0000\u0000\u0128"+
		"-\u0001\u0000\u0000\u0000\u0129\u012a\u0005\'\u0000\u0000\u012a\u012c"+
		"\u0003\u0002\u0001\u0000\u012b\u012d\u0003\f\u0006\u0000\u012c\u012b\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u012c\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f/\u0001\u0000"+
		"\u0000\u0000\u0130\u0132\u0005(\u0000\u0000\u0131\u0133\u0003\f\u0006"+
		"\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000"+
		"\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000"+
		"\u0000\u01351\u0001\u0000\u0000\u0000\u0136\u0137\u0005%\u0000\u0000\u0137"+
		"\u0138\u0003\u0002\u0001\u0000\u0138\u013a\u0005&\u0000\u0000\u0139\u013b"+
		"\u0003\f\u0006\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001"+
		"\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013d\u0001"+
		"\u0000\u0000\u0000\u013d\u0141\u0001\u0000\u0000\u0000\u013e\u0140\u0003"+
		".\u0017\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u0140\u0143\u0001\u0000"+
		"\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000"+
		"\u0000\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000"+
		"\u0000\u0000\u0144\u0146\u00030\u0018\u0000\u0145\u0144\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0005)\u0000\u0000\u01483\u0001\u0000\u0000\u0000\u0149"+
		"\u014a\u0005*\u0000\u0000\u014a\u014b\u0005+\u0000\u0000\u014b\u014d\u0003"+
		"\u0002\u0001\u0000\u014c\u014e\u00036\u001b\u0000\u014d\u014c\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000"+
		"\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0152\u0001\u0000"+
		"\u0000\u0000\u0151\u0153\u00038\u001c\u0000\u0152\u0151\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000"+
		"\u0000\u0154\u0155\u0005-\u0000\u0000\u01555\u0001\u0000\u0000\u0000\u0156"+
		"\u0157\u0003\u0002\u0001\u0000\u0157\u0159\u0005@\u0000\u0000\u0158\u015a"+
		"\u0003\f\u0006\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u015a\u015b\u0001"+
		"\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015c\u0001"+
		"\u0000\u0000\u0000\u015c\u0167\u0001\u0000\u0000\u0000\u015d\u015e\u0003"+
		"\u0002\u0001\u0000\u015e\u015f\u0005\u001f\u0000\u0000\u015f\u0160\u0003"+
		"\u0002\u0001\u0000\u0160\u0162\u0005@\u0000\u0000\u0161\u0163\u0003\f"+
		"\u0006\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000"+
		"\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000"+
		"\u0000\u0000\u0165\u0167\u0001\u0000\u0000\u0000\u0166\u0156\u0001\u0000"+
		"\u0000\u0000\u0166\u015d\u0001\u0000\u0000\u0000\u01677\u0001\u0000\u0000"+
		"\u0000\u0168\u016a\u0005,\u0000\u0000\u0169\u016b\u0003\f\u0006\u0000"+
		"\u016a\u0169\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000"+
		"\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000"+
		"\u016d9\u0001\u0000\u0000\u0000\u016e\u016f\u00051\u0000\u0000\u016f\u0170"+
		"\u0003\u0002\u0001\u0000\u0170;\u0001\u0000\u0000\u0000\u0171\u0172\u0005"+
		"5\u0000\u0000\u0172\u0173\u0003\u0002\u0001\u0000\u0173\u0174\u0005\u001e"+
		"\u0000\u0000\u0174\u0175\u0007\u0003\u0000\u0000\u0175=\u0001\u0000\u0000"+
		"\u0000\u0176\u0177\u0005;\u0000\u0000\u0177\u0178\u0003\u0002\u0001\u0000"+
		"\u0178?\u0001\u0000\u0000\u0000\u0179\u017a\u0005:\u0000\u0000\u017a\u017b"+
		"\u0003\u0002\u0001\u0000\u017b\u017c\u0005>\u0000\u0000\u017c\u017d\u0005"+
		"M\u0000\u0000\u017dA\u0001\u0000\u0000\u0000\u017e\u017f\u00059\u0000"+
		"\u0000\u017f\u0180\u0003\u0002\u0001\u0000\u0180\u0181\u0005>\u0000\u0000"+
		"\u0181\u0182\u0003\u0002\u0001\u0000\u0182C\u0001\u0000\u0000\u0000\u0183"+
		"\u0184\u0005M\u0000\u0000\u0184\u018d\u0005<\u0000\u0000\u0185\u018a\u0003"+
		"\u0002\u0001\u0000\u0186\u0187\u0005>\u0000\u0000\u0187\u0189\u0003\u0002"+
		"\u0001\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0189\u018c\u0001\u0000"+
		"\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000"+
		"\u0000\u0000\u018b\u018e\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000"+
		"\u0000\u0000\u018d\u0185\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000"+
		"\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0190\u0005=\u0000"+
		"\u0000\u0190E\u0001\u0000\u0000\u0000 ITbi\u0089\u0091\u0094\u009e\u00b0"+
		"\u00bc\u00bf\u00cb\u00d5\u00f7\u00fc\u0103\u010c\u0117\u0124\u012e\u0134"+
		"\u013c\u0141\u0145\u014f\u0152\u015b\u0164\u0166\u016c\u018a\u018d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}