package dataStructure.stack;

public interface Stack {
    void push(Object data);
    void pop();
    Object peek();
    boolean isEmpty();
    int size();
}
