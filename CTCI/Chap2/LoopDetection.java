
public class LoopDetection {
	
	private class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	protected Node head;

	public Node loopDetection(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		fast = head;
		while(slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}

}
