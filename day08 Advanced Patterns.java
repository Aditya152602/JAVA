// Butterfly Pattern
class AdvancedPatterns{
    public static void main(String[] args){
        int n  = 4;

        // UPPER HALF
        for(int i=1; i<=n;i++){
            // 1ST PART
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // Spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
           }
           // 2nd part
          for(int j=1; j<=i; j++){
              System.out.print("*");
          }
            System.out.println();
        }

        
        // Lower Half
                for(int i=n; i>=1;i--){
                    // 1ST PART
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    // Spaces
                    int spaces = 2*(n-i);
                    for(int j=1; j<=spaces; j++){
                        System.out.print(" ");
                    }
                    // 2nd part
                    for(int j=1; j<=i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }

        // Solid Rhombus

        int m = 5;

        for(int i=1; i<=m; i++){
            // Spaces
            for(int j=1; j<=m-i; j++){
                System.out.print(" ");
            }
            // Stars
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Number Pyramid

         int o = 5;
        for (int i=1; i<=o; i++){
            // Spaces
            for (int j=1; j<=o-i; j++) {
                System.out.print(" ");
            }
            // Numbers - >print row no, row no times
            for (int j=1; j<=i; j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
        
        // Palindromic Pattern
        int p= 5;
        for (int i=1; i<=p; i++) {
            // Spaces
            for (int j=1; j<=p-i; j++) {
                System.out.print(" ");
            }
            // 1st Half Numbers
            for (int j=i; j>=i; j--) {
                System.out.print(j);
            }
            // 2nd Half Numbers
            for (int j=2; j<=i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
        // Diamond Pattern
        
        int a = 4;

       //Upper Half
       for (int i=1; i<=a; i++){
           // Spaces
           for (int j=1;j<=a-i;j++){
               System.out.print(" ");
           }
           // Stars
           for(int j=1; j<=2*i-1; j++){
               System.out.print("*");
           }
           System.out.println();
       }
       // Lower Half
        for (int i=a; i>=1; i--){
            // Spaces
            for (int j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            // Stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

