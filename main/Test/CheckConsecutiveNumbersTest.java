import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckConsecutiveNumbersTest {
    private static CheckConsecutiveNumbers num;

    @BeforeClass
    public static void setup(){
        num= new CheckConsecutiveNumbers();
    }

    @AfterClass
    public static void teardown(){
        num=null;
    }

    @Test
    public void checkConsecutiveSuccess(){
        Integer ar[]={1,2,3,4,5,6,7};
        boolean res=num.CheckConsecutive(ar);
        assertEquals(true,res);
    }

    @Test
    public void checkConsecutiveFailure() {
        Integer ar[]={1,4,3,2,1,2,3};
        boolean res=num.CheckConsecutive(ar);
        assertEquals(false,res);
    }


}