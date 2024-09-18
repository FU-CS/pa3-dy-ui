package pa3;

public class Queue2 {
	Node[] arr = new Node[1];
	int start = -1;
	int end = 0;
	
	public  Queue2() {}
	
	public void enqueue(Node val) {
		if (end < arr.length) {
			arr[end] = val;
			end += 1;
			if (start == -1)
				start = 0;
			return;
		}
		Node[] arr2 = new Node[2*arr.length];
		int i = 0;
		while (start < arr.length) {
			arr2[i] = arr[start];
			i += 1; start += 1;
		}
		arr2[i] = val;
		i += 1;
		start = 0;
		end = i;
		arr = arr2;
		
	}
	
	public Node dequeue() {
		if (start == end || start == -1) 
			return null;
		
		start += 1;
		return arr[start-1];
	}
	
	public boolean isEmpty() {
		return start == end || start == -1;
	}
}




