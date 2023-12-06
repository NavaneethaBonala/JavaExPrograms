package map;
import java.util.*;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap m = new HashMap();
		
		m.put("chiranjeevi", 700);
		m.put("balayya", 800);
		m.put("nagarjuna", 200);
		m.put("venky", 500);
		System.out.println(m);

		System.out.println(m.put("chiranjeevi", 1000));
		
		Set s = m.keySet();
		System.out.println(s);
		Collection c = m.values();
		System.out.println(c);
		
		
		Set s1 = m.entrySet();
		System.out.println(s1);
		
		Iterator it = s1.iterator();
		while(it.hasNext())
		{
			Map.Entry m1 = (Map.Entry)it.next();
			
			System.out.println(m1.getKey()+ " ........."+ m1.getValue());
			if(m1.getKey().equals("nagarjuna"))
			{
				m1.setValue(10000);
			}
		}
		System.out.println(m);
	}

}
