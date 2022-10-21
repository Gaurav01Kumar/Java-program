import java.util.LinkedList;

import java.util.Collections;
import java.util.List;

public class linkedlist{
    public static void main(String[] args) {
        LinkedList<Integer> link=new LinkedList<>();
        //Insert the element  in linked list 

        link.add(23);
        link.add(22);
        link.add(1);
        link.add(34);
        link.add(13);
        link.add(22);
        link.add(1);
        link.add(34);
        link.add(13);
        System.out.println(" Linked list all element is = " + link);
        //find the size of the linked list 
        System.out.println(" Size of the linked is = "+ link.size());
        //get the particular data from a linked list 
        System.out.println("The data present in 3rd index = " + link.get(3));
        //modify the particular data in linked list 
        System.out.println("Change the 3rd index data 34 into 49 " + link.set(3, 49));
        System.out.println(" Linked list all element is = " + link);
        //remove a data from particular are 
        System.out.println("The data of 5th index deleted = " + link.remove(5));
        System.out.println(" Size of the linked is = "+ link.size());
        //Sorting the element in accesending order 
        Collections.sort(link);
        System.out.println("Shorted element = " + link);
        
    }
}