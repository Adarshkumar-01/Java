/*A command line argument is a value or parameter provided to a program when it is launched from the command line 
or terminal. It's a way to pass input or configuration options to a program when it starts.
*/
package java_class;

import java.util.Scanner;

class TwoMatrix {
    public static void main(String[] args) {
        
        if (args.length != 1) {
            System.out.println("Please provide the size of matrix (N) as a command line argument.");
            return;
        }
        int n = Integer.parseInt(args[0]);
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] C = new int[n][n];
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of the A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of the B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("The sum of the two matrices is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}


