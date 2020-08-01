import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

public class TestFiboncci {


    @Test
    public void fibonacci_should_return_list_of_Integers_Count_as_requested() {
        int[] output = Fibonacci.getFibonacciSeries(10);
        Assert.assertEquals(10, output.length);
    }

    @Test
    public void WhenSuppliedZeroItShouldRetrunZeroElement() {
        int[] output = Fibonacci.getFibonacciSeries(0);
        Assert.assertEquals(0, output.length);
    }

    @Test
    public void WhenSuppliedOne_ItShouldRetrun_OneElement_WithZeroValue() {
        int[] output = Fibonacci.getFibonacciSeries(1);
        Assert.assertEquals(1, output.length);
        Assert.assertArrayEquals(new int[]{0}, output);
    }

    @Test
    public void WhenSuppliedTwo_ItShouldRetrun_TwoElement_WithOneAandZero() {
        int[] output = Fibonacci.getFibonacciSeries(2);
        Assert.assertEquals(2, output.length);
        Assert.assertArrayEquals(new int[]{0, 1}, output);
    }


    @Test
    public void WhenSuppliedMoreThanTwo_ItShouldRetrun_FibonacciSeries() {

        int[] output = Fibonacci.getFibonacciSeries(3);
        Assert.assertEquals(3, output.length);
        Assert.assertArrayEquals(new int[]{0, 1, 1}, output);

        // adding some more asseertion with bigger value
        int[] output1 = Fibonacci.getFibonacciSeries(10);
        Assert.assertEquals(10, output1.length);
        Assert.assertArrayEquals(new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34}, output1);
    }


    @Test
    public void timecomplexity_shouldbe_linear() {
        long startTime = Calendar.getInstance().getTimeInMillis();
        //taking around 3 seconds with original
        Fibonacci.getFibonacciSeries(42);
        long endTime = Calendar.getInstance().getTimeInMillis();
        Assert.assertTrue(" actual time is : " + (endTime - startTime), endTime - startTime < 10);

    }

}
