package Num707_Design_LinkedList;

public class Main {
    public static void main(String[] args) {
          MyLinkedList obj = new MyLinkedList();
          obj.addAtHead(1);
          obj.addAtTail(3);
          obj.addAtIndex(1,2);
          obj.get(1);
          obj.deleteAtIndex(1);
          obj.get(1);
    }
}