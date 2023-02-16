import org.junit.Assert;
import org.junit.Test;

public class CombineStringsTest {
    Lab cs = new Lab();

    /**
     * The combination of strings abc and xyz should result in abcxyz.
     */
    @Test
    public void combineTest1(){
        Lab cs = new Lab();
        String input1 = "abc";
        String input2 = "xyz";
        String expected = "abcxyz";
        String actual = cs.combine(input1,input2);
        Assert.assertEquals(expected,actual);
        /**return a + b;**/
    }
    
    /**
     * The combination of strings 123 and 456 should result in 123456.
     */
    @Test
    public void combineTest2(){
        String input1 = Integer.toString(123); 
        String input2 =  Integer.toString(456);
        String expected = "123456";
        String actual = cs.combine( input1,input2);
        Assert.assertEquals(expected,actual);
        /*** return a + b;**/
        
    }
}
