grammar PseudocodePaper2;

// ==============================
// 1. LEXER
// ==============================

// 1.1 Keywords
DCL : 'DECLARE';
ASN : '<-';
CST : 'CONST';

INT : 'INTEGER';
REL : 'REAL';
STR : 'STRING';
CHR : 'CHAR';
BOL : 'BOOLEAN';
ARR : 'ARRAY';
RCD : 'TYPE';
ERC : 'ENDTYPE';

ADD : '+';
MIN : '-';
MUL : '*';
MOD : 'MOD';
EXP : '^';
DIV : '/' | 'DIV';
CCN : '&';
AND : 'AND';
ORR : 'OR';
NOT : 'NOT';

EQS : '=';
NEQ : '<>';
GRT : '>';
LSS : '<';
GOE : '>=';
LOE : '<=';

RPT : 'REPEAT';
UTL : 'UNTIL';
FOR : 'FOR';
FTO : 'TO';
STP : 'STEP';
NXT : 'NEXT';
WHL : 'WHILE';
EWH : 'ENDWHILE';
WDO : 'DO';

IIF : 'IF';
THN : 'THEN';
EIF : 'ELSE IF';
ELS : 'ELSE';
EDF : 'ENDIF';
CSE : 'CASE';
OFF : 'OF';
OTW : 'OTHERWISE';
ECS : 'ENDCASE';

FTN : 'FUNCTION';
EFT : 'ENDFUNCTION';
RTT : 'RETURNS';
RTN : 'RETURN';
PCD : 'PROCEDURE';
EPC : 'ENDPROCEDURE';
BRF : 'BYREF';

OPF : 'OPENFILE';
WRT : 'WRITE';
RED : 'READ';
APD : 'APPEND';
WRF : 'WRITEFILE';
RDF : 'READFILE';
CLF : 'CLOSEFILE';

LPR : '(';
RPR : ')';
CMA : ',';
DOT : '.';
COL : ':';
LBR : '[';
RBR : ']';

INP : 'INPUT';
OUP : 'OUTPUT';

// 1.3 Literals
CHAR_Literal
    : '\'' ( ESCAPE_SEQUENCE | NON_ESCAPE_CHARACTER ) '\'';

STRING_Literal
    : '"' (ESCAPE_SEQUENCE | ~["\\\r\n])* '"'
    | '\'' (ESCAPE_SEQUENCE | ~['\\\r\n])* '\'';

ESCAPE_SEQUENCE
    : '\\' ( ['"'\bfnrt\\] | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
    ;

fragment NON_ESCAPE_CHARACTER
    : ~['\\\r\n]
    ;

fragment HEX_DIGIT
    : [0-9a-fA-F]
    ;

fragment DECIMAL_Literal
    : [0-9]+
    ;

fragment DECIMAL_FLOATING_POINT
    : [0-9]+ '.' [0-9]*        // 如：123.456 或 123.
    | '.' [0-9]+              // 如：.456
    | [0-9]+ (('e'|'E') ('+'|'-')? [0-9]+)?   // 如：123 或带科学计数法
    ;

Literal: STRING_Literal | IntegerLiteral | RealLiteral | BooleanLiteral | CharLiteral ;
IntegerLiteral : '-'? DECIMAL_Literal;
RealLiteral    : DECIMAL_FLOATING_POINT;
BooleanLiteral : 'TRUE' | 'FALSE';
CharLiteral    : CHAR_Literal;

// 1.4 Identifier
fragment LETTER : [a-zA-Z];
fragment DIGIT  : [0-9];
fragment UNDERSCORE : '_';

Identifier
    : LETTER (LETTER | DIGIT | UNDERSCORE)*
    ;

// 1.5 skips
WS : [ \t\r\n]+ -> skip;
COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT : '//' ~[\r\n]* -> skip;


// ==============================
// 2. PARSER
// ==============================

program
    : statement* EOF
    ;

// 2.1 expression

expression
    : primaryExpression (binaryOp primaryExpression)*
    ;

primaryExpression
    : Identifier
    | functionCall
    | STRING_Literal
    | CHAR_Literal
    | Literal
    | recordExpression
    | arrayExpression
    | (LPR expression RPR)
    ;

arrayExpression: Identifier LBR expression (CMA expression)? RBR;
recordExpression: Identifier DOT Identifier;

binaryOp
    : ADD | MIN | MOD | DIV | EXP | MUL
    | EQS | NEQ | GRT | LSS | GOE | LOE
    | AND | ORR
    | CCN
    ;

// 2.2 statements
statement
    : variableDeclaration
    | functionDeclaration
    | procedureDeclaration
    | oneDArrayDeclaration
    | twoDArrayDeclaration
    | recordDeclaration
    | assignment
    | whileStatement
    | repeatStatement
    | forStatement
    | ifStatement
    | switchStatement
    | returnStatement
    | fileOpen
    | fileClose
    | readFile
    | writeFile
    | functionCall
    | constDeclaration
    | recordVarDeclaration
    | outputStatement
    | inputStatement
    ;

outputStatement
    : OUP (expression (CMA expression)*)?
    ;

inputStatement
    : INP Identifier
    ;

variableDeclaration
    : DCL (Identifier CMA)* Identifier COL (INT | REL | STR | CHR | BOL)
    ;

recordVarDeclaration
    : DCL Identifier COL Identifier
    ;

constDeclaration
    : CST Identifier EQS expression
    ;

parameter
    : BRF? Identifier COL (INT | REL | STR | CHR | BOL | ARR)
    ;

parameters
    : LPR (parameter (CMA parameter)*)? RPR
    ;

functionDeclaration
    : FTN Identifier parameters RTT (INT | REL | STR | CHR | BOL | ARR)
        (statement)+ EFT
    ;

procedureDeclaration
    : PCD Identifier parameters (statement)+ EPC
    ;


oneDArrayDeclaration
    : DCL Identifier COL ARR LBR (expression) COL (expression) RBR OFF (INT | REL | STR | CHR | BOL | ARR)
    ;

twoDArrayDeclaration
    : DCL Identifier COL ARR LBR expression COL expression CMA expression COL expression RBR OFF (INT | REL | STR | CHR | BOL | ARR)
    ;

assignment
    : (Identifier | expression) ASN (expression | Literal)
    ;

whileStatement
    : WHL expression (statement)* EWH
    ;

repeatStatement
    : RPT (statement)* UTL (expression)
    ;

recordDeclaration
    : RCD Identifier variableDeclaration+ ERC
    ;

forStatement
    : FOR Identifier ASN expression FTO expression (statement)+ NXT Identifier
    ;

elseIfExpression
    : EIF expression (statement)+
    ;

elseExpression
    : ELS (statement)+
    ;

ifStatement
    : IIF expression THN (statement)+ (elseIfExpression)* (elseExpression)? EDF
    ;

switchStatement
    : CSE OFF expression switchTerm+ (otherwiseExpression)? ECS
    ;

switchTerm
    : expression COL (statement)+
    | expression FTO expression COL (statement)+
    ;

otherwiseExpression
    : OTW (statement)+
    ;

returnStatement
    : RTN expression
    ;

fileOpen
    : OPF expression FOR (WRT | RED | APD)
    ;

fileClose
    : CLF expression
    ;

readFile
    : RDF expression CMA Identifier
    ;

writeFile
    : WRF expression CMA expression;

functionCall
    : (Identifier LPR (expression (CMA (expression) )*)? RPR)
    ;
