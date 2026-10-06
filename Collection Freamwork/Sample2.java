import java.util.ArrayList;

class Employee{
    int id;
    String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
    
}
public class Sample2 {
    public static void main(String[] args) {
        Employee emp=new Employee(1, "ajay");
        Employee emp1=new Employee(2,"sham" );

        ArrayList<Employee> list=new ArrayList<Employee>();
        list.add(emp);
        list.add(emp1);

        System.out.println("id\tName");

        for(Employee e:list)
            System.out.println(e.id+"\t"+e.name);

        
    }
}
