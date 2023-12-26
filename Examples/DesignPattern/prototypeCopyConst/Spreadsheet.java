package prototypeCopyConst;

public class Spreadsheet {
	
	private int sheetrows;
	private int sheetcolumns;
	
	//parameterized constructor
	public Spreadsheet(int sheetrows, int sheetcolumns) {
		super();
		this.sheetrows = sheetrows;
		this.sheetcolumns = sheetcolumns;
		System.out.println("Spread sheet created with "+ sheetrows + "rows" + 
		"and "+ sheetcolumns + " with columns");
	}
	
	//copy constructor (Spreadsheet spreadsheet) -> (Class_name Obj_name)
	public Spreadsheet (Spreadsheet spreadsheet)
	{	// obj_name.datamember
		this.sheetcolumns=spreadsheet.sheetcolumns;
		this.sheetrows=spreadsheet.sheetrows;
		
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

}
