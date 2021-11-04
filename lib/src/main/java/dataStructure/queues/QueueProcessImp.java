package dataStructure.queues;

import lombok.ToString;

@ToString
public class QueueProcessImp implements QueueProcess{

    @ToString
    public class NodeQueue{
        Object object;
        NodeQueue nextNode;

        public NodeQueue(Object obj){
            this.object = obj;
        }
    }

    private NodeQueue head, latest;
    private int numElement;

    @Override
    public void addQueue(Object obj) {
        NodeQueue nodeQueue = new NodeQueue(obj);

        if(this.head == null){
            this.head = nodeQueue;
        }else{
            this.latest.nextNode = nodeQueue;
        }
        this.latest=nodeQueue;
        this.numElement++;
    }

    @Override
    public void delete() {
        if(this.head!=null){
            NodeQueue tmp = this.head;
            this.head = this.head.nextNode;
            tmp.nextNode = null;

            if(this.head==null){
                this.latest = null;
            }
            this.numElement--;
        }
    }

    @Override
    public Object get() {
        if (this.head==null){
            return null;
        }else{
            return this.head.object;
        }
    }

    @Override
    public Object process() {
        return null;
    }

    @Override
    public int size() {
        return this.numElement;
    }
}
