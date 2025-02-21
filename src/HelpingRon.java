
import java.util.*;
//Helping Ron
//        In Hogwarts, a new subject, advanced matrix has been introduced. Hermione being Hermione finds no difficulty in acing it, but Ron is struggling a lot. In order to help him, she decided to make a program that could take two matrices and give their sum. But she isn't able to find time to make it because of her extra subjects. Help Hermione to make the program.
//
//Input Format
//The first line contains an integer R and C denoting the dimensions of the matrix A and B.
//
//The following R lines containing C integers each denote the element of the first matrix, matrix A.
//
//The following R lines containing C integers each denote the element of the second matrix, matrix B.
//
//Output Format
//Print R lines containing C integers each, denoting the sum of matrix A and B.
//
//Example 1
//Input
//
// 2 2
//         1 2
//         3 4
//         4 3
//         2 1
//Output
//
//5 5
//        5 5

class Solution {
    static void matrixAdd(int A[][], int B[][],int R, int C)
    {
        //Write code here and print the matrix
        int sum[][]= new int[R][C];

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                sum[i][j]= A[i][j]+B[i][j];
            }
        }

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.print(sum[i][j] +" ");
            }
            System.out.println();
        }

    }
}
public class HelpingRon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R= sc.nextInt();
        int C= sc.nextInt();
        int A[][] = new int[R][C];
        int B[][] = new int[R][C];

        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++)
                A[i][j]= sc.nextInt();
        }

        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++)
                B[i][j]= sc.nextInt();
        }

        Solution Obj = new Solution();
        Obj.matrixAdd(A,B,R,C);
    }
}
