package gr.aueb.elearn.builder;


public class BookAdv implements ShoppingItem {
    private String bookTitle;
    private String bookAuthor;
    private String pubYear;

    public static BookAdv getInstance(){
        return new BookAdv();
    }

    public BookAdv title(String bookTitle){
        this.bookTitle = bookTitle;
        return this;
    }

    public BookAdv author(String bookAuthor){
        this.bookAuthor = bookAuthor;
        return this;
    }

    //static factory method
    public BookAdv year(String pubYear){
        this.pubYear = pubYear;
        return this;
    }

    //Builder Design Pattern
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
