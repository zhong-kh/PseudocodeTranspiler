// Generated from /Users/zhong/IdeaProjects/PseudocodeTranspiler/src/main/java/PseudocodePaper2.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PseudocodePaper2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PseudocodePaper2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PseudocodePaper2Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PseudocodePaper2Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(PseudocodePaper2Parser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#arrayExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpression(PseudocodePaper2Parser.ArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#recordExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordExpression(PseudocodePaper2Parser.RecordExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#binaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOp(PseudocodePaper2Parser.BinaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PseudocodePaper2Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#outputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatement(PseudocodePaper2Parser.OutputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#inputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStatement(PseudocodePaper2Parser.InputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(PseudocodePaper2Parser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#recordVarDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordVarDeclaration(PseudocodePaper2Parser.RecordVarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(PseudocodePaper2Parser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(PseudocodePaper2Parser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(PseudocodePaper2Parser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(PseudocodePaper2Parser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(PseudocodePaper2Parser.ProcedureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#oneDArrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneDArrayDeclaration(PseudocodePaper2Parser.OneDArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#twoDArrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoDArrayDeclaration(PseudocodePaper2Parser.TwoDArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PseudocodePaper2Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(PseudocodePaper2Parser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#repeatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(PseudocodePaper2Parser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#recordDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordDeclaration(PseudocodePaper2Parser.RecordDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(PseudocodePaper2Parser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#elseIfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfExpression(PseudocodePaper2Parser.ElseIfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#elseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseExpression(PseudocodePaper2Parser.ElseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(PseudocodePaper2Parser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(PseudocodePaper2Parser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#switchTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchTerm(PseudocodePaper2Parser.SwitchTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#otherwiseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherwiseExpression(PseudocodePaper2Parser.OtherwiseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(PseudocodePaper2Parser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#fileOpen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileOpen(PseudocodePaper2Parser.FileOpenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#fileClose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileClose(PseudocodePaper2Parser.FileCloseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#readFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadFile(PseudocodePaper2Parser.ReadFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#writeFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteFile(PseudocodePaper2Parser.WriteFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodePaper2Parser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(PseudocodePaper2Parser.FunctionCallContext ctx);
}