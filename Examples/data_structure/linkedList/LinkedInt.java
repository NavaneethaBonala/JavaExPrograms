package linkedList;

class Node
{// node has two parts data and address(next)
	int data;
	Node next;
	// constructor
	public Node(int data)
	{// we have data and next, take next as null
		this.data = data;
		this.next = null;

	}
}

public class LinkedInt {
	// here we have multiple nodes
	// so head and size
	
	int size;
	Node head;
	
	public LinkedInt()
	{// take head as null to compare
		this.size = size;
		this.head = null;
	}

	public void addele(int data)
	{
		Node newnode = new Node(data);
		
		if( head == null)
		{
			head = newnode;
			
		}
		else
		{
			Node current = head;
			while(current.next != null)
				current = current.next;
			current.next = newnode;
		}
		size++;
				
	}
	
	public int size()
	{
		return size;
	}
	 public void print()
	 {
		 Node current = head;
		while (current != null)
		{
			System.out.println(current.data);
			current = current.next;
		}
		System.out.println("Null");
	 }
	public static void main(String[] args) {
		
		LinkedInt l2 = new LinkedInt();
		
		l2.addele(1);
		l2.addele(2);
		l2.addele(3);
		l2.addele(4);
		l2.addele(5);
		
		l2.print();
		System.out.println("Size of the Linked List : " +l2.size());
		
	}

}
