class MyThread3  extends Thread{
String name;
	public MyThread3 (String name) {
		this.name=name;
		
		System.out.println(name+" Started..");
		start();
	}
	@Override
	public void run() {
		try {
			for(int i=1;i<=5;i++)
			{
				System.out.println(name+" Thread := "+(i*i));
				Thread.sleep(500);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(name+" Thread Terminated...");
		
	}
	
}
public class Alivethread {
 
	public static void main(String[] args) {
		MyThread3 t1=new  MyThread3("One");
		MyThread3 t2=new MyThread3("Two");
		MyThread3 t3=new MyThread3("Three");
		System.out.println("Main Thread Started..");
		System.out.println("t1 is Alive "+t1.isAlive());
		System.out.println("t2 is Alive "+t2.isAlive());
		System.out.println("t3 is Alive "+t3.isAlive());
		try {
			
			t1.join();
			t2.join();
			t3.join();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("t1 is Alive "+t1.isAlive());
		System.out.println("t2 is Alive "+t2.isAlive());
		System.out.println("t3 is Alive "+t3.isAlive());
		System.out.println("Main Thread Terminated..");
	}
 
}