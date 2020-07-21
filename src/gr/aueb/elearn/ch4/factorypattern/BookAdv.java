package gr.aueb.elearn.ch4.factorypattern;


public class BookAdv implements ShoppingItem {
    private String bookTitle;
    private String bookAuthor;
    private String pubYear;

    //static factory method
    static BookAdv getInstance(){
        return new BookAdv();
    }

    // Builder Design Pattern
    public BookAdv title(String bookTitle){
        this.bookTitle = bookTitle;
        return this;
    }

    public BookAdv author(String bookAuthor){
        this.bookAuthor = bookAuthor;
        return this;
    }

    public BookAdv year(String pubYear){
        this.pubYear = pubYear;
        return this;
    }

    public String getBookTitle() {
        return bookTitle;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }
    public String getPubYear() {
        return pubYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", pubYear='" + pubYear + '\'' +
                '}';
    }
}
