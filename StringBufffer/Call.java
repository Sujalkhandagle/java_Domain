class Person{
    String name;
    Person(String name){
        this.name=name;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }
    
}
public class Call {
    public static void main(String[] args) {
        int a=10;
        int b=a;
        System.out.println(a+" , "+b);
        b=34;
        System.out.println(a+" , "+b);

        Person p1=new Person("sham");
        //call by value
        Person p2=p1;
        System.out.println(p1);
        System.out.println(p2);  

        p2.name="kanishk";
        System.out.println(p1);
        // call by refernce
        System.out.println(p2);

        


    }
}
