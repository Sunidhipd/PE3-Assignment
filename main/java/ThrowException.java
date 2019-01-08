import java.util.Scanner;

public class ThrowException {
    public static void main(String args[]) {
        System.out.print("Input a number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        try{
            if(n>6){
                Exception obj=new Exception("Thrown Error");
                throw obj;
            }
        }catch (Exception e){
            System.out.println("Exception Caught");
        }
        finally {
            System.out.println("Finally block - Always Excecuted");
        }
    }
}
