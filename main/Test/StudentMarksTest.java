import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    private static StudentMarks mar;

    @BeforeClass
    public static void setup(){
        mar= new StudentMarks();
    }

    @AfterClass
    public static void teardown(){
        mar=null;
    }

    @Test
    public void checkGradesFailureTest() {
        int[] ar={1,2,3,4,8};
        assertEquals(false,mar.CheckGrades(0,ar));
    }

    @Test
    public void checkGradesSuccessTest(){
        int[] ar={1,2,3,4,8};
        assertEquals(true,mar.CheckGrades(5,ar));
    }
}