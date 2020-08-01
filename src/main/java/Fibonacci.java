import java.util.stream.IntStream;

public class Fibonacci {

    public int[] getFibonacciSeries(Integer count) {
//        if(count==0) return new int[]{};
//        if(count==1) return new int[]{0};
        return IntStream.range(0, count).map(this::fib).toArray();
    }

    private int fib(int num) {
        if(num==0 || num==1) return  num;
        return fib(num-1) + fib(num-2);
    }


}

