public class LinkedList {
    Node head; // head of the list
    int size; //size if the list

    /*Linked list node */
    static class Node {
        int data;
        Node next;
        //constructor to create a new node
        //next is default initialized as null
        Node(int d) 
        {
            data = d;
            next = null;
        }
    }
    public static LinkedList insert(LinkedList list, int data)
    {
        //create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;
        //if empty make that new node the head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            //traverse till last node insert at the end
            Node last = list.head;
            while (last.next != null){
                last = last.next;
            }
            // insert the new_node at the last node
            last.next = new_node;
        }
        //increase the size of the list
        list.size++;
        //return the list by head
        return list;
    }

    public static void printList(LinkedList list)
    {
         Node currNode = list.head;
         System.out.print("linkedList: ");
         //traverse through the linked list
         while (currNode != null){
            //print data
            System.out.print(currNode.data + " ");
            //go to next node
            currNode = currNode.next;
         }  
         System.out.println();
    }
    
    public static LinkedList deleteAtPosition(LinkedList list, int index)
    {
        //store head node
        Node currNode = list.head, prev = null;
        //case1: of index-0, head node to be deleted
        if (index == 0 && currNode != null){
            list.head = currNode.next; //change head
            //display message
            System.out.println((index+1) + " element deleted");
            //decrease size
            list.size--;
            //return list
            return list;
        }
        //case2: index greater than 0 within the list
        int counter = 0;
        while (currNode != null) {
            if (counter == index) {
                prev.next = currNode.next;
                //display message
                System.out.println((index+1) + " element deleted");
                //decrease size
                list.size--;
                break;
            }
            else{
                //if current position is not the index, continue to next
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }
        //case3: index greater than size of the list
        if (currNode == null){
            //display message
            System.out.println(index + " Position not found");
        }
        //return the list
        return list;
    }
    //main method
    public static void main(String[] args)
    {
        //start with empty linked list
        LinkedList list = new LinkedList();
        //insert values <11, 22, 6, 89, 99> //
        list = insert(list, 11);
        list = insert(list, 22);
        //insert <50> in third position
        list = insert(list, 50);
        list = insert(list, 6);
        list = insert(list, 89);
        list = insert(list, 99);
        //print the list
        printList(list);
        //delete second element, index =1
        deleteAtPosition(list, 1);
        printList(list);
        //delete first element, index =0
        deleteAtPosition(list, 0);
        printList(list);
        //delete last element
        deleteAtPosition(list, (list.size-1));
        printList(list);


    }
}