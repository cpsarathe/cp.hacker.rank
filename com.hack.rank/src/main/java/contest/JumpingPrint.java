package contest;

import java.util.Scanner;

import problems.linkedlist.Linked;
import problems.linkedlist.Node;

public class JumpingPrint {

	Node head = null;
	class Node {
		Node next;
		Node prev;
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
			head.prev = null;
			head.next = null;
		} else {
			while(temp.next!=null) {
				temp = temp.next;
			}
			node.prev = temp;
			temp.next = node;
			node.next = null;
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
		JumpingPrint list = new JumpingPrint();
		for(int i = 0;i<nodes;i++) {
			int data = scanner.nextInt();
			list.add(data);
		}
		scanner.nextLine();
		String base = scanner.next();
		Node h = list.head;
		String str = "";
		char ch[] = base.toCharArray();
		for(int i = 0 ;i < ch.length ; i++){
			if(ch[i]=='F') {
				h = h.next;
				if(h==null) {
					h = list.head;
					str = str + h.data + " ";
				}
			}
			else if(ch[i]=='B') {
				h = h.prev;
				if(h==null) {
					h = list.head;
					str = str + h.data + " ";
				}
			}
			else if(ch[i]=='P') {
				str = str + h.data + " ";
			}
		}
		System.out.println(str);
	}

}
