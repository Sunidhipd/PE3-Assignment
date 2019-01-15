import java.util.*;

public class StudentMarks {
    
    public boolean CheckGrades(int numOfStudents,int[] stuGrades) {
            if(numOfStudents==0){
                return false;
            }
            else {
                for (int i = 0; i < numOfStudents; i++) {
                    if (stuGrades[i] < 0 && stuGrades[i] >= 100) {
                        return false;
                    }
                }
                return true;
            }
    }
}
