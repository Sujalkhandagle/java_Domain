class Main1{
    public static void main(String[] args) {
        Thread T=Thread.currentThread();
        System.out.println(T);
        T.setName("mytheadfirst");
        System.out.println(T);
        try{
        for(int i=1;i<=5;i++){
            System.out.println(i);
            Thread.sleep(500);
        }
    } catch(Exception e){
        System.out.println(e);
    }
    }
}