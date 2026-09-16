package innerclass;

public class Stringimutability {
    public static void main(String[] args) {
        String s1="java";
        String s2="java";
        if(s1==s2)
            System.out.println("string is equal ");
    

    String str1=new String("JAVA");
    String str2=new String("JAVA");
    if(str1.equals(str2))
        System.out.println("string is equal");
    else
        System.out.println("string is not equal");
    }
        
        
}
