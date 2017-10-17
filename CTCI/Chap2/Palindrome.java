import java.util.Stack;

public class Palindrome {

	private class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	protected Node head;
	
	public boolean palindrome() {
		Stack<Node> stack = new Stack<Node>();
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			stack.push(slow);
			fast = fast.next.next;
			slow = slow.next;
		}
		if(fast != null)
			slow = slow.next;

		while(slow != null) {
			if(stack.pop().data != slow.data)
				return false;
			slow = slow.next;
		}
		return true;
	}

}
