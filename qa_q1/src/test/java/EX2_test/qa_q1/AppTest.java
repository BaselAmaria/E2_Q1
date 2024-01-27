package EX2_test.qa_q1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
  
    @Test
    public void F_Min_test() {
    	String expected = "F";
    	String result = App.GradesTest(1);
    	assertEquals(expected, result);
    }
    
    @Test
    public void F_Min_Plus_1_test() {
    	String expected = "F";
    	String result = App.GradesTest(2);
    	assertEquals(expected, result);
    }
}
