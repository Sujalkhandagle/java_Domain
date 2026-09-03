package constructor;

public class Mainapp {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println(emp);

        Employee emp1=new Employee(1,"KILAS",30000);
        System.out.println(emp1);
        Employee emp2=new Employee(2,"hahsjsie",40000);
        System.out.println(emp2);
        Employee emp3=new Employee(3,"endfirvkf,",500000);
        System.out.println(emp3);

    }
}
