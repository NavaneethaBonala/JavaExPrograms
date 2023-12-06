package set;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
		
		t.add("A");
		t.add("B");
		t.add("a");
		t.add("Z");
		t.add("l");
		//t.add(10);
		t.add(null);
		System.out.println(t);
	}
	
}
