package contest;

import java.util.Scanner;

import problems.linkedlist.Linked;
import problems.linkedlist.Node;

public class DeleteNodesGreaterthanX {

	Node head = null;
	class Node {
		Node next;
		int data;
		public Node(int data) {
			this.data = data;
		}
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
	public void deleteNode(int data){
		Node temp = head;
		if(temp==null) {
			return;
		}
		else if(temp.next==null) {
			//only one node exist , remove this node
			head = temp = null;
			return;
		} else if (temp.data>data) {
			//see if first node is the node to be deleted.
			temp = temp.next;
			head = temp;
			return;
		}
		Node current = temp;
		while (current != null && current.next != null)
        {
            /* If current is greater than max, then delete
               current */
            if (current.next.data > data)
            {
                temp = current.next;
                current.next = temp.next;
                temp = null;
            }
            /* If current is smaller than max, then update
               max and move current */
            else
            {
                current = current.next;
            }
        }
	}
	
	public void print() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int nodes = scanner.nextInt();
		scanner.nextLine();
		DeleteNodesGreaterthanX list = new DeleteNodesGreaterthanX();
		for(int i = 0;i<nodes;i++) {
			int data = scanner.nextInt();
			list.add(data);
		}
		scanner.nextLine();
		int toBeDeleted = scanner.nextInt();
		list.deleteNode(toBeDeleted);
		list.print();
		scanner.close();
	}

}
