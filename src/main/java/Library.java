import java.util.ArrayList;

public class Library {

    //ArrayList - Для динамического увелинения ячеек массива
    private ArrayList<Book> books = new ArrayList<>();

    //
    public void addBook (Book book){
        this.books.add(book);
    }

    public void printAvailableBooks(){
        for(Book book : this.books) {
            if(book.isAvailable()){
                System.out.printf("%n---Название: %s---%n", book.getTitle());
            }
        }
    }
    // 14 строка аналогична 23ей
    public ArrayList<Book> findBooksByAuthor(String author){

        ArrayList<Book> booksByAuthor = new ArrayList<>();

        for(int i = 0; i < this.books.size(); i++){
            if(this.books.get(i).getAuthor().equals(author)){
                booksByAuthor.add(this.books.get(i));
            }
        }
        return booksByAuthor;
    }


    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
