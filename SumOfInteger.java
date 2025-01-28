import java.util.Arrays;
import java.util.List;

public class SumOfInteger {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(10,20,30,40,50);

        Integer sum = list.stream().reduce((a, b) -> a + b).get();

        System.out.println(sum);


    }
}
