public class day17Recursion {
    //                                                     Print numbers from 5 to 1.
    /*    public static void ptintNum(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        ptintNum(n-1);
    } 
    public static void main(String args[]){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
        int n = 1;
        ptintNum(n);

    }

    //                                                      Print numbers from 1 to 5.

    public static void ptintNum(int n){
        if (n==6){
            return;
        }
        System.out.println(n);
        ptintNum(n+1);
    }
    public static void main(String args[]){
        int n = 1;
        ptintNum(n);

    }

    //                                                  Print the sum of first n natural numbers.

public static void printSum(int n,int sum , int i){
        if (i == n){
            sum +=i;
            System.out.println(sum);
            return;
        }
       sum+=i;
       printSum(i+1,n,sum);
    }
    public static void main (String args[]){
        printSum(5,0,1);
    }

//                                                           FACTORIAL OF A N NO..

public static int calcfactorial(int n) {
        if (n == 1 || n == 0) {

            return 1;
        }
        int fact_nm1 = calcfactorial(n - 1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }
    public static  void main(String[] args){
        int n=5;
        int ans = calcfactorial(n);
        System.out.println(ans);
    }

              //                                       FIBONACCI SEQUENCE TILL NTH TERM. 

public static void printfib(int a , int b , int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printfib(b, c, n - 1);
    }
    public static  void main(String[] args){
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n =7;
        printfib(a,b,n-2);
    }                                                                                                                           
        
    //                                                  Print x^n(with stack height=n)                                

public static int printPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int x_ = printPower(x,n-1);
        int xn = x*x;
        return xn;
    }
    public static void main(String args[]){
        int x = 10,n = 5;
        int output = printPower(x,n);
        System.out.println(output);
    }*/    

    //                                                    Print x^n(with stack height =logn)

public static int printPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return printPower(x, n / 2) * printPower(x, n / 2);
        } else {
            return x * printPower(x, n / 2) * printPower(x, n / 2);
        }
    }
    public static void main(String args[]){
        int x = 2,n = 5;
        int output = printPower(x,n);
        System.out.println(output);
    }
}


















                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
