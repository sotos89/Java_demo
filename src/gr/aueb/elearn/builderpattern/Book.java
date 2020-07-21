package gr.aueb.elearn.builderpattern;

public class Book implements ShoppingItem {
    private final String bookTitle;
    private final String bookAuthor;
    private final String pubYear;

    public static class Builder{
        private String bookTitle;
        private String bookAuthor;
        private String pubYear;

        // Builder Design Pattern
        public Builder bookTitle(String bookTitle){
            this.bookTitle = bookTitle;
            return this;
        }

        public Builder bookAuthor(String bookAuthor){
            this.bookAuthor = bookAuthor;
            return this;
        }

        public Builder pubYear(String pubYear){
            this.pubYear = pubYear;
            return this;
        }

        // Factory method
        public Book build(){
            return new Book(this);
        }
    }

    // Constructor
    public Book(Builder builder){
        this.bookAuthor = builder.bookAuthor;
        this.bookTitle = builder.bookTitle;
        this.pubYear = builder.pubYear;
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
