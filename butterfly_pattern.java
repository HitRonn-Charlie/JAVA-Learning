/* 


*      *
**    **
***  ***
********
********
***  ***
**    **
*      * 


*/

public class butterfly_pattern {
    public static void main(String[] args) {
        int n = 4;

        // Upper half
        for (int i = 1; i <= n; i++) {
            // first part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // Second part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // lower half
        for (int i = n; i >= 1; i--) {
            // first part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // Second part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
