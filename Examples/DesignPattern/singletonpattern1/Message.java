package singletonpattern1;

//singleton class
public class Message {
	
	private static Message si = new Message();
	
	private Message()
	{
		System.out.println("Object Instance..");
	}
	
	public static Message getinstance()
	{
		
		return si;
	}
	
	public void mybusinesslogic()
	{
		System.out.println("singleton method...");
		
	}
}

