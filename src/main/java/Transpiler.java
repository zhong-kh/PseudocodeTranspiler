import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Transpiler extends PseudocodePaper2BaseVisitor<String>{

    private static StringBuilder structs = new StringBuilder();
    private static StringBuilder functions = new StringBuilder();
    private static StringBuilder mainBody = new StringBuilder();
    private static StringBuilder constants = new StringBuilder();

    @Override
    public String visitProgram(PseudocodePaper2Parser.ProgramContext ctx) {
        StringBuilder javaCode = new StringBuilder();

        for (PseudocodePaper2Parser.StatementContext stmt : ctx.statement()) {
            if (stmt.constDeclaration() != null) {
                constants.append(visit(stmt)).append("\n");
            } else if (stmt.recordDeclaration() != null) {
                structs.append(visit(stmt)).append("\n");
            } else if (
                    stmt.functionDeclaration() != null
                    || stmt.procedureDeclaration() != null
            ) {
                functions.append(visit(stmt)).append("\n");
            } else {
                mainBody.append(visit(stmt)).append("\n");
            }
        }

        // Headers & constants
        javaCode.append("#include <iostream>\n#include <cmath>\n#include <fstream>\n#include <cstdlib>\n#include <ctime>\n#include <string>\n#include <cctype>\n#include <sstream>\nusing namespace std;");

        // Builtin functions: string operations
        javaCode.append(
                "string LEFT(const string& ThisString, int x) {\n" +
                "    return ThisString.substr(0, x);\n" +
                "}\n" +
                "\n" +
                "string RIGHT(const string& ThisString, int x) {\n" +
                "    return ThisString.substr(ThisString.length() - x, x);\n" +
                "}\n" +
                "\n" +
                "string MID(const string& ThisString, int x, int y) {\n" +
                "    return ThisString.substr(x - 1, y);\n" +
                "}\n" +
                "\n" +
                "int LENGTH(const string& ThisString) {\n" +
                "    return ThisString.length();\n" +
                "}\n" +
                "\n" +
                "char LCASE(char ThisChar) {\n" +
                "    return tolower(ThisChar);\n" +
                "}\n" +
                "\n" +
                "char UCASE(char ThisChar) {\n" +
                "    return toupper(ThisChar);\n" +
                "}\n" +
                "\n" +
                "string TO_UPPER(const string& ThisString) {\n" +
                "    string result = ThisString;\n" +
                "    for (char& c : result) {\n" +
                "        c = toupper(c);\n" +
                "    }\n" +
                "    return result;\n" +
                "}\n" +
                "\n" +
                "string TO_LOWER(const string& ThisString) {\n" +
                "    string result = ThisString;\n" +
                "    for (char& c : result) {\n" +
                "        c = tolower(c);\n" +
                "    }\n" +
                "    return result;\n" +
                "}\n" +
                "\n" +
                "template <typename T>\n" +
                "string NUM_TO_STR(T x) {\n" +
                "    ostringstream oss;\n" +
                "    oss << x;\n" +
                "    return oss.str();\n" +
                "}\n" +
                "\n" +
                "double STR_TO_NUM(const string& x) {\n" +
                "    return stod(x);\n" +
                "}\n");

        // Chars and strings
        javaCode.append(
                "bool IS_NUM(const string& ThisString) {\n" +
                "    if (ThisString.empty()) return false;\n" +
                "\n" +
                "    char* endptr = nullptr;\n" +
                "    strtod(ThisString.c_str(), &endptr);\n" +
                "    return (*endptr == '\\0'); \n" +
                "}\n" +
                "\n" +
                "int ASC(char ThisChar) {\n" +
                "    return static_cast<int>(ThisChar);\n" +
                "}\n" +
                "\n" +
                "char CHR(int x) {\n" +
                "    return static_cast<char>(x);\n" +
                "}");

        // ints and reals
        javaCode.append(
                "int INT(double x) {\n" +
                "    return static_cast<int>(x);\n" +
                "}\n" +
                "\n" +
                "double RAND(int x) {\n" +
                "    return static_cast<double>(rand()) / RAND_MAX * x;\n" +
                "}");

        // dates
        javaCode.append(
                "struct DATE {\n" +
                "    int day, month, year;\n" +
                "};\n" +
                "\n" +
                "int DAY(DATE ThisDate) {\n" +
                "    return ThisDate.day;\n" +
                "}\n" +
                "\n" +
                "int MONTH(DATE ThisDate) {\n" +
                "    return ThisDate.month;\n" +
                "}\n" +
                "\n" +
                "int YEAR(DATE ThisDate) {\n" +
                "    return ThisDate.year;\n" +
                "}\n" +
                "\n" +
                "int DAYINDEX(DATE ThisDate) {\n" +
                "    struct tm timeinfo = {};\n" +
                "    timeinfo.tm_mday = ThisDate.day;\n" +
                "    timeinfo.tm_mon = ThisDate.month - 1;\n" +
                "    timeinfo.tm_year = ThisDate.year - 1900;\n" +
                "\n" +
                "    mktime(&timeinfo); " +
                "    return timeinfo.tm_wday == 0 ? 7 : timeinfo.tm_wday;\n" +
                "}\n" +
                "\n" +
                "DATE SETDATE(int Day, int Month, int Year) {\n" +
                "    return {Day, Month, Year};\n" +
                "}\n" +
                "\n" +
                "DATE TODAY() {\n" +
                        "    time_t now = time(0);\n" +
                        "    struct tm* tstruct = localtime(&now);\n" +
                        "    return {tstruct->tm_mday, tstruct->tm_mon + 1, tstruct->tm_year + 1900};\n" +
                        "}");



        javaCode.append(constants);

        // records
        javaCode.append("\n");
        javaCode.append(structs);

        // functions & procedures
        javaCode.append(functions);

        // main body statements
        javaCode.append(" int main() {\n");
        javaCode.append(mainBody).append("return 0;\n}");

        return javaCode.toString();
    }

    @Override
    public String visitVariableDeclaration(PseudocodePaper2Parser.VariableDeclarationContext ctx) {
        // DECLARE Identifier, Identifier, ... : Type

        String varType = "";
        if (ctx.INT() != null) varType = "int";
        else if (ctx.REL() != null) varType = "double";
        else if (ctx.STR() != null) varType = "string";
        else if (ctx.CHR() != null) varType = "char";
        else if (ctx.BOL() != null) varType = "bool";

        if (ctx.Identifier().size() == 1) {
            String varName = ctx.Identifier(0).getText();
            return varType + " " + varName + ";";
        }

        StringBuilder sb = new StringBuilder().append(varType+" ");
        for (int i = 0; i < ctx.Identifier().size(); i++) {
            String varName = ctx.Identifier(i).getText();
            sb.append(varName).append(",");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append(";");

        return sb.toString();
    }


    private String findPseudoType(String varType) {
        return switch (varType) {
            case "INTEGER" -> "int";
            case "REAL" -> "double";
            case "STRING" -> "string";
            case "BOOLEAN" -> "bool";
            case "CHAR" -> "char";
            default -> "ERROR";
        };
    }

    @Override
    public String visitConstDeclaration(PseudocodePaper2Parser.ConstDeclarationContext ctx) {
        String constName = ctx.Identifier().getText();
        String value = visitExpression(ctx.expression());

        return "#define " + constName + " " + value;
    }

    public String eofHandle(String fileExp) {
        String fileVar = getFStreamIdentifier(fileExp);
        return fileVar + ".eof()";
    }


    @Override
    public String visitFunctionDeclaration(PseudocodePaper2Parser.FunctionDeclarationContext ctx) {
        StringBuilder sb = new StringBuilder();
        String funcName = ctx.Identifier().getText();

        String returnType = "void"; // Default if no valid return type is found
        if (ctx.INT() != null) returnType = "int";
        else if (ctx.REL() != null) returnType = "double";
        else if (ctx.STR() != null) returnType = "string";
        else if (ctx.CHR() != null) returnType = "char";
        else if (ctx.BOL() != null) returnType = "bool";

        String params = ctx.parameters() != null ? visit(ctx.parameters()) : "";

        StringBuilder body = new StringBuilder();
        for (PseudocodePaper2Parser.StatementContext stmt : ctx.statement()) {
            body.append(visit(stmt)).append("\n");
        }

        sb.append(returnType).append(" ").append(funcName).append("(").append(params).append(") {\n");
        sb.append(body.toString()).append("  }\n");

        return sb.toString();
    }

    @Override
    public String visitProcedureDeclaration(PseudocodePaper2Parser.ProcedureDeclarationContext ctx) {
        StringBuilder sb = new StringBuilder();
        String procName = ctx.Identifier().getText();
        String params = visit(ctx.parameters());
        StringBuilder body = new StringBuilder();
        for (PseudocodePaper2Parser.StatementContext stmt : ctx.statement()) {
            body.append(visit(stmt));
        }
        sb.append("void " + procName + "(" + params + ") {\n");
        sb.append(body.toString()).append("\n  }\n");

        return sb.toString();
    }

    @Override
    public String visitRecordVarDeclaration(PseudocodePaper2Parser.RecordVarDeclarationContext ctx) {
        String varName = ctx.Identifier(0).getText();
        String typeName = ctx.Identifier(1).getText();
        return typeName + " " + varName + ";";
    }

    private String getDisplacementIdentifier(String name) {
        return "displacement_" + UUID.nameUUIDFromBytes(name.getBytes()).toString().replace("-", "");
    }

    @Override
    public String visitOutputStatement(PseudocodePaper2Parser.OutputStatementContext ctx) {
        String output = ctx.expression().stream()
                .map(this::visit)
                .collect(Collectors.joining(" << "));
        return "std::cout << " + output + " << std::endl;";
    }

    @Override
    public String visitInputStatement(PseudocodePaper2Parser.InputStatementContext ctx) {
        String variable = ctx.Identifier().getText();
        return "std::cin >> " + variable + ";";
    }


    @Override
    public String visitOneDArrayDeclaration(PseudocodePaper2Parser.OneDArrayDeclarationContext ctx) {
        // A displacement variable used to adjust indexes defined not beginning at 0
        String name = ctx.Identifier().getText();
        String start = visit(ctx.expression(0));
        String end = visit(ctx.expression(1));
        int displacement = Integer.parseInt(start);
        int arrLen = Integer.parseInt(end) - displacement + 1;
        String displacementIdentifier = getDisplacementIdentifier(name);
        String type = "";
        if (ctx.INT() != null) type = "int";
        else if (ctx.REL() != null) type = "double";
        else if (ctx.STR() != null) type = "string";
        else if (ctx.CHR() != null) type = "char";
        else if (ctx.BOL() != null) type = "bool";
        return  type + " " + name + "[" + arrLen + "];\nint " + displacementIdentifier + " = " + displacement + ";";
    }

    @Override
    public String visitTwoDArrayDeclaration(PseudocodePaper2Parser.TwoDArrayDeclarationContext ctx) {
        // Two displacement variables used to adjust indexes defined not beginning at 0
        String name = ctx.Identifier().getText();

        String start1 = visit(ctx.expression(0));
        String end1 = visit(ctx.expression(1));
        String start2 = visit(ctx.expression(2));
        String end2 = visit(ctx.expression(3));

        int displacement1 = Integer.parseInt(start1);
        int displacement2 = Integer.parseInt(start2);

        String displacementIdentifier1 = "f" + getDisplacementIdentifier(name);
        String displacementIdentifier2 = "s" + getDisplacementIdentifier(name);

        int arrLen1 = Integer.parseInt(end1) - displacement1 + 1;
        int arrLen2 = Integer.parseInt(end2) - displacement2 + 1;

        String type = "";
        if (ctx.INT() != null) type = "int";
        else if (ctx.REL() != null) type = "double";
        else if (ctx.STR() != null) type = "string";
        else if (ctx.CHR() != null) type = "char";
        else if (ctx.BOL() != null) type = "bool";
        return type + " " + name + "[" + arrLen1 + "][" + arrLen2 + "];\nint " + displacementIdentifier1 + " = " + displacement1 + ";\nint " + displacementIdentifier2 + " = " + displacement2 + ";";
    }

    @Override
    public String visitRecordDeclaration(PseudocodePaper2Parser.RecordDeclarationContext ctx) {
        String name = ctx.Identifier().getText();
        StringBuilder recordBody = new StringBuilder(" struct " + name + " {\n");
        for (PseudocodePaper2Parser.VariableDeclarationContext varCtx : ctx.variableDeclaration()) {
            recordBody.append(visit(varCtx)).append("\n");
        }
        recordBody.append("  };\n");
        return recordBody.toString();
    }

    @Override
    public String visitAssignment(PseudocodePaper2Parser.AssignmentContext ctx) {

        if (ctx.Identifier() != null) {
            return ctx.Identifier().getText() + " = " + visit(ctx.expression(0)) + ";";
        } else if (ctx.expression(0) != null) {
            return visit(ctx.expression(0)) + " = " + visit(ctx.expression(1)) + ";";
        } else {
            throw new IllegalStateException("Invalid assignment: left-hand side is null");
        }
    }

    @Override
    public String visitWhileStatement(PseudocodePaper2Parser.WhileStatementContext ctx) {
        String condition = visit(ctx.expression());
        String body = convertStatements(ctx.statement());
        return "  while (" + condition + ") " + body;
    }

    @Override
    public String visitRepeatStatement(PseudocodePaper2Parser.RepeatStatementContext ctx) {
        String condition = visit(ctx.expression());
        String body = convertStatements(ctx.statement());
        return "  do " + body + " while (!(" + condition + "));";
    }

    @Override
    public String visitForStatement(PseudocodePaper2Parser.ForStatementContext ctx) {
        String identifier = ctx.Identifier(0).getText();
        String start = visit(ctx.expression(0));
        String end = visit(ctx.expression(1));
        String body = convertStatements(ctx.statement());
        return "  for (int " + identifier + " = " + start + "; " + identifier + " <= " + end + "; " + identifier + "++) " + body;
    }

    @Override
    public String visitIfStatement(PseudocodePaper2Parser.IfStatementContext ctx) {
        String condition = visit(ctx.expression());
        String thenBlock = convertStatements(ctx.statement());

        StringBuilder elseIfBlocks = new StringBuilder();
        for (PseudocodePaper2Parser.ElseIfExpressionContext elifCtx : ctx.elseIfExpression()) {
            String elifCondition = visit(elifCtx.expression());
            String elifBlock = convertStatements(elifCtx.statement());
            elseIfBlocks.append(" else if (").append(elifCondition).append(") ").append(elifBlock);
        }

        String elseBlock = ctx.elseExpression() != null ? " else " + convertStatements(ctx.elseExpression().statement()) : "";

        return "  if (" + condition + ") " + thenBlock + elseIfBlocks + elseBlock;
    }

    @Override
    public String visitSwitchStatement(PseudocodePaper2Parser.SwitchStatementContext ctx) {
        String switchExpr = visit(ctx.expression());
        StringBuilder switchBody = new StringBuilder("  switch (" + switchExpr + ") {\n");
        for (PseudocodePaper2Parser.SwitchTermContext termCtx : ctx.switchTerm()) {
            switchBody.append(visit(termCtx)).append("\n");
        }
        if (ctx.otherwiseExpression() != null) {
            switchBody.append(visit(ctx.otherwiseExpression())).append("\n");
        }
        switchBody.append("  }");
        return switchBody.toString();
    }

    @Override
    public String visitSwitchTerm(PseudocodePaper2Parser.SwitchTermContext ctx) {
        String caseExpr = visit(ctx.expression(0));
        String caseBody = convertStatements(ctx.statement());
        return "    case " + caseExpr + ": " + caseBody + " break;";
    }

    @Override
    public String visitOtherwiseExpression(PseudocodePaper2Parser.OtherwiseExpressionContext ctx) {
        return "    default: " + convertStatements(ctx.statement()) + " break;";
    }

    @Override
    public String visitReturnStatement(PseudocodePaper2Parser.ReturnStatementContext ctx) {
        return "  return " + visit(ctx.expression()) + ";";
    }

    @Override
    public String visitFileOpen(PseudocodePaper2Parser.FileOpenContext ctx) {
        String fileName = visit(ctx.expression()).replace("\"", "");
        String mode = ctx.getChild(3).getText(); // Reading mode (e.g., "READ" or "WRITE")
        String identifier = getFStreamIdentifier(fileName);

        return "fstream " + identifier + "(\"" + fileName + "\", " + (mode.equals("READ") ? "ios::in" : (mode.equals("APPEND") ? "ios::app" : "ios::out")) + ");";
    }

    @Override
    public String visitFileClose(PseudocodePaper2Parser.FileCloseContext ctx) {
        String fileName = visit(ctx.expression()).replace("\"", "");
        String identifier = getFStreamIdentifier(fileName);

        return identifier + ".close();";
    }

    @Override
    public String visitReadFile(PseudocodePaper2Parser.ReadFileContext ctx) {
        String fileName = visit(ctx.expression()).replace("\"", "");
        String identifier = getFStreamIdentifier(fileName);
        String variable = ctx.Identifier().getText();

        return "std::getline(" + identifier + ", " + variable + ");";
    }

    @Override
    public String visitWriteFile(PseudocodePaper2Parser.WriteFileContext ctx) {
        String fileName = visit(ctx.expression(0)).replace("\"", "");
        String identifier = getFStreamIdentifier(fileName);
        String content = visit(ctx.expression(1));

        return identifier + " << " + content + " << std::endl;";
    }

    private String getFStreamIdentifier(String fileName) {
        return "file_" + UUID.nameUUIDFromBytes(fileName.getBytes()).toString().replace("-", "");
    }

    @Override
    public String visitFunctionCall(PseudocodePaper2Parser.FunctionCallContext ctx) {
        if (ctx.Identifier().getText().equals("EOF")) {

            String text = ctx.expression(0).getText();
            StringBuilder expr = new StringBuilder(eofHandle(text.replace("\"", "")));
            if (ctx.getParent() instanceof PseudocodePaper2Parser.StatementContext) {
                expr.append( ";");
            }
            return expr.toString();
        }
        String functionName = ctx.Identifier().getText();
        StringBuilder args = new StringBuilder();
        for (PseudocodePaper2Parser.ExpressionContext expr : ctx.expression()) {
            if (args.length() > 0) {
                args.append(", ");
            }
            args.append(visit(expr));
        }
            String functionCall = functionName + "(" + args.toString() + ")";
            // Check if the function call is a standalone statement
            if (ctx.getParent() instanceof PseudocodePaper2Parser.StatementContext) {
                functionCall += ";";
            }
            return functionCall;
    }

    @Override
    public String visitExpression(PseudocodePaper2Parser.ExpressionContext ctx) {
        if (ctx.primaryExpression().size() == 1) {
            return visit(ctx.primaryExpression(0));
        }

        String left = visit(ctx.primaryExpression(0));
        StringBuilder result = new StringBuilder().append(left);

        for (int i = 1; i < ctx.primaryExpression().size(); i++) {
            String op = ctx.binaryOp(i - 1).getText();
            String right = visit(ctx.primaryExpression(i));

            switch (op) {
                case "^":
                    result = new StringBuilder("pow(" + result + ", " + right + ")");
                    break;
                case "=":
                    result.append(" == " + right);
                    break;
                case "+":
                    result.append(" + " + right);
                    break;
                case "-":
                    result.append(" - "+ right);
                    break;
                case "*":
                    result.append(" * " + right);
                    break;
                case "/":
                    result.append(" / " + right);
                    break;
                case "MOD":
                    result.append(" % " + right);
                    break;
                case "AND":
                    result.append(" && " + right);
                    break;
                case "OR":
                    result.append(" || " + right);
                    break;
                case ">":
                    result.append(" > " + right);
                    break;
                case "<":
                    result.append(" < " + right);
                    break;
                case ">=":
                    result.append(" >= " + right);
                    break;
                case "<=":
                    result.append(" <= " + right);
                    break;
                case "<>":
                    result.append(" <> " + right);
                    break;
                case "DIV":
                    result.append(" / " + right);
                    break;
            }
        }

        return result.toString();
    }
    @Override
    public String visitPrimaryExpression(PseudocodePaper2Parser.PrimaryExpressionContext ctx) {
        if (ctx.Identifier() != null) {
            return ctx.Identifier().getText();
        }
        if (ctx.functionCall() != null) {
            return visit(ctx.functionCall());
        }
        if (ctx.STRING_Literal() != null) {
            return ctx.STRING_Literal().getText();
        }
        if (ctx.CHAR_Literal() != null) {
            return ctx.CHAR_Literal().getText();
        }
        if (ctx.Literal() != null) {
            return handleLiteral(ctx.Literal().getText());
        }
        if (ctx.recordExpression() != null) {
            return visit(ctx.recordExpression());
        }
        if (ctx.arrayExpression() != null) {
            return visit(ctx.arrayExpression());
        }
        if (ctx.expression() != null) {
            return "(" + visit(ctx.expression()) + ")";
        }
        return "";
    }

    private String handleLiteral(String literal) {
        if (literal.equals("TRUE")) return "true";
        if (literal.equals("FALSE")) return "false";
        return literal;
    }

    private String convertStatements(List<PseudocodePaper2Parser.StatementContext> statements) {
        if (statements.size() == 1) {
            return "{" + visit(statements.get(0)) + "}";
        }
        StringBuilder block = new StringBuilder("{\n");
        for (PseudocodePaper2Parser.StatementContext stmt : statements) {
            block.append(visit(stmt)).append("\n");
        }
        block.append("}");
        return block.toString();
    }

    @Override
    public String visitRecordExpression(PseudocodePaper2Parser.RecordExpressionContext ctx) {
        String recordName = ctx.Identifier(0).getText();
        String fieldName = ctx.Identifier(1).getText();
        return recordName + "." + fieldName;
    }

    @Override
    public String visitArrayExpression(PseudocodePaper2Parser.ArrayExpressionContext ctx) {
        String arrayName = ctx.Identifier().getText();
        if (ctx.expression().size() == 1) {
            // 1D array
            String displacementIdentifier = getDisplacementIdentifier(arrayName);
            return arrayName + "[" + visit(ctx.expression(0)) + " - " + displacementIdentifier + "]";
        } else {
            // 2D array
            String displacementIdentifier1 = "f" + getDisplacementIdentifier(arrayName);
            String displacementIdentifier2 = "s" + getDisplacementIdentifier(arrayName);
            return arrayName + "[" + visit(ctx.expression(0)) + " - " + displacementIdentifier1 + "][" + visit(ctx.expression(1)) + " - " + displacementIdentifier2 + "]";
        }

    }

    @Override
    public String visitParameters(PseudocodePaper2Parser.ParametersContext ctx) {
        if (ctx.parameter().isEmpty()) {
            return "";
        }
        return ctx.parameter().stream()
                .map(this::visit)
                .collect(Collectors.joining(", "));
    }

    @Override
    public String visitParameter(PseudocodePaper2Parser.ParameterContext ctx) {
        String paramName = ctx.Identifier().getText();
        String paramType = findPseudoType(ctx.getChild(ctx.getChildCount() - 1).getText());
        boolean isByRef = ctx.BRF() != null;
        return paramType + " " + (isByRef ? "&" : "") + paramName;
    }
}
