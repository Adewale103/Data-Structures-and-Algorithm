package leet_code_solutions;

import java.util.LinkedList;

public class AndelaTest extends LinkedList<String> {
    public int countOccurences(){
        int count = 0;
        Node<E> current = head;
        while(current != null){
            if(current.item.equals(element)){
                count++;
            }
            current = current.next();
        }
        return count;
    }
}
