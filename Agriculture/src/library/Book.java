package library;

public class Book {

    private String title;
    private Member borrower = null;
    private static int bookCount = 0;
    private int accessionNumber;

    public Book(String name){
        title = name;
        accessionNumber = bookCount++;
    }

    void setBorrower(Member theBorrower) {
        borrower = theBorrower;
    }

    Member getBorrower() {
        return borrower;
    }

    public String toString() {
        return title;
    }
}
