import java.util.ArrayList;

public class Main {

    private static final Library library = new Library();

    static void initLibrary(){

        Book book1 = new Book("Kebab","Serega", 10, true);
        Book book2 = new Book("Burgir","Illya", 20,true);
        Book book3 = new Book("Nuggets","Sanya", 30,true);
        Book book4 = new Book("Cola","Petya", 40,true);
        Book book5 = new Book("Shaurma","Serega", 11,true);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

    }

    public static void main(String[] args){

        initLibrary();


        borrowBook(library.getBooks().get(1));

        displayInfo(library.getBooks().get(1));

        library.printAvailableBooks();

        ArrayList<Book> foundBooks = library.findBooksByAuthor("Serega");

        for(int i = 0; i < foundBooks.size(); i++){
            displayInfo(foundBooks.get(i));
        }

    }

    static void borrowBook(Book book) {
        if(book.isAvailable())
        {
            book.setAvailable(false);
            System.out.println("Я забираю книгу");
        }
        else{
            System.out.println("Книга не досутпна");
        }
    }


    static void returnBook(Book book) {
        if(book.isAvailable())
        {
            System.out.println("Книга уже возвращена");
        }
        else{
            book.setAvailable(true);
            System.out.println("Я возвращаю книгу");
        }
    }


    static void displayInfo(Book book) {

        System.out.printf("%n---Название: %s, Автор: %s, год: %d, наличие: %b---%n", book.getTitle(), book.getAuthor(), book.getYear(), book.isAvailable());

    }




}
