/*class Pen{
    String colour;
    String type;
    public void write(){
        System.out.println("Writing something");
    }
    public void printColour(){
        System.out.println(this.colour);
    }
}
public class  day25Oops{
    public static void main (String args[]){
        Pen pen1 = new Pen();
        pen1.colour = "Blue";
        pen1.type = "gel";
        pen1.write();
        Pen pen2 = new Pen();
        pen2.colour = "Blue";
        pen2.type = "gel";
        pen1.printColour();
        pen2.printColour();
    }

}



class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //PARAMETERISED CONSTRUCTOR
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class day25Oops {
    public static void main (String args[]){
       Student s1 = new Student("Aditya",18);
       s1.printInfo();
    }
}



class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //COPY CONSTRUCTOR
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
        //Manually defined constructor
    }Student(){
        
    }
}
public class day25Oops {
    public static void main (String args[]){
       Student s1 = new Student();
       s1.name = "Aditya Dwivedi";
       s1.age = 18;

       Student s2 = new Student(s1);
       s1.printInfo();
    }
}*/
