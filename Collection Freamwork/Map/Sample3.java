
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Sample3 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(
            1, 2, 2, 2, 3, 4, 4, 3, 5, 5, 7, 7, 4, 1, 2
        );

        Map<Integer, Integer> frequency = new HashMap<>();

        for (Integer n : list) {
            frequency.put(n, frequency.getOrDefault(n, 0) + 1);
        }

        System.out.println(frequency);

        Map<String ,Integer> even_odd=new HashMap<String ,Integer>();
        for(Integer n:list){
            if(n%2==0)
                even_odd.put("even",even_odd.getOrDefault("even", 0)+1);
            else
                even_odd.put("odd",even_odd.getOrDefault("odd", 0)+1);
        }
        System.out.println(even_odd);

    }
}