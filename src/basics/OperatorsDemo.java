package basics;
/*
* Operators are symbols that perform specific operations on one or more operands (variables or values). They are used to perform calculations, comparisons, logical operations and manipulate data.

They are basically of 7 types:

Arithmetic Operators: +, -, *, /, %
Relational Operators: ==, !=, >, <, >=, <=
Logical Operators: &&, ||, !
Assignment Operators: =, +=, -=, *=, /=, %=
Unary Operators: +, -, ++, --, !
Ternary Operator: condition ? value_if_true : value_if_false
Bitwise Operators: &, |, ^, ~, <<, >>, >>>

*/
public class OperatorsDemo {
    public static void main(String[] args) {

        // 1️⃣ Arithmetic Operators
        int a = 10, b = 5;

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2️⃣ Unary Operators
        int x = 10;
        System.out.println("\nUnary Operators:");
        System.out.println("x++ = " + (x++));
        System.out.println("++x = " + (++x));
        System.out.println("x-- = " + (x--));
        System.out.println("--x = " + (--x));
        System.out.println("Negation (-x) = " + (-x));

        // 3️⃣ Assignment Operators
        int y = 10;
        System.out.println("\nAssignment Operators:");
        y += 5;
        System.out.println("y += 5 -> " + y);
        y -= 3;
        System.out.println("y -= 3 -> " + y);
        y *= 2;
        System.out.println("y *= 2 -> " + y);
        y /= 4;
        System.out.println("y /= 4 -> " + y);
        y %= 3;
        System.out.println("y %= 3 -> " + y);

        // 4️⃣ Relational (Comparison) Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // 5️⃣ Logical Operators
        boolean p = true, q = false;
        System.out.println("\nLogical Operators:");
        System.out.println("p && q : " + (p && q));
        System.out.println("p || q : " + (p || q));
        System.out.println("!p     : " + (!p));

        // 6️⃣ Bitwise Operators
        int m = 6;  // 110
        int n = 3;  // 011
        System.out.println("\nBitwise Operators:");
        System.out.println("m & n  : " + (m & n));
        System.out.println("m | n  : " + (m | n));
        System.out.println("m ^ n  : " + (m ^ n));
        System.out.println("~m     : " + (~m));

        // 7 Shift Operators
        System.out.println("\nShift Operators:");
        System.out.println("m << 1  : " + (m << 1));
        System.out.println("m >> 1  : " + (m >> 1));
        System.out.println("m >>> 1 : " + (m >>> 1));

        // Ternary Operator
        int age=19;
        boolean isAdult = age >= 18 ? true : false;
        System.out.println("\nTernary Operator:");
        System.out.println("isAdult: " + isAdult);
    }
}
