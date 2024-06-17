// Package declaration, this file belongs to the com.library package
package src.com.library;

// Member class representing a member of the library 
public class Member {
    // Attribute of the member 
    private String name; // Name of the the member 

    // Constructor to initialize member name
    public Member(String name) {
        this.name = name;
    }

    // Getter method for member name 
    public String getName() {
        return name;
    }

    // Override toString method to display member details 
    @Override
    public String toString() {
        return  "Member{" +
                "name='" + name + '\'' +
                '}';
    }
}
