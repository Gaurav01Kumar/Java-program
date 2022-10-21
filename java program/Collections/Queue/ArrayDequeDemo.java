

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq=new ArrayDeque<Integer>();
        //Inserting the element with add() method 
        dq.add(23);
        dq.add(22);
        dq.add(55);
        dq.add(89);
        dq.add(34);
        //printing the all element in the deque 
        System.out.println(dq);
        //Clear all the element 
        dq.clear();
        
        if(dq.isEmpty()){
            System.out.println("Nothing to print ");
        }else{
            System.out.println(dq);
        }
        //insert at first using addFirst() method 
        dq.addFirst(12);
        dq.addFirst(123);
        System.out.println(dq);
        dq.addLast(245);
        dq.addLast(34);
        System.out.println(dq);

    }
}
