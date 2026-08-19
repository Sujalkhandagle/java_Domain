public class If_statemant {
    public static void main(String[] args) {
        int i=3,j=20,k=39;
        if(i>j && i>k)
            System.out.println((i+" is greter then "+j+"and"+k));
        else
            if(j>k)
            System.out.println((j+" is greter then "+i+"and"+k)); 
        else
            System.out.println((k+" is greter then "+i+"and"+j));

int no=30;

System.out.println(+no%2==0? "even":"odd");

int year=2026;

System.out.println(year%4==0?"leeap year":"not leeap year");
                
    }
}
