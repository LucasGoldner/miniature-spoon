lexer grammar LangLexer;

// keywords

BOOLEAN: 'Bool';
INT: 'Int';
FLOAT: 'Float';
CHAR: 'Char';
DATA: 'data';
IF: 'if';
ELSE: 'else';
ITERATE : 'iterate';
NEW: 'new';
RETURN: 'return';
READ: 'read';
PRINT: 'print';

// identifiers

Identifier: [a-z] [a-zA-Z0-9_]*;
DataIdentifier: [A-Z] [a-zA-Z0-9_]*;

// literals

IntLiteral 
    :   [0]+
    |   [1-9] [0-9]*
	;

FloatLiteral
    :   [0]+ '.' [0-9]*
	|   [1-9] [0-9]* '.' [0-9]+
	|   '.' [0-9]+
	;

CharLiteral
	:   '\'' ~['\\\r\n] '\''
    |   '\'' '\\' [btnr\\] '\''
	;

BoolLiteral
	:   'true'
	|   'false'
	;

NullLiteral: 'null';

// operators, separators 

LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';
DOT: '.';
COMMA: ',';
SEMI: ';';
COLON: ':';
COLONCOLON: '::';
GT: '>';
LT: '<';
ASSIGN: '=';
EQUAL: '==';
BANG: '!';
NOTEQUAL: '!=';
AND: '&&';
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
MOD: '%';

// whitespace, comments

WS: [ \t\r\n\b]+ -> skip;

COMMENT: '{-' .*? '-}' -> skip;
LINE_COMMENT: '--' ~[\r\n]* -> skip;

ERROR : .;