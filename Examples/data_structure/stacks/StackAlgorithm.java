/*
 *  2. Create a Java class called MinStack of Integers 
 *  that supports standard stack operations (push, pop, top, and isEmpty) and 
 *  also provides a getMin method that returns the minimum element in the stack.
 */

package stacks;// User Defined Package declaration

// class declaration
class Operation {
	
	int top=0;// stack index number
	int [] stackarray = new int[4];// create a new stack array
	int maxSize;// size of the stack
	// push()method to add values to the stack
	public void push(int value)
	{	// checks if the index number is equal to the size
		if(top==4)
		{
			System.out.println("stack is Full");
		}
		else
		{
		// here value is assigned to array's 0th index
		stackarray[top]=value;
		// increment the index top value
		top++;}
	}
	// POP () method to remove the top element from the stack
	 public int pop()
	 {
		 int value=0;
		 // chacks if stack is empty
		 if (isEmpty())
		 {System.out.println("Stack is Empty");}
		 // take the value to be poped out
		 else {
			
			 // decrement the top index value
			 top--;
			 // here size of the array is 4, and we have entered 4 elements 
			 //in push method 'top' is increased from 3->4 after assigning the 3rd indx value
			 // so we have to subtrct 1 from the index number so as to achieve the last index number
			 // if not we get indexOutofBound Exception
			 value = stackarray[top] ;}
		  return value;
	 }
	// Peek() method to display the top element of the stack
	 public int peek()
	 {// show the top value
		 int value;
		 value = stackarray[top-1];
		 return value;
		 
	 }
	 // Size method to check the length of the stack
	 public int size()
	 {// top index is the actual size of the stack
		 return top;
	 }
	 // here when we use "is" as in 'isEmpty' it will always return boolean value 
	 public boolean isEmpty()
	 {
		 // returns the true or false by consition
		 return top<=0;
	 }
	 
	 // To display the elements of the stack
	public void show()
	{	// for each loop 
		for (int e : stackarray)
        {
        	System.out.print(e+" ");
        }
	}
}
// class declaration
public class StackAlgorithm {
// main method
public static void main(String[] args) {
		// stack is an object 
	Operation stack = new Operation();
		// obj.push()
		stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);// Gives message as Stack is Full
        System.out.println("Size of the Stack : "+stack.size());
       
        stack.show();
        System.out.println("Top element of the Stack : "+stack.peek());
        while (!stack.isEmpty()) {
			System.out.println("Popped: " + stack.pop());
		}
		System.out.println("Stack size after popping all elements: " + stack.size());
		System.out.println("Is Stack is Empty : "+stack.isEmpty());        
	}
}
