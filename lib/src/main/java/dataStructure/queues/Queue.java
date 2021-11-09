package dataStructure.queues;

public interface Queue <T extends Comparable>{

    void offer(T obj);
    void poll();
    T peek();
    int size();
}
