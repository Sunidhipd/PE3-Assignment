import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class RemoveVowelsFromPlaceArrayTest {
    private static RemoveVowelsFromPlaceArray rem;

    @BeforeClass
    public static void setup(){
        rem= new RemoveVowelsFromPlaceArray();
    }

    @AfterClass
    public static void teardown(){
        rem=null;
    }

    @Test
    public void vowelsRemovedSuccess() {
        List<String> s=asList("Spn","Brzl","Ind");
        List<String> res=rem.VowelsRemoved(s);
        assertEquals(s,res);
    }



}