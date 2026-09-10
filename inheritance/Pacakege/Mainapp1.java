package Pacakege;
class Parent{
	void show() {
		System.out.println("I am Parent");
	}
	
}
class Child extends Parent{
	void show(int x) {
		System.out.println("I am Child - Parameterised");
	}
	void show() {
		System.out.println("I am Child");
	}

}
public class Mainapp1 {

	public static void main(String[] args) {
		// Parent p=new Parent();
		// p.show();
		// Child c=new Child();
		// c.show();
	
		Parent i=new Child();
		i.show();
	}

}