import java.util.*;
import java.io.*;

class Solution4 {
    public int[][] matrixTranspose(int[][] a, int n) {
        //Write your code here
        int ans[][]= new int[n][n];
        for(int c=0;c<n;c++){
            for(int r=0;r<n;r++){
                ans[c][r]=a[r][c];
            }
        }
        return ans;
    }
}


public class matrixTranspose {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        Solution4 Obj = new Solution4();
        int[][] ans = Obj.matrixTranspose(matrix, n);
        for(int i=0; i<n; i++)
        {   for(int j=0; j<n; j++)
        {
            System.out.print(ans[i][j] + " ");
        } System.out.println("");
        }
        sc.close();
    }
}
