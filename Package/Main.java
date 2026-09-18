// import pack1.Addition;
// import pack1.Multiplication;
import  pack1.*;

import pack1.pack2.Substration;

public class Main {
    public static void main(String[] args) {
        Addition a=new Addition();

        
        a.add(5, 8);
        Substration b=new Substration();
        b.sub(20, 5);
        Multiplication c=new Multiplication();
        c.mul(5, 4);

        Demo d1=new Demo();
        d1.show();
    }
}

