package dataStructure.list;

public interface LinkedList <T extends Comparable> {

    void insertFirst(T obj);
    void insertLatest (T obj);
    void deleteFirst();
    void deleteLatest();
    void deletePosition(int position);
    void insertOrder(T obj);
    void deleteSpecific(T obj);
}
