package week3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class TestPlusMinus {
    @Test
    public void testLetter() {
        HashMap<Integer,String> tests=new HashMap<>();
        tests.put(100,"A");
        tests.put(99,"A");
        tests.put(98,"A");
        tests.put(97,"A");
        tests.put(96,"A");
        tests.put(95,"A");
        tests.put(94,"A");
        tests.put(93,"A");
        tests.put(92,"A");
        tests.put(91,"A");
        tests.put(90,"A");
        tests.put(81,"B");
        tests.put(-5,"F");

        for (int score : tests.keySet()) {
            String expected=tests.get(score);
            String actual=PlusMinus.letter(score);
            assertEquals( "letter("+score+"): ", expected, actual);
        }
    }
}
