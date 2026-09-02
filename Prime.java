public class Prime {
    public static void main(String[] args) {

        int i, no = 1;
        boolean isPrime;

        while (no <= 100) {

            i = 2;
            isPrime = true;

            while (i <= Math.sqrt(no)) {

                if (no % i == 0) {
                    isPrime = false;
                    break;
                }

                i++;
            }

            if (isPrime) 
                System.out.print(no+"  ");
            

            no++;
        }
    }
} 