package basics;

public class CallStackExample {

    public static void D() {    
        System.out.println("In Method D");
    }

    public static void C() {
        System.out.println("In Method C");
    }

    public static void B() {
        C(); // Calling C
        System.out.println("In Method B");
    }

    public static void A() {
        B(); // Calling B
        System.out.println("In Method A");
    }

    public static void main(String[] args) {
        A(); // Start with function A
        D(); // Then call D
    }
}
