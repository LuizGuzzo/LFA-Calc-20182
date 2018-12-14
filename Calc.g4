grammar Calc;

@header {
import java.util.List;
import java.util.LinkedList;
import static edu.ifes.lfa.calc.data.CalcFactory.*;
import edu.ifes.lfa.calc.data.*;
}

program returns [List<Expr> sttms]
@init {
    $sttms = new LinkedList<>();
}
    : (s=statement  {$sttms.add($s.result);})+
    ;

statement returns [Expr result]
    : e=expr SEMI           {$result = $e.result;}
    | f=function_decl SEMI   {$result = $f.result;}
    ;

function_decl returns [Expr result]
    : DEF IDENT LPAR p=param_list RPAR e=expr
      {$result = makeFunctionDecl($IDENT.text, $p.params, $e.result);}
    ;

param_list returns [List<String> params]
@init {
    $params = new LinkedList<>();
}
    : /* empty */
    | IDENT         {$params.add($IDENT.text);}
      (COMMA IDENT  {$params.add($IDENT.text);})*
    ;

expr returns [Expr result]
    : IDENT GETS e=expr {$result = makeAssign($IDENT.text, $e.result);}
    | b=bexpr           {$result = $b.result;}
    | i=if_expr         {$result = $i.result;}
    | w=while_expr      {$result = $w.result;}
    | k=block_expr      {$result = $k.result;}
    ;

if_expr returns [Expr result]
@init {
    List<Expr> elseIfBeforeList = new LinkedList<>();
    List<Expr> elseIfAfterList = new LinkedList<>();
}
    : IF b=bexpr THEN t=expr            
      {$result = makeIfThen($b.result, $t.result);}
    | IF b=bexpr THEN t=expr ELSE e=expr
      {$result = makeIfThenElse($b.result, $t.result, $e.result);}
    | IF b=bexpr THEN t=expr (ELSEIF be=bexpr {elseIfBeforeList.add($be.result);} THEN te=expr {elseIfAfterList.add($te.result);})*
      {$result = makeIfThenElseIf($b.result, $t.result, elseIfBeforeList, elseIfAfterList);}
    | IF b=bexpr THEN t=expr (ELSEIF be=bexpr {elseIfBeforeList.add($be.result);} THEN te=expr {elseIfAfterList.add($te.result);})* ELSE e=expr
      {$result = makeIfThenElseIfElse($b.result, $t.result, $e.result, elseIfBeforeList, elseIfAfterList);}
    ;

while_expr returns [Expr result]
    : WHILE b=bexpr DO d=expr
      {$result = makeWhile($b.result, $d.result);}
    ;

block_expr returns [Expr result]
@init {
    List<Expr> body = new LinkedList<>();
}
    : LBRC (s=statement {body.add($s.result);})* RBRC
      {$result = makeBlock(body);}
    ;

bexpr returns [Expr result]
    : c1=conj       {$result = $c1.result;}
      (AND c2=conj  {$result = makeCompositeExpr(Functions.AND, $result, $c2.result);}
      )*
    ;

conj returns [Expr result]
    : d1=disj       {$result = $d1.result;} 
      (OR d2=disj   {$result = makeCompositeExpr(Functions.OR, $result, $d2.result);}
      )*
    ;

disj returns [Expr result]
    : a1=aexpr              {$result = $a1.result;}
      (o=rel_op a2=aexpr    {$result = makeCompositeExpr($o.op, $result, $a2.result);})?
    ;

rel_op returns [Operator op]
    : EQU       {$op = Functions.EQU;}
    | NEQ       {$op = Functions.NEQ;}
    | GT        {$op = Functions.GT;}
    | GEQ       {$op = Functions.GEQ;}
    | LT        {$op = Functions.LT;}
    | LEQ       {$op = Functions.LEQ;}
    ;

aexpr returns [Expr result]
    : f1=fator              {$result = $f1.result;}
        (PLUS f2=fator      {$result = makeCompositeExpr(Functions.PLUS, $result, $f2.result);}
        | MINUS f2=fator    {$result = makeCompositeExpr(Functions.MINUS, $result, $f2.result);}
        )*
    ;

fator returns [Expr result]
    : t1=termo              {$result = $t1.result;}
        (TIMES t2=termo     {$result = makeCompositeExpr(Functions.TIMES, $result, $t2.result);}
        | DIVIDE t2=termo   {$result = makeCompositeExpr(Functions.DIVIDE, $result, $t2.result);}
        )*
    ;

termo returns [Expr result]
    : a1=atomo      {$result = $a1.result;}
      (EXP a2=atomo {$result = makeCompositeExpr(Functions.EXP, $result, $a2.result);}
      )*
    ;
       
atomo returns [Expr result]
    : MINUS t=atomo     {$result = makeCompositeExpr(Functions.UMINUS, $t.result);}
    | PLUS t=atomo      {$result = $t.result;}
    | NOT t=atomo       {$result = makeCompositeExpr(Functions.NOT, $t.result);}
    | LPAR e=expr RPAR  {$result = $e.result;}
    | f=func_call       {$result = $f.result;}
    | l=lambda_func     {$result = $l.result;}
    | b=bool            {$result = $b.result;}
    | ( INTEGER         {$result = makeInt($INTEGER.text);}
      | FLOAT           {$result = makeDecimal($FLOAT.text);}
      | STRING          {$result = makeCharSeq($STRING.text);}
      | IDENT           {$result = makeVariable($IDENT.text);}
      )
    ;

bool returns [Expr result]
    : VERUM     {$result = makeBool(true);}
    | FALSUM    {$result = makeBool(false);}
    ;

func_call returns [Expr result]
    : IDENT LPAR a=arg_list RPAR
      {$result = makeCompositeExpr(makeVariable($IDENT.text), $a.args);}
    ;

lambda_func returns [Expr result]
    : LAMBDAF LPAR p=param_list RPAR THEN e=expr
      {$result = makeFunctionDecl($p.params, $e.result);}
    ;

arg_list returns [List<Expr> args]
@init {
    $args = new LinkedList<>();
}
    : /* empty */
    | e1=expr           {$args.add($e1.result);}
      (COMMA e2=expr    {$args.add($e2.result);}
      )*
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
ELSEIF  : 'elseif';
THEN    : 'then';
ELSE    : 'else';
WHILE   : 'while';
DO      : 'do';
DEF     : 'def';
LAMBDAF : 'lfunction';

fragment DIGIT  : [0-9] ;

INTEGER : DIGIT+ ;

FLOAT   : DIGIT+ '.' DIGIT* ([eE] (PLUS | MINUS) DIGIT+)?
        | '.' DIGIT+ ([eE] (PLUS | MINUS) DIGIT+)?
        ;

IDENT   : [_a-zA-Z] [_a-zA-Z0-9\']* ;

STRING  : '\"' ('\\' . | ~[\"\\])* '\"' ;

WS      : [ \t\n\r] -> skip;
