import junit.framework.TestCase;
import org.junit.Test;

public class check_even_oddTest extends TestCase {
    @Test
    public void test_check(){
        check_even_odd digit = new check_even_odd();
        assertEquals(0, digit.check(0));
    }
    public void test_check2(){
        check_even_odd digit = new check_even_odd();
        assertEquals(0, digit.check(2));
    }
    public void test_check3(){
        check_even_odd digit = new check_even_odd();
        assertEquals(1, digit.check(5));
    }

}