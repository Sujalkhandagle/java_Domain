public class Sample {
    public static void main(String[] args) {
        System.out.println("Hello Welcome");
        int i=3,j=4,k=2,res;
        res=++i/j + k++ *j++ + --k + --i - j--;
        System.out.println("i := "+i);
        System.out.println("j := "+j);
        System.out.println("k := "+k);
        System.out.println("res := "+res);
    }
}
