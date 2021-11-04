package dataStructure.queues;

import dataStructure.Library;
import dataStructure.list.LinkedList;
import lombok.extern.java.Log;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

@Log
public class QueueProcessImpTest {
    @Test
    public void testProcessQueue() {
        QueueProcess queueProcess = new QueueProcessImp();

        queueProcess.addQueue(1);
        queueProcess.addQueue(3);
        queueProcess.addQueue(4);
        queueProcess.addQueue(2);
        queueProcess.addQueue(new Library("harry potter", "J. K"));
        log.info("Queue toString : "+queueProcess.toString());

        assertTrue("someLibraryMethod should return 'true'", queueProcess.size()==5);
    }
}
