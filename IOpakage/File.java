import java.io.FileWriter;

public class File {
    public static void main(String[] args) {
        try{

            FileWriter fw=new FileWriter("file.txt");
            System.out.println("file creted");
           fw.write("hello good moraning\n");
            fw.append("hello good ");

            fw.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }  
}
