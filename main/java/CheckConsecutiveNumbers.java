import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CheckConsecutiveNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Integer numberArray[]=new Integer[7];
        int n;
        for(int i=0;i<7;i++) {
            n = sc.nextInt();
            numberArray[i]=n;
        }
        boolean res=CheckConsecutive(numberArray);
        if(res==true)
        System.out.println("consecutive");
        else
            System.out.println("Not consecutive");
    }

    public static boolean CheckConsecutive(Integer numberArray[]) {
        String res = "";
        int min = Collections.min(Arrays.asList(numberArray));
        int max = Collections.max(Arrays.asList(numberArray));
        boolean visited[] = new boolean[7];
        if (max - min + 1 == 7) {
            for (int i = 0; i < 7; i++) {
                if (visited[numberArray[i] - min] != false) {
                    return false;
                }
                visited[numberArray[i] - min] = true;
            }
            return true;
        }
        return false;
    }

}
