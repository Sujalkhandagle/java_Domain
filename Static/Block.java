package Static;

public class Block {

    //constrctor call after object creation
    public Block(){
        System.out.println("object instantiated");
    }


    //static block
    static {
        System.out.println("static block");
    }

    //simple block
    {
        System.out.println("object is created");
    }
    public static void main(String[] args) {
        Block s1=new Block();
        Block s2=new Block();
        Block s3=new Block();
        Block s4=new Block();

        
    }
}
