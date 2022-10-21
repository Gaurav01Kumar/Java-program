import java.util.*;
class LinkedHash{
    public static void main(String [] args){
        LinkedHashSet<String> lh=new LinkedHashSet<>();
        //ading the element 
        lh.add("A");
        lh.add("B");
        lh.add("C");
        lh.add("D");
        //Printing the hash element 
        System.out.println("LinkedHash Element = " +lh);
        //Remove a element in Linked hash set 
        System.out.println("Size of the Linked list is = " + lh.size());
        System.out.println("Remove the element = "+ lh.remove("B"));
        System.out.println("Size of the Linked list is  after remove one element = " + lh.size());
        System.out.println("Update value is = " + lh);
        System.out.println("Check linked contain E "+ lh.contains("E"));
        

    }
}