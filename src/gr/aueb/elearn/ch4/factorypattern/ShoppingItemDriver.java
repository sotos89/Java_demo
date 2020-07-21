package gr.aueb.elearn.ch4.factorypattern;

import java.awt.*;

/**
 * Abstract Factory Design Pattern
 */

public class ShoppingItemDriver {
    public static void main(String[] args) {
        Toolkit.getDefaultToolkit().beep();

        try {
            BookAdv book0 = Transactions.createShoppingItem(BookAdv.class);
            book0.author("Giannis Sotiris").title("Java EE Advance").year("2020");

            CDAdv cd0 = Transactions.createShoppingItem(CDAdv.class);
            cd0.id("1").title("New Song").cdProducer("Pink Floyd");

            Transactions.saveTransactionItem(book0);
            Transactions.saveTransactionItem(cd0);

            Transactions.showTransactions();
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
