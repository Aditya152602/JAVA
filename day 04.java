import java.util.Scanner;

class Main {
    public static void main(String[] args){
        
        try(Scanner scanner = new Scanner(System.in)){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum =a+b;
        System.out.println(sum);}


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Good Morning "  + name);
        System.out.println(name +", Also tell me your age : ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println(" Your age is :"+age);
        

    }

     
}  
