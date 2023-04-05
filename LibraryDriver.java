public class LibraryDriver {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book( "Rich dad, poor dad",  "RandomName", "RandomSurname");
        library.addNewBook(book1);        
        
        Book book2 = new Book("The Lost City", "Samantha", "Jones");
        library.addNewBook(book2);       
        
        Book book3 = new Book("Echoes in the Wind", "David", "Nguyen");
        library.addNewBook(book3);
        
        Book book4 = new Book("The Secret Garden", "Maggie", "Johnson");
        library.addNewBook(book4);
        
        Book book5 = new Book("Beyond the Horizon", "Daniel", "Kim");
        library.addNewBook(book5);        
        
        Book book6 = new Book("The Last Time We Met", "Emily", "Chen");
        library.addNewBook(book6);

        // check for availaible -> output: available (true)
        if(library.findAvailableBook(new Book("Echoes in the Wind", "David", "Nguyen")))
            System.out.println("This book is available");
        else
            System.out.println("Sorry, but this book isn't available");

        // check if is there this book
        if(library.checkIfBookExistsInLibrary(new Book("The Secret Garden", "Maggie", "Johnson")))           //  if(library.checkIfBookExistsInLibrary(book4))
            System.out.println("There is this book in library");
        else
            System.out.println("There is not this book in our library");

        // loan a book
        library.loanBook(123,book2);

        // return a book
        library.returnBook(123,book2);
    }
}


// also I think we need reader class too (for readId and some process with it)