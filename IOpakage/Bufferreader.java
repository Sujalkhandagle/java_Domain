import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bufferreader {
    public static void main(String[] args) throws Exception {
        // System.out.println("Enter your name := ");
        // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // String name=br.readLine();
        // System.out.println("name := "+name);

        try{
            System.out.println("enter any number");
            int no;
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          no=Integer.parseInt(br.readLine());
          System.out.println("number := "+no);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
