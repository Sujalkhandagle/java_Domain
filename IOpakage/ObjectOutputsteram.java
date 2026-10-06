
 
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student implements Serializable{
	int id;
	String name;
	Student(){
		
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
public class ObjectOutputsteram{
 
	public static void main(String[] args) {
		
		try(FileOutputStream fout=new FileOutputStream("Student.pdf");
				ObjectOutputStream out=new ObjectOutputStream(fout)){
			Student s1=new Student(1,"Rahul");
			Student s2=new Student(2,"Shital");
			Student s3=new Student(3,"Harish");
			Student s4=new Student(4,"Bina");
			out.writeObject(s1);
			out.writeObject(s2);
			out.writeObject(s3);
			out.writeObject(s4);
		}
		catch(Exception e) {
			System.out.println(e);
		}
 
	}
 
}