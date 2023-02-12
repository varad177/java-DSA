import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class array_list_2 {
    // revers the arraylist

    static void ReverseArrayList(ArrayList<Integer> list) {
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }

    // an inbuild method
    static void ReverseArrayList2(ArrayList<Integer> list) {
        Collections.reverse(list);
        System.out.println(list);
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);
        ReverseArrayList(list);
        System.out.println(list);
        ReverseArrayList2(list);

    }

}
