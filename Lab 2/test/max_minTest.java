import junit.framework.TestCase;
import org.junit.Test;

public class max_minTest extends TestCase {
    @Test
    public void test_find_max_min(){
        max_min m1 = new max_min();
        int [] arr = {1,5,8,4,3,2};
        assertEquals(8,m1.find_max_min("Max",arr));
    }

    public void test_find_max_min2(){
        max_min m1 = new max_min();
        int [] arr = {3,2,9,7,3,2};
        assertEquals(2,m1.find_max_min("Min",arr));
    }
}