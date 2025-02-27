import java.util.ArrayList; //this to create a dynamic array 

class lib1 {

    private ArrayList<String> issuedBooks;
    private ArrayList<String> availableBooks;

    // constructor to initialize dynamic arrays
    public lib1() {
        this.availableBooks = new ArrayList<>();
        this.issuedBooks = new ArrayList<>();
    }

    // method to add book to the library
    public void addBooks(String book) {
        availableBooks.add(book);
        System.out.println("you added '" + book + "' to the library");
    }

    // method to issue a book
    public void issueBook(String book) {
        if (availableBooks.contains(book)) {
            availableBooks.remove(book);
            issuedBooks.add(book);
            System.out.println("book '" + book + "' has been issued");
        } else {
            System.out.println("sorry the book is not available");
        }
    }

    // method to return a book
    public void returnbook(String book){
        if (issuedBooks.contains(book)){
            issuedBooks.remove(book);
            availableBooks.add(book);
            System.out.println("you returned "+book+ " book" );
        }
        else{
            System.out.println("error "+book+" books was not issued");
        }
    }
    
    // method to display available books
    public void dispbooks(){
        if (availableBooks.isEmpty()) {
            System.out.println("no books available in the library");
        }
        else{
            System.out.println("available book"+availableBooks);
        }
    }
}

public class library {
    public static void main(String[] args) {
        lib1 obj1 = new lib1();

        obj1.addBooks("harry potter");
        obj1.addBooks("alchemist");
        obj1.addBooks("ikigai");
        obj1.addBooks("ate that frog");

        // obj1.dispbooks();

        obj1.issueBook("harry potter");
        obj1.issueBook("alchemist");
        obj1.issueBook("ikigai");
        obj1.issueBook("ate that frog");

        obj1.dispbooks();
    }
}