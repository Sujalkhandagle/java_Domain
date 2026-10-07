import java.util.ArrayList;
import java.util.Collections;

public class Arraysort {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(8);
        list.add(5);
        list.add(7);
        list.add(3);

        Collections.sort(list,(a,b)->a-b);
        System.out.println(list);
    }
}
