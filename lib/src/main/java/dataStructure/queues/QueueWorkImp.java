package dataStructure.queues;

import dataStructure.Work;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class QueueWorkImp implements Queue<Work>{

    @Getter
    @Setter
    @ToString
    public class Node{
        private Work work;
        private Node nextNode;

        public Node(Work work){
            this.work=work;
        }
    }

    private int numElement=0;
    Node head, latest;

    @Override
    public void offer(Work work) {
        Node nodeWork = new Node(work);

        if(this.head==null){
            this.head = nodeWork;
        }else{
            this.latest.setNextNode(nodeWork);
        }
        this.latest=nodeWork;
        this.numElement++;
    }

    @Override
    public void poll() {
        if(this.head!=null){
            Node tmp = this.head;
            this.head = this.head.getNextNode();
            tmp.setNextNode(null);
            this.numElement--;
        }
    }

    @Override
    public Work peek() {
        if(this.head!=null){
            return this.head.getWork();
        }
        return null;
    }

    @Override
    public int size() {
        return this.numElement;
    }
}
