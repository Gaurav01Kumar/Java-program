import java.util.*;



public class stack {
    public static void main(String[] args) {
        Stack<String>  stack=new Stack<String>();
        //append the element 
        stack.push("hello ");
        stack.push("my ");
        stack.push("is ");
        stack.push("gaurav");
        stack.push("kumar ");
        System.out.println(stack);
        Iterator<String> itr=stack.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+ " ");
        }
        stack.pop();
        System.out.println();
        itr=stack.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+ " ");
        }
    }
}
