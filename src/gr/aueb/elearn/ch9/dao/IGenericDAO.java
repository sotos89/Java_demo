package gr.aueb.elearn.ch9.dao;

/**
 * provides CRUD operation
 * @param <T> generic class
 */
public interface IGenericDAO<T> {
    boolean save(T t);
    void update(T t, T newT);
    T delete(T t);

    <K extends T> K getInstanceOf(Class<K> clazz) throws IllegalAccessException, InstantiationException;
    void showList();
}
