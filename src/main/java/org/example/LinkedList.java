package org.example;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(4);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = this.head;
        while(temp!=null){
            System.out.print(temp.value);
            temp = temp.next;
            System.out.print("-->");
        }
        System.out.println("null");

    }

    public Node removeLastNode(){
        if(length == 0) {
            return null;
        }
        Node pre = head;
        Node temp = head;
        while(temp.next!=null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0 ) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public int getLength() {
        System.out.println("Length: " + length);
        return length;
    }
}
