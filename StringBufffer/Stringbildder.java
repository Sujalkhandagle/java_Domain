public class Stringbildder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" Java");
        System.out.println(sb);

        sb.insert(5, " World");    
        System.out.println(sb);

        sb.replace(0, 5, "Hi");    
        System.out.println(sb);

        sb.delete(2, 8);    
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}