
package pa3;

/**
 * A queue of nodes.
 */
public class Queue {
	private class Qnode{
		Node val;
		Qnode next;
		Qnode prev;
		public Qnode(Node val) {
			this.val = val;
		}
	}
	
	Qnode head = null;
	Qnode tail = null;

    /** 
     * Constructs an empty queue.
     */
    public Queue() {

        
    }

    /**
     * Adds a node to the queue.
     * @param node
     */
    public void enqueue(Node node) {
    	Qnode new_node = new Qnode(node);
    	new_node.next = head;
    	if (head != null)
    		head.prev = new_node;
    	head = new_node;
    	if (tail == null)
    		tail = head;
        
    }

    /**
     * Removes and returns the node at the front of the queue.
     * @return the node at the front of the queue.
     */
    public Node dequeue() {
    	if (this.isEmpty())
    		return null;
    	Qnode tmp = tail;
    	tail = tail.prev;
    	if(tail == null) {
    		head = null;
    		return tmp.val;
    	}
    	tail.next = null;
    	tmp.prev = null;
    	return tmp.val;
    	
        
    }

    /**
     * Returns true if the queue is empty.
     * @return true if the queue is empty.
     */
    public boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        Node node1 = new Node(9);
        Node node2 = new Node(8);
        queue.enqueue(node1);
        queue.enqueue(node2);
        System.out.println(queue.dequeue().value); // Should print 4
    }
    
}
