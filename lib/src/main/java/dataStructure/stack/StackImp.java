package dataStructure.stack;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class StackImp implements Stack{

    @Getter
    @Setter
    @ToString
    public class Node{
        private Object data;
        private Node nextNode;

        public Node(Object data){
            this.data=data;
        }
    }

    private Node top = null;
    private int numElement=0;

    @Override
    public void push(Object data) {
        Node node = new Node(data);
        node.nextNode = this.top;
        this.top = node;
        this.numElement++;
    }

    @Override
    public void pop() {
        if(!this.isEmpty()){
            Node tmp = this.top;
            this.top = this.top.nextNode;
            tmp = null;
            this.numElement--;
        }

    }

    @Override
    public Object peek() {
        if(this.top==null){
            return null;
        }else{
            return this.top.data;
        }
    }

    @Override
    public boolean isEmpty() {
        return this.top==null;
    }

    @Override
    public int size() {
        return this.numElement;
    }
}
