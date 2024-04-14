grammar cuteLang;

program: START block END
    ;

block: ( operation? NEWLINE )*
;

operation:  IF cond THEN ifblock ENDIF      #if
            | WRITE ID		                #write
	        | ID '=' expr0		            #assign
	        | READ ID   		            #read
            ;

ifblock: block
;

cond: ID '==' INT
;

expr0:  expr1			#single0
      | expr1 ADD expr1	#add
      | boolExpr0       #boolexpr
;

expr1:  expr2			    #single1
      | STRING          #string
      | expr2 MULT expr2	#mult
;

expr2:  expr3			#single2
      | expr3 SUB expr3	#sub
;

expr3:  expr4			#single3
      | expr4 DIV expr4	#div
;

expr4:   INT			    #int
       | FLOAT			    #float
       | ID                 #id1
       | arrayExpr          #array
       | TOINT expr4		#toint
       | TOFLOAT expr4		#tofloat
       | '(' expr0 ')'		#par
;

boolExpr0: boolExpr1                #singlebool0
         | boolExpr1 AND boolExpr1  #and
;

boolExpr1: boolExpr2                #singlebool1
         | boolExpr2 OR boolExpr2   #or
;

boolExpr2: boolExpr3                #singlebool2
         | boolExpr3 XOR boolExpr3  #xor
;

boolExpr3: boolExpr4                #singlebool3
         | NEG boolExpr4            #neg
;

boolExpr4: BOOL                 #bool
         | ID                   #id2
         | '(' boolExpr0 ')'    #boolpar
;

arrayExpr:  '[' INT (',' INT)* ']'      #intarray
          | '[' FLOAT (',' FLOAT)* ']'  #floatarray
    ;

TOINT: '(int)'
    ;

TOFLOAT: '(float)'
    ;

WRITE:	'write'
   ;

READ:	'read'
   ;

IF:	'if'
;

THEN:	'then'
;

ENDIF:	'endif'
;

STRING :  '"' ( ~('\\'|'"') )* '"'
    ;

BOOL: 'true' | 'false'
    ;

ID:   ('a'..'z'|'A'..'Z')+
   ;

INT:   '0'..'9'+
    ;

FLOAT:  '0'..'9'+ '.' '0'..'9'+
    ;

ADD: '+'
    ;

MULT: '*'
    ;

DIV: '/'
    ;

SUB: '-'
    ;

AND : '&&';
OR : '||';
XOR : '^';
NEG : '!';

NEWLINE:	'\r'? '\n'
    ;

WS:   (' '|'\t')+ { skip(); }
    ;

START: ':D';

END: ':C';