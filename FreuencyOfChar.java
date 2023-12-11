import java.util.Scanner;
public class FrequencyofChar {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter string : ");
        String str= ob.nextLine();
        Scanner ob1=new Scanner(System.in);
        System.out.println("enter char : ");
        char c=ob1.next().charAt(0);
        int i=0,count=0,n;
        n=str.length()-1;
        for(i=0;i<=n;i++){
           if(c==str.charAt(i)){
            count++;
           }
        }
        System.out.println("Frequency of Char "+c+" is "+count);
        ob.close();
        ob1.close();
    }
}
