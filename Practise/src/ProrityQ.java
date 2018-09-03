import java.util.*;
public class ProrityQ {
	public static void main(String arg) {
	PriorityQueue<String> 	q =
            new PriorityQueue<String>();
	
	q.add("nbm");
	q.add("XY");
	q.add("abc");
	Iterator itr = q.iterator();
	System.out.println("Viany");
    while (itr.hasNext())
        System.out.println(itr.next());
}
}