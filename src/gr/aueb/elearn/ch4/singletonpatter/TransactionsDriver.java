package gr.aueb.elearn.ch4.singletonpatter;

public class TransactionsDriver {
    public static void main(String[] args) {
        /*TransactionsSingleton transactionsSingleton = TransactionsSingleton.TRANSACTIONS_SINGLETON_INSTANCE;
        System.out.println(transactionsSingleton);

        TransactionsSingleton transactionsSingleton2 = TransactionsSingleton.TRANSACTIONS_SINGLETON_INSTANCE;
        System.out.println(transactionsSingleton2);*/

        TransactionsSingleton2 transactionsSingleton2 = TransactionsSingleton2.getInstance();
        System.out.println(transactionsSingleton2);

        TransactionsSingleton2 transactionsSingleton3 = TransactionsSingleton2.getInstance();
        System.out.println(transactionsSingleton3);
    }
}
