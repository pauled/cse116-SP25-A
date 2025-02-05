package week3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class TestCode {
    @Test
    public void testAddPositives(){
        assertEquals(CodeToTest.add(1,2),3);
        int result=CodeToTest.add(10,5);
        assertEquals(result,15);
        assertTrue(CodeToTest.add(7,7)==14);
        assertEquals("expected "+4.5,4.5,4.500001,.001);
    }
    @Test
    public void testAddZero(){
        assertTrue(CodeToTest.add(0,7)==7);
        assertTrue(CodeToTest.add(9,0)==9);
        assertTrue(CodeToTest.add(0,0)==0);
    }
    @Test
    public void testAddNegatives(){
        ArrayList<ArrayList<Integer>> data=new ArrayList<>();
        data.add(new ArrayList<>(Arrays.asList(-11,2,-9)));
        data.add(new ArrayList<>(Arrays.asList(-4,9,5)));
        for (ArrayList<Integer> arr : data){
            int result=CodeToTest.add(arr.get(0),arr.get(1));
            int out=arr.get(2);
            assertEquals("Expected "+arr.get(2)+" on inputs "+arr.get(0)+","+arr.get(1)+" but got: "+result,result,out);
        }
        int result=CodeToTest.add(-11,2);
        assertEquals("Expected -9 on inputs -11,2 but got: "+result,result,-9);
        assertTrue(CodeToTest.add(-4,9)==5);
        assertTrue(CodeToTest.add(-5,5)==0);
        assertTrue(CodeToTest.add(1,-9)==-8);
        assertTrue(CodeToTest.add(12,-3)==9);
        assertTrue(CodeToTest.add(6,-6)==0);
        assertTrue(CodeToTest.add(-3,-2)==-5);
        assertTrue(CodeToTest.add(-1,-12)==-13);
        assertTrue(CodeToTest.add(-6,-6)==-12);
    }
}
