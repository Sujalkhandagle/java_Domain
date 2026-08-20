public class Loop {
    public static void main(String[] args) {
        int no=4554,rem,rev=0,t;
        t=no;
        while (no>0) {
            rem=no%10;
            rev=rev*10+rem;
            no=no/10;

        }
System.out.println("revsre := "+rev);
if(t==rev)
    System.out.println(t+" is palidrom");
else
    System.out.println(t+" not palidrom");
    }
}
