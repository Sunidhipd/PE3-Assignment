import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CheckConsecutiveNumbers {
    public boolean CheckConsecutive(Integer numberArray[]) {
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
