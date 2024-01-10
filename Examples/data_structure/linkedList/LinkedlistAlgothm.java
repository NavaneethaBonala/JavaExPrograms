package linkedList;

class ListNode
{
	String data; // store the data
	ListNode next;// reference of next node
	
	ListNode(String data){
		this.data = data;
		this.next = null;
	}
}

public class LinkedlistAlgothm {
	
	ListNode head;
	int size;
	
	public LinkedlistAlgothm()
	{
		this.head = null;
		this.size = 0;
	}

	public void add(String data)
	{
		ListNode newnode = new ListNode(data);
		
		if(head == null)
		{
			head = newnode;
		}
		else
		{
			ListNode current = head;
			while(current.next!=null)
				current=current.next;
			current.next = newnode;
		}
		size++;
	}
	
	public int size()
	{
		return size;
	}
	
	public void printList()
	{
		ListNode current = head;
		while(current != null)
		{
			System.out.print(current.data+"->");
			current = current.next;
		}
		System.out.println("Null");
	}
	
	public static void main(String[] args) {
		
		LinkedlistAlgothm la = new LinkedlistAlgothm();
		
		la.add("Apple");
		la.add("Banana");
		la.add("Orange");
		la.add("papaya");
		
		System.out.println("List of the Elements");
		la.printList();
		
		System.out.println("Size of the List : "+ la.size());
		

	}

}
