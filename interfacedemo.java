interface callback{
    void fnn(int a);
} 
class Cube implements callback{
    public void fnn(int a){
        System.out.println("Cube : "+(a*a*a));
    }
}
class Square implements callback{
    public void fnn(int a){
        System.out.println("Square : "+(a*a));
    }
}
public class DemoInterface {
    public static void main(String[] args) {
        callback s=new Square();
        callback c=new Cube();
        c.fnn(3);
        s.fnn(2);
    }
}
