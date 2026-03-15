/*
java is object-oriented programming language so everything must be inside a class.

* It is possible to have multiple classes and main methods in a java file.

* But it is recommended to have only a single class and single main method. */

package basics;
class MultipleClassesDemo{
    public static void main(String[] args) {
        System.out.println("this is the default main method.");//This will run by default
    }
}
class A{
    public static void main(String[] args){
        System.out.println("main method of class A");// to run: java A; //telling the
    }
}
class B{
    public static void main(String[] args){
        System.out.println("main method of class B");// java B : tell the jvm to implement the main method of this class
    }
}