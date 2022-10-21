

import java.util.ArrayList;



public class number {
    public static void main(String[] args) {
        ArrayList<Integer>number=new ArrayList<>();
        number.add(10);
        number.add(13);
        number.add(134);
        number.add(123);
        number.add(1232);
        number.add(12);
        number.forEach( (numbe) ->{
            System.out.println(numbe);
            System.out.println(numbe.shortValue());
        });
    }
}
