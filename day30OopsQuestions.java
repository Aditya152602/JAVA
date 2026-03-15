/*class Employee{
    int salary;
        String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){

    }
}
public class day30OopsQuestions {
    public static void main(String args[]){
    Employee aditya = new Employee();
    aditya.setName("Aditya Dwivedi");
    aditya.salary = 230;
    System.out.println(aditya.getName());
    System.out.println(aditya.getSalary());
    }
}
class Smartphone{
    public void ringing(){
        System.out.println("The smartphone is ringing.");
    }
    public void vibrating(){
        System.out.println("The smartphone is vibrating");
    } 
    public void callFriend(){
        System.out.println("Saket was calling");
    }
}    public class day30OopsQuestions {
        public static void main (String args[]){
            Smartphone apple = new Smartphone();
            apple.callFriend();
            apple.vibrating();
            apple.ringing();
        }
    }


class Square{
    int side ;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}   public class day30OopsQuestions{
    public static void main(String args[]){
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}


class Tommy{
    public void hitting(){
        System.out.println("Hitting the Enemies");
    }
    public void firing(){
        System.out.println("Firing on the enemies");
    }
    public void running(){
        System.out.println("Running away from enemies");
    }
}
public class day30OopsQuestions{
    public static void main (String args[]){
        Tommy t = new Tommy();
        t.firing();
        t.hitting();
        t.running();
    }
}

    class Cylinder {
    private int radius ;
    private int height ;
    public int getRadius(){
        return radius ;
    }
    public int setRadius(int radius){
        this.radius=radius;
        return 1;
    }
    public double surfaceArea(){
        return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height=height;
    }
}
public class day30OopsQuestions{
    public static void main(String args[]){
        Cylinder c = new Cylinder();
        c.setHeight(12);
        int h=c.getHeight();
        System.out.println(h);
        c.setRadius(9);
        System.out.println(c.getRadius());
        System.out.println(c.surfaceArea());
        System.out.println(c.volume());
    }

}

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
    public class day30OopsQuestions{
        public static void main (String[] args){
            Rectangle r = new Rectangle();
            System.out.println(r.getLength());
            System.out.println(r.getBreadth());
        }
    }
class Circle{
    public int radius;
    Circle(){
        System.out.println("I am non parameterised constructor");
    }
    Circle(int r){
        System.out.println("I am parameterised constructor");
        this.radius=r;
    }
    public double area (){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    public int height;
    Cylinder(int r, int h){
        super(r);
        System.out.println("I am cylinder parameterised constructor");
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.height;
    }
}
public class day30OopsQuestions{
    public static void main(String args[]){
        Circle objCircle = new Circle(12);
        Cylinder objCylinder = new Cylinder(12, 4);
    }
}*/