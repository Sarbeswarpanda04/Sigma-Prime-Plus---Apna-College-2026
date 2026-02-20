import java.util.*;
public class Array_input {
    public static void main(String[] args) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter Marks of Physics : ");
        marks[0] = sc.nextInt(); //phy
        System.out.print("Enter Marks of Math : ");
        marks[1] = sc.nextInt(); //math
        System.out.print("Enter Marks of Chemistry : ");
        marks[2] = sc.nextInt(); //chem

        System.out.println("Length of Array : "+marks.length);

        System.out.println("phy : "+marks[0]);
        System.out.println("Math : "+marks[1]);
        System.out.println("Chemistry : "+marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage : "+percentage );
    }
}