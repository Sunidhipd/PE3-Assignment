import java.util.Scanner;

public class MatrixAddition {
   
    public int[][] sum(int firstMatrix[][], int secondMatrix[][],int rows,int columns){
            int sumMatrix[][] = new int[rows][columns];
            for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                sumMatrix[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
            }
        }
        return sumMatrix;
    }
}
