import java.util.*;
public class passorfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks;
        System.out.println("Enter Your marks : ");
        marks = sc.nextInt();

        String Status = ((marks)>=33) ? "Pass" : "Fail";
        System.err.println(Status);
        }
}