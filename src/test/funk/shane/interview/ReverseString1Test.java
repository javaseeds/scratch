package funk.shane.interview;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Shane on 2/8/2016.
 */
public class ReverseString1Test {

    private ReverseString1 rs1;

    @Before
    public void setup() {
        rs1 = new ReverseString1();
    }

    @Test
    public void testReverseMe_happyPathEvenLen() throws Exception {
        final String testEvenLen   = "Ab,c,de!";
        final String expectReverse = "ed,c,bA!";

        final String resultStr = rs1.reverseMe(testEvenLen);

        assertThat(resultStr, is(expectReverse));
    }

    @Test
    public void testReverseMe_happyPathOddLen() throws Exception {
        final String testOddLen    = "Ab,c,de!$";
        final String expectReverse = "ed,c,bA!$";

        final String resultStr = rs1.reverseMe(testOddLen);

        assertThat(resultStr, is(expectReverse));
    }

    @Test
    public void testReverseMe_noSpecialChars() throws Exception {
        final String testStr  = "AbcdeXyZ";
        final String expectedStr = new StringBuffer(testStr).reverse().toString();

        final String resultStr = rs1.reverseMe(testStr);

        assertThat(resultStr, is(expectedStr));
    }

    @Test
    public void testReverseMe_AllSpecialChars() throws Exception {
        final String testStr  = "!@#$%^";
        final String resultStr = rs1.reverseMe(testStr);

        assertThat(resultStr, is(testStr));
    }
}