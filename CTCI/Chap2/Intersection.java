
public class Intersection {
	
	private class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	protected Node head;

	public Node intersection(Node n1, Node n2) {
		if(n1 == null || n2 == null)
			return null;
		Node current1 = n1, current2 = n2;
		int len1 = 1, len2 = 1;

		while(current1.next != null) {
			len1++;
			current1 = current1.next;
		}
		while(current2.next != null) {
			len2++;
			current2 = current2.next;
		}
		if(current1 != current2)
			return null;
		int diff = Math.abs(len1 - len2);
		current1 = n1;
		current2 = n2;
		while(diff > 0) {
			if(len1 > len2)
				current1 = current1.next;
			else
				current2 = current2.next;
		}
		while(current1 != current2) {
			current1 = current1.next;
			current2 = current2.next;
		}
		return current1;
	}

}
