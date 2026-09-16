package innerclass;
import java.util.Date;

public class Dateclass {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println("current date and time := "+date.toString());
        System.out.println("toay day := "+date.getDay());
        System.out.println("today date := "+date.getDate());
        System.out.println("todays month :="+date.getMonth());
        System.out.println("todays year := "+date.getYear());
        System.out.println("current year := "+date.toLocaleString  ());
        System.out.println("current  hr :="+date.getHours());
        System.out.println("current min := "+date.getMinutes());
        System.out.println("current seconds := "+date.getSeconds());
    }
    
}
