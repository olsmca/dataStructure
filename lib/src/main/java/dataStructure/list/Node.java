package dataStructure.list;

import lombok.Getter;

@Getter
class Node {
    private Object element;
    private Node nextNode;

    Node(Object element, Node nextNode) {
        this.element=element;
        this.nextNode = nextNode;
    }
    
    public Object getElement() {
        return this.element;
    }

    public Node getNext() {
        return this.nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
