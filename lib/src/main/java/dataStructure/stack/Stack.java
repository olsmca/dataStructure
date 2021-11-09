package dataStructure.stack;

public interface Stack <T extends Comparable>{
    void push(Object data);
    void pop();
    Object peek();
    boolean isEmpty();
    int size();
}
