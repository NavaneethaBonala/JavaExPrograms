package singletonpattern1;

public class UsingSingleton2 {

	public static void main(String[] args) {
		Singleton1 s ;
		s = Singleton1.getinstance();
		s.mybusinesslogic();
		System.out.println("Hashcode of the object " + s.hashCode());
		
		Singleton1 s1 ;
		s1 = Singleton1.getinstance();
		s1.mybusinesslogic();
		System.out.println("Hashcode of the object " + s1.hashCode());
		
		Singleton1 s2;
		s2 = Singleton1.getinstance();
		s2.mybusinesslogic();
		System.out.println("Hashcode of the object " + s2.hashCode());
	}

}
