public class Automorphic {
    public static void main(String[] args) {
        int no=25,sq,t;
		boolean isAutomorphic=true;
		sq=no*no;
		t=no;
		while(no>0) {
			if(no%10!=sq%10) {
				isAutomorphic=false;
				break;
			}
			no=no/10;
			sq=sq/10;
		}
		if(isAutomorphic)
			System.out.println(t+" is Automorphic");
		else
			System.out.println(t+" Not Automorphic");
	}
    }
