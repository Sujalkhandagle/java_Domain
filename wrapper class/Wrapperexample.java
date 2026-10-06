public class Wrapperexample {
    public static void main(String[] args) {

        int a = 10;              

        Integer b = Integer.valueOf(a);  

        System.out.println("Primitive value: " + a);
        System.out.println("Wrapper object: " + b);
    }
}