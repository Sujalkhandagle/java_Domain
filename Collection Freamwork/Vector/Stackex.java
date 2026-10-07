import java.util.Stack;

public class Stackex {
    public static void main(String[] args) {
        Stack<Integer>list=new Stack<Integer>();
        list.add(42);
        list.add(75);
        list.push(78);
        list.push(43);
        list.remove(2);
        list.pop();
        list.pop();



        System.out.println(list);
    }
}
