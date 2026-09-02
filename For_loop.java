import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {

        // for(int i=1;i<=10;i++){
        //     System.out.print(i+" ");
        // }

        // for(int j=10;j>=1;j--){
        //     System.out.print(j+"\n ");
        // }

        // int i=1,sum=0;
        // for(i=1;i<=10;i++){
        //     sum=sum+i;
        //     System.out.print(sum+" ");
        // }

        // int no = 5;  
        // int fact = 1;

        // for (int i = 1; i <= no; i++) {
        //     fact = fact * i;
        // }

        // System.out.println("Factorial of " + no + " = " + fact);

        
        int no = 273548;
        int rev = 0;
        


        for (int n = no; n > 0; n = n / 10) {
        
            int rem = n % 10;
            rev = rev * 10 + rem;
        }

        System.out.println("Reverse = " + rev);
        


    }


    }


