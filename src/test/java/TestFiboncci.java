

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestFiboncci {


    @Test
    public void fibonacci_should_return_list_of_Integers_Count_as_requested() {
        TestFb fib = new TestFb();
        int[] output = fib.getFib(10);
        System.out.println(output);
        Assert.assertEquals(10, output.length);
    }


}
