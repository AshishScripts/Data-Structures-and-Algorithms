package basics;

public class CallStackExample {

    public static void D() {
        float var1 = 40.5f;
        System.out.println("In Method D");
    }

    public static void C() {
        double  var2 = 30.5;
        System.out.println("In Method C");
    }

    public static void B() {
        int var3 = 20;
        C(); // Calling C
        System.out.println("In Method B");
    }

    public static void A() {
        int var4 = 10;
        B(); // Calling B
        System.out.println("In Method A");
    }

    public static void main(String[] args) {
        A(); // Start with function A
        D(); // Then call D
    }
}
