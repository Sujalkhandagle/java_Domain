package Encapsulation;

public class Sample {
    public static void main(String[] args) {

        Student stud1 = new Student();
        stud1.setId(1);
        stud1.setName("ajay");
        stud1.setMarks(96);
        System.out.println("id := " + stud1.getId());
        System.out.println("name := " + stud1.getName());
        System.out.println("Marks := " + stud1.getMarks());

    }

}
