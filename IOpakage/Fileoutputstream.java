import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Fileoutputstream {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("file2.pdf ");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));

            System.out.println("Enter text (type 'stop' to finish):");

            String str;

            do {
                str = br.readLine();

                if (str.equals("stop")) {
                    break;
                }

                fout.write(str.getBytes());
                fout.write('\n');

            } while (true);

            fout.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}