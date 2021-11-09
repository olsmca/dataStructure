package dataStructure.list;

import dataStructure.Library;
import lombok.extern.java.Log;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@Log
public class LinkedListTest {
    @Test public void testSomeNodeMethod() {
        LinkedListFirtsImp linkedList = new LinkedListFirtsImp();

        log.info("Init List");
        linkedList.insertFirst(2);
        linkedList.insertFirst(5);
        linkedList.insertLatest(1);
        linkedList.insertLatest(7);

        log.info("print list");
        log.info(linkedList.toString());
        log.info("Delete element");
        linkedList.deleteNode(1);
        linkedList.deleteNode(5);
        log.info("print list");
        log.info(linkedList.toString());

        assertTrue("someLibraryMethod should return 'true'", linkedList.getNumElement()==2);
    }

    @Test public void testDeleteElement() {
        LinkedListFirtsImp linkedList = new LinkedListFirtsImp();

        log.info("Init List");
        linkedList.insertFirst(2);
        linkedList.insertFirst(5);
        linkedList.insertLatest(1);
        linkedList.insertLatest(7);

        log.info("print list");
        log.info(linkedList.toString());
        log.info("Delete element");
        linkedList.deleteNode(1);
        linkedList.deleteNode(5);
        log.info("print list");
        log.info(linkedList.toString());
        linkedList.deleteLatest();
        linkedList.insertFirst(5);
        linkedList.insertLatest(1);
        linkedList.insertLatest(7);
        log.info(linkedList.toString());
        linkedList.deletePosition(3);
        log.info(linkedList.toString());

        assertTrue("someLibraryMethod should return 'true'", linkedList.getNumElement()==3);
    }

    @Test public void testLibrary() {
        LinkedListFirtsImp linkedList = new LinkedListFirtsImp();

        log.info("Init List");
        linkedList.insertFirst(new Library(1,"Harry Potter 1", "J. K. Rowling"));
        linkedList.insertFirst(new Library(2,"Harry Potter 2", "J. K. Rowling"));
        linkedList.insertLatest(new Library(3,"Harry Potter 3", "J. K. Rowling"));
        linkedList.insertLatest(new Library(4,"Harry Potter 4", "J. K. Rowling"));

        log.info("print list");
        log.info(linkedList.toString());
        log.info("Delete element");
        linkedList.deleteNode(new Library(2,"Harry Potter 2", "J. K. Rowling"));
        linkedList.deleteNode(new Library(4,"Harry Potter 4", "J. K. Rowling"));
        log.info("print list");
        log.info(linkedList.toString());
        linkedList.insertSpecific(new Library(3,"Harry Potter 3", "J. K. Rowling"));
        linkedList.insertLatest(new Library(4,"Harry Potter 4", "J. K. Rowling"));
        linkedList.insertSpecific(new Library(3,"Harry Potter 3", "J. K. Rowling"));
        log.info(linkedList.toString());
        linkedList.deleteLatest();
        log.info(linkedList.toString());
        log.info("List is empty: "+linkedList.isEmpty());

        assertTrue("someLibraryMethod should return 'true'", linkedList.getNumElement()==4);
        assertFalse("someLibraryMethod should return 'false'", linkedList.isEmpty());
    }

}
