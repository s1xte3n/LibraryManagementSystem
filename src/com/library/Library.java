// Package declaration, this file belongs to the com.library package 
package src.com.library;

// Import statements to use ArrayList and List from java.util package
import java.util.ArrayList;
import java.util.List;

// Library class to manage books and members 
public class Library {
    // List to store books in the library 
    private List<Book> books;
    // List to store members of the library 
    private List<Member> members;

    // Constructor to initialize the library 
    public Library() {
        books = new ArrayList<>(); // Initialize the books list 
        members = new ArrayList<>(); // Initialize the members list 

        // Initialize the library with some predefined books and members 
        initBooks();
        initMembers();
    }

    // Method to add a book to the library 
    public void addBook(Book book) {
        books.add(book); // Add the book to the books list 
        System.out.println("Book added: " + book); // Print confirmation message 
    }

    // Method to add a member to the library 
    public void addMember(Member member) {
        members.add(member); // Add the member to the members list 
        System.out.println("Member added: " + member); // Print confirmation message 
    }

    // Method to issue a book to a member 
    public void issueBook(String title, String memberName) {
        Book book = findBook(title); // Find the book by title
        if (book != null && !book.isIssued()) {
            book.setIssued(true);
            System.out.println("Book issued: " + book); // Print confirmation message
        } else {
            System.out.println("Book not available or already issued"); // Print error message
        }
    }

    // Method to return a book from a member 
    public void returnBook(String title, String memberName) {
        Book book = findBook(title); // Find the book by title 
        if (book != null && book.isIssued()) {
            book.setIssued(false); // Mark the book as not issued 
            System.out.println("Book returned: " + book); // Print confirmation message
        } else {
            System.out.println("Book not found or not issued"); // Print error message
        }
    }

    // Method to display all books in the library 
    public void viewBooks() {
        System.out.println("Books in the library: ");
        for (Book book: books) {
            System.out.println(book); // Print details of each book
        }
    }

    // Method to display all members of the library 
    public void viewMembers() {
        System.out.println("Members of the library: ");
        for (Member member: members) {
            System.out.println(member); // Print details of each member 
        }
    }

    // Method to find a book by its title
    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book; // Return the book if title matches 
            }
        }
        return null; // Return null if book is not found 
    } 

    // Method to find a member by name 
    public Member findMember(String name) {
        for (Member member: members) {
            if (member.getName().equalsIgnoreCase(name)) {
                return member; // Return the member if name matches (case-insensitive)
            }
        }
        return null; // Return null if member is not found 
    } 

    // Method to initialize some sample books in the library 
    private void initBooks() {
        addBook(new Book("Java Programming", "John Doe"));
        addBook(new Book("Python Basics", "Jane Smith"));
        addBook(new Book("SQL Fundamentals", "Michael Johnson"));
    }

    // Method to initialize some sample members in the library 
    private void initMembers() {
        addMember(new Member("Alice"));
        addMember(new Member("Bob"));
        addMember(new Member("Eve"));
    }
}
