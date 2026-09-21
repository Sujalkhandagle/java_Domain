public class Mainapp {

    public static void main(String[] args) {

        try {
            int a = 4;
            int b = 2;

            int res = a / b;

            System.out.println(res);

            int arr[] = {1, 5, 6};
            arr[2] = 9;

            String str = null;
            System.out.println(str.toUpperCase());
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Length is out of bound");
            System.out.println(e);
        }

        catch (ArithmeticException e) {
            System.out.println("Division stopped due to some error");
            System.out.println(e);
        }

        catch (Exception e) {
            System.out.println("string value is null");
            System.out.println(e);
        }
    }
}