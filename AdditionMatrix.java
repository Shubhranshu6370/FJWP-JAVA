package array;
import java.util.Scanner;

public class AdditionMatrix { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        // Initialize the matrices
        Integer[][] matrix1 = new Integer[rows][columns];
        Integer[][] matrix2 = new Integer[rows][columns];

        System.out.println("Enter the elements of the first matrix:");
        initializeMatrix(matrix1, sc);

        System.out.println("Enter the elements of the second matrix:");
        initializeMatrix(matrix2, sc);

        // Perform  addition of matrix
        Integer[][] resultMatrix = addMatrices(matrix1, matrix2);

        // Display the result
        System.out.println("Resulting Matrix after addition:");
        displayMatrix(resultMatrix);

        sc.close();
    }

    // Initialize a matrix with user input
    public static void initializeMatrix(Integer[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Perform addition of two matrices
    public static Integer[][] addMatrices(Integer[][] matrix1, Integer[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;

        Integer[][] resultMatrix = new Integer[rows][columns];

        //using for loop 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    // Display the matrix
    public static void displayMatrix(Integer[][] matrix) {
        for (Integer[] row : matrix) {
            for (Integer element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

//---------------------OUTPUT-------------------
//Enter the number of rows: 3
//Enter the number of columns: 3
//Enter the elements of the first matrix:
//12
//23
//34
//44
//54
//67
//77
//73
//55
//Enter the elements of the second matrix:
//34
//77
//33
//78
//98
//90
//31
//42
//53
//Resulting Matrix after addition:
//46 100 67 
//122 152 157 
//108 115 108 