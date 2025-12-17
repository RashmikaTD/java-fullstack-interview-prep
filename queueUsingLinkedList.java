/******************************************************************************
Implement Queue using linkedlist


Class Node -> has 2 variable (int value, Node next)
Class Queue ->2 Node variable
    front -> Deleting end
    end -> Inserting end

Inside enqueue(value):
  ├─ Create new Node with value
  ├─ If front == null (queue empty)
  │      └─ front = end = new Node, return
  └─ Else
         ├─ end.next = new Node
         └─ end = new Node
  │
  ▼
Inside dequeue():
  ├─ If front == null → throw "Queue is empty" error
  ├─ Save front.value to return
  └─ Move front = front.next
         ├─ If front == null → end = null
  └─ Return saved value
  │
  ▼
Inside peek():
  ├─ If front == null → throw "Queue is empty"
  └─ Return front.value
  │
  ▼
Inside display():
  ├─ If front == null → print "Queue is empty"
  └─ Else traverse from front → end using a temp Node -> Node temp = front;
         └─ loop until temp is not null
         └─ Print each node value
  │
  ▼
Inside size():
  ├─ Initialize count = 0
  ├─ Traverse from front → end using a temp Node -> Node temp = front;
         └─ loop until temp is not null
         └─ Print each node value
  └─ Return count
  │
  ▼
Back in main:
  └─ Program ends



*******************************************************************************/
import java.util.*;

public class Main
{
    public static class Node
    {
        int value;
        Node next;
        
        public Node (int value){
            this.value= value;
            this.next=null;
        }
    }
    
    public static class Queue{
        private Node front;
        private Node end;
        
        Queue(){
            front=null;
            end=null;
        }
        
        public boolean isEmpty(){
            return front==null;
        }
        
        public void enqueue(int value){
            Node newNode = new Node(value);
            if (front==null){
                
                front = newNode;
                end = newNode;
                return;
            }
            //System.out.println(end.value);
            // System.out.println(newNode);
            end.next = newNode;
            end = newNode;
            // System.out.println(end.value);
            
        }
        
        public int dequeue(){
            if(front==null){
                throw new RuntimeException("Queue is empty");
            }
            int value = front.value;
            front = front.next;
            if (front==null){
                end=null;
            }
            //  System.out.println(end.value);
            return value;
        }
        
        public int peek(){
            if(front==null){
                throw new RuntimeException("Queue is empty");
            }
            return front.value;
        }
        public void display(){
            if(front==null){
                System.out.println("Queue is empty");
            }
            Node temp = front;
            while(temp!=null){
                System.out.println(temp.value);
                temp = temp.next;
                
            }
        }
        public int size(){
            int count = 0;
            if(front==null){
                System.out.println("Queue is empty");
            }
            Node temp = front;
            while(temp!=null){
                count++;
                temp = temp.next;
                
            }
            return count;
        }
    }
	public static void main(String[] args) {
		Queue q = new Queue();
		System.out.println(q.isEmpty()?"Queue is empty":"Queue is not empty");
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println("Removed:"+q.dequeue());
		System.out.println("Peeked:"+q.peek());
		q.display();
		System.out.println("Size is "+q.size());
		System.out.println("Removed:"+q.dequeue());
		System.out.println("Removed:"+q.dequeue());
		System.out.println("Removed:"+q.dequeue());
		System.out.println(q.isEmpty()?"Queue is empty":"Queue is not empty");
		q.enqueue(10);
		q.display();
	}
	
	
	
	
}
