package week3;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class TestAdd {
    @Test
    public void testAddPositive() {
        ArrayList<ArrayList<Integer>> data = new ArrayList<>();
        data.add(new ArrayList<>(Arrays.asList(1, 3, 4)));
        data.add(new ArrayList<>(Arrays.asList(5, 5, 10)));
        data.add(new ArrayList<>(Arrays.asList(12, 9, 21)));
        for (ArrayList<Integer> arr : data) {
            int a = arr.get(0);
            int b = arr.get(1);
            int expected = arr.get(2);
            int actual = FirstRecursion.add(a, b);
            assertEquals("add(" + a + "," + b + "),", expected, actual);
        }
    }
    @Test
    public void testAddZero() {
        ArrayList<ArrayList<Integer>> data = new ArrayList<>();
        data.add(new ArrayList<>(Arrays.asList(0, 3, 3)));
        data.add(new ArrayList<>(Arrays.asList(5, 0, 5)));
        data.add(new ArrayList<>(Arrays.asList(0, 0, 0)));
        for (ArrayList<Integer> arr : data) {
            int a = arr.get(0);
            int b = arr.get(1);
            int expected = arr.get(2);
            int actual = FirstRecursion.add(a, b);
            assertEquals("add(" + a + "," + b + "),", expected, actual);
        }
    }
    @Test
    public void testAddNegatives() {
        ArrayList<ArrayList<Integer>> data = new ArrayList<>();
        data.add(new ArrayList<>(Arrays.asList(-1, -3, -4)));
        data.add(new ArrayList<>(Arrays.asList(-5, -5, -10)));
        data.add(new ArrayList<>(Arrays.asList(-12, 9, -3)));
        data.add(new ArrayList<>(Arrays.asList(-1, 3, 2)));
        data.add(new ArrayList<>(Arrays.asList(5, -7, -2)));
        data.add(new ArrayList<>(Arrays.asList(12, -9, 3)));
        data.add(new ArrayList<>(Arrays.asList(-1, 1, 0)));
        for (ArrayList<Integer> arr : data) {
            int a = arr.get(0);
            int b = arr.get(1);
            int expected = arr.get(2);
            int actual = FirstRecursion.add(a, b);
            assertEquals("add(" + a + "," + b + "),", expected, actual);
        }
    }
}
