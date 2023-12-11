import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter string : ");
        String str= ob.nextLine();
        String str2=" ";
        int i=0,j,n;
        n=str.length()-1;
        j=n;
        for(i=0;i<=n;i++){
            str2+=str.charAt(j--);
        }
        System.out.println("Revrsed string : "+str2);
        ob.close();
    }
}
