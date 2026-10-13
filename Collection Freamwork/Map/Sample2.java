import java.util.HashMap;
import java.util.HashSet;
 
class Student{
	int id;
	String name;
	
	String city;
	
	Student(){
		
	}
	
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
 
	@Override
	public String toString() {
		return "Student [city=" + city + ", name=" + name + ", id=" + id + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
public class Sample2 {
 
	public static void main(String[] args) {
		Student s1=new Student(1,"Rishi","Pune");
		Student s2=new Student(2,"Akash","Nashik");
		Student s3=new Student(3,"Madhav","Pune");
		Student s4=new Student(4,"Priyanka","Dhule");
		Student s5=new Student(5,"Harsh","Nashik");
		Student s6=new Student(6,"Sunil","Pune");
		Student s7=new Student(7,"Ratna","Pune");
		
		HashSet<Student> students=new HashSet<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);  
		students.add(s6);
		students.add(s7);
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for(Student s:students)
			map.put(s.getCity(), map.getOrDefault(s.getCity(), 0)+1);
		
		System.out.println(map);
 
	}
 
}