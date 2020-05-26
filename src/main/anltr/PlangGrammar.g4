grammar PlangGrammar;
fragment DIGIT: [0-9] ;
fragment LLET: [a-z] ;
fragment ULET: [A-Z] ;
fragment LET: ULET | LLET;

IDENT  : LLET (LET | DIGIT)* ;
VAR    : ULET (LET | DIGIT)* ;
WS     : [ \t\r\n]+ -> skip ;

start : prog EOF;

var: VAR;
arg: atom | var ;
abody: '(' (arg ',')* arg ')' ;
atom: IDENT body=abody?;

rhead: atom ;
rbody: (atom ',')* atom;
rrule: rhead ('->' rbody)? '.';

tar: (atom ',')* atom '.';

prog: rrule* '-?' tar ;
