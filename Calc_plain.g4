grammar Calc_plain;

program
    : statement+
    ;

statement
    : IDENT GETS expr SEMI
    | bexpr SEMI
    | if_expr
    | while_expr
    | block_expr
    ;

expr
    : IDENT GETS expr
    | bexpr
    | if_expr
    | while_expr
    | block_expr
    ;

if_expr
    : IF bexpr THEN expr
    | IF bexpr THEN expr ELSE expr
    ;

while_expr
    : WHILE bexpr DO expr
    ;

block_expr
    : LBRC expr* RBRC
    ;

bexpr
    : conj (AND conj)*
    ;

conj
    : disj (OR disj)*
    ;

disj
    : aexpr (rel_op aexpr)?
    ;

rel_op
    : EQU
    | NEQ
    | GT
    | GEQ
    | LT
    | LEQ
    ;

aexpr
    : f1=fator
        (PLUS f2=fator
        | MINUS f2=fator
        )*
    ;

fator
    : t1=termo
        (TIMES t2=termo
        | DIVIDE t2=termo
        )*
    ;

termo
    : atomo (EXP atomo)*
    ;
       
atomo
    : MINUS t=atomo
    | PLUS t=atomo
    | NOT t=atomo
    | LPAR e=expr RPAR
    | func_call 
    | boolean
    | ( INTEGER
      | FLOAT
      | IDENT
      )
    ;

boolean
    : VERUM
    | FALSUM
    ;

func_call
    : IDENT LPAR arg_list RPAR
    ;

arg_list
    : /* empty */
    | expr (COMMA expr)*
    ;

LPAR    : '(' ;
RPAR    : ')' ;
LBRC    : '{' ;
RBRC    : '}' ;
PLUS    : '+' ;
MINUS   : '-' ;
TIMES   : '*' ;
DIVIDE  : '/' ;
EXP     : '^' ;
COMMA   : ',' ;
SEMI    : ';' ;
GETS    : '=' ;
EQU     : '==';
NEQ     : '!=';
GT      : '>';
GEQ     : '>=';
LT      : '<';
LEQ     : '<=';
AND     : '&&';
OR      : '||';
NOT     : '!';
VERUM   : 'true';
FALSUM  : 'false';
IF      : 'if';
THEN    : 'then';
ELSE    : 'else';
WHILE   : 'while';
DO      : 'do';

fragment DIGIT  : [0-9] ;

INTEGER : DIGIT+ ;

FLOAT   : DIGIT+ '.' DIGIT* ([eE] (PLUS | MINUS) DIGIT+)?
        | '.' DIGIT+ ([eE] (PLUS | MINUS) DIGIT+)?
        ;

IDENT   : [_a-zA-Z] [_a-zA-Z0-9\']* ;

WS      : [ \t\r\n] -> skip;
