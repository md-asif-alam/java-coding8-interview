import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,10,10,20,20,20,30,30,40,50);

        list.stream().distinct().forEach(System.out::println);
    }
}
