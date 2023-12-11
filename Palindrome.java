import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter string : ");
        String str= ob.nextLine();
        int i=0,flag=0,j,n;
        n=str.length()-1;
        j=n;
        for(i=0;i<=n;i++){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("Not palindrome");
                flag=1;
                break;
            }
            j--;
        }
        if(flag==0){
            System.out.println("Palindrome");
        }
        ob.close();
    }
}
