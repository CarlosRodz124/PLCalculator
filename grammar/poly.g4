grammar poly;

@parser::header{
import java.util.Map;
import java.util.HashMap;
}
@parser::members{
Map<String,Object> symbolTable = new HashMap<String,Object>();
}

/*Lexical rules*/

INTEGER: 'integer';
ID: 'id';
EXP: 'exp';
TERM: 'term';
MONOMIAL: 'monomial';
POLYNOMIAL: 'polynomial';
STRING: 'string';
FACTOR: 'factor';
EXPLIST: 'expList';
PROPEXPLIST: 'propExpList';
IDLIST: 'idList';
DEF: 'def';
EMPTY: 'empty';
BOOL: 'bool';
UNOP: 'unop';
SIGN: 'sign';
BINOP: 'binop';

CONDITIONS: 'if' | 'else' | 'for' | 'while' | 'return' | 'true' | 'false' | 'in' ;
WS : [ \r\t\u000C\n]+ -> skip ;
CHARACTER: [a-zA-Z];
DIGIT: [0-9] ;
DELIMITER: '(' | ')' | '[' | ']' | ',' | ';' ;
OPERATOR: '+' | '-' | '~' | '*' | '/' | '=' | '!=' | '<' | '>' | '<=' | '>=' | '&' | '|' ;

/* Grammar rules */

program: 'class' id '{'exp*'}';

exp: def
    | idop
    | term (binop exp)*
    | 'if' exp ':' exp
    | 'if' exp ':' exp 'else' ':' exp
    | 'while' exp ':' exp
    | 'for' id 'in' term ':' exp
    ;

term: unop term
    | factor ('('expList ')')*
    | empty
    | integer
    | bool
    | string
    | print
    | sumpolynomial
    | subpolynomial
    | mulpolynomial
    | mulcpolynomial
    | derpolynomial
    | defintegralpolynomial
    | integralpolynomial
    | evalpolynomial
    | degree
    | equalpolynomial
    | polynomial
    | monomial
    ;

print: 'print:' exp ';';

idop: id binop id ;

sumpolynomial:polynomial'+'polynomial;

subpolynomial:polynomial'-'polynomial;

mulpolynomial:polynomial'*'polynomial;

mulcpolynomial:polynomial'*'integer;

derpolynomial: 'der' polynomial;

defintegralpolynomial : 'integral' polynomial integer ',' integer;

integralpolynomial : 'integral' polynomial ;

evalpolynomial : 'eval' polynomial integer;

degree : 'degree' polynomial | 'degree' monomial;

equalpolynomial: polynomial '==' polynomial;

monomial: integer CHARACTER? ( '^' integer)? | integer;

polynomial: '$' sign? monomial  (sign monomial)+'$';

string: '"' exp '"' ;

factor: '(' exp ')'
    | id
    ;

expList: (propExpList)* ;

propExpList: exp
    | exp ',' propExpList
    ;

idList: (propIdList)* ;

propIdList: id
    | id ',' propIdList
    ;

def: id '=' exp;

empty: WS;

bool: 'true'
    | 'false'
    ;

unop: sign
    | '~'
    ;

sign: '+'
    | '-'
    ;

binop: sign
    | '*'
    | '/'
    | '='
    | '!='
    | '<'
    | '>'
    | '<='
    | '>='
    | '&'
    | '|'
    ;

id: CHARACTER (CHARACTER | DIGIT)* ;

integer: DIGIT+ ;
