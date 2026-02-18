public class Inverted_Rotated_half_pyramid {

    public static void invertedrotatedhalfpyramid(int s) {
        // outer loop
        for (int i = 1; i <= s; i++) {
            // spaces
            for (int j = 1; j <= s - i; j++) {
                System.out.print("  ");
            }

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        return;
    }
    public static void main(String[] args) {
        invertedrotatedhalfpyramid(7);
    }

}
