public class Mainapp{


public static void main(String[] args) {
    try{
        int a=4;
        int b=0;
        int res=a/b;
        System.out.println(res);
    }
    catch(ArithmeticException e){
        System.out.println("division stopped, due to some error");
        System.out.println(e);

    }
    System.out.println("i have performed division");
}
}