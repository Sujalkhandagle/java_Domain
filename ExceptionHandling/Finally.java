public class Finally {

    static void show(){
        try{
            throw new ArithmeticException();
        }
        finally{
        System.out.println("finally block show");
        }
    }


    static int display(){
        try{
            return 0;

        }
        finally{
            System.out.println("finally in display ");
        }
    }

    public static void main(String[] args) {
        //Finally.show();
        Finally.display();
        
        
    }
}
