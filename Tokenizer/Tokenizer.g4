grammar Tokenizer;

options{
	buildAST=true;
}

r : token* EOF;

token : (COMMENT|STRINGLITERAL|IDENTIFIER|FLOATLITERAL|INTLITERAL|KEYWORD|OPERATOR|WS);

COMMENT : '--'.*'\n';

STRINGLITERAL : '"'.*'"';

IDENTIFIER : [A-z]([0-9]|[A-z])*;

FLOATLITERAL : '-'?[0-9]*'.'[0-9]+;

INTLITERAL : '-'?[0-9]+;

KEYWORD : ('PROGRAM'|'BEGIN'|'FUNCTION'|'READ'|'WRITE'|'ELSE'|'ENDIF'|'ENDWHILE'|'CONTINUE'|'BREAK'|'RETURN'|'INT'|'VOID'|'STRING'|'FLOAT'|'END'|'IF');

OPERATOR : (':='|'!='|'<='|'>='|'+'|'-'|'*'|'/'|'('|')'|';'|','|'<'|'>'|'=');

WS : [ \t\r]+ -> skip ;