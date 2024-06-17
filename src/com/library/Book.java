// Package declaration, this file belongs to the com.library package
package src.com.library;

// Book class representing a book in the library 
public class Book {
    // Attributes of the book 
    private String title; // Title of the book
    private String author; // Author of the book
    private boolean isIssued; // Status of the book (issued or not)

    // Constructor to initialize book details 
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false; // By default, the book is not issued
    }

    // Getter method for book title 
    public String getTitle() {
        return title;
    }

    // Getter method for book author 
    public String getAuthor() {
        return author;
    }

    // Method to check if the book is issued 
    public boolean isIssued() {
        return isIssued;
    }

    // Method to set the issued status of the book 
    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    // Override toString method to display book details 
    @Override
    public String toString() {
        return  "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isIssued=" + isIssued + 
                '}';
    }
}
