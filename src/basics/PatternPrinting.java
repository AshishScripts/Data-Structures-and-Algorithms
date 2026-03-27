//Patterns  questions
package basics;

public class PatternPrinting {

    /*
     * Pattern 1
     
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     * * * * *

     */
    public void squareStarPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    /*
     * Pattern 2
     *
     **
     ***
     ****
     *****
     *
     */
    public void triangleStarPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    /*
     * Pattern 3
     * 1
     * 12
     * 123
     * 1234
     * 12345
     *
     */

    public void triangleNumberPattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }

    /*
     * Pattern 4
     * 1
     * 22
     * 333
     * 4444
     * 55555
     *
     */
    public void triangleNumberPattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i  +   " ");
            }
            System.out.print("\n");
        }
    }

    /*
     * Pattern 5
     *****
     ****
     ***
     **
     *
     *
     */

    public void invertedStarTriangleLeft(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    /*
     * Pattern 6
     * 12345
     * 1234
     * 123
     * 12
     * 1
     *
     */
    public void invertedNumberTriangleLeft(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j  +   " ");
            }
            System.out.print("\n");
        }
    }

    /*
        Pattern   7
* * * * *
*       *
*       *
*       *
* * * * *

    */
    public void hollowSquarePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    /*

    Pattern 8
1
12
123
1234
12345

    */
     public  void    triangleNumPattern(int  n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    /*
    Pattern 9
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

    */

    public  void    triangleNumChangingPattern(int  n){
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(++count+" ");
            }
            System.out.print("\n");
        }
    }

    /*
    Pattern 10
12345
1234
123
12
1

    */

     public  void    invertedNumTriangleLeft(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
    /*
        Pattern  11
    *
   ***
  *****
 *******
*********

    */
    void    pyramidPattern(int  n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        Pattern  12
    1
   222
  33333
 4444444
555555555

    */

     void    pyramidPatternNumbered(int  n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /*
        Pattern  13
*********
 *******
  *****
   ***
    *

    */
    void   invertedPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*n-(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        Pattern  14
*****
 *****
  *****
   *****
    *****

    */
    void    rhombusPattern(int  n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        Pattern   15
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

    */
    void    diamondStarPattern(int  n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        PatternPrinting t = new PatternPrinting();

        System.out.println("\nPattern 1");
        t.squareStarPattern(5);

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

        System.out.println("\nPattern 8");
        t.triangleNumPattern(5);

        System.out.println("\nPattern 9");
        t.triangleNumChangingPattern(5);

        System.out.println("\nPattern 10");
        t.invertedNumTriangleLeft(5);

        System.out.println("\nPattern  11");
        t.pyramidPattern(5);

        System.out.println("\nPattern  12");
        t.pyramidPatternNumbered(5);

        System.out.println("\nPattern  13");
        t.invertedPyramid(5);

        System.out.println("\nPattern  14");
        t.rhombusPattern(5);

        System.out.println("\nPattern   15");
        t.diamondStarPattern(5);

    }
}
