package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! Working with Linked lists");

        LinkedList linkedList = new LinkedList(4);
        linkedList.append(5);
        linkedList.append(100);
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();
        linkedList.printList();

        if(linkedList.getLength() > 1) {
            System.out.println("remove last node and the removed node is " + linkedList.removeLastNode().value);
            linkedList.printList();
        }
    }
}