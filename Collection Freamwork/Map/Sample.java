import java.util.HashMap;

public class Sample {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"sujal" );
        map.put(2,"yogesh" );
        map.put(3,"khandagale");
        map.put(3,"yadav");

        System.out.println(map);
        for(Integer keys:map.keySet())
        System.out.println(keys);
    }
}
