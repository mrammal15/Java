
public class SumList {
	
	private class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	protected Node head;
	
	public Node sumList(Node n1, Node n2) {
		return sumList(n1,n2,0);
	}
	
	private Node sumList(Node n1, Node n2, int carry) {
		if(n1 == null && n2 == null && carry == 0)
			return null;
		int sum = carry;
		
		if(n1 != null)
			sum += n1.data;
		if(n2 != null)
			sum += n2.data;
		Node res = new Node(sum%10);
		if(n1 != null || n2 != null) {
			res.next = sumList(n1 == null ? null : n1.next, n2 == null ? null : n2.next, sum/10);
		}
		return res;
	}

}
