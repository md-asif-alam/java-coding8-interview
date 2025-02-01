import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeMaxAndThreeMin {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(10,20,30,40,50,43,67,23,54);

        //Three Minimum numbers
        list.stream().sorted().limit(3).forEach(System.out::println);

        System.out.println("========================================================");

        //Three Maximum numbers
        list.stream().sorted(Collections.reverseOrder()).limit(3).forEach(System.out::println);

    }
}
