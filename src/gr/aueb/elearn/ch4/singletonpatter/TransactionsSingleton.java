package gr.aueb.elearn.ch4.singletonpatter;

public class TransactionsSingleton {
    public static final TransactionsSingleton TRANSACTIONS_SINGLETON_INSTANCE = new TransactionsSingleton();
    private TransactionsSingleton(){}
}
