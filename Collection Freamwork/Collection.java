import java.util.*;
public class Collection {
    public static void main(String[] args) {
        ArrayList list=new ArrayList<>();
        list.add(32);
        list.add("hello collection");
        list.add(35524878997855L);
        list.add(35.89);
        list.add(true);
        list.add(48);
        System.out.println(list);
        System.out.println(list.size());
        list.remove(2);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());


    }
}
