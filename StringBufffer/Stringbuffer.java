public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hellow");
        System.out.println(sb);

        sb.append(" java");
        System.out.println(sb);

        sb.insert(11, " programing");
        System.out.println(sb);

        // sb.delete(6, 11);
        // System.out.println(sb);

        sb.replace(6, 11, " python");
        System.out.println(sb);
    }
}
