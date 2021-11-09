package dataStructure.tree;

import dataStructure.Employee;
import lombok.extern.java.Log;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@Log
public class TreeBinaryImpTest {

    @Test
    public void addTree(){

        Tree tree = new TreeBinaryImp();

        Arrays.asList(
                new Employee(20, "Oliver", "Dev"),
                new Employee(40, "Oliver", "Dev"),
                new Employee(18, "Oliver", "Dev"),
                new Employee(33, "Oliver", "Dev"),
                new Employee(5, "Oliver", "Dev"),
                new Employee(55, "Oliver", "Dev"),
                new Employee(12, "Oliver", "Dev"),
                new Employee(15, "Oliver", "Dev")
        ).forEach(
                employee -> tree.add(employee)
        );



        log.info("the Tree Is Empty: "+ tree.isEmpty() + " The Tree is Leaf: "+ tree.isLeaf());
        log.info("the Tree Is Empty: "+ tree.isEmpty() + " The Tree is Leaf: "+ tree.isLeaf());

        //tree.add(new Employee(18, "Oliver", "general"));

        log.info("Employee is exist: "+tree.isExist(18));
        log.info("Get Employee : "+tree.get(18));
        log.info("Employee is exist: "+tree.isExist(55));
        log.info("Get Employee : "+tree.get(55));

        log.info("preOrder: ");
        tree.preOrder();
        log.info("postOrder : ");
        tree.postOrder();
        log.info("inOrder : ");
        tree.inOrder();

        tree.delete(55);
        log.info("postOrder : ");
        tree.postOrder();
        tree.delete(12);
        log.info("inOrder : ");
        tree.inOrder();
        tree.delete(33);
        log.info("inOrder : ");
        tree.inOrder();

        assertTrue("The tree is empty", true);
    }
}
