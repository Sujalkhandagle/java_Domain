import java.util.PriorityQueue;

public class Example {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("sujal");
        queue.add("yadav");
        queue.add("khandagale");
        System.out.println(queue);
        System.out.println(queue.element());
        queue.offer("yogesh");
        System.out.println(queue);
        queue.peek();
        System.out.println(queue);
        // queue.poll();
        // System.out.println(queue);
    }
}
