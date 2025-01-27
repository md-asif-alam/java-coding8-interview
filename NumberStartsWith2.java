import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith2 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,2,22,32,11,25,289);

        List<Integer> numStartsWith2=list.stream().map(String::valueOf)
                .filter(e->e.startsWith("2"))
                .map(Integer::valueOf).collect(Collectors.toList());

        System.out.println(numStartsWith2);
    }
}
