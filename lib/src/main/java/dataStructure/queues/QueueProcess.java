package dataStructure.queues;

public interface QueueProcess {

    void addQueue(Object obj);
    void delete();
    Object get();
    int size();
    Object process(); //optional
}
