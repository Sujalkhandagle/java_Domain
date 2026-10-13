import java.util.Collections;
import java.util.TreeSet;
 
class Employee1 implements Comparable<Employee1>{
	int id;
	String name;
	int salary;
	Employee1(){
		
	}
	public Employee1(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee1 o) {
		
		return name.compareTo(o.name);
	}
	
	
}
public class Employee {
 
	public static void main(String[] args) {
		Employee1 e1=new Employee1(1, "Guari", 45000);
		Employee1 e2=new Employee1(2,"Vanita",87900);
		Employee1 e3=new Employee1(3,"Rupesh",76000);
		Employee1 e4=new Employee1(4,"Anish",65000);
		TreeSet<Employee1> emps=new TreeSet<Employee1>(Collections.reverseOrder());
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		for(Employee1 e : emps)
		System.out.println(e);
 
	}
 
}
 