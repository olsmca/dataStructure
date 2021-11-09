package dataStructure.stack;

import dataStructure.URL;
import jdk.jfr.Threshold;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class StackUrlImp implements Stack<URL>{

    @Getter
    @Setter
    @ToString
    public class Node {
        private Object url;
        private Node nextNode;

        public Node(Object url){
            this.url = url;
        }
    }

    private Node top=null;
    private int numElement=0;

    @Override
    public void push(Object data) {
        Node node = new Node(data);
        node.setNextNode(this.top);
        this.top = node;
        this.numElement++;
    }

    @Override
    public void pop() {
        if(!isEmpty()){
            Node tmp = this.top;
            this.top = this.top.nextNode;
            tmp = null;
            this.numElement--;
        }
    }

    @Override
    public Object peek() {
        return this.top!=null?this.top.getUrl():null;
    }

    @Override
    public boolean isEmpty() {
        return this.top==null;
    }

    @Override
    public int size() {
        return 0;
    }
}
