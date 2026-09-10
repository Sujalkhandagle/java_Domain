package innerclass;




class Sports{
	void play() {
		System.out.println("Playing Cricket..");
	}
}
public class Mainapp2 {
	public static void main(String[] args) {
		Sports cricket=new Sports();
		cricket.play();
		Sports hocky=new Sports() {
			void play() {
				System.out.println("Playing Hocky...");
			}
		};
		hocky.play();
	}
}
