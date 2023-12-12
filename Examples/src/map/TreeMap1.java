package map;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		
		TreeMap tm = new TreeMap();
		
		tm.put(101, "Nita");
		tm.put(102,  "Nitu");
		tm.put(101,  "Neetu");

		System.out.println(tm);
		
		
	}

}
