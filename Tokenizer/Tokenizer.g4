grammar Tokenizer;

r : .* EOF;

token : (COMMENT|STRINGLITERAL|IDENTIFIER|FLOATLITERAL|INTLITERAL|KEYWORD|OPERATOR);

COMMENT : '--'.*?'\n' -> skip;

STRINGLITERAL : '"'.*?'"';

KEYWORD : ('PROGRAM'|'BEGIN'|'FUNCTION'|'READ'|'WRITE'|'ELSE'|'ENDIF'|'ENDWHILE'|'CONTINUE'|'BREAK'|'RETURN'|'INT'|'VOID'|'STRING'|'FLOAT'|'END'|'IF'|'WHILE');

IDENTIFIER : [A-z]([0-9]|[A-z])*;

FLOATLITERAL : [0-9]*'.'[0-9]+;

INTLITERAL : [0-9]+;

OPERATOR : (':='|'!='|'<='|'>='|'+'|'-'|'*'|'/'|'('|')'|';'|','|'<'|'>'|'=');

WS : [ \t\r\n]+ -> skip ;