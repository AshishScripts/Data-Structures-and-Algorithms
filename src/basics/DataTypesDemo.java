package basics;

/*Data Types in Java:

Data types specify what type of values a variable can hold. They define the size, range and nature of data stored in memory and the operations that can be performed on them. Java has two main categories of data types:

Primitive: interger(byte, short, int, long) ,floating values(float, double), characters (char), boolean(true and false)
Non-Primitive: String, Arrays, Classes, Interfaces, Objects

*/
public class DataTypesDemo {
    public static void main(String[] args) {

        // -------- Primitive Data Types --------

        //----------integer type---------
        byte b = 100;              // 1 byte
        short s = 30000;           // 2 bytes
        int i = 100000;            // 4 bytes
        long l = 10000000000L;     // 8 bytes

        float f = 3.14f;           // 4 bytes
        double d = 3.14159265359;  // 8 bytes

        char c = 'A';              // 2 bytes (Unicode character)
        boolean flag = true;       // 1 bit

        // -------- Non-Primitive Data Types --------
        String str = "Hello, Java"; // String (class in Java)
        int[] arr = {1, 2, 3, 4, 5}; // Array

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

        System.out.println("String: " + str);
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
