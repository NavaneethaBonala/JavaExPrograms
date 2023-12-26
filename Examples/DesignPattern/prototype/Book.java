package prototype;

class Book
{
	// data member
	private int bid;
	private String bname;
	
	// getter and setter methods for data members
	public String getbname() {
		return bname;
	}
	public void setbname(String bname) {
		this.bname = bname;
	}
	
	public int getbid() {
		return bid;
	}
	public void setbid(int bid) {
		this.bid = bid;
	}
	// 'To string' method to display with return types
	public String toString() {
		return "Book [bid = " + bid + ", bname = " + bname + "]";
	}
}