

import org.junit.Assert;
import org.junit.Test;

public class TestFiboncci {


    @Test
    public void fibonacci_should_return_list_of_Integers_Count_as_requested() {
        Fibonacci fib = new Fibonacci();
        int[] output = fib.getFibonacciSeries(10);
        System.out.println(output);
        Assert.assertEquals(10, output.length);
    }

    @Test
    public void WhenSuppliedZeroItShouldRetrunZeroElement() {
        Fibonacci fib = new Fibonacci();
        int[] output = fib.getFibonacciSeries(0);
        Assert.assertEquals(0, output.length);
    }

    @Test
    public void WhenSuppliedOne_ItShouldRetrun_OneElement_WithZeroValue() {
        Fibonacci fib = new Fibonacci();
        int[] output = fib.getFibonacciSeries(1);
        Assert.assertEquals(1, output.length);
        Assert.assertArrayEquals(new int[]{0}, output);
    }

    @Test
    public void WhenSuppliedTwo_ItShouldRetrun_TwoElement_WithOneAandZero() {
        Fibonacci fib = new Fibonacci();
        int[] output = fib.getFibonacciSeries(2);
        Assert.assertEquals(2, output.length);
        Assert.assertArrayEquals(new int[]{0, 1}, output);
    }


    @Test
    public void WhenSuppliedMoreThanTwo_ItShouldRetrun_FibonacciSeries() {
        Fibonacci fib = new Fibonacci();

        int[] output = fib.getFibonacciSeries(3);
        Assert.assertEquals(3, output.length);
        Assert.assertArrayEquals(new int[]{0, 1, 1}, output);


    }


}
