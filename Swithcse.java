public class Swithcse   {
    public static void main(String[] args) {
        //   int month=5;
        //   switch (month) {
        //     case 1:
        //     case 3:
        //     case 5:
        //     case 7:
        //     case 8:
        //     case 10:
        //     case 12:System.out.println("Toatal month day := 31");
        //     break;
        //     case 4:
        //     case 6:
        //     case 9:
        //     case 11:System.out.println("Toatal month days := 30");
        //     break;
        //     case 2:System.out.println("Toatal month days := 28");
        //   break;
        //     default:System.out.println("Invalid month days !!");
        //         break;

        int month=9;
        String result=switch(month){
            case 1,3,5,7,8,10,12->"total days 31";
            case 4,6,9,11-> "total  days 30";
            case 2-> "total days 28";
            default-> "invalid month !!";
        };
        System.out.println(result);

                 
          }
    }

