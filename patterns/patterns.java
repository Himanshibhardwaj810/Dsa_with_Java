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
        //pattern 7 calling
        pattern7(5);
        //pattern 8 calling
        pattern8(5);

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

    static void pattern7(int n){

    // Pattern 7
    System.out.println("7th");
    /*
    7.   *****
          ****
           ***
            **
             *
             
        */
        //main loop
        for(int j=1;j<=n;j++){
            //print space
            for(int i=j-1;i<j;i++){
                System.out.print(" ");
            }
            //print star
            for(int i=n+1-j;i>=1;i--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        // Pattern 8
    System.out.println("8th");
    /*
    8.  *
       ***
      *****
     *******
    *********
    */
    //main loop
    for(int j=1;j<=n;j++){
        //print 1st portion
        for(int i=n-j;i>=1;i--){
            System.out.print(" ");
        }
        
        for(int i=1;i<=j;i++){
            System.out.print("*");
        }
        //print 2nd portion
        for(int i=j-1;i>0;i--){
            System.out.print("*");
        }
        System.out.println();
    }



    }

}
