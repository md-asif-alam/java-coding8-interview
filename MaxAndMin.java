import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,23,32,11,34,21,55,87,20,65);

        //for Maximum number
        Optional<Integer> max = list.stream().max(Comparator.comparing(Integer::valueOf));
        System.out.println(max.get());

        //For Minimum Number
        Optional<Integer> min = list.stream().min(Comparator.comparing(Integer::valueOf));
        System.out.println(min.get());

    }
}
