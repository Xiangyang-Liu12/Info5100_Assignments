package Question1;

import java.util.LinkedList;
import java.util.List;

public class ThreadSafeLinkedList {
    int size;
    ListNode head;
    private static Object obj = new Object();


    //constructor
    public ThreadSafeLinkedList() {
        this.size = 0;
        this.head = new ListNode(1);
    }

    public void addAtPosition(int index, int element) {
        synchronized (obj) {
            if (index > size + 1 || index < 0) {
                System.out.println("Invalid position");
                return;
            }
            size++;
            ListNode current = head;
            while (index-- > 0) {
                current = current.next;
            }
            ListNode node = new ListNode(element);
            node.next = current.next;
            current.next = node;
            System.out.println(Thread.currentThread().getName() + " is running and the size is "  + size);
        }

    }

    public void removeAtPosition(int index, int element) {
        synchronized (obj) {

            if (index > size + 1 || index < 0) {
                System.out.println("Invalid position");
                return;
            }
            size--;
            ListNode current = head;
            while (index-- > 0) {
                current = current.next;
            }
            current.next = current.next.next;
            System.out.println(Thread.currentThread().getName() + " has removed " + element + " the size is " + size);

        }
    }

    public int getFist(){
        synchronized (obj){
            return head.val;
        }
    }

    public int getLast(){
        synchronized (obj){
            ListNode tail = head;
            for(int i = 0; i < size; i++){
                tail = tail.next;
            }
            return tail.val;
        }

    }
    public int size(){
        synchronized (obj){
            return size;
        }
    }
}
