public class Main4 {
    public static void main(String[] args) {
        String messge="hello java";
        Thread t1=new Thread(()->{
            System.out.println("Thread 1 "+messge);
        });


        Thread t2=new Thread(()->{
            System.out.println("Thread 2 "+messge);
        });

        Thread t3=new Thread(()->{
            System.out.println("Thread 3 "+messge);
        });
        t1.start();
        t2.start();
        t3.start();
    }

}
