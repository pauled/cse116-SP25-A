package week6;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SimpleMathTests {
    @Test
    public void TestMultiply(){
        ArrayList<MultiplyTestCase> tests=new ArrayList<>(
                Arrays.asList(
                        new MultiplyTestCase(1,1,1),
                        new MultiplyTestCase(10,5,50),
                        new MultiplyTestCase(10,10,100),
                        new MultiplyTestCase(3,6,18),
                        new MultiplyTestCase(-6,-6,36),
                        new MultiplyTestCase(-4,-10,40),
                        new MultiplyTestCase(-9,-5,45),
                        new MultiplyTestCase(-1,10,-10),
                        new MultiplyTestCase(7,-6,-42),
                        new MultiplyTestCase(0,10,0),
                        new MultiplyTestCase(-9,0,0)
                )
        );

        for (MultiplyTestCase test: tests){
            int inputOne=test.getInputOne();
            int inputTwo=test.getInputTwo();
            int expected=test.getExpectedOutput();
            int actual=SimpleMath.multiplyInt(inputOne,inputTwo);
            System.out.println("one: "+inputOne+" input two: "+inputTwo);
            assertEquals(expected,actual);
        }
    }
}
