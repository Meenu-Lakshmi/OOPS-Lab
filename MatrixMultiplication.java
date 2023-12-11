public class MatrixMultiplication {
    public static void main(String[] args) {
        int m1[][]={{1,2},{3,4}};
        int m2[][]={{1,2},{3,4}};
        int m3[][]=new int[2][2];
        for(int i=0;i<=1;i++){
            for(int j=0;j<=1;j++){
                for(int k=0;k<=1;k++){
                    m3[i][j]+=m1[i][k]*m2[k][j];
                }
            }
        }
         for(int i=0;i<=1;i++){
            for(int j=0;j<=1;j++){
                System.out.printf("%d ",m3[i][j]);
            }
            System.out.println();
        }
    }
}
