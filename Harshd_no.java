public class Harshd_no {
    public static void main(String[] args) {
        int no=1,sum,rem,t;
        int n=no;
        while (n<=100) {
            t=n;
            sum=0;
            while (n>0) {
                rem=n%10;
                sum+=rem;
                n=n/10;

            }
            if(t%sum==0)
                System.out.print(t+" ");

            n=++no;

            
            
        }
    }
}
