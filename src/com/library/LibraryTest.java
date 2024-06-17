// Package declaration, this file belongs to the com.library package 
package src.com.library;

// Test class for testing Library Management System functionalities
public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library(); // Create a new instance of Library 

        // Test case 1: Adding a Book
        library.addBook(new Book("Java Programming", "John Doe")); // Add a book
        library.viewBooks(); // View all books to verify the addition 
        
        // Test case 2: Adding a Member
        library.addMember(new Member("Alice")); // Add a member 
        library.viewMembers(); // View all members to verify the addition 

        // Test case 3: Issuing a Book 
        library.issueBook("Java Programming", "Alice"); // Issue a book to a member
        library.viewBooks();

        // Test case 4: Returning a Book 
        library.returnBook("Java Programming", "Alice"); // Return a book from a member
        library.viewBooks(); // View all books to verify the book is marked as not issued

        // Test case 5: Viewing Books
        library.addBook(new Book("Python Basics", "Jane Smith")); // Add another book
        library.addBook(new Book("SQL Fundamentals", "Michael Johnson")); // Add another book
        library.viewBooks(); // View all members to ensure all members are displayed 

        // Test case 6: Viewing Members 
        library.addMember(new Member("Bob")); // Add another member
        library.addMember(new Member("Eve")); // Add another member 
        library.viewMembers(); // View all members to ensure all members are displayed 
    }
}
