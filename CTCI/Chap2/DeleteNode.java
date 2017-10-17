
public class DeleteNode {

	private class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	protected Node head;

	public void deleteNode(int element) {
		if(head == null)
			return;
		Node current = head;
		if(current.data == element)
			head = head.next;
		else {
			while(current.next != null) {
				if(current.next.data == element) {
					current.next = current.next.next;
					return;
				}
				current = current.next;
			}
			if(current.data == element)
				current = null;
		}
		return;
	}

}
