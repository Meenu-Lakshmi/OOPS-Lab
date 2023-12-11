import java.util.Scanner;
public class SecondSmallest {
    public void sort(int a[],int n){
        int i,j,k;
        boolean swapped;
        for(i=0;i<=n-1;i++){
            swapped=false;
            for(j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    k=a[j+1];
                    a[j+1]=a[j];
                    a[j]=k;
                    swapped=true;
                }
            }
            if(swapped==false)
                break;
        }
        System.out.println("sorted array");
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[19];
        Scanner ob=new Scanner(System.in);
        System.out.println("Number of elmnts : ");
        int n=ob.nextInt();
        System.out.println("elements: ");
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        SecondSmallest ob1=new SecondSmallest();
        ob1.sort(arr,n);
        System.out.println("Second smallest Element is "+arr[1]);
        ob.close();
    }
}

