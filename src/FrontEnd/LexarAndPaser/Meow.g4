grammar Meow;


// Expressions
primaryExpression
    : Identifier                    #primaryExpressionIdentifier
    | constant                      #primaryExpressionconstant
    | Stringliteral                 #primaryExpressionStringLiteral
    | '(' expression ')'            #primaryExpressionParen
    ;
postfixExpression
    : primaryExpression                              #postfixExpressionPre
    | postfixExpression '[' expression ']'           #postfixExpressionBracket
    | postfixExpression '(' argumentExpression? ')'  #postfixExpressionParen
    | postfixExpression '.' Identifier        #postfixExpressionDot
    | postfixExpression '++'                         #postfixExpressionPlusPlus
    | postfixExpression '--'                         #postfixExpressionMinusMinus
    ;

unaryExpression
    : postfixExpression             #unaryExpressionPre
    | 'new' creator                 #unaryExpressionNew
    | '++' unaryExpression          #unaryExpressionPlusPlus
    | '--' unaryExpression          #unaryExpressionMinusMinus
    | '!' unaryExpression           #unaryExpressionNot
    | '~' unaryExpression           #unaryExpressionTilde
    | '+' unaryExpression           #unaryExpressionPlus
    | '-' unaryExpression           #unaryExpressionMinus
    ;
castExpression
    : unaryExpression                   #castExpressionPre
    //| '(' typeName ')'  castExpression  #castExpressionCur
    ;
multiplicativeExpression
    : castExpression                                #multiplicativeExpressionPre
    | multiplicativeExpression '*' castExpression   #multiplicativeExpressionMul
    | multiplicativeExpression '/' castExpression   #multiplicativeExpressionDiv
    | multiplicativeExpression '%' castExpression   #multiplicativeExpressionMod
    ;

addativeExpression
    : multiplicativeExpression                          #addativeExpressionPre
    | addativeExpression '+' multiplicativeExpression   #addativeExpressionPlus
    | addativeExpression '-' multiplicativeExpression   #addativeExpressionMinus
    ;
shiftExpression
    : addativeExpression                        #shiftExpressionPre
    | shiftExpression '<<' addativeExpression   #shiftExpressionLeftShift
    | shiftExpression '>>' addativeExpression   #shiftExpressionRightShift
    ;
relationalExpression
    : shiftExpression                             #relationalExpressionPre
    | relationalExpression '<' shiftExpression    #relationalExpressionLessThan
    | relationalExpression '>' shiftExpression    #relationalExpressionGreaterThan
    | relationalExpression '<=' shiftExpression   #relationalExpressionLessOrEqualThan
    | relationalExpression '>=' shiftExpression   #relationalExpressionGreaterOrEqualThan
    ;

equalityExpression
    : relationalExpression                              #equalityExpressionPre
    |   equalityExpression '==' relationalExpression    #equalityExpressionEqual
    |   equalityExpression '!=' relationalExpression    #equalityExpressionNotEqual
    ;
andExpression
    : equalityExpression                        #andExpressionPre
    | andExpression '&' equalityExpression      #andExpressionAnd
    ;
xorExpression
    : andExpression                     #xorExpressionPre
    | xorExpression '^' andExpression   #xorExpressionXor
    ;
orExpression
    : xorExpression                     #orExpressionPre
    | orExpression '|' xorExpression    #orExpressionOr
    ;
logicalAndExpression
    : orExpression                              #logicalAndExpressionPre
    | logicalAndExpression '&&' orExpression    #logicalAndExpressionAnd
    ;
logicalOrExpression
    : logicalAndExpression                              #logicalOrExpressionPre
    | logicalOrExpression '||' logicalAndExpression     #logicalOrExpressionOr
    ;
conditionalExpression
    : logicalOrExpression           #conditionalExpressionPre
    ;
assignmentExpression
    : conditionalExpression                                      #assignmentExpressionPre
    | <assoc=right> unaryExpression assignmentOperator assignmentExpression    #assignmentExpressionAssgin
    ;
assignmentOperator
    : '='
    ;
argumentExpression
    : assignmentExpression                          #argumentExpressionPre
    | argumentExpression ',' assignmentExpression   #argumentExpressionCur
    ;
expression
    : assignmentExpression                          #expressionPre
    //| expression ',' assignmentExpression           #expressionCur
    ;
creator
     : primitiveType                     #creatorPrimitiveType
     | Identifier                        #creatorIdentifier
     | creator '[' expression? ']'        #creatorArray
     ;
typeName
    : primitiveType                     #typeNameprimitiveType
    | Identifier                        #typeNameIdentifier
    | typeName '[' ']'                  #typeNameArray
    ;

primitiveType
    : name = ('bool'| 'int'| 'void'| 'string')
    ;
// block and statement
block
    : '{' blockStatements? '}'
    ;
blockStatements
    : statement                    #blockStatementsPre
    | blockStatements statement    #blockStatementsCur
    ;
statement
    : block                                                             #statementBlock
    | variableDeclarationStatement                                      #statementVariableDeclarationStatement
    | expressionStatement                                               #statementExpressionStatement
    | 'if' '(' expression ')' bodyThen=statement ('else' bodyElse=statement)?             #statementIfElse
    | 'for' '(' forInit = expression? ';' forCondition = expression? ';' forUpdate = expression? ')' statement    #statementFor
    | 'while' '(' expression ')' statement                              #statementWhile
    | 'return' expression? ';'                                          #statementReturn
    | 'break' ';'                                                       #statementBreak
    | 'continue' ';'                                                    #statementcontinue
    | ';'                                                               #statementEmpty
    ;
expressionStatement
    : expression ';'
    ;
// program
program
    : translationUnits? EOF
    ;
translationUnits
    : translationUnits  translationUnit #translationUnitsCur
    | translationUnit                   #translationUnitPre
    ;
translationUnit
    : classDeclaration                  #translationUnitClassDeclaration
    | functionDeclaration               #translationUnitFunctionDeclaration
    | variableDeclarationStatement      #translationUnitVariableDeclaration   // return a list
    ;
classDeclaration
    : 'class' Identifier classBody
    ;
classBody
    : '{' classBodyDeclaration* '}'
    ;
classBodyDeclaration
    : ';'                           #classBodyDeclarationEmpty
    | memberDeclaration             #classBodyDeclarationMember
    ;
memberDeclaration
    : fieldDeclaration
    ;
fieldDeclaration
    : typeName variableDeclaratorIDList ';'
    ;
functionDeclaration
    : typeName Identifier formalParameters block
    ;
formalParameters
    : '(' formalParameterList? ')'
    ;
formalParameterList
    : formalParameter (',' formalParameter)*  // bu
    ;
formalParameter
    : typeName variableDeclaratorID
    ;
variableDeclarationStatement
    :   variableDeclaration ';'
    ;
variableDeclaration
    : typeName variableDeclaratorList
    ;
variableDeclaratorList
    : variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    : variableDeclaratorID ('=' expression)?
    ;
variableDeclaratorID
    : Identifier
    ;
variableDeclaratorIDList
    : variableDeclaratorID (',' variableDeclaratorID)*
    ;
constant
    : IntegerConstant #constantIntegerConstant
    | BooleanConstant #constantBooleanConstant
    | 'null'          #constantNullConstant
    //| FloatingConstant
    //| CharacterConstant
    ;

// Lexar

LeftParen : '(';
RightParen : ')';
LeftBracket : '[';
RightBracket : ']';
LeftBrace : '{';
RightBrace : '}';

Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';
LeftShift : '<<';
RightShift : '>>';

Plus : '+';
PlusPlus : '++';
Minus : '-';
MinusMinus : '--';
Star : '*';
Div : '/';
Mod : '%';

And : '&';
Or : '|';
AndAnd : '&&';
OrOr : '||';
Caret : '^';
Not : '!';
Tilde : '~';

Question : '?';
Colon : ':';
Semi : ';';
Comma : ',';

Assign : '=';
// '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|='
StarAssign : '*=';
DivAssign : '/=';
ModAssign : '%=';
PlusAssign : '+=';
MinusAssign : '-=';
LeftShiftAssign : '<<=';
RightShiftAssign : '>>=';
AndAssign : '&=';
XorAssign : '^=';
OrAssign : '|=';

Equal : '==';
NotEqual : '!=';

Arrow : '->';
Dot : '.';
New : 'new';
Bool : 'bool';
Int  : 'int';
String : 'string';
Void : 'void';
Class : 'class';
Null : 'null';

If : 'if';
Else : 'else';
For : 'For';
While : 'while';
Return : 'return';
Continue : 'continue';
Break : 'break';
TBD: 'ToBeDone';





BooleanConstant
    : 'true' | 'false'
    ;
IntegerConstant
    : DecimalConstant
    ;
Stringliteral
    : '"' Char* '"'
    ;

Whitespace
    :   [ \t]+
        -> skip
    ;
Newline
    : '\r'? '\n'
    ->skip
    ;
testID
    : Identifier
    ;
Identifier
    :  IdentifierNonDigit (IdentifierNonDigit | Digit)*
    ;
IdentifierNonDigit
    : [a-zA-Z_]
    ;
LineComment
    :   '//' ~[\r\n]* -> skip
    ;
BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;
fragment
Char
    : ~["\\\n]
    | EscapeSequence
    ;
fragment
EscapeSequence
    : '\\' [\\"nr]
    ;

fragment
DecimalConstant
    : NonzeroDigit Digit*
    | [0]+
    ;

fragment
NonzeroDigit
    : [1-9]
    ;

fragment
Digit
    : [0-9]
    ;

