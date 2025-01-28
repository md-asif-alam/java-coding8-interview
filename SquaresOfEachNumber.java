import java.util.Arrays;
import java.util.List;

public class SquaresOfEachNumber {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);

        List<Integer> squareList = list.stream().map(e -> e * e).toList();

        System.out.println(squareList);

    }
}
