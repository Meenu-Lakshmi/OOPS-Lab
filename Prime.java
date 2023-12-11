import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner ob2=new Scanner(System.in);
        System.out.println("enter number : ");
        int n=ob2.nextInt();
        int flag=0;
        if(n==1){
            System.out.println("neither prime nor composite");
            flag=2;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Prime");
        }
        else if(flag==1){
            System.out.println("Not Prime");
        }
        ob2.close();
    }
}
