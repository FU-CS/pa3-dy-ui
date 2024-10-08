package pa3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    // Add tests for the Queue class here

    @Test
    public void testEnqueue() {
        Queue queue = new Queue();
        Node node1 = new Node(4);
        Node node2 = new Node(5);
        queue.enqueue(node1);
        queue.enqueue(node2);
        assertEquals(node1, queue.dequeue());
    }
    
    @Test
    public void testDequeue() { //empty queue
    	Queue queue = new Queue();
        assertEquals(null, queue.dequeue());
    }
    
    @Test
    public void testDequeue2() { //1 node
    	Queue queue = new Queue();
    	Node node1 = new Node(4);
    	queue.enqueue(node1);
        assertEquals(node1, queue.dequeue());
        assertEquals(null, queue.dequeue()); //then empty
    }
    
    @Test
    public void testIsEmpty() {
    	Queue queue = new Queue();
    	assertEquals(true, queue.isEmpty());
    	Node node1 = new Node(4);
    	queue.enqueue(node1);
    	assertEquals(false, queue.isEmpty());
    }

}
