package Static;
  class Student {

    int id;
    String name;
    static String collage_name;
    Student(){}
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [collage name = "+collage_name+"id=" + id + ", name=" + name + "]";
    }
       
      

    
}

public class Mainclass {
    public static void main(String[] args) {

         Student.collage_name="FORTUNE_CLOUDE";
        System.out.println("collage name = "+Student.collage_name);
        Student s1=new Student(1,"sujal");
        Student s2=new Student(22,"aditya");
        Student s3=new Student(3,"Govind");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);



        
    }
}
