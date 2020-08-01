

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
    public void WhenSuppliedZeroItShouldRetrunZero() {
        Fibonacci fib = new Fibonacci();
        int[] output = fib.getFibonacciSeries(0);
        System.out.println(output);
        Assert.assertEquals(1, output.length);
    }

}
