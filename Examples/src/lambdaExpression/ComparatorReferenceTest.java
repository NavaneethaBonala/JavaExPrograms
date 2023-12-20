package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Students {
	// Instance variables
	private String name;
	private Integer rollNumber;
	// getter setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	//Constructor
	public Students(String name, Integer rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", rollNumber=" + rollNumber + "] \n";
	}
}
// The following class defines the method to compare two Student objects.
// Note that method names can be anything. But this method will be used
// as compare() method of comparator
class StudentsComparator {
	public int compareByRollNumber(Students a, Students b) {
		return a.getRollNumber().compareTo(b.getRollNumber());
	}
}
public class ComparatorReferenceTest {
	public static void main(String[] args) {
		// Created a list of Students
		List <Students> list = new ArrayList <> ();
		list.add(new Students ( "John", 12));
		list.add(new Students ( "Jack", 8));
		list.add(new Students ( "Tom", 112));
		list.add(new Students ( "Tony", 3));
		list.add(new Students ( "Mike", 4));
		System.out.println("Initial list is: " + list);
		// Defined our own comparator
		// No need to use Java’s Comparator or Comparable
		StudentsComparator myComparisonProvider = new StudentsComparator();
		//Here instead of providing a comparator class we pass a method reference.
		Collections.sort(list, myComparisonProvider::compareByRollNumber);
		System.out.println("The sorted list is: " + list);
	}
}