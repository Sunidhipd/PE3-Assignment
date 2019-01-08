import java.util.Scanner;

public class ChessBoardPatternPrint {
    public static void main(String args[]){
    printChessBoard();

}
    public static void printChessBoard(){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++) {
                if (i % 2 == 0) {
                    System.out.print("WW|");
                    System.out.print("BB|");
                } else if (i % 2 != 0) {
                    System.out.print("BB|");
                    System.out.print("WW|");

                }
            }
            System.out.println();
        }
    }

}
