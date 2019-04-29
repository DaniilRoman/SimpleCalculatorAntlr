input:
SQRT(4) * (3 + (ABS(-4) * 2)) / 2

Result: 11.0

Tree as: 
(input (lhs (rhs (rhs (rhs (sqrt SQRT ( (unaryAtom (atom 4)) ))) * (unaryAtom (atom ( (lhs (lhs (rhs (unaryAtom (atom 3)))) + (rhs (unaryAtom (atom ( (lhs (rhs (rhs (abs ABS ( (unaryAtom - (unaryAtom (atom 4))) ))) * (unaryAtom (atom 2)))) ))))) )))) / (unaryAtom (atom 2)))) <EOF>)

For generate base clases need use script "antlr4 src/main/java/Calculator.g4 -no-listener -visitor -o app" instead generate from idea plugin. Because by defoult generate for listener but we use visitor strategy for walking on tree.
