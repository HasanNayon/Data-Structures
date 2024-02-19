import java.util.ArrayList;

public class problem9 {
    public static void ReverseArray(ArrayList list){

        System.out.println("Before Reverse Array:");
        for (int i = 0; i <list.size(); i++) {
            System.out.print(list.get(i)+ " ");
            
        }

        System.out.println(" ");

        System.out.println("Before Reverse Array:");


         for (int i = list.size()-1; i >=0; i--) {
            System.out.print(list.get(i)+ " ");
            
        }

         }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(4);
        list.add(9);
        list.add(16);
        list.add(9);
        list.add(7);
        list.add(4);
        list.add(9);
        list.add(11);


        //System.out.println(list);
        ReverseArray(list);

       }
}