package Pacakege;


class Vechicle{
	void start() {
		System.out.println("Vechicle Starts");
	}
}
class Bike extends Vechicle{
	void start() {
		super.start();
		System.out.println("Bike Starts with Kick / button start");
	}
}
class Car extends Vechicle{
	void start() {
		super.start();
		System.out.println("Car starts with key");
	}
}
public class Mainapp2 {

	public static void main(String[] args) {
		Vechicle obj=new Bike();
		obj.start();
		Vechicle obj1=new Car();
		obj1.start();
	}

}