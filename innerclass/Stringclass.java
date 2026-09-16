package innerclass;

public class Stringclass {
    public static void main(String[] args) {
       String str="Hello";
       System.out.println("upper case := "+str.toUpperCase()); 
       System.out.println("lower case := "+str.toLowerCase()); 
       if(str.contains("l"))
        System.out.println("'l' is prensent");


       String s1=str.concat(" java");
       System.out.println("oringanal :="+str);
       System.out.println("conacated string :="+s1);
       System.out.println(str.length());
       System.out.println(str.compareTo("hello"));
       System.out.println(str.indexOf("o"));
       System.out.println(str.endsWith("hj"));

       str="java progaming langage";
       System.out.println(str.substring(10));
       System.out.println(str.substring(4, 16));

       String strarray[]=str.split(" ");
       for(String s:strarray)
        System.out.println(s);



       String names[]={"hari","rahul","kiya","viran"};
       String namesStr=String.join("_",names);
       System.out.println(namesStr);


       
    }
    
}
