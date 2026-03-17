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

        list.add(1,9);  //Add at spectific index
        System.out.println(list);

        //Get Operation
        int element = list.get(2);
        System.out.println(element);

        //Remove Element
        list.remove(2);
        System.out.println(list);

        //Set Element At Index
        list.set(2, 10);
        System.out.println(list);

        //Contains Element
        System.out.println(list.contains(1));
        System.out.println(list.contains(12));

        //Size of Array list
        System.out.println(list.size());

        //Print Array List
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}
