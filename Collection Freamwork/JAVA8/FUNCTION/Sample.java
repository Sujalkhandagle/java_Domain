import java.util.function.Function;

public class Sample {
    public static void main(String[] args) {
        Function<Integer,Integer> sqare=n->n*n;
        System.out.println(sqare.apply(5));

        Function<Integer,Integer> cube=n->n*n*n;
        System.out.println(cube.apply(9));

        Function<String,String> upper=str->str.toUpperCase();
        System.out.println(upper.apply("sujal"));

        String str="sujal";  
        Function<String,String> fullname=st->st.concat(" khandagale");
        System.out.println(fullname.apply(str)); 

        Function<Integer,Integer> dob=n->n*2;
        Function<Integer,Integer> add10=n->n+10;
        Function<Integer,Integer> res=dob.andThen(add10);
        System.out.println(res.apply(40));
        }
}
