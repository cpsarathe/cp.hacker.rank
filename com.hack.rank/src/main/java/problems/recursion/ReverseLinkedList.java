package problems.recursion;

import problems.linkedlist.Linked;
import problems.linkedlist.Node;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Linked list = new Linked();
     list.add(10);
     list.add(20);
     list.add(30);
     list.add(40);
     reverse(list.head);
	}
	
	public static void reverse(Node head){
		if(head==null){
			return;
		}
		reverse(head.next);
		System.out.print(head.data + " ");
	}

}
