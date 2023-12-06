package loopexamples;

//Method Overloading
public class Student {
	
	//data members
		int idno;
		String name, course;
		float avgmarks;
		
		//constructor overloading
		public Student(int id, String na, String c, float avg)
		{
			idno=id;
			name=na;
			course=c;
			avgmarks=avg;
		}
		
		public Student() {}
		
		public Student(int id, String na)
		{
			idno=id;
			name=na;
		}
		
		//method overloading
		public void addStudent()
		{
			idno=100;
			name="Ram";
			course="BE";
			avgmarks=67.7f;
		}
		
		public void addStudent(int id, String na, String c, float avg)
		{
			idno=id;
			name=na;
			course=c;
			avgmarks=avg;
		}
		public void show()
		{
			System.out.println("Idno "+ idno);
			System.out.println("Student Name "+ name);
			System.out.println("Course "+ course);
			System.out.println("Average marks "+ avgmarks);
		}
		
		public String findGrade()
		{
			String s;
			if(avgmarks>80)
				 s="A+";
				else
				 s="A";
			
			return(s);
		}

		public static void main(String[] args) {
			
			Student s= new Student();
			s.addStudent();
			s.show();
			System.out.println(s.findGrade());
			
			Student s1 = new Student();
			s1.addStudent(101, "Rahul", "MCA", 78.5f);
			s1.show();
			System.out.println(s1.findGrade());
			

		}
}
