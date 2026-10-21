import java.util.Arrays;
import java.util.List;
//Method refersence call by class and in which function
class Mathutil{
    static void sqare(int n){
        System.out.println(n*n);
    }
}
public class Sampl1 {
    public static void main(String[] args) {
        //Method refersence call by class and in which function
        List<Integer> list=Arrays.asList(2,3,4,5,6);
        list.forEach(Mathutil::sqare);
    }
}
