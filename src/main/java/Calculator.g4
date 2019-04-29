grammar Calculator;
INT    : [0-9]+;
DOUBLE : [0-9]+'.'[0-9]+;
ABS    : 'ABS';
SQRT    : 'SQRT';
WS     : [ \t\r]+ -> skip;

PLUS  : '+';
EQUAL : '=';
MINUS : '-';
MULT  : '*';
DIV   : '/';
LPAR  : '(';
RPAR  : ')';

input
    : lhs input? EOF # Calculate
    ;

lhs
    : lhs PLUS rhs  # Plus
    | lhs MINUS rhs # Minus
    | rhs                   # ToMultOrDiv
    ;

rhs
    : rhs MULT unaryAtom # Multiplication
    | rhs DIV unaryAtom# Division
    | unaryAtom    # AtomRhs
    | abs                # ToAbs
    | sqrt                # ToSqrt
    ;

abs
    : ABS LPAR unaryAtom RPAR # AbsCalc
    ;

sqrt
    : SQRT LPAR unaryAtom RPAR # SqrtCalc
    ;

unaryAtom
    : MINUS unaryAtom # ChangeSign
    | atom             # ToAtom
    ;

atom
    : DOUBLE                # Double
    | INT                   # Int
    | LPAR lhs RPAR # Braces
    ;
