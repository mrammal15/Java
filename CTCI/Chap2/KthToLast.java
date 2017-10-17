
public class KthToLast {
	
	private class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	protected Node head;

	public int kthToLast(Node head, int k) {
		if(head == null)
			return -1;
		int length = 1;
		Node current = head;
		while(current != null) {
			length++;
			current = current.next;
		}
	    k = k % length;
	    current = head;
	    Node runner = head;
	    while(k != 0) {
	    		runner = runner.next;
	    		k--;
	    }
	    while(runner.next != null) {
	    		runner = runner.next;
	    		current = current.next;
	    }
	    return current.data;
	}
	
}
