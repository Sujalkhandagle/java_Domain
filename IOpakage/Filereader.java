import java.io.FileReader;

public class Filereader {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("file.txt");
          int ch;
          do{
            ch=fr.read();
            if(ch==-1)
                break;
            System.out.print((char)ch);
          }
          while(true);
        }
        catch(Exception e){
            System.out.println();
        }
    }
}
