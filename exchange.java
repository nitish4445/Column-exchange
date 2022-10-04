import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class exchange {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[][] matrix=new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            matrix[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<n;i++){
        int tem=matrix[i][0];
        matrix[i][0]=matrix[i][m-1];
        matrix[i][m-1]=tem;
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
    }
}