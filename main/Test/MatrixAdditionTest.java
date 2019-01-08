import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    private static MatrixAddition mat;

    @BeforeClass
    public static void setup(){
        mat= new MatrixAddition();
    }

    @AfterClass
    public static void teardown(){
        mat=null;
    }

    @Test
    public void matrixSumTestSuccess() {
        int rows=3,columns=2;
        int firstMatrix[][] = {{1,2},{2,3},{3,4}};
        int secondMatrix[][] = {{1,2},{2,3},{3,4}};
        int res[][]=mat.sum(firstMatrix,secondMatrix,rows,columns);
        int expected[][]={{2,4},{4,6},{6,8}};
        assertEquals(expected,res);
    }
}