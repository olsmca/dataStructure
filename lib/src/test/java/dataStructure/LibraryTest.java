/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package dataStructure;

import lombok.extern.java.Log;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@Log
public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library(4,"Harry Potter 4", "J. K. Rowling");

        List<Integer> ar = Arrays.asList(1,2,3,4,10,11);

        log.info("Lista: "+ar.stream().mapToInt(value -> value).sum());

        List<Integer> a = Arrays.asList(5,6,7);
        List<Integer> b = Arrays.asList(3,6,10);

        List<Integer> res = Arrays.asList(
                (a.get(0)>b.get(0)?1:0)+(a.get(1)>b.get(1)?1:0)+(a.get(2)>b.get(2)?1:0),
                (a.get(0)<b.get(0)?1:0)+(a.get(1)<b.get(1)?1:0)+(a.get(2)<b.get(2)?1:0)
        );

        log.info("result tripleta: "+res);

        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
}
