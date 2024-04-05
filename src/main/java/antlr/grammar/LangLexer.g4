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

ID: [a-z] [a-zA-Z0-9_]*;
DATA_ID: [A-Z] [a-zA-Z0-9_]*;

// literals

INT_LITERAL 
    :   [0]+
    |   [1-9] [0-9]*
	;

FLOAT_LITERAL
    :   [0]+ '.' [0-9]*
	|   [1-9] [0-9]* '.' [0-9]+
	|   '.' [0-9]+
	;

CHAR_LITERAL
	:   '\'' ~['\\\r\n] '\''
    |   '\'' '\\' [btnr\\] '\''
	;

BOOLEAN_LITERAL
	:   'true'
	|   'false'
	;

NULL_LITERAL: 'null';

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