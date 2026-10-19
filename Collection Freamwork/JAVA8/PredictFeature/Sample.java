import java.net.Socket;
import java.util.function.Predicate;

public class Sample {
    public static void main(String[] args) {
        Predicate<Integer> even=n->n%2==0;
        System.out.println(even.test(14));

        Predicate<Integer> twodig=(n)->n>9 && n<100;
        System.out.println(twodig.test(13));

        String str="ragahv";
        Predicate<String> len5=s->s.length()==5;
        System.out.println(len5.test(str));

         str="Raman";
        Predicate<String> len4=s->s.length()==5;
        System.out.println(len4.test(str));

        str="Aman";    
        Predicate<String> starwithA=s->s.toUpperCase().startsWith("A");
        System.out.println(starwithA.test(str));
    }
}
