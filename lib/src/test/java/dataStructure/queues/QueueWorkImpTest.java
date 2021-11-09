package dataStructure.queues;

import dataStructure.Work;
import org.junit.Test;

public class QueueWorkImpTest {

    @Test
    public void processQueue(){
        Queue queue = new QueueWorkImp();

        queue.offer(new Work("document1","Oliver", false));
        queue.offer(new Work("CV","Oliver", false));
        queue.offer(new Work("document2","Oliver", false));
        queue.offer(new Work("reporte","Oliver", false));

        System.out.println(queue);
        System.out.println("The size: "+queue.size());

        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());

    }
}
