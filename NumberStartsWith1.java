import java.util.Arrays;
import java.util.List;

public class NumberStartsWith1 {
    public static void main(String[] args) {

        //For input as a list
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);

        myList.stream().map(num->num+"")
                .filter(num->num.startsWith("1"))
                .forEach(System.out::println);

        System.out.println("----------------------------------------------------");

        //For input as a array

        int[] arr = {10,15,8,49,25,98,32};

        Arrays.stream(arr).mapToObj(num->num+"").filter(num->num.startsWith("1"))
                .forEach(System.out::println);


    }
}
