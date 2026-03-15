package basics;
/*
Conditional statements control decision-making in Java.
They allow the program to execute different blocks of code based on conditions (boolean expressions).

Java provides the following conditional statements:

if

if-else

if-else if-else

Nested if

switch

Ternary operator (?:) — conditional expression
*/
public class ConditionalDemo {
    public static void main(String[] args) {
        int number = 100;

        // if statement
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // if-else statement
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // if-else-if ladder
        if (number < 0) {
            System.out.println("The number is negative.");
        } else if (number == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is positive.");
        }

        //grading system example
        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade A");
        }
        else if (marks >= 75) {
            System.out.println("Grade B");
        }
        else if (marks >= 50) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Fail");
        }

        // switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }
    }
}
