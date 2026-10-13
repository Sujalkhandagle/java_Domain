import java.util.Collections;
import java.util.TreeSet;
 
public class Sample2 {
 
	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<Integer>(Collections.reverseOrder());
		set.add(34);
		set.add(23);
		set.add(87);
		set.add(45);
		set.add(1);
		System.out.println(set);
		set.add(3);
		set.add(30);
		System.out.println(set);
 
	}
 
}  