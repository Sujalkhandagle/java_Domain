import java.util.Arrays;
import java.util.List;
import java.util.Set;

import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Sample2 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6);
         Object[] arr=(Object[])list.stream().filter(n->n>3).toArray();
         
        
        int min=list.stream().min(Integer::compareTo).orElse(0);
        System.out.println("minimum value := "+min);
        Optional<Integer> max=list.stream().max(Integer::compareTo);
        System.out.println("maximum value :="+max.get());

       List<Integer> list1 = Arrays.asList(1, 4, 2, 5, 6, 5, 3, 4, 2);

        Set<Integer> set = list1.stream()
                                .collect(Collectors.toSet());

        System.out.println(set);

        List<String> lits3=Arrays.asList("amit","vishal","shirol");
        String result=lits3.stream().collect(Collectors.joining(", "));
        System.out.println(result);

       List<Integer> list4 = Arrays.asList(1,2,3,4,5);
       int sum=list4.stream().reduce(0,(a,b)->a+b);
       System.out.println(sum);

       List<Integer> list5 = Arrays.asList(1,2,3,4,5);
       int fact=list5.stream().reduce(1,(a,b)->a*b);
       System.out.println(fact);

       List<Integer> list6 = Arrays.asList(1,2,3,4,5);
       Long summ=list6.stream().filter(n->n%2==0).count();
       System.out.println(summ);



       

       


    }
}
