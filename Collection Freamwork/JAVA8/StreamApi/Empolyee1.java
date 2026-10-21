import java.util.ArrayList;
import java.util.List;

class Empolye{
    String name;
    int salary;
    String location;
    
    public Empolye() {
    }

    public Empolye(String name, int salary, String location) {
        this.name = name;
        this.salary = salary;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Empolye [name=" + name + ", salary=" + salary + ", location=" + location + "]";
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    

    
    
}
public class Empolyee1 {
    public static void main(String[] args) {
        Empolye em1=new Empolye("Sujal",95000,"pune");
        Empolye em2=new Empolye("Govind",85000,"pune");
        Empolye em3=new Empolye("Shivam",75000,"nashik");
        Empolye em4=new Empolye("pavan",50000,"nashik");
        Empolye em5=new Empolye("Sujal",95000,"pune");

        List<Empolye> list=new ArrayList<Empolye>();
        list.add(em1);
        list.add(em2);
        list.add(em3);
        list.add(em4);
        list.add(em5);

        list.stream().filter(emp->emp.getSalary()>=70000).forEach(System.out::println);





        
    }
}
