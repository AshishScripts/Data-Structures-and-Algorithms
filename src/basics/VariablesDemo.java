package basics;

//In Java, a variable is a named memory location that stores a value with a fixed type. Java is strongly typed, so every variable must declare its type before use.

//variables are basically containers that stores the value of a specific types.

//syntax: datatypes variableName;  declaration
//variableName = value; Assignment

//There are no global variables in java to prevent naming conflict.

//constants are declared using the "final" keyword and written in all caps.

//Based upon the type of data stored they can be categorised into primitive or reference variables.

/*
primitive variables:Primitive types store actual values directly(stored in stack frame). They are fast and memory-efficient.

int count = 100;
long distance = 100000L;   // L required
float f = 3.14f;   // f required
double d = 3.14;
char grade = 'A';
boolean isValid = true;
*/

/*
* Reference type:Reference variables store addresses of objects, not raw values.variables stores reference or address in stack where as the actual unnamed data stored in heap.

String name = "Ash";
int[] arr = new int[5];
Object obj = new Object();
*/


//Based upon scope there are three types of variables:
//1.Local variable
//2.Instance variable
//3.Static or class variable

/*
1. Local Variables: Declared inside a method, constructor, or block. Accessible only within that block.
2. Instance Variables: Declared inside a class but outside any method. Each object of the class has its own copy.
3. Static Variables: Declared with the static keyword inside a class. Shared by all objects of the class.
*/

//Final Variables: Declared with final keyword. Value cannot be changed once assigned.

public class VariablesDemo {

    int instanceVar1 = 100;//instance intialization
    int instanceVar2;//instace variable declaration
    int instanceVar3;

    static int staticVar = 400;

    final double PI = 3.14;//its a constant its value cant be changed in the program


    VariablesDemo() {             //constructor
        instanceVar3 = 300;//initializing object using the constructor
    }

    {
        instanceVar2 = 200;//initializing the instance variable using non-static block
    }

    public void createLocalVariable() {
        int localVar = 500;
        System.out.println("Local Variable : " + localVar);
    }

    public static void main(String[] args) {

        VariablesDemo obj1 = new VariablesDemo();
        System.out.println("instance Variable 1: " + obj1.instanceVar1);
        System.out.println("instance Variable 2: " + obj1.instanceVar2);
        System.out.println("instance Variable 3: " + obj1.instanceVar3);

        System.out.println("Static Variable: " + VariablesDemo.staticVar);//Static variables are associated with the class
        System.out.println("PI:" + obj1.PI);

        obj1.createLocalVariable();//calling method
    }
}