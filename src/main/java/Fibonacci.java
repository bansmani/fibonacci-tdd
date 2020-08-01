import java.util.stream.IntStream;

public class Fibonacci {

    public int[] getFibonacciSeries(Integer count) {
        if(count==0) return new int[]{count};
        return IntStream.range(0, count).map(this::fib).toArray();
    }

    private int fib(int num) {
        return num;
    }


}

