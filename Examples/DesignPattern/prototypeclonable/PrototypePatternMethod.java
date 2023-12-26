package prototypeclonable;

public class PrototypePatternMethod {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Spreadsheet s1 = new Spreadsheet(65536, 256);
		
		Spreadsheet s2, s3,s4;
		
		s2=s1.clone();
		s3=s1.clone();
		s4=s1.clone();
		
		System.out.println(s2.getSheetrows());
		System.out.println(s3.getSheetcolumns());
	}
}