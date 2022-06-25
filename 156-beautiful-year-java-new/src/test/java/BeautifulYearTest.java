import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author kunduin
 */
public class BeautifulYearTest {

    @Test
    public void test1() {
        assertEquals(2013, BeautifulYear.getYear(1987));
    }

    @Test
    public void test2() {
        assertEquals(2301, BeautifulYear.getYear(2200));
    }

    @Test
    public void test3() {
        assertEquals(2031, BeautifulYear.getYear(2019));
    }

    @Test
    public void test4() {
        assertEquals(9012, BeautifulYear.getYear(9000));
    }

    @Test
    public void test5() {
        assertEquals(1023, BeautifulYear.getYear(1000));
    }
}
