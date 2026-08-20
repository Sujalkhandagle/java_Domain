public class Amstron {
    public static void main(String[] args) {
        int no=54748,rem,t,sum=0,cnt=0;
		t=no;
		while(no>0) {
			rem=no%10;
			cnt++;
		
//			rev=rev*10+rem;
			no=no/10;
		}
		no=t;
		while(no>0) {
			rem=no%10;
			sum=sum+(int)Math.pow(rem, cnt);
			
			no=no/10;
		}
		if(t==sum)
			System.out.println(t+" is Armstrong");
		else
			System.out.println(t+" is not Armstrong");
    }
    
}
