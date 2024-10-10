/*Here's a breakdown of how the spiralPrint method works:

1-->It initializes four variables: top, bottom, left, and right, which represent the boundaries of the matrix.
2-->It enters a while loop that continues until top is greater than bottom or left is greater than right.
3-->Inside the loop, it prints the elements of the top row from left to right, increments top, and then prints
 the elements of the right column from top to bottom, decrements right.
4-->If top is still less than or equal to bottom, it prints the elements of the bottom row from right to left,
 decrements bottom, and then prints the elements of the left column from bottom to top, increments left.
5-->The loop repeats until all elements of the matrix have been printed.
6-->In the main method, you've created a 2D matrix with 4 rows and 6 columns, and called the spiralPrint method
 to print the matrix in a spiral order.
*/


public class Spiral {
    public static void spiralPrint(int m, int n, int[][] a) {
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <=right; ++i) {                 /*i<=right kynoki right =n-1 that is length-1.
                                                                 so i<=right will give access upto last element.
                                                                 */ 
                System.out.print(a[left][i] + " ");
            }
            top++;
            for (int i = top; i <=bottom; ++i) {
                System.out.print(a[i][right] + " ");
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; --i) {
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; --i) {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4,5,6},
            {7,8,9,10,11,12}
        };
        spiralPrint(matrix.length, matrix[0].length, matrix);
    }
}
