import java.util.*;

public class StudentMarks {
    public static void main(String args[]) {
        System.out.print("Input the number of Students: ");
        int numOfStudents;
        int marks;
        Scanner sc = new Scanner(System.in);
        numOfStudents = sc.nextInt();
        Scanner scan = new Scanner(System.in);
        int stuGrades[] = new int[numOfStudents];
        for (int i = 0; i < numOfStudents; i++) {
            System.out.print("Enter marks for Student with roll number " + (i + 1) + ": ");
            marks = sc.nextInt();
            stuGrades[i] = marks;
        }
            boolean check = CheckGrades(numOfStudents,stuGrades);
            if (check == false) System.out.println("ERROR! INVALID INPUT");
            else System.out.println("All good");
    }

    public static boolean CheckGrades(int numOfStudents,int[] stuGrades) {

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
