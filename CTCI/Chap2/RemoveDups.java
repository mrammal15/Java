import java.util.HashSet;
import java.util.Set;

public class RemoveDups {

	private class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	protected Node head;

	public void removeDups(Node head) {
		Node current = head;

		while(current != null) {
			Node runner = current;
			while(runner.next != null) {
				if(runner.next.data == current.data)
					runner.next = runner.next.next;
				else
					runner = runner.next;
			}
			current = current.next;
		}
	}
	
	public void removeDupsV2(Node head) {
		Set<Integer> set = new HashSet<Integer>();
		Node current = head;
		Node previous = null;
		
		while(current != null) {
			if(set.add(current.data))
				previous = current;
			else 
				previous.next = current.next;
			current = current.next;
		}
	}
	
}
