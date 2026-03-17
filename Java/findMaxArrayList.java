import java.util.ArrayList;

public class findMaxArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);


        int Max = Integer.MIN_VALUE;

        for(int i=0;i<list.size();i++){
            // if(list.get(i)>=Max){
            //     Max = list.get(i);
            // }
            Max = Math.max(Max, list.get(i));
        }
        System.out.println("Max ellement is : "+Max);
    }

}
