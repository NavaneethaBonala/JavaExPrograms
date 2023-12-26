package prototypeCopyConst;

public class PrototypePatternMethod {
	
public static void main(String[] args) {
		
		Spreadsheet s1 = new Spreadsheet(65536, 256);
		
		Spreadsheet s2, s3,s4;
		
		s2 = new Spreadsheet(s1);
		s3 = new Spreadsheet(s1);
		s4 = new Spreadsheet(s1);
		
		System.out.println(s2.getSheetrows());
		System.out.println(s3.getSheetcolumns());

	}

}
