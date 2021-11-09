package dataStructure.list;

import dataStructure.Library;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class LinkedListLibraryImp implements LinkedList<Library>{

    @Getter
    @Setter
    @ToString
    public class Node{
        private Library library;
        private Node nextNode;

        public Node(Library library, Node nextNode){
            this.library=library;
            this.nextNode = nextNode;
        }
    }

    private int numElement;
    private Node head;

    public LinkedListLibraryImp(){
        this.numElement=0;
    }

    @Override
    public void insertFirst(Library library) {
       this.head = new Node(library, this.head);
       this.numElement++;
    }

    @Override
    public void insertLatest(Library library) {
        if(this.head ==null){
            insertFirst(library);
        }else{
            Node current = this.head;
            while (current.getNextNode()!=null){
                current = current.getNextNode();
            }
            current.setNextNode(new Node(library, null));
            this.numElement++;
        }
    }

    @Override
    public void deleteFirst() {
        if(this.head== null){
            throw new RuntimeException("List empty");
        }else{
            Node tmp = this.head;
            this.head = this.head.getNextNode();
            tmp.setNextNode(null);
            this.numElement--;
        }
    }

    @Override
    public void deleteLatest() {
        if(this.head == null){
            throw new RuntimeException("List empty");
        }else{
            Node current=this.head;
            while (current.getNextNode().getNextNode()!=null){
                current = current.getNextNode();
            }
            current.setNextNode(null);
            this.numElement--;
        }
    }

    @Override
    public void deletePosition(int position) {
        if(position>this.numElement){
            throw new IndexOutOfBoundsException("Range out");
        }
        if(this.head!=null){
            if(0==position){
                deleteFirst();
            }else{
                Node current = this.head;
                int count =0;
                while (current.nextNode!= null && count< (position-1)){
                    current=current.getNextNode();
                    count++;
                }
                Node tmp = current.getNextNode();
                current.setNextNode(tmp.getNextNode());
                tmp.setNextNode(null);
                this.numElement--;
            }
        }
    }

    @Override
    public void insertOrder(Library library) {
        if(this.head==null){
            insertFirst(library);
        }else{
            Node current = this.head;
            if(library.compareTo(current.getLibrary())<0){
                insertFirst(library);
            }else{
                while (current.getNextNode()!=null){
                  if(current.getNextNode().getLibrary().compareTo(library)>0){
                      Node tmp = current.getNextNode();
                      current.setNextNode(new Node(library, tmp));
                      this.numElement++;
                      return;
                  }
                  current = current.getNextNode();
                }
                insertLatest(library);
                return;
            }
        }
    }

    @Override
    public void deleteSpecific(Library library) {
        if(this.head == null){
            throw new RuntimeException("List empty");
        }else{
            Node current = this.head;
            while(current.getNextNode()!=null && current.getNextNode().getLibrary()!= library){
                current = current.getNextNode();
                if(current.getNextNode()==null){
                    throw new RuntimeException("This element does not exist in the List");
                }else{
                    Node tmp = current.getNextNode();
                    current.setNextNode(current.getNextNode().getNextNode());
                    tmp.setNextNode(null);
                    this.numElement--;
                }

            }
        }
    }
}
