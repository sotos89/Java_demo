package gr.aueb.elearn.ch6.generics;

public class NodeGeneric<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
