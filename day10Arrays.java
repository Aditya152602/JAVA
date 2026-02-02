/*import java.util.Scanner;
public class day10Arrays {
    public static void main (String[] args){
       int[] marks = new int[3];
       marks[0] = 97;
       marks[1] = 75;
       marks[2] = 80;
       System.out.println(marks[0]);
       System.out.println(marks[1]);
       System.out.println(marks[2]);
       for (int i=0;i<3;i++){
           System.out.println(marks[i]);
       }

    Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
       // input
        for (int i=0; i<size;i++){
            numbers [i] = sc.nextInt();
        }

        // output
        for (int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }

 Que: Take an array as input from the user.Search for a given no. x and print the index at which it occurs.(Linear search)

    Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
         input
        for (int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt();
         output
        for (int i=0; i<numbers.length; i++){
            if (numbers[i] == x){
                System.out.println("x found at index : " + i);
            }
        }

 Que:Taking an array as an input and printing its elements.

    Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        // Print the no. in the array
        
        for (int i=0; i<numbers.length; i++){
        
                    System.out.print(numbers[i]+" ");
       }

 Que:Take an array of a names as input from the user and print them on the screen.        

    Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String names[] = new String[size];
        for (int i=0; i<size; i++){
            names[i] = sc.next();
        }
         Print the no. in the array

        for (int i=0; i<names.length; i++){
            System.out.println("names "+(i+1) + " is : " + names[i]);
        }

 Que:Find the maximum and minimum numbers in an array of integers. 

    Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        // Input

        for (int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        

        for (int i=0; i<numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
       System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);

 Que:Take an array of numbers as input and check if it is an array sorted in ascending order.

    Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

         Input

        for (int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for (int i=0; i<numbers.length-1; i++){// NOTICE : numbers.length-1 as termination conditions.

            if (numbers[i] > numbers[i+1]){ // This is the condition for descending order.
                isAscending = false;
            }
        }
        if (isAscending){
            System.out.println("The array is sorted in ascending order ");
        }else {
            System.out.println("The array is not sorted in ascending order ");
        }
    }
}*/


