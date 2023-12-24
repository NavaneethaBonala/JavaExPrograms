package factorypattern2;

public class OperatingSystem {
	
	public OS getinstance(String str)
	{
		if (str.equalsIgnoreCase("Open"))
				return new Android();
		else if (str.equalsIgnoreCase("Closed"))
				return new IOS();
		else 
			return new Windows();
	}
}
