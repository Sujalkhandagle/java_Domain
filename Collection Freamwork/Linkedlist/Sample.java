import java.util.ArrayList;
import java.util.LinkedList;

public class Sample {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        list.add("sujal");
        list.add("yogesh");
        list.add("rohit");
        list.add("yash");
        System.out.println(list);

        ArrayList<String> list1=new ArrayList<String>();
        list1.add("ayush");
        list1.add("james");
        list.addAll(list1);
        System.out.println(list);
    }
}
