package dataStructure.tree;

public interface Tree<T extends Comparable> {

    void add(T generic);
    boolean isExist(int id);
    T get (int id);
    boolean isLeaf();
    boolean isEmpty();
    void preOrder();
    void postOrder();
    void inOrder();
    void delete(int id);

}
