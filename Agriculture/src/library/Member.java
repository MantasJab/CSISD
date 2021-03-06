/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;
/**
 *
 * @author Kutoma
 */
public class Member {
    private String name;
    private int memberNumber;
    private SetOfBooks currentLoans = new SetOfBooks();
    private static int memberCount = 0;
    
    public Member(String aName){
        name = aName;
        memberNumber = memberCount++;
        currentLoans = new SetOfBooks();
    }

    public String toString(){
        return Integer.toString(memberNumber) + " " + name;
        
    }
    
    public String getName() {
        return name;
    }
    
    public int getNumber() {
        return memberNumber;
    }

    public void borrowBook(Book aBook){
        currentLoans.addBook(aBook);
        aBook.setBorrower(this);
    }
     public void returnBook(int index) {
         currentLoans.removeBook(index);
     }
    public static int getMemberCount() {
        return memberCount;
    }
    
    public SetOfBooks getMemberBooks() {
        return currentLoans;
    }
    
}

