import java.util.ArrayList;
import java.util.Collections;
 
class Employee implements Comparable<Employee>{
	int id;
	String name;
	int salary ;
	String dept;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Employee(int id, String name, int salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
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
 
	public String getDept() {
		return dept;
	}
 
	public void setDept(String dept) {
		this.dept = dept;
	}
 
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	@Override
	public int compareTo
    (Employee o) {
		if(salary>o.getSalary())
			return 1;
		else
			if(salary<o.getSalary())
				return -1;
			else
				return 0;
	}
	
}
public class Sample2 {
 
	public static void main(String[] args) {
		Employee e1=new Employee(1, "Amar",45000,"Sales");
		Employee e2=new Employee(2, "Mayur",76000,"Production");
		Employee e3=new Employee(3, "Kiran",40000,"Sales");
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		Collections.sort(empList);
//		System.out.println(empList);
		System.out.println("Id\tName\tSalary\tDept");
		for(Employee e:empList) {
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary()+"\t"+e.getDept());
		}
	}
 
}
 