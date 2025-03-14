import java.util.Scanner;

//Print 2D Array
//You are given 2D Array arr of size N x M, print the elements of it.
//
//        Input Format
//First line contains 2 space separated integers N and M, representing number of rows and columns respectively.
//
//Next N lines contains M space separated integers representing elements of the array arr.
//
//Output Format
//Elements of the array in N lines, where each line has M space separated integers.
//
//Example 1
//Input
//
//2 3
//        1 2 3
//        4 5 6
//Output
//
//  1 2 3
//  4 5 6

class Solution1 {
    public void printElements(int[][] arr , int n  , int m) {
        //Write your code here
        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                System.out.print(arr[r][c]+ " ");
            }
            System.out.println(" ");
        }
    }
}
public class Print2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();
        Solution1 Obj = new Solution1();
        Obj.printElements(arr , n , m);
        sc.close();
    }
}
