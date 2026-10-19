import java.util.Random;
import java.util.function.Supplier;

public class Sample {
    public static void main(String[] args) {
        Supplier<Integer> value=()->100;
        System.out.println(value.get());

        Supplier<Integer> otp=()->100000+new Random().nextInt(9000000);
        System.out.println(otp.get());
    }
}
