package problems.linkedlist;

public class Linked {
	Node head;
	int size = 0;
	
	public Node get(int data){
		Node temp = head;
		Node result = null;
		if(head==null) {
			return result;
		} else {
			while(temp.next!=null) {
				if(temp.data==data){
					result = temp;
					break;
				}
				temp = temp.next;
			}
		}
		return result;
	}
	
	public void add(int data){
		Node temp = head;
		Node node = new Node(data);
		if(head==null) {
			head = node;
		} else {
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
	public void insertAtBeginning(int data){
		Node node = new Node(data);
		if(head==null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}
	
	public void insertAtIndex(int data,int index){
		Node node = new Node(data);
		Node temp = head;
		int idx = 0;
		if(head==null) {
			head = node;
		} else {
			while(temp!=null && temp.next!=null) {
				idx++;
				if(index==idx) {
					node.next = temp.next;
					temp.next = node;
					break;
				}
				temp = temp.next;
			}
		}
	}
	
	public void print() {
		Node temp = head;
		if(temp==null) {
			System.out.println("Empty List");
		}
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	/**
	 * Given a sorted singly linked list, delete all nodes that have repeating numbers, 
	 *	leaving only those nodes whose value has occurred only once in the linked list.
     *
	 *	Note:  If an element is repeated more than once, it won't be part of returned list.
	 *  keepAkelas(1 ->2->2 ->4) => 1->4
		keepAkelas(1->2->3->3->4->4->5) => 1->2->5
	 * @param head
	 * @return
	 */
//	public Node keepAkelas(Node head)
//	{
//		
//	}
	
	/**
	 * Write code to delete a node with specified value from given linked list.

	   Note:  Linked list is guarenteed to have unique elements (no-repeating elements).
	 * @param data
	 */
	public void deleteNode(int data){
		Node temp = head;
		if(temp==null) {
			return;
		}
		else if(temp.next==null) {
			//only one node exist , remove this node
			head = temp = null;
			return;
		} else if (temp.data==data) {
			//see if first node is the node to be deleted.
			temp = temp.next;
			head = temp;
			return;
		}
		Node slow = temp , fast = temp.next;
		while(fast!=null) {
			if(fast.data==data) {
				slow.next = fast.next;
			}
			fast = fast.next;
			slow= slow.next;
		}
	}
	
	/**
	 * Given pointer to a linked list node (it can be any middle node, but not last node);
	 * Delete the node by keeping linked list intact. You are NOT given head pointer at all. 
	 * nodeToDelete won't be empty ever. list will have at least two nodes.
	 * 
	 * @param nodeToDelete
	 */
	public void deleteNodeWithoutHead(Node node)
	{
		//since we dont have head there is no way we can delete  node
		//what we need to do is we need to shift elements of next of 
		//the given node
		Node temp = node.next;
	    while(temp!=null) {
	    	node.data = temp.data;
	    	node =  node.next;
	    	temp = temp.next;
	    }
	    System.out.println("$$"+node.data);
	}
	
	public static void main(String[] args) {
		Linked link = new Linked();
		link.add(10);
		link.add(10);
		link.add(10);
		link.add(40);
		link.add(50);
		//link.insertAtBeginning(40);
		//link.insertAtBeginning(50);
		//link.insertAtIndex(70,3);
		link.print();
		System.out.println("***");
		Node node = link.get(30);
		//link.deleteNodeWithoutHead(node);
//		link.deleteNode(50);
//		link.keepAkelas(link.head);
		link.print();
		/*
		//find middle node
		Node node  = link.findMiddleNode(link.head);
		if(node==null) {
			System.out.println("Empty List");
		} else {
			System.out.println(node.data);
		}
		*/
		
		//link.print();
	}
	/**
	 *  Find Middle Node
		For Even Sized List, Return the first middle. e.g. 1->2->3->4, 
		return pointer to 2.Do it with one pass only O(n)
		
		getMiddleNode(1->2 ->3 ->4) => 2

		getMiddleNode(1->2 ->3 ->4->5) => 3

	 * @param node
	 * @return
	 */
	public Node findMiddleNode(Node head) {
		if(head==null) {
			return head;
		}
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null) {
				fast = fast.next.next;
				//in case of even length slow points to mid+1 , so check if fast is not null
				if(fast!=null) { 
					slow = slow.next;
				}
		}
		return slow;
	}

}
