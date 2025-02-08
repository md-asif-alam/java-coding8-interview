import java.util.Arrays;
import java.util.List;

public class CountOfElems {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15,15,8);

        //Total count
        long count = myList.stream().count();
        System.out.println("Total Elements: "+count);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

        //find first
        myList.stream().findFirst().ifPresent(System.out::println);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");


        //Distinct Elements
        myList.stream().distinct().forEach(System.out::println);

    }
}
