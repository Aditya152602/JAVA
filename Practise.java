/*import java.util.*;
public class Practise {
  public static void main(String[] args) {

//        System.out.println("The result of an half yearly exam is given below :");
//       Scanner sc= new Scanner(System.in);
//       System.out.println("Enter the marks of Mathematics :");
//       int a = sc.nextInt();
//        System.out.println("Enter the marks of Hindi :");
//       int b = sc.nextInt();
//        System.out.println("Enter the marks of English :");
//       int c = sc.nextInt();
//        System.out.println("Enter the marks of computer science :");
//        int d = sc.nextInt();
//        System.out.println("Enter the marks of science");
//        int e = sc.nextInt();
//        float percentage = ((a+b+c+d+e)/500.0f)*100;
//        System.out.println("Percentage :");
//        System.out.println(percentage);


// }



//}

//                                                           GRETS


//
//  public static void main(String[] args) {
//    System.out.println("What is your name :");
//  Scanner sc = new Scanner(System.in);
//String name = sc.nextLine();
//System.out.println("Hello "+name+" have a good day!");



// }



//

//                                                        CONVERTING KM TO MILES 

//import java.util.*;
//class Conditions {
//    public static void main(String[] args) {
//        double km ,miles;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the distance in km :");
//        km = input.nextDouble();
//        input.close();
//        miles = (km*0.621371);
//       System.out.printf("%2f kilometers =%2f Miles",km,miles);



//}



//}

//                                   TO CHECK WHETHER THE ENTERED NO. IS INTEGER OR NOT.

//import java.util.*;
//class Conditions {
//    public static void main(String[] args) {
//        System.out.println("Enter the number :");
//        Scanner sc = new Scanner(System.in);
//        System.out.println(sc.hasNextInt());



//    }



//}


//                                                  ESCAPE SEQENCE CHARACTERS

//import java.util.*;
//class  Conditions{
//    public static void main(String[] args){
//            String myletter = "Dear Aditya,\n\tDwivedi.\n\tanuj";
//            System.out.println(myletter);
//    }
//}

//                                                CONDITIONALS EXAMPLE IN JAVA

Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
          if (n%2==0) {
                System.out.println("Is an even number");

            } else{
                System.out.println("Is not an even number");
            }
            
      // NESTED IF ELSE
    int a = sc.nextInt();
            int b = sc.nextInt();
            if (a==b) {
                System.out.println("They both are equal.");

            } else if (a>b) {
                System.out.println("N is greater then m. ");

            } else{
                System.out.println("N is lesser.");
            }

            // SWITCH CASE EXAMPLE
    int button = sc.nextInt();
        switch (button){
            case 1 :
                System.out.println("Hello");
            break;
            case 2 :
                System.out.println("Namaste");
            break;
            case 3 :
                System.out.println("Bonjour");
            break;
            default:
                System.out.println("Invalid Button");
        }
  int day = sc.nextInt();
switch (day){
  case 1 : 
      System.out.println("Monday");
  break;    
  case 2 :
      System.out.println("Tuesday");
  break;
  case 3 : 
      System.out.println("Wednesday");
  break;
  case 4 : 
      System.out.println("Thursday");
  break;
  case 5 : 
      System.out.println("Friday");
  break;
  case 6 : 
      System.out.println("Saturaday");
  break;
  case 7 : 
      System.out.println("Sunday");
  break;
  default :
  System.out.println("Invalid");
}

//                                     WAP TO FIND OUT THE TYPE OF WEBSITE FROM THE URL

  String website = sc.next();
if (website.endsWith(".org")) {
  System.out.println("This is an organistional website");
}
else if(website.endsWith(".in")){
  System.out.println("This is an Industial Website");

}
  // WAP TO FIND FACTORIAL OF A GIVEN NO. USING FOR LOOP
  int c = 5;
  int factorial = 1;
  for(int i = 1; i<=c;i++){
    factorial*=i;
  }  System.out.println(factorial);

   //                 WAP TO CALCULATE THE SUM OF THE NUMBERS OCCURING IN THE ANY MULTIPLICATION TABLE
    int o =sc.nextInt();
        int sum = 0;
        for(int i=1;i<=10;i++){
            sum += o*i;
        }
        System.out.println(sum);
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

import java.util.Arrays;

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

//public class Compare{
//    static void main() {
//        String a = "Anushree";
//        String b = "Anushree1";
//        if (a.compareTo(b) == 0) {
//            System.out.println("Equal");
//        } else {
//            System.out.println("Not Equal");
//        }
//
//    }
//
//}
//
//public class Equals{
//    static void main() {
//        String a = "Anushree";
//        String b = "Anushree1";
//        if (a.equals(b)) {
//            System.out.println("Equal");
//        } else {
//            System.out.println("Not Equal");
//        }
//
//    }
//
//}//import java.util.*;
//public class RemoveSpacesFromString{
//    static void main() {
//        String a="banana is my favourite fruit";
//        char c = ' ';
//        for (int i = 0; i < a.length(); i++) {
//            if (a.charAt(i)!=c) {
//                System.out.print(a.charAt(i));
//
//
//            }
//        }
//    }
//}

//
//import java.util.*;
//public class RemoveVowelsFromString{
//    static void main() {
//        String a="banana is my favourite fruit";
//        String c ="aeiou";
//        for (int i = 0; i < a.length(); i++) {
//            if (c.indexOf(a.charAt(i)) == -1) {
//                System.out.print(a.charAt(i));
//
//
//            }
//        }
//    }
//}


//public class FindLongestWordsInString {
//    public static void main(String[] args) {
//        String str = "The quick brown fox jumps over the lazy dog";
//        String[] words = str.split(" ");
//        int maxLength = 0;
//
//        for (String word : words) {
//            if (word.length() > maxLength) {
//                maxLength = word.length();
//            }
//        }
//
//        System.out.println("Longest word(s) in the string:");
//        for (String word : words) {
//            if (word.length() == maxLength) {
//                System.out.println(word);
//            }
//        }
//    }
//}

//public class FindSmallestWordInString {
//    static void main() {
//        String str = "The quick brown fox jumps over the lazy dog";
//        String[] words = str.split(" ");
//        String smallestWord = words[0];
//
//        for (String word : words) {
//            if (word.length() < smallestWord.length()) {
//                smallestWord = word;
//            }
//        }
//
//        System.out.println("Smallest word in the string: " + smallestWord);
//
//    }
//
//}

public class Palindrome {

    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String str = "madam";

        if (isPalindrome(str)) {
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Is not Palindrome");
        }
    }
}

import java.util.Scanner;
public class ReverseEveryWordInSentenceString {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String a = sc.nextLine();
        System.out.println("Reversed");
        for (int i = a.length()-1;i>=0;i--){
            System.out.println(a.charAt(i));
        }
    }

}
public class Palindrome {

    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (!Character.isLetterOrDigit(str.charAt(left))) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(str.charAt(right))) {
                right--;
                continue;
            }

            if (Character.toLowerCase(str.charAt(left)) !=
                    Character.toLowerCase(str.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String str = "m@a#d$a%m";

        if (isPalindrome(str)) {
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Is not Palindrome");
        }
    }
}




















