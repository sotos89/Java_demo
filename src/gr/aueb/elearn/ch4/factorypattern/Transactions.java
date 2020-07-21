package gr.aueb.elearn.ch4.factorypattern;

public class Transactions {

    public enum ItemType {Book, CD}

    private static ShoppingItem[] transactions = new ShoppingItem[100];
    private static int pivot = 0;

    public static ShoppingItem createShoppingItem (ItemType itemType) {
        switch (itemType) {
            case Book:
                return BookAdv.getInstance();
            case CD:
                return CDAdv.getInstance();
            default:
                return null;
        }
    }

    public static <T extends ShoppingItem> T createShoppingItem (Class<T> item) throws IllegalAccessException, InstantiationException {
        return item.newInstance();
    }


    public static void saveTransactionItem(ShoppingItem shoppingItem){
        transactions[pivot++] = shoppingItem;
    }

    public static void showTransactions() {
        for (ShoppingItem shoppingItem : transactions){
            if (shoppingItem != null)
                System.out.println(shoppingItem);
        }
    }

    public static void showBookTransactions() {
        for (ShoppingItem shoppingItem : transactions){
            if (shoppingItem instanceof BookAdv)
                System.out.println(shoppingItem);
        }
    }

    public static void showCDTransactions() {
        for (ShoppingItem shoppingItem : transactions){
            if (shoppingItem instanceof CDAdv)
                System.out.println(shoppingItem);
        }
    }
}
