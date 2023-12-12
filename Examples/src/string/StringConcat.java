package string;

class StringConcat
{
	public static void main(String[] argos)
	{
		String s1 = new String ("Spring");
		s1.concat("fall");
		String s2 = s1.concat ("Winter");
		s2.concat("summer");
		System.out.println(s1);
		System.out.println(s2);
	}
}
