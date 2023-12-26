package prototypeclonable;

public class Spreadsheet  implements Cloneable {

	private int sheetrows;
	private int sheetcolumns;
	
	//parameterized constructor
	public Spreadsheet(int sheetrows, int sheetcolumns) {
		super();
		this.sheetrows = sheetrows;
		this.sheetcolumns = sheetcolumns;
		System.out.println("Spread sheet created with "+ sheetrows + "rows" + "and "+ sheetcolumns + " with columns");
		
	}

	//getter setter methods
	public int getSheetrows() {
		return sheetrows;
	}

	public void setSheetrows(int sheetrows) {
		this.sheetrows = sheetrows;
	}

	public int getSheetcolumns() {
		return sheetcolumns;
	}

	public void setSheetcolumns(int sheetcolumns) {
		this.sheetcolumns = sheetcolumns;
	}
	
	public Spreadsheet clone() throws CloneNotSupportedException
	{
		return ((Spreadsheet)super.clone());
	}
	
}
