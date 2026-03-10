abstract class Animal{
    abstract void walk();
}
class Horse extends Animal{
    public void walk(){
        System.out.println("");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println(" ");
    }
}
public class day28Abstraction{
    public static void main(String args[]){
       Horse horse = new  Horse();
       horse.walk();
    }
}
