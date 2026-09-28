public class String_buffer_thread {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("Hello");

        Thread t1=new Thread(()->{
            for(int i=1;i<=5;i++)
                str.append("A");
            System.out.println(str);
        });

        Thread t2=new Thread(()->{
            for(int i=1;i<=5;i++)
                str.append("B");
            System.out.println(str);
        });

        t1.start();
        t2.start();
        System.out.println(str);

    }
}
