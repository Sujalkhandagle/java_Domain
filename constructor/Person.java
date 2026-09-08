package constructor;

public class Person {
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    Person compare(Person p){
        if(this.age>p.age)
            return this;
        else 
                return p;
        }
        public class Mainapp {
        
            
        
        public static void main(String[] args) {
            Person p1=new Person("sheker",40);
            Person P2=new Person("niles",35);
            Person p=p1.compare(P2);
            

            
        }
    }

    

}
