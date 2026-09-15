/*import java.util.*;
// Que:Enter three no. from the user and make a function to print their average. 
public class Exercise {
    public static double average(double a, double b, double c) {
        double sum;
        double average = (a+b+c) / 3;
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println("Average of three no. : " + average(a, b, c));
    }

    // Que:WAF to print the sum of all odd numbers from 1 to n. 


    public static void printSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        return;
    }

        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSum(n);
        
    }

    


    // Que:WAF which takes in two no. and returns greater of those two.



    public static int  getGreater(int a, int b){
        if (a>b){
            return a;
        }
        else {
            return b;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getGreater(a,b));
    }



    // Que:WAF that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote. 


    public static boolean isElligible(int age){
        if(age>=18){
            return true;
        }
            return false;

    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(isElligible(age));

    }


    // Que:WAF that takes in the radius as input and returns the circumference of a circle.



    public static Double getCircumference(Double radius){
            return 2*3.14*radius;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Double radius = sc.nextDouble();
        System.out.println(getCircumference(radius));

    }



    // Que:Write an infinite loop using do while condition.



    public static void main(String args[]){
        do {

        }while(true);
    }


    // Que:WAF that calculates the Greatest Common Divisor of two no. .



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        while(n1 != n2){
            if (n1>n2){
                n1 = n1-n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD is : " + n2);
    }


    // Que:WAP to print fibonacci series of n terms where n is input by user. 


    public static void main(String[] args){
        
        int n = sc.nextInt();
        int a=0 , b=1;
        System.out.print(a+" ");
        if (n>1){
            // Find nth term
            for (int i=2; i<=n ; i++){
                System.out.print(b+" ");

                // The concept below is called swapping
                
                int temp = b;
                b = a+b;
                a = temp;
            }
            System.out.println();
        }
    }

}*/

//public class FirstOccurrence {
//    public static void main(String[] args) {
//
//        int arr[] = {0, 0, -1, 2, -3, 4, -5,4, 6, -7, 8};
//        int occur = 4;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == occur) {
//                System.out.println("Found at index: " + i);
//                return;
//            }
//        }
//
//        System.out.println("Not Found");
//    }
//}
//import java.util.*;
//public class LastOccurrence{
//    static void main() {
//        int arr[] = {1, 2, 3, 4, 5, 6, 3, 9, 0};
//        int lastocc = 3;
//        for (int i = arr.length - 1; i >= 0; i--) {
//            if (arr[i] == lastocc) {
//                System.out.println("Found at index: " + i);
//                return;
//            }
//        }
//        System.out.println("Not found");
//    }
//}

import java.util.Arrays;
//public class CopyAnArrayIntoAnother {
//    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int arr1[] = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr1[i] = arr[i];
//        }
//
//        System.out.println("Copied array: ");
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i] + " ");
//        }
//    }
//}



//public class CompareTwoArrays{
//    static void main() {
//        int arr[] = {1,2,3,4,5,6,7,8,9};
//        int arr1[] = {1,2,3,4,5,6,7,8,9};
//        if (Arrays.equals(arr, arr1)){
//            System.out.println("Equal");
//        }
//        else{
//            System.out.println("Not Equal");
//        }
//    }
//}



//public class SwapFirstAndLastElement {
//    public static void main(String[] args) {
//
//        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//
//        int temp = arr[0];
//        arr[0] = arr[arr.length - 1];
//        arr[arr.length - 1] = temp;
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}

//import java.util.Arrays;

//public class SwapAdjacentElements {
//    public static void main(String[] args) {
//
//        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//
//        for (int i = 0; i < arr.length - 1; i += 2) {
//            int temp = arr[i];
//            arr[i] = arr[i + 1];
//            arr[i + 1] = temp;
//        }
//
//        System.out.println(Arrays.toString(arr));
//    }
//}
//public class RemoveAgivenElement{
//    static void main() {
//
//        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int elementToRemove = 5;
//        int newSize = arr.length - 1;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == elementToRemove) {
//                for (int j = i; j < arr.length - 1; j++) {
//                    arr[j] = arr[j + 1];
//                }
//                break;
//            }
//        }
//
//        System.out.println("Array after removing " + elementToRemove + ":");
//        for (int i = 0; i < newSize; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//    }
//}

// Import the Arrays utility class to enable array formatting for printing
import java.util.Arrays;

// Declare a public class named MoveAllZerosToEnd
//public class MoveAllZerosToEnd {
//
//    // Declare a public static method named moveZeros that takes an integer array 'nums' as a parameter
//    public static void moveZeros(int[] nums) {
//
//        // Initialize an integer variable 'zeroIndex' to 0 to track where the next non-zero number should be placed
//        int zeroIndex = 0;
//
//        // Start a for loop that iterates through every index 'i' from 0 to the end of the 'nums' array
//        for (int i = 0; i < nums.length; i++) {
//
//            // Check if the current array element at index 'i' is not equal to zero
//            if (nums[i] != 0) {
//
//                // Declare a temporary integer variable 'temp' and store the value currently at 'zeroIndex' (which is a zero)
//                int temp = nums[zeroIndex];
//
//                // Overwrite the value at 'zeroIndex' with the non-zero value found at the current index 'i'
//                nums[zeroIndex] = nums[i];
//
//                // Place the original value of 'zeroIndex' (stored in 'temp') into the current index 'i' to complete the swap
//                nums[i] = temp;
//
//                // Increment 'zeroIndex' by 1 to advance the pointer to the next available position for a non-zero number
//                zeroIndex++;
//
//                // Close the if statement block
//            }
//
//            // Close the for loop block
//        }
//
//        // Close the moveZeros method block
//    }
//
//    // Declare the main method which serves as the execution entry point for the Java application
//    public static void main(String[] args) {
//
//        // Initialize an integer array named 'nums' with the test values 0, 1, 0, 3, and 12
//        int[] nums = {0, 1, 0, 3, 12};
//
//        // Call the moveZeros method and pass the 'nums' array to modify its elements in-place
//        moveZeros(nums);
//
//        // Print the string "Result: " concatenated with a human-readable string representation of the modified 'nums' array
//        System.out.println("Result: " + Arrays.toString(nums));
//
//        // Expected Output: [1, 3, 12, 0, 0] (This line represents the expected console output after execution)
//
//        // Close the main method block
//    }
//
//// Close the MoveAllZerosToEnd class block
//}
