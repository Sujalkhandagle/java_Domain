public class Callbyvalue {
    static  void call(int a,int b){
        int t=a;
         a=b;
         b=t;
         System.out.println(a+" "+b);
      }

      public static void main(String[] args) {
        int a=10,b=20;

        call(a,b);
        System.out.println(a+" "+b);
        
      }
}
