import java.util.ArrayList;

public class Sample {
      public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(45);
        list.add(78);
        list.add(83);
        System.out.println(list);
        list.add(1, 80);
        System.out.println(list);

        if(list.contains(83))
            System.out.println("present");
        else
            System.out.println("absent");


        // list.clear();
        // System.out.println(list);

        if(list.isEmpty())
            System.out.println("empty");
        else
            System.out.println("not empty");


        System.out.println(list.indexOf(78));

        ArrayList<Integer> list1 =new ArrayList<Integer>();
        list1.add(18);
        list1.add(76);
        System.out.println(list1);
        list.addAll(list1);
        System.out.println(list);
        list.addAll(1,list1);
        System.out.println(list);



      }
}
