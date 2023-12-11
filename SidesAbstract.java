abstract class Shape{
    abstract void numberOfSides();
}
class Rectangle extends Shape{
    void numberOfSides(){
        System.out.println("No.of Sides rectangle : 4");
    }
}
class Triangle extends Shape{
    void numberOfSides(){
        System.out.println("No.of Sides Triangle : 3");
    }
}
class Hexagon extends Shape{
    void numberOfSides(){
        System.out.println("No.of Sides Hexagon : 6");
    }
}
public class Sides {
    public static void main(String[] args) {
        Hexagon h=new Hexagon();
        Triangle t=new Triangle();
        Rectangle r=new Rectangle();
        h.numberOfSides();
        r.numberOfSides();
        t.numberOfSides();
    }
}
