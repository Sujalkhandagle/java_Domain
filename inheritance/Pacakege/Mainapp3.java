package Pacakege;    
class Alpha{
	 int a;
	Alpha(){
		
	}
	 Alpha(int a) {
		this.a=a;
	}
}
class Beta extends Alpha{
	int b;
	Beta(int a, int b){
		super(a);
		this.b=b;
	}
	void show() {
		System.out.println("a := "+a);
		System.out.println("b := "+b);
	}
}
public class Mainapp3 {

	public static void main(String[] args) {
		Beta beta=new Beta(20,40);
		beta.show();

	}

}