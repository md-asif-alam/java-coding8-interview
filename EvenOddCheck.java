import java.util.Arrays;
import java.util.List;

public class EvenOddCheck {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,10,20,24,11,19,78,65);

        //For even number
        list.stream().filter(e->e%2==0).forEach(System.out::println);

        System.out.println("==============================================");

        //For odd number
        list.stream().filter(e->e%2!=0).forEach(System.out::println);

         }
}
