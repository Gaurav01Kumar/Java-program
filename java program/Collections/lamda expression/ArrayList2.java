import java.util.*;
public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Gaurav");
        list.add("abhi");
        list.add("Ankush");
        list.add("ravi");
        //printing the list item
        System.out.println(list);
        //geting the particular data in array
        String ele=list.get(2);
        System.out.println("2nd index data is = " + ele);
        //Deleting particular element
       String del= list.remove(2);
       System.out.println("The deleted item is = "+ del);
        System.out.println(list);
        //Change the element
        list.set(2, "sonali");
        System.out.println(list);
        //loop on the list 
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        int size=list.size();
        System.out.println("Size of array list = " + size);
    }
}
