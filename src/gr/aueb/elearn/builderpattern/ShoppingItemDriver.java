package gr.aueb.elearn.builderpattern;

import java.awt.*;

public class ShoppingItemDriver {

    public static void main(String[] args) {

        ShoppingItem book = new Book.Builder()
                .bookAuthor("giannis")
                .bookTitle("Java Advanced")
                .pubYear("2019")
                .build();

        Transactions.saveTransactionItem(book);
        Transactions.showTransactions();
    }
}
