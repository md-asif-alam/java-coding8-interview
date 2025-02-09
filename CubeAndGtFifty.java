import java.util.Arrays;
import java.util.List;

public class CubeAndGtFifty {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8);

        myList.stream().map(e->e*e*e).filter(e->e>50).forEach(System.out::println);


    }
}
