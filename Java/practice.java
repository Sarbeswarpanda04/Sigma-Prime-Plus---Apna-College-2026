import java.util.*;
public class practice {
    public static void main(String[] args) {
        int marks[] = {100,95,75,7,25,45,98};
        System.out.print("Marks less than 35: ");
        boolean found = false;
        for (int mark : marks) {
            if (mark < 35) {
                System.out.print(mark + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("None");
        }
        System.out.println();
    }
}
