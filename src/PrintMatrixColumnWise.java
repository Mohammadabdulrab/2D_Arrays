
import java.util.*;

//Print Matrix Column Wise
//Given a 2-D matrix A with N rows and M columns. Print the matrix in column-major order.
//
//Your task is to complete the function printMatrixColumnwise which receives the input matrix, N, and M as its parameters and prints the matrix in column major order.
//
//        Input Format
//The first line contains the number of test cases.
//
//For each test case: The first line contains two integers N and M denoting the number of rows and columns respectively.
//
//The next N lines contains M integers each denoting the elements of matrix A.
//
//Output Format
//For each test case print N*M space-separated integers, print the elements of the matrix column wise, in a single line.
//
//Example 1
//Input:
//
//        1
//        3 3
//        1 2 3
//        4 5 6
//        7 8 9
//Output:
//
//        1 4 7 2 5 8 3 6 9


class Solution2 {
    public void printMatrixColumnwise(int[][] a, int n, int m) {
        // Write code here and print output
        for(int c=0;c<m;c++){
            for(int r=0;r<n;r++){
                System.out.print(a[r][c] + " ");
            }
        }
    }
}
public class PrintMatrixColumnWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t > 0) {
            int n;
            int m;
            n = sc.nextInt();
            m = sc.nextInt();
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    matrix[i][j] = sc.nextInt();
            Solution2 Obj = new Solution2();
            Obj.printMatrixColumnwise(matrix, n, m);
            System.out.println();
            t--;
        }
        sc.close();
    }
}