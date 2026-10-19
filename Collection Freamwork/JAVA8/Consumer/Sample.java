import java.util.function.Consumer;

public class Sample {
    public static void main(String[] args) {
        Consumer<Integer> show=n->System.out.println(n);
        show.accept(46);
        
        Consumer<String> show1=n->System.out.println(n);
        show1.accept("sujal  ");

    }
}
