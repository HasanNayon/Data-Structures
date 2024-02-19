import java.util.ArrayList;

public class problem7 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList();

        // Add Element
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(11);
        list.add(13);

        System.out.println("Array before Move element 2:\n"+list);

        //Remove element 2 at position 0
        list.remove(0);

        // Add element 2 at position 5
        list.add(5,2);
        System.out.println("Array after Move element 2:\n"+list);


    }
}
