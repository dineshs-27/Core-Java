import java.util.Scanner;

public class matrixDigonalSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns for matrix: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        if (rows != cols) {
            System.out.println("Matrix needs to be square (equal number of rows and columns).");
            System.exit(0);
        }

        int[][] mat = new int[rows][cols];

        System.out.println("Enter the matrix elements: ");
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int diagonalSum = 0;
        for(int i=0; i<rows; i++){
            diagonalSum += mat[i][i];
            if(i != rows-1-i){
                diagonalSum += mat[i][rows-1-i];
            }
        }

        System.out.println("Diagonal Sum: " + diagonalSum);
        sc.close();
    }
}