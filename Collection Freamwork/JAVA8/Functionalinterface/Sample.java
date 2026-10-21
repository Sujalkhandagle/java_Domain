import java.util.Arrays;
import java.util.List;

@FunctionalInterface 
interface Demo{
    void show(String name);
    default void sayhello(){
        System.out.println("good coding");
    }
}
@FunctionalInterface 
interface demo2 extends Demo{
    void show(String name);
}
class Test implements Demo{
    public void show(String name){
        System.out.println(name.toUpperCase());
    }
}
public class Sample {
    public static void main(String[] args) {
        Test obj=new Test();
        // obj.show();
        // obj.sayhello();

        //method refrence
        List<String> name=Arrays.asList("harish","soham","vishal","rajesh");
        name.forEach(obj::show);
    }
}
