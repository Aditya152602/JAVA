class Main {
    public static void main(String[] args) {

        // SOLID RECTANGLE

        int n = 4;
        int m = 5;

        // OUTER LOOP

        for (int i = 1; i <= n; i++) {

            // INNER LOOP

            for(int j=1; j<=m ;j++){
                System.out.print("*");
            }
            System.out.println();

        }

        // HOLLOW RECTANGLE

   
        int a = 4;
        int b = 5;

        // OUTER LOOP
        for (int i = 1; i <= a; i++) {
            // INNER LOOP
            for (int j = 1; j <= b; j++) {
                if (i == 1 || j == 1 || i == a || j == b) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }

        // HALF PYRAMID

   int c = 4;

        // OUTER LOOP
        for (int i = 1; i <= c; i++) {
            //INNER LOOP
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();


        } 

        // INVERTED PYRAMID

    int d = 4;

        // OUTER LOOP
        for (int i = d; i>=1 ; i--) {
            //INNER LOOP
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();


        }

        //INVERTED HALF PYRAMID 180 DEGREE

     int e = 4;

        // OUTER LOOP
        for (int i = 1; i<=e ; i++) {
            //INNER LOOP -> space print
            for (int j = 1; j <=e-i; j++) {
                System.out.print(" ");
            }
            // INNER LOOP STAR PRINT
            
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            } System.out.println();



        }

        // HALF PYRAMID WITH NUMBERS
        
     int f = 5;

        // OUTER LOOP
        for (int i = 1; i<=f ; i++) {
            //INNER LOOP -> space print
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }

        // INVERTED HALF PYRAMID WITH NUMBERS
        
    int g = 5;

        // OUTER LOOP
        for (int i = 1; i<=g ; i++) {
            //INNER LOOP -> space print
            for (int j = 1; j <=g-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // FLOYD'S TRIANGLE

    int h = 5;
        int number = 1;

        // OUTER LOOP
        for (int i = 1; i<=h ; i++) {
            //INNER LOOP -> space print
            for (int j = 1; j <=i; j++) {
                System.out.print(number+" ");
                number++;    //number  = number + 1
            }
            System.out.println();
        }

        // 01 PYRAMID

     int k = 5;
        // OUTER LOOP
        for (int i = 1; i<=k ; i++) {
            //INNER LOOP -> space print
            for (int j = 1; j <=i; j++) {
                int sum = i+j;
                if(sum % 2==0){
                System.out.print("1 ");}
                else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }
}

        

