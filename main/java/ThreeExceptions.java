import java.util.Scanner;

public class ThreeExceptions {
    public static void nullPointerException(){
        try{
            throw null;
        }catch (NullPointerException npe){
            System.out.println(npe);
        }

    }
    public static void negativeArraySizeException(){
        try{
            int ar[]=new int[-5];
        }
        catch (NegativeArraySizeException nae){
            System.out.println(nae);
        }

    }
    public static void indexOutOFBoundsException(){
        try{
            int a[]=new int[1];
            a[2]=3;
        }
         catch(IndexOutOfBoundsException e){
             System.out.println(e);

        }

    }

}
