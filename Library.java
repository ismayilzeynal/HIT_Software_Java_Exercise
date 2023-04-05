import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library 
{
    private List<Book> availableBooks;
    private Map<Book, Integer> loanedBooks;

    public Library() 
    {
        availableBooks = new ArrayList<Book>();
        loanedBooks = new HashMap<Book, Integer>();
    }

    public void addNewBook(Book book) 
    {
        availableBooks.add(book);
    }

    public boolean findAvailableBook(Book book) 
    {
        for(int i=0; i<availableBooks.size();i++)
        {
            if(availableBooks.get(i).getTitle() == book.getTitle() && availableBooks.get(i).getAuthorFirstName()==book.getAuthorFirstName() && availableBooks.get(i).getAuthorLastName()==book.getAuthorLastName())                                          
                return true;
        }
        return false;
    }

    public boolean checkIfBookExistsInLibrary(Book book) 
    {
        if(findAvailableBook(book) || loanedBooks.containsKey(book))
            return true;
        return false;
    }

    public void loanBook(int readerId, Book book) 
    {
        if(readerId<1 || book==null)
        {
            System.out.println("Something entered wrong. Please check and retry");
            return;
        }
        if (!availableBooks.contains(book)) 
        {
            System.out.println("Book is not available for loan, beacuse we haven't");
            return;  // may be we can write else instead of this
        }
        availableBooks.remove(book);
        loanedBooks.put(book, readerId);
    }

    public void returnBook(int readerId, Book book) 
    {
        if(readerId<1 || book==null)
        {
            System.out.println("Something entered wrong. Please check and retry");
            return;
        }
        if (!loanedBooks.containsKey(book)) 
        {
            System.out.println("Book was not loaned for this reader");
            return;
        }
        if (loanedBooks.get(book) != readerId) 
        {
            System.out.println("Book was loaned for another reader.");
            return;
        }
        loanedBooks.remove(book);
        availableBooks.add(book);
    }
}
// Somewhere I use "return;" inside methods (functions) beacuse I this it's vest of time for "if else" and this form is more clean code