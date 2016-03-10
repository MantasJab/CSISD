/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.Vector;

public class SetOfBooks extends Vector<Book> 
{
    public SetOfBooks(){
        super();
    }

    public void addBook(Book aBook){
        super.add(aBook);
    }
    
    public void removeBook(int index) {
        super.remove(index);
    }
}
