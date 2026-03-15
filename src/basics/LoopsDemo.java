package basics;
/*
* Loops in Java:

* Loops are control statements in Java that allow a block of code to be executed repeatedly as long as a specified condition is true. They help in reducing code repetition.

There are 4 types of loops in Java.

* for: Used when the number of iterations is known.

* while: Used when the number of iterations is not known in advance, condition checked before each iteration.

* do-while: Similar to while loop, but condition is checked after executing the block (executes at least once).

* for-each: Used to iterate over arrays and collections.
*/
public class LoopsDemo {
    public static void main(String[] args) {

        // 1. For loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // 2. While loop
        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        // 3. Do-While loop
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);

        // 4. For-each loop
        System.out.println("\nEnhanced For Loop:");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int num : numbers) {
            System.out.println("twice = " + num*2);
        }
    }
}