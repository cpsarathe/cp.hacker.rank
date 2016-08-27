package problems;

import java.util.Scanner;

class LLNode
{
  int data;
  LLNode next;
  LLNode(int d) {data = d; next = null; }
}
class LinkedList
{
	LLNode head;
	void printList()
    {
        LLNode temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	void InsertAtEnd(int data)
    {
        LLNode node = new LLNode(data);
        LLNode temp = head;
        if(head==null) { 
        	head = node;
        	return;
        }
        while(temp.next!=null) {
        	temp = temp.next;
        }
        temp = node;
        printList();
    }
}
public class Test
{
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
      	while(t--!=0)
        {
          LinkedList llist = new LinkedList();
          int n = sc.nextInt();
          while(n--!=0){
              llist.InsertAtEnd(sc.nextInt());
          }
          llist.printList();
        }
    }
}
