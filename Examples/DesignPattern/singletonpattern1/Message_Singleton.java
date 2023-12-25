package singletonpattern1;

public class Message_Singleton {

	public static void main(String[] args) {
		Message s ;
		s = Message.getinstance();
		s.mybusinesslogic();
		System.out.println("Hashcode of the object " + s.hashCode());
		
		Message s1 ;
		s1 = Message.getinstance();
		s1.mybusinesslogic();
		System.out.println("Hashcode of the object " + s1.hashCode());
		
		Message s2;
		s2 = Message.getinstance();
		s2.mybusinesslogic();
		System.out.println("Hashcode of the object " + s2.hashCode());
	}

}
