public class patterns {
    public static void main(String[] args) {
        // pattern 1
        /*
         * 1.*****
         *****
         *****
         *****
         */
        System.out.println("1st");
        for (int j = 1; j <= 5; j++) {
            // for every row the cols are

            for (int i = 1; i <= 5; i++) {
                System.out.print("*");
            }
            // to add new line after ending of col
            System.out.println();

        }
        // patterns 2
        /*
         * 2. *
         **
         ***
         ****
         */
        System.out.println("2nd");
        for (int j = 1; j <= 5; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print("*");

            }
            System.out.println();
        }
        // pattern 3
        /*
         * 3. *****
         ****
         ***
         **
         */
        System.out.println("3rd");
        for (int j = 5; j >= 1; j--) {
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();

        }

        // Pattern 4
        System.out.println("4th");
        /*
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5
         */
        for (int j = 1; j <= 5; j++) {
            int i = 1;
            for (i = 1; i <= j; i++) {
                System.out.print(i);
            }
            System.out.println();
        }

        // Pattern 5
        System.out.println("5th");
        /*
         * 5. *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *
         */
        // main loop
        for (int j = 1; j <= 5; j++) {
            // upper portion
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // both are operated separately
        // lower portion
        for (int j = 4; j >= 1; j--) {
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();

        }

        // pattern 6 calling
        pattern6(5);
        // pattern 7 calling
        pattern7(5);
        // pattern 8 calling
        pattern8(5);
        // pattern 9 calling
        pattern9(5);
        // pattern 10 calling
        pattern10(5);
        // pattern 11 calling
        pattern11(5);
        // pattern 12 calling
        pattern12(5);
        // pattern 17 calling
        pattern17(4);

    }

    static void pattern6(int n) {
        // Pattern 6
        System.out.println("6th");
        /*
         * 6. *
         **
         ***
         ****
         *****
         */

        // main loop
        for (int j = 1; j <= n; j++) {
            // print space
            for (int i = n - j; i >= 1; i--) {
                System.out.print(" ");
            }
            // print stars
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    static void pattern7(int n) {

        // Pattern 7
        System.out.println("7th");
        /*
         * 7. *****
         ****
         ***
         **
         *
         * 
         */
        // main loop
        for (int j = 1; j <= n; j++) {
            // print space
            for (int i = 1; i < j; i++) {
                System.out.print(" ");
            }
            // print star
            for (int i = n + 1 - j; i >= 1; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        // Pattern 8
        System.out.println("8th");
        /*
         * 8. *
         ***
         *****
         *******
         *********
         */
        // main loop
        for (int j = 1; j <= n; j++) {
            // print 1st portion
            for (int i = n - j; i >= 1; i--) {
                System.out.print(" ");
            }

            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            // print 2nd portion
            for (int i = j - 1; i > 0; i--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern9(int n) {
        // Pattern 8
        System.out.println("9th");
        /*
         * 9. *********
         *******
         *****
         ***
         *
         */
        for (int j = 1; j <= n; j++) {
            // print space
            for (int i = 1; i < j; i++) {
                System.err.print(" ");

            }
            // print star
            for (int i = n + 1 - j; i >=1; i--) {
                System.out.print("*");
            }
            // print star 3rd portion
            for (int i = n - j; i >=1; i--) {
                System.err.print("*");
            }
            System.out.println();

        }
    }
    static void pattern10(int n) {
        // Pattern 8
        System.out.println("10th");
        /*
        10.      *
                * *
               * * *
              * * * *
             * * * * *
              */
        for (int j=1;j<=5;j++){
            //print 1st part
            for(int i=n-j;i>=1;i--){
                System.out.print(" ");
            }
            //print star
            for(int i=1;i<=j;i++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern11(int n) {
        // Pattern 11
        System.out.println("11th");
        /*
        11.  * * * * *
              * * * *
               * * *
                * *
                 *
                 */
        for(int j=1;j<=n;j++){
            //print space
            for(int i=1;i<j;i++){
                System.out.print(" ");

            }
            //print stars
            for(int i=n+1-j;i>=1;i--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern12(int n) {
        // Pattern 12
        System.out.println("12th");
        /*
        12.  * * * * *
              * * * *
               * * *
                * *
                 *
                 *
                * *
               * * *
              * * * *
             * * * * *
             */
            for(int j=1;j<=n;j++){
                //print space
                for(int i=1;i<j;i++){
                    System.out.print(" ");
    
                }
                //print stars
                for(int i=n+1-j;i>=1;i--){
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int j=1;j<=5;j++){
                //print 1st part
                for(int i=n-j;i>=1;i--){
                    System.out.print(" ");
                }
                //print star
                for(int i=1;i<=j;i++){
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
    static void pattern17(int n) {
        // Pattern 17
        System.out.println("17th");
        /*
        17. 
         1
        212
       32123
      4321234
       32123
        212
         1
         */
        for(int j=1;j<=4;j++){
            //upper portion
            //print space 1st part
            for(int i=n-j;i>=1;i--){
                System.out.print(" ");

            }
            //print 2nd part nums
            for(int i=j;i>=1;i--){
                System.out.print(i);
            }
            //print third nums
            for(int i=1;i<j; i++){
                System.out.print(i+1);
            }
            System.out.println();

        }
        //lower portion
        for(int j=1;j<=3;j++){
            //print space 
            for(int i=1;i<=j;i++){
                System.out.print(" ");
            }
            //print 5th nums
            for(int i=n-j;i>=1;i--){
                System.out.print(i);
            }
            //print 6th part nums
            for(int i=2;i<=n-j;i++){
                System.out.print(i);

            }
            System.out.println();
        }
    }

}
