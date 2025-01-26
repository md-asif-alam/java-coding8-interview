import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestAndSecondLowest {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,14,18,15,20,24,45,43,32,35,43);

        //SecondHighest number
        Integer secMax = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(secMax);

        //SecondLowest
        Integer secMin = list.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println(secMin);
    }
}
