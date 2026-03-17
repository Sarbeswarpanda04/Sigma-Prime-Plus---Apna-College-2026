import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(2);
        list.add(9);
        list.add(4);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        //descending order sort
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
