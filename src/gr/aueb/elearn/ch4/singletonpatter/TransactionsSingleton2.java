package gr.aueb.elearn.ch4.singletonpatter;

public class TransactionsSingleton2 {
    private static final TransactionsSingleton2 TRANSACTIONS_SINGLETON_INSTANCE = new TransactionsSingleton2();
    private TransactionsSingleton2(){}
    public static TransactionsSingleton2 getInstance() {
        return TRANSACTIONS_SINGLETON_INSTANCE;
    }

}
