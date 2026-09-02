public class PalidromNo   {
    public static void main(String[] args) {

        int no = 1;

        while (no <= 1000) {

            int original = no;
            int temp = no;
            int reverse = 0;

            while (temp > 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp = temp / 10;
            }

            if (original == reverse) {
                System.out.println(original);
            }

            no++;
        }
    }
}