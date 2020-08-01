import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Fibonacci {

    public int[] getFibonacciSeries(Integer count) {

        HashMap<Integer, Integer> map = new HashMap<>();
        return IntStream.range(0, count).map(i -> fib(i, map)).toArray();
    }

    private int fib(int num, Map<Integer, Integer> map) {
        if (num == 0 || num == 1) return num;
        Integer integer = map.get(num);
        if (integer != null) {
            return integer;
        }
        int output = fib(num - 1, map) + fib(num - 2, map);
        map.put(num, output);
        return output;
    }


}

