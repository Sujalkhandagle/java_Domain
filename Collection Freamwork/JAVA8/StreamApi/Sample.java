import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {
        // Stream<Integer> list=Arrays.asList(1,2,3,4,5,6,7).stream();
        // list.forEach(System.out::println);

        // List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
        // List<Integer> even=list.stream().filter(n->n%2==0).toList();
        // even.forEach(System.out::println);

        // List<String> list=Arrays.asList("sujal","Govind","Nakul","Arayan");
        // List<String> lent5=list.stream().filter(n->n.length()==5).toList();
        // lent5.forEach(System.out::println);

        List<String> list=Arrays.asList("sujal","Govind","Nakul","Arayan");
        List<String> starwithA=list.stream().filter(n->n.startsWith("s")).toList();
        starwithA.forEach(System.out::println);
        

    }
}
