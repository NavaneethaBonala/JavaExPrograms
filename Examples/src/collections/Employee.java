package collections;
import java.util.ArrayList;

class Employee1 {

	private int id;
	private String name;
	private String address;
	
	public Employee1() {}
	
	public Employee1(int id, String name, String address) {
		
		this.id = id;
		this.name = name;
		this.address= address;
		
	}
	
	public String toString() {
		
		return "Employee [id="+id+", name = "+ name + ", address = "+address + "]";
	}

	}


public class Employee {
	
	public static void main(String[] args) {
		
		ArrayList<Employee1> emp = new ArrayList<Employee1>();
		
		emp.add(new Employee1(1, "Nita", "KrupaComplex"));
		emp.add(new Employee1(2, "Nitu","Safilgud"));
		emp.add(new Employee1(3, "Neetu", "Hyd"));
		
		/* OR
		 * Employee1 obj1 = new Employee1(1, "Nita", "KrupaComplex");
		Employee1 obj2 = new Employee1(2, "Nitu","Safilgud");
		Employee1 obj3 = new Employee1(3, "Neetu", "Hyd");
		 */
		for(Employee1 e : emp)
		{
			System.out.println(e);
		}
		
		
	}
}