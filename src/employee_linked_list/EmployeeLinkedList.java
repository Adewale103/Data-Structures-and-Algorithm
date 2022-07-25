package employee_linked_list;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public EmployeeNode removeFromFront(){
        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        return removedNode;
    }

    public void printList(){
        EmployeeNode current = head;
        while(current != null){
            System.out.print("Next ->");
            System.out.print(current);
            current = current.getNext();
        }
        System.out.print("null");
    }


}
