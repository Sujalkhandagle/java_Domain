import java.util.Arrays;
import java.util.List;

public class Sample1 {
    public static void main(String[] args) {
        // List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
        // list.stream().map(n->n*n).forEach(n->System.out.print(n+" "));

        // List<String> list1=Arrays.asList("sujal","Govind","Nakul","Arayan");
        // list1.stream().map(name->name.concat(" ER")).forEach(System.out::println);

        //map
        // List<Integer> list=Arrays.asList(1,2,4,3,2,1,2,3,3,5,4,3,3,1,2,3,4);
		// List<Integer> unique=list.stream()
		// 						 .filter(n->n%2==0)
		// 						 .map(n->n*n)
		// 						 .distinct()
		// 						 .toList();
		// System.out.println(unique);

		// List<Integer> list2=Arrays.asList(1,2,4,3,2,1,2,3,3,5,4,3,3,1,2,3,4);
		// list2.stream()
		//     .distinct()
		//     .sorted((a,b)->b-a)
		//     .forEach(n->System.out.printf(n+" "));

		// List<String> names=Arrays.asList("Shital","Anish","Gauri","Aruna","Madhav","Payal");
		// names.stream()
		//      .sorted((a,b)->b.length()-a.length())
		//      .forEach(System.out::println);

        //flat map
        List<List<Integer>> matrix=Arrays.asList(Arrays.asList(1,2,3),
                                                  Arrays.asList(4,5,6),
                                                   Arrays.asList(7,8,9));
                                                   System.out.println(matrix);
                                                matrix.stream().flatMap(val->val.stream())
                                                .limit(4).skip(2)
                                                .forEach(System.out::println);  
                                                
        
        //peek
        List<String> names=Arrays.asList("Shital","Anish","Gauri","Aruna","Madhav","Payal");
		List<String> startswithA=names.stream()
		     .filter(name->name.startsWith("A"))
		     .peek(n->System.out.println("Selected := "+n))
		     .toList();                                        
	
 

    }
}
