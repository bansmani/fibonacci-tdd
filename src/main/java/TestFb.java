import java.util.stream.IntStream;

public class TestFb {

    public int[] getFib(Integer count) {
        return IntStream.range(0, count).map(this::fib).toArray();
    }

    private int fib(int num) {
        return num;
    }


}

