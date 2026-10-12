import java.util.ArrayDeque;

public class Sample {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq=new ArrayDeque<Integer>();
        dq.offer(16);
        dq.offer(76);
        dq.offer(49);
        System.out.println(dq);
        dq.offerFirst(25);
        System.out.println(dq);
        dq.offerLast(124);
        System.out.println(dq);
    }
}
