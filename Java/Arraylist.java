import java.util.ArrayList;
public class Arraylist {
    
    public static void main(String[] args) {
        
        //ClassName objectName = new ClassName
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        //Get Operation
        int element = list.get(2);
        System.out.println(element);

        //Remove Element
        list.remove(2);
        System.out.println(list);

        

    }
}
