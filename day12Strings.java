/*import java.util.*;
public class day12Strings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String firstname = sc.nextLine();
        String lastname = sc.nextLine();
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);
        System.out.println(fullname.length());
        System.out.println(fullname.charAt(0));
        System.out.println(fullname.toUpperCase());
        System.out.println(fullname.toLowerCase());

     //Compare two strings.

    String name1 = "Tony";
        String name2 = "Tony";

        if(name1.equals(name2)){
            System.out.println("They are the same string");
        } else{
            System.out.println("They are different strings");
        }
        //DO NOT USE == to check for string equality
        //Gives correct answer here
        if(name1 == name2){
            System.out.println("They are the same string");
        }else{
            System.out.println("They are different strings");
        }
        //Gives incorrect answer here
        if(new String("Tony") == new String("Tony")){
            System.out.println("They are the same string");
        }else{
            System.out.println("They are different strings");
        }

     //Substring: The substring of a string is a subpart of it.

        String name = "Aditya Dwivedi";
        System.out.println(name.substring(0,4));

     //ParseInt Method of Integer class.

        int number = 123;
     //   String str = Integer.toString(number);
     //   System.out.println(str.length());

     //ToString Method of String class.

     //   String str = "123";
     //   int number = Integer.parseInt(str);
        System.out.println(number);

     // Que:Take an array of Strings input from the user and fin the comulative(combined) length of those strings.

     int size = sc.nextInt();
        String array[] = new String[size];
        int totLength = 0;
        for(int i=0;i<size;i++){
            array[i] = sc.nextLine();
            totLength += array[i].length();
        }
        System.out.println(totLength);

     // Que:Input a string from a user .Create a new string called 'result' in which you will replace the letter 'e' in the original string with letter 'i'.

    String str =  sc.next();
        String result = " ";
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'e'){
                result += 'i';
            }else{
                result += str.charAt(i);
            }
        }
        System.out.println(result);

     // Que:Input an email from the user. You have to create a username from the email by deleting the part that comes after '@'.Display that username to the user. 
        
        String email = sc.next();
        String userName = " ";
        for(int i=0; i<email.length();i++){
            if (email.charAt(i) == '@'){
                break;
            }else{
                userName += email.charAt(i);
            }
        }
        System.out.println(userName);
    }
}*/
 