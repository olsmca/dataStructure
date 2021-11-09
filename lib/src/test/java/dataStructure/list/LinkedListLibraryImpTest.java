package dataStructure.list;

import dataStructure.Library;
import lombok.extern.java.Log;
import org.junit.Test;

@Log
public class LinkedListLibraryImpTest {

    /**@Rule
    public ExpectedException exceptionRule = ExpectedException.none();*/

    @Test
    public void addElementToList(){
        LinkedList linkedList = new LinkedListLibraryImp();
        System.out.println(linkedList);
        linkedList.deletePosition(0);

        /**exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("List empty");
        linkedList.deleteLatest();*/

        linkedList.insertLatest(new Library(1,"Harry Potter", "J. K."));
        linkedList.insertFirst(new Library(2,"Harry Potter la piedra", "J. K."));
        linkedList.insertLatest(new Library(3,"Harry Potter la camara", "J. K."));
        linkedList.insertFirst(new Library(4,"Harry Potter el caliz", "J. K."));
        System.out.println(linkedList);
        linkedList.deleteLatest();
        System.out.println(linkedList);
        linkedList.deleteFirst();
        System.out.println(linkedList);
        linkedList.deletePosition(1);
        System.out.println(linkedList);
        linkedList.deletePosition(0);
        System.out.println(linkedList);

        linkedList.insertOrder(new Library(1,"Harry Potter", "J. K."));
        linkedList.insertOrder(new Library(3,"Harry Potter la piedra 2", "J. K."));
        linkedList.insertOrder(new Library(4,"Harry Potter la piedra 1", "J. K."));
        linkedList.insertOrder(new Library(7,"Harry Potter el caliz", "J. K."));
        linkedList.insertOrder(new Library(2,"Harry Potter el caliz", "J. K."));
        linkedList.insertOrder(new Library(8,"Harry Potter la camara", "J. K."));
        linkedList.insertOrder(new Library(5,"Harry Potter final parte 1", "J. K."));

        System.out.println(linkedList);
    }
}
