import java.util.Scanner;
public class Transpose {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r=ob.nextInt();
        System.out.println("Enter number of columns: ");
        int c=ob.nextInt();
        int m1[][]=new int[r][c];
        System.out.println("enter elements : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m1[i][j]=ob.nextInt();
            }
        }
        System.out.println("Matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.printf("%d ",m1[i][j]);
            }
            System.out.println();
        }
        System.out.println("Transpose: ");
        int m2[][]=new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m2[j][i]=m1[i][j];
            }
        }
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.printf("%d ",m2[i][j]);
            }
            System.out.println();
        }
        ob.close();
    }
    
}
