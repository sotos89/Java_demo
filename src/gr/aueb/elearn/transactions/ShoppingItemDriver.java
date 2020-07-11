package gr.aueb.elearn.transactions;

public class ShoppingItemDriver {
    public static void main(String[] args) {
        ShoppingItem book1 = new Book("Java Advance", "Author", "2019");
        ShoppingItem cd1 = new CD("1", "Unforgiven", "Metallica");

        Transactions.saveTransactionItem(book1);
        Transactions.saveTransactionItem(cd1);
        System.out.println("Book transactions");
        Transactions.showBookTransactions();
        System.out.println("\ncd transactions");

        Transactions.showCDTransactions();

//        Transactions.showTransactions();
    }

}
