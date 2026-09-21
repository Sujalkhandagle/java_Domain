public class Throw {
    static void div(int a,int b){
        // if(b==0)
        //     throw new ArithmeticException();
        System.out.println("result "+a/b);
    }
    public static void main(String[] args)  {
        try{
        div(10,0);
        }
        catch(ArithmeticException e){
            System.out.println("not divible");
        }
        
    }
    
}
