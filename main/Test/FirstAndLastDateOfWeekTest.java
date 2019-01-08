import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

public class FirstAndLastDateOfWeekTest {
    private static FirstAndLastDateOfWeek date;

    @BeforeClass
    public static void setup(){
        date= new FirstAndLastDateOfWeek();
    }

    @AfterClass
    public static void teardown(){
        date=null;
    }

    @Test
    public void findDate() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        String[] result = date.findDate(c);
        assertEquals(new String[]{"Mon 07/01/2019","Sun 13/01/2019"},result);
    }

    @Test
    public void DateOfWeekFailure(){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        String[] result = date.findDate(c);
        assertNotEquals(new String[]{"Tue 07/01/2019","Sun 13/01/2019"},result);
    }


    @Test
    public void DateOfWeekSuccess(){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        String[] result = date.findDate(c);
        assertEquals(new String[]{"Mon 07/01/2019","Sun 13/01/2019"},result);
    }


}