class AreaOverloading {
    public double area(int r){
        double a=3.14*r*r;
        return a;
    }
    public double area(int l,int b){
        double a=b*l;
        return a;
    }
    public double area(int d,int b,int c){
        double s=d+b+c;
        double a=Math.sqrt(s*(s-d)*(s-b)*(s-c));
        return a;
    }
}
class Area{
    public static void main(String[] args) {
        AreaOverloading ob4=new AreaOverloading();
        double a1=ob4.area(4);
        double a2=ob4.area(2,4);
        double a3=ob4.area(3,4,5);
        System.out.println("Circle : "+a1);
        System.out.println("Rectangle : "+a2);
        System.out.println("Triangle : "+a3);
    }
}
