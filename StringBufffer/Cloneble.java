class Student implements Cloneable{
    int id;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
    // @Override
    // public String toString() {
    //     return "Student [id=" + id + ", name=" + name + "]";
    // }


    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class Cloneble {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1=new Student(1, "sham");
        System.out.println(s1);
        Student s2=s1;
        System.out.println(s2);


        Student stud=(Student)s1.clone();
        System.out.println(stud);


        
        
    }
}
