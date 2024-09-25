package pa3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Queue2Test {
    // Add tests for the Queue class here

    @Test
    public void testEnqueue() {
        Queue2 queue = new Queue2();
        Node node1 = new Node(4);
        Node node2 = new Node(5);
        queue.enqueue(node1);
        queue.enqueue(node2);
        assertEquals(node1, queue.dequeue());
    }
    
    @Test
    public void testDequeue() { //empty queue
    	Queue2 queue = new Queue2();
        assertEquals(null, queue.dequeue());
    }
    
    @Test
    public void testDequeue2() { //1 node
    	Queue2 queue = new Queue2();
    	Node node1 = new Node(4);
    	queue.enqueue(node1);
        assertEquals(node1, queue.dequeue());
        assertEquals(null, queue.dequeue()); //then empty
    }
    
    @Test
    public void testIsEmpty() {
    	Queue2 queue = new Queue2();
    	assertEquals(true, queue.isEmpty());
    	Node node1 = new Node(4);
    	queue.enqueue(node1);
    	assertEquals(false, queue.isEmpty());
    }

}