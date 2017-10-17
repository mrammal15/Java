
public class Partition {
	
	private class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	protected Node head;
	
	public void partition(int pivot) {
		Node current = head;
		Node smaller = head;
		Node greater = head;
		
		while(current != null) {
			Node temp = current.next;
			if(current.data < pivot) {
				current.next = smaller;
				smaller = current;
			}
			else {
				greater.next = current;
				greater = current;
			}
			current = temp;
		}
		head = smaller;
	}

}
