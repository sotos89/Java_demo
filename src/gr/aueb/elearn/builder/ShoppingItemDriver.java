package gr.aueb.elearn.builder;
import java.awt.*;


public class ShoppingItemDriver {
    public static void main(String[] args) {
        Toolkit.getDefaultToolkit().beep();

        ShoppingItem book0 = BookAdv.getInstance()
                .title("Java Advanced")
                .author("giannis")
                .year("2019");

        ShoppingItem cd0 = CDAdv.getInstance()
                .id("0")
                .title("New song")
                .cdProducer("french latino");

        Transactions.saveTransactionItem(book0);
        Transactions.saveTransactionItem(cd0);
        Transactions.showTransactions();
    }
}
