package dataStructure.queues;

import dataStructure.Work;
import lombok.extern.java.Log;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

@Log
public class QueueProcessTest {
    @Test
    public void testProcessQueue() {
        QueueProcess queueProcess = new QueueProcessImp();

        queueProcess.addQueue(new Work("Doc1", "Oliver", false));
        queueProcess.addQueue(new Work("Doc2", "Patty", false));
        queueProcess.addQueue(new Work("Doc3", "Oliver", false));
        queueProcess.addQueue(new Work("Data", "Oliver", false));
        queueProcess.addQueue(new Work("CV", "Patty", false));
        log.info("Queue toString : "+queueProcess.toString());

        assertTrue("someLibraryMethod should return 'true'", queueProcess.size()==5);
    }
}
