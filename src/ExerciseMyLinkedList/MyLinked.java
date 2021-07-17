package ExerciseMyLinkedList;

import com.sun.javaws.IconUtil;

public class MyLinked<E> {
    private Node head;
    private int numNodes;
//    private int capacity;
//    private int DEFAULTCAPACITY=10;

    public MyLinked(E element) {
        head = new Node(element);
        numNodes = 1;
    }

    public void add(int index, E element) {
        int count = 0;
        Node newNode = new Node(element);
        Node temp = head;
        Node holder;
        while (count < index - 1 && temp.next != null) {
            temp = temp.next;
            count++;
        }
        holder = temp.next;
        temp.next = newNode;
        temp.next.next = holder;
        numNodes++;
    }

    public void addFisrt(E element) {
        Node temp =head;
        head = new Node(element);
        head.next=temp;
        numNodes++;
    }

    public void addLast(E element) {
        int count = 0;
        Node newNode = new Node(element);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            count++;
        }
        temp.next = newNode;
    }

    public void ensureCapacity() {

    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    class Node {
        Node next;
        Object data;

        Node(Object _data) {
            data = _data;
        }

        Object getData() {
            return data;
        }

    }
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinked<Integer> ll = new MyLinked<>(11);
        ll.addFisrt(11);
        ll.addFisrt(12);
        ll.addFisrt(13);
        ll.add(4,9);
        ll.add(4,9);
        ll.printList();
    }
}
