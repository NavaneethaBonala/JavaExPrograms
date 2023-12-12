package exceptionhandling;

//Custom exception class for handling out-of-stock books
class BookNotAvailableException extends Exception {
 public BookNotAvailableException(String message) {
     super(message);
 }
}

//BookInventory class simulating a book inventory system
class BookInventory {
 private int availableBooks = 10;

 public void borrowBook(int requestedBooks) throws BookNotAvailableException {
     if (requestedBooks > availableBooks) {
         // Throw the custom exception if requested books are more than available
         throw new BookNotAvailableException("Requested number of books not available in the inventory");
     } else {
         availableBooks -= requestedBooks;
         System.out.println(requestedBooks + " book(s) borrowed. Remaining books: " + availableBooks);
     }
 }
}

//Example usage of the BookInventory class and the custom exception
public class CustomExceptionExample {
 public static void main(String[] args) {
     BookInventory bookInventory = new BookInventory();

     try {
         // Attempting to borrow more books than available
         bookInventory.borrowBook(15);
     } catch (BookNotAvailableException e) {
         // Catching the custom exception and handling the error
         System.out.println("Borrowing failed: " + e.getMessage());
     }
 }
}