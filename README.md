input:
SQRT(4) * (3 + (ABS(-4) * 2)) / 2

Result: 11.0

Tree as: 
(input (lhs (rhs (rhs (rhs (sqrt SQRT ( (unaryAtom (atom 4)) ))) * (unaryAtom (atom ( (lhs (lhs (rhs (unaryAtom (atom 3)))) + (rhs (unaryAtom (atom ( (lhs (rhs (rhs (abs ABS ( (unaryAtom - (unaryAtom (atom 4))) ))) * (unaryAtom (atom 2)))) ))))) )))) / (unaryAtom (atom 2)))) <EOF>)
