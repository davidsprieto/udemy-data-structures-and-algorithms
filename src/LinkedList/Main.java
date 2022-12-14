package LinkedList;

public class Main {

    public static void main(String[] args) {

        // Practice - Create a new linked list object and print it
//        LinkedList myLinkedList = new LinkedList(4);
//
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//
//        myLinkedList.printList();

        // Practice - append a new node to a linked list
//        LinkedList myLinkedList1 = new LinkedList(1);
//
//        myLinkedList1.append(2);
//
//        myLinkedList1.printList();

        // Practice - remove last node of a linked list
//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.append(2);
//
//        myLinkedList.printList();

//        // (2) Items - Returns 2 Node
//        System.out.println(myLinkedList.removeLast().value);
//        // (1) Item - Returns 1 Node
//        System.out.println(myLinkedList.removeLast().value);
//        // (0) Items - Returns null
//        System.out.println(myLinkedList.removeLast());

        // Practice prepend a new node to a linked list
//        LinkedList myLinkedList = new LinkedList(2);
//        myLinkedList.append(3);
//
//        myLinkedList.prepend(1);
//
//        myLinkedList.printList();

        // Practice - remove first node from a linked list
//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.prepend(2);
//        myLinkedList.printList();
//
//        // (2) Items - Returns 2 Node
//        System.out.println(myLinkedList.removeFirst().value);
//        // (1) Item - Returns 1 Node
//        System.out.println(myLinkedList.removeFirst().value);
//        // (0) Items - Returns null
//        System.out.println(myLinkedList.removeFirst());

        // Practice - Return a node at a specified index
//        LinkedList myLinkedList = new LinkedList(0);
//        myLinkedList.append(1);
//        myLinkedList.append(2);
//        myLinkedList.append(3);
//        myLinkedList.printList();
//
//        System.out.println("Got the node: " + myLinkedList.get(2).value);

        // Practice - Set a node value at a specified index
//        LinkedList myLinkedList = new LinkedList(11);
//        myLinkedList.append(3);
//        myLinkedList.append(23);
//        myLinkedList.append(7);
//
//        myLinkedList.printList();
//
//        System.out.println(myLinkedList.set(1, 4));
//
//        myLinkedList.printList();

        // Practice - Insert a new node at a specified index
//        LinkedList myLinkedList = new LinkedList(0);
//        myLinkedList.append(2);
//
//        myLinkedList.printList();
//
//        System.out.println(myLinkedList.insert(1, 1));
//
//        myLinkedList.printList();

        // Practice - Remove a node at a specified index
//        LinkedList myLinkedList = new LinkedList(11);
//        myLinkedList.append(3);
//        myLinkedList.append(23);
//        myLinkedList.append(7);
//
//        myLinkedList.printList();
//
//        System.out.println("Removed node: " + myLinkedList.remove(2).value);
//
//        myLinkedList.printList();

        // Practice - Reverse a linked list in place without creating a new linked list
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);

        myLinkedList.printList();

        System.out.println("Reversed:");
        myLinkedList.reverse();

        myLinkedList.printList();



    }

}