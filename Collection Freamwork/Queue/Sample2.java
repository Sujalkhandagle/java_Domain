 
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
 
public class Sample2 {
 
	public static void main(String[] args) {
		PriorityQueue<Integer> queue=
				new PriorityQueue<Integer>((a,b)->{if(a%2==0)
					return -1;
				 if(a%2!=0)
					return 1;
				return Integer.compare(a, b);
	}
					);
		queue.add(20);
		queue.add(45);
		queue.add(15);
		queue.add(10);
		queue.add(17);
		System.out.println(queue);
		queue.add(16);
		System.out.println(queue);
		queue.add(22);
		System.out.println(queue);
		queue.add(55);
		System.out.println(queue);
		// PriorityQueue<Integer> queue=
		// 		new PriorityQueue<Integer>(Collections.reverseOrder());
		// queue.add(20);
		// queue.add(45);
		// queue.add(15);
		// queue.add(10);
		// queue.add(17);
		// System.out.println(queue);
		// queue.add(87);
		// System.out.println(queue);
	}
 
}
 