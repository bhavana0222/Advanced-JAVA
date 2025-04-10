//1. Create a Book class with bookId, bookName and authorName.
import java.util.ArrayList;

public class Book {

	    int bookId;
	    String bookName;
	    String authorName;

	    // Parameterized constructor to initialize the object
	    public Book(int bookId, String bookName, String authorName) {
	        this.bookId = bookId;
	        this.bookName = bookName;
	        this.authorName = authorName;
	    }

	    // Method to display book details
	    public void displayBookDetails() {
	        System.out.println("Book ID: " + bookId);
	        System.out.println("Book Name: " + bookName);
	        System.out.println("Author Name: " + authorName);
	    }

	    public static void main(String[] args) {
	        // Create an ArrayList of type Book
	        ArrayList<Book> bookList = new ArrayList<>();

	        bookList.add(new Book(1, "The Alchemist", "Paulo Coelho\n"));
	        bookList.add(new Book(2, "Jane Eyre", "Charlotte Bronte\n"));
	        bookList.add(new Book(3, "The Hunger Games", "C.S.Lewis\n"));

	        // Display all book details using an advanced for loop
	        System.out.println("Book Details:\n");
	        for (Book book : bookList) {
	            book.displayBookDetails();
	        }
	    }
	}

//2..Write a Java program that calculates the sum of all even numbers present in an
//ArrayList of integers.
import java.util.ArrayList;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		
		ArrayList<Integer> num=new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(8);
		num.add(9);
		num.add(10);
		
		  // Calculate the sum of even numbers
        int sum = 0;
        for (int number : num) {
            if (number % 2 == 0) { // Check if the number is even
                sum += number; // Add even number to the sum
            }
        }
        // Display the sum
        System.out.println("Sum of even numbers:"+sum);

		
	}

}


