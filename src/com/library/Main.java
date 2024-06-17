// Package declaration, this file belongs to the com.library package
package src.com.library;

// Import statements to use Scanner class from java.util package 
import java.util.Scanner;

// Main class of the application 
public class Main {
    public static void main(String[] args) {
        // Create a new instance of Library to manage books and members 
        Library library = new Library();

        // Create a Scanner object to read user input from the console 
        Scanner scanner = new Scanner(System.in);

        try{
            // Infinite loop to continuously display the menu until user exits 
            while (true) {
                // Display the menu options to the user 
                System.out.println("1. Add Book");
                System.out.println("2. Add Member");
                System.out.println("3. Issue Book");
                System.out.println("4. Return Book");
                System.out.println("5. View Books");
                System.out.println("6. View Members");
                System.out.println("7. Search Book");
                System.out.println("8. Search Member");
                System.out.println("0. Exit");
                System.out.println("Enter your choice: ");

                // Read the user's choice and convert it to an integer
                int choice = scanner.nextInt();

                //Consume the newLine character left by nextInt() to avoid input issues 
                scanner.nextLine();

                // Execute different actions based on the user's choice 
                switch (choice) {
                    case 1:
                        // Add a new book to the library 
                        System.out.println("Enter book title: ");
                        String title = scanner.nextLine(); // Read the title from the user
                        System.out.println("Enter book author: ");
                        String author = scanner.nextLine(); // Read the book author from the user 
                        library.addBook(new Book(title, author)); // Create a new Book object and add it to the library
                        break;
                    case 2:
                        // Add a new member to the library 
                        System.out.println("Enter member name: ");
                        String name = scanner.nextLine(); // Read the member name from the user
                        library.addMember(new Member(name)); // Create a new Member object and add it to the library
                        break;
                    case 3: 
                        // issue a book to a member 
                        System.out.println("Enter a book title: ");
                        title = scanner.nextLine(); // Read the book title from the user
                        System.out.println("Enter member name: ");
                        name = scanner.nextLine(); // Read the member name from the user 
                        library.issueBook(title, name); // Issue the specified book to the specified member 
                        break;

                    case 4: 
                        // Return a book from a member 
                        System.out.println("Enter book title: ");
                        title = scanner.nextLine(); // Read the book title from the user
                        System.out.println("Enter member name: ");
                        name = scanner.nextLine(); // Read the member name from the user
                        library.returnBook(title, name); // Return the specified book from the specified member

                        break;

                    case 5:
                        // View all books in the library 
                        library.viewBooks(); // Display the list of all books in the library 

                        break;

                    case 6: 
                        // View all members of the library 
                        library.viewMembers(); // Display the list of all members in the library

                        break;

                    case 7: 
                        // Search Book functionality
                        System.out.println("Enter book title to search: ");
                        String bookTitle = scanner.nextLine(); // Read book title from user
                        Book foundBook = library.findBook(bookTitle); // Search for the book 
                        if (foundBook != null) {
                            System.out.println("Book found: " + foundBook); // Display the found book
                        } else {
                            System.out.println("Book not found");
                        }

                        break;
                    
                    case 8: 
                        // Search Member functionality 
                        System.out.println("Enter member name to search: ");
                        String memberName = scanner.nextLine(); // Read member name from user 
                        Member foundMember = library.findMember(memberName); // Search for the member 
                        if (foundMember != null) {
                            System.out.println("Member found: " + foundMember); // Display the found member 
                        } else {
                            System.out.println("Member not found");
                        }

                        break;

                    case 0:
                        // Exit the program 
                        System.out.println("Exiting...");
                        System.exit(0); // Terminate the program

                        break;
                    default:
                        // Handle invalid user input
                        System.out.println("Invalid choice");

                        break;
                }
            } 
        }finally{
            // Close the Scanner object to release the resource 
            scanner.close();
        }              
    }    
}