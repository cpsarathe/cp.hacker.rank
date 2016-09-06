package problems.linkedlist;

public class Linked {
	public Node head;
	int size = 0;

	public Node get(int data) {
		Node temp = head;
		Node result = null;
		if (head == null) {
			return result;
		} else {
			while (temp.next != null) {
				if (temp.data == data) {
					result = temp;
					break;
				}
				temp = temp.next;
			}
		}
		return result;
	}

	public void add(int data) {
		Node temp = head;
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public void add(Node node) {
		Node temp = head;
		if (head == null) {
			head = node;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public void insertAtBeginning(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}

	public void insertAtIndex(int data, int index) {
		Node node = new Node(data);
		Node temp = head;
		int idx = 0;
		if (head == null) {
			head = node;
		} else {
			while (temp != null && temp.next != null) {
				idx++;
				if (index == idx) {
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
		if (temp == null) {
			System.out.println("Empty List");
		}
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	/**
	 * Given a sorted singly linked list, delete all nodes that have repeating
	 * numbers, leaving only those nodes whose value has occurred only once in
	 * the linked list.
	 *
	 * Note: If an element is repeated more than once, it won't be part of
	 * returned list. keepAkelas(1 ->2->2 ->4) => 1->4
	 * keepAkelas(1->2->3->3->4->4->5) => 1->2->5
	 * 
	 * @param head
	 * @return
	 */
	// public Node keepAkelas(Node head)
	// {
	//
	// }

	/**
	 * Write code to delete a node with specified value from given linked list.
	 * 
	 * Note: Linked list is guarenteed to have unique elements (no-repeating
	 * elements).
	 * 
	 * @param data
	 */
	public void deleteNode(int data) {
		Node temp = head;
		if (temp == null) {
			return;
		} else if (temp.next == null) {
			// only one node exist , remove this node
			head = temp = null;
			return;
		} else if (temp.data == data) {
			// see if first node is the node to be deleted.
			temp = temp.next;
			head = temp;
			return;
		}
		Node slow = temp, fast = temp.next;
		while (fast != null) {
			if (fast.data == data) {
				slow.next = fast.next;
			}
			fast = fast.next;
			slow = slow.next;
		}
	}

	/**
	 * Given pointer to a linked list node (it can be any middle node, but not
	 * last node); Delete the node by keeping linked list intact. You are NOT
	 * given head pointer at all. nodeToDelete won't be empty ever. list will
	 * have at least two nodes.
	 * 
	 * @param nodeToDelete
	 */
	public void deleteNodeWithoutHead(Node node) {
		// since we don't have head there is no way we can delete node
		// what we need to do is we need to shift elements of next of
		// the given node
		Node temp = node.next;
		while (temp != null) {
			node.data = temp.data;
			node = temp;
			temp = temp.next;
		}
		node = null;

	}

	public static void main(String[] args) {
		Linked link = new Linked();
		link.add(10);
		link.add(20);
		link.add(30);
		link.add(40);
		link.add(50);
		link.add(40);
		link.add(30);
		link.add(20);
		link.add(10);

		// link.insertAtBeginning(40);
		// link.insertAtBeginning(50);
		// link.insertAtIndex(70,3);
		link.print();
		System.out.println("***");

		// Node node = link.get(30);
		// link.deleteNodeWithoutHead(node);
		// link.print();

		// link.deleteNode(50);
		// link.keepAkelas(link.head);
		// link.print();
		/*
		 * //find middle node Node node = link.findMiddleNode(link.head);
		 * if(node==null) { System.out.println("Empty List"); } else {
		 * System.out.println(node.data); }
		 */

		// find cycle
		/*
		 * Node node = link.get(30); link.add(node); boolean flag =
		 * link.hasCycle(link.head); System.out.println(flag); link.print();
		 */

		// find nth Node from last
		// Node node = link.nthNodeFromLast(link.head,7);
		// System.out.println("3rd node "+node.data);

		// reverse singly linked list
		// Node node = link.reverseSingleLInkedListInPlace(link.head);
		// link.head = node;
		// link.print();

//		link.sortedInsert(link.head, 30);
//		link.print();
		
		boolean flag = link.isPalindromicList(link.head);
		System.out.println(flag);
	}

	/**
	 * Find Middle Node For Even Sized List, Return the first middle. e.g.
	 * 1->2->3->4, return pointer to 2.Do it with one pass only O(n)
	 * 
	 * getMiddleNode(1->2 ->3 ->4) => 2
	 * 
	 * getMiddleNode(1->2 ->3 ->4->5) => 3
	 * 
	 * @param node
	 * @return
	 */
	public Node findMiddleNode(Node head) {
		if (head == null) {
			return head;
		}
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			// in case of even length slow points to mid+1 , so check if fast is
			// not null
			if (fast != null) {
				slow = slow.next;
			}
		}
		return slow;
	}

	/**
	 * 7 - Detect Cycle in Linked List Given a linked list where last node might
	 * be pointing to any of the previous nodes in the list or NULL.Write a
	 * function that detects if list has cycle (last node pointing to previous
	 * or itself), or not.
	 * 
	 * hasCycle(1->2 ->3 ->4----->3) => true hasCycle(1->2 ->3 ->4----->NULL) =>
	 * false
	 * 
	 * @return
	 */
	public boolean hasCycle(Node head) {
		// approach is to use floyds algorithm
		// where slow pointer moves one hop and fast pointer moves
		// 2 hop
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next; // 1 hop
			fast = fast.next.next; // 2 hop
			if (slow == fast)
				return true;
		}
		return false;
	}

	/**
	 * 5 - N-th Node from End Given a list and a number N, Write function that
	 * returns pointer to N-th node from end.
	 * 
	 * getNthFromEnd(1->2->3->4, 3) => 2
	 * 
	 * @param head
	 * @param n
	 * @return
	 */
	public Node nthNodeFromLast(Node head, int n) {
		// initialize two pointer with head
		// move second pointer by n-1 node
		// after that move first and second one by one
		// move until second.next is null
		// the node first pointer is pointing is the nth Node
		Node first = head;
		Node second = head;
		int temp = 0;
		while (temp != (n - 1) && second != null) {
			second = second.next;
			temp++;
		}
		if (second == null) {
			return null;
		}
		while (second.next != null) {
			first = first.next;
			second = second.next;
		}
		System.out.println(first.data);
		return first;
	}

	/**
	 * 
	 * 3 - Reverse a given linked list Given a singly linked list, Re-arrange in
	 * such a way that first->second->third->....->secondLast->Last becomes
	 * first->last->second->secondLast->third...Do In-Place, Without Swapping
	 * Node Values.
	 * 
	 * reverseList(1->2 ->3 ->4) => 4->3->2->1
	 * 
	 * @param head
	 * @return
	 */
	public Node reverseSingleLInkedListInPlace(Node head) {
		// Cre­ate 3 nodes, cur­rN­ode, Pre­vN­ode and nextNode.
		// Ini­tial­ize them as cur­rN­ode = head; nextN­ode = null;pre­vN­ode =
		// null;
		// Now keep revers­ing the point­ers one by one till currNode!=null.

		Node current = head;
		Node prev = null;
		Node next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}

	public Node sortedInsert(Node head, int data) {
		Node temp = head;
		Node node = null;
		while (temp != null && temp.next != null) {
			if (data >= temp.data && data <= temp.next.data) {
				node = new Node(data);
				node.next = temp.next;
				temp.next = node;
				break;
			}
			temp = temp.next;
		}
		return node;
	}

	public int length(Node h) {
		int len = 0;
		while (h != null) {
			h = h.next;
			len++;
		}
		return len;
	}
	
    /**
     * Point of Intersection
	   Given two linked lists that may have last few nodes in common. 
	   Write a function that returns the first common node (point of intersection). 
       If they aren't intersecting, Return NULL.
       
     * @param h1
     * @param h2
     * @return
     */
	public Node pointOfIntersection(Node h1, Node h2) {
		//approach is to find diff d of two list h1 , h2
		//move bigger list till the difference d
		//now move parallel both list h1 & h2 and compare if node is equal or not
		//if they are equal they are intersecting.
		
		int len1 = length(h1);
		int len2 = length(h2);

		if (len1 > len2) {
			int d = len1 - len2;
			int lc = 0;
			while (h1 != null && lc != d) {
				h1 = h1.next;
				lc++;
			}
		} else if (len1 < len2) {
			int d = len2 - len1;
			int lc = 0;
			while (h2 != null && lc != d) {
				h2 = h2.next;
				lc++;
			}
		}
		Node intersection = null;
		while (h1 != null && h2 != null) {
			if (h1 == h2) {
				intersection = h1;
				break;
			}
			h1 = h1.next;
			h2 = h2.next;
		}
		return intersection;

	}
	
	/**
	 * Is Palindromic Linked List

	   Given a singly linked list, tell if is palindromic or not.

       Note:  O(N) solution with O(1) space is required.
	 * @param head
	 * @return
	 */
	public boolean isPalindromicList(Node  head)
	{
		Node temp = head;
		int size = length(temp);
		temp = head;
		Node middle = findMiddleNode(temp);
		Node midOne;
		if(size%2==0) {
			midOne = reverseSingleLInkedListInPlace(middle);
		} else {
			midOne = reverseSingleLInkedListInPlace(middle.next);
		}
		temp = head;
		boolean isPalindrome = false;
		while(temp!=null && midOne!=null){
			if(temp.data==midOne.data){
				isPalindrome = true;
			} else {
				isPalindrome = false;
				break;
			}
			temp = temp.next;
			midOne = midOne.next;
		}
		return isPalindrome;
	}
}
