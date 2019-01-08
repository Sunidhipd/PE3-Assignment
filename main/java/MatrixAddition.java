import java.util.Scanner;

public class MatrixAddition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows;
        int columns;
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        columns = sc.nextInt();

        int firstMatrix[][] = new int[rows][columns];
        int secondMatrix[][] = new int[rows][columns];

        System.out.print("Enter data for first matrix: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                firstMatrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter data for second matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                secondMatrix[i][j] = sc.nextInt();
            }
        }
        int sumMatrix[][] = new int[rows][columns];
        sumMatrix=sum(firstMatrix,secondMatrix,rows,columns);
        System.out.println("The sum matrix: ");

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(sumMatrix[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }

    public static int[][] sum(int firstMatrix[][], int secondMatrix[][],int rows,int columns){
            int sumMatrix[][] = new int[rows][columns];


            for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                sumMatrix[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
            }
        }

        return sumMatrix;

    }
}
