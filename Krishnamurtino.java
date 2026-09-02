public class Krishnamurtino {
    public static void main(String[] args) {
        int no=145,rem,t,sum=0,f;
        t=no;

        while (no>0) {

            rem=no%10;
            f=1;
            while (rem>=1) {
                f=f*rem;
                rem--;
                
            }

            sum+=f;
            no=no/10;

            
        }
        System.out.println(sum);
        if(t==sum)
            System.out.println(t+" is krishanmurti no");
        
        else
            System.out.println(t+" is not krishanmurti no");
        
    }
}
