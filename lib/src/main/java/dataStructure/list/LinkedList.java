package dataStructure.list;

import lombok.Getter;
import lombok.extern.java.Log;

@Log
@Getter
public class LinkedList {

    private Node head;
    private int numElement;
    
    public LinkedList() {
        this.head = null;
        this.numElement = 0;
    }

    public void insertFirst (Object element) {
        this.head = new Node(element, this.head);
        this.numElement++;
    }

    public void insertLatest(Object element) {

        if(this.head == null){
            insertFirst(element);
        }else{
            Node current = this.head;
            while(current.getNext()!=null){
                current = current.getNext();
            }
            current.setNextNode(new Node(element, null));
            this.numElement++;
        }
    }

    public void insertSpecific(Object element) {
        if (this.head == null) {
            insertFirst(element);
        }else{
            Node specificNode = this.head;
            while (specificNode.getNext()!= null) {
                if(specificNode.getElement()==element){
                    break;
                }
                specificNode = specificNode.getNext();
            }
            if(specificNode.getNext()==null){
                specificNode.setNextNode(new Node(element, null));
            }else{
                specificNode.setNextNode(new Node(element, specificNode.getNextNode()));
            }

            this.numElement++;
        }
    }

    public void deleteNode(Object element) {
        if(this.head == null){
            log.info("Empty List");
        }else{
            if(this.head.getElement()==element){
                this.head=this.head.getNext();
                this.numElement--;
            }else{
                Node current = this.head;
                while (current.getNext()!=null && current.getNext().getElement() != element) {
                    current = current.getNext();
                    if (current.getNext()==null) {
                        log.info("the element is not in the Linked List");
                    }else{
                        current.setNextNode(current.getNext().getNext());
                        this.numElement--;
                    }
                }
            }
        }
    }

    public void deletePosition(int position){
        if(position>this.numElement){
            log.info("out of Range");
            return;
        }
        if(this.head!=null){
            if(0==position){
                Node tmp = this.head;
                this.head = this.head.getNext();
                tmp.setNextNode(null);
                this.numElement--;
                return;
            }
            Node current = this.head;
            int count = 0;
            while (count < (position-1)){
                current=current.getNext();
                count++;
            }
            Node tmp = current.getNext();
            current.setNextNode(tmp.getNext());
            tmp.setNextNode(null);
            this.numElement--;
        }
    }

    public void deleteLatest(){
        if (this.head==null){
            log.info("List Empty");
        }else{
            Node current = this.head;
            while(current.getNext().getNext()!=null){
                current= current.getNext();
            }
            current.setNextNode(null);
            this.numElement--;
        }
    }

    public boolean isEmpty(){
        return this.head==null;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        Node current = this.head;

        str.append("\nList toString");
        while (current.getNext()!= null) {
            str.append("\n"+current.getElement());
            current = current.getNext();
        }
        str.append("\n"+current.getElement()+"\n");
        return str.toString();
    }

}
