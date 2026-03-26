//Patterns  questions
package basics;

public class PatternPrinting {
    public  void    rectangularStarPattern(int  n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public  void    triangleStarPattern(int  n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public  void    triangleNumberPattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    public  void    triangleNumberPattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }

    public  void    invertedStarTriangleLeft(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public  void    invertedNumberTriangleLeft(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        PatternPrinting    t=new   PatternPrinting();

        System.out.println("\nPattern 1");
        t.rectangularStarPattern(3);

        System.out.println("\nPattern 2");
        t.triangleStarPattern(5);

        System.out.println("\nPattern 3");
        t.triangleNumberPattern1(5);

        System.out.println("\nPattern 4");
        t.triangleNumberPattern2(5);

        System.out.println("\nPattern 5");
        t.invertedStarTriangleLeft(5);

        System.out.println("\nPattern 6");
        t.invertedNumberTriangleLeft(5);
    }
}
