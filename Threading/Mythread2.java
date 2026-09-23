class Mythread implements Runnable {

    Thread t;

    public Mythread() {
        t = new Thread(this, "demo thread");
        System.out.println(t.getName() + " started...");
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("demo thread := " + (i * i));
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("child thread terminated...");
    }
}

public class Mythread2 {

    public static void main(String[] args) {

        new Mythread();

        System.out.println("Main thread started...");

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Main thread terminated...");
    }
}