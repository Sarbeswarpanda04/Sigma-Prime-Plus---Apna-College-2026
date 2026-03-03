public class Updateithbit {
    public static int updateithbit(int n, int i, int newBit) {
        int bitmask = ~(1 << i);
        return (n & bitmask) | (newBit << i);
    }
    public static void main(String[] args) {
        System.out.println(updateithbit(10, 1, 0)); // 1010 -> 1000 = 8
        System.out.println(updateithbit(10, 0, 1)); // 1010 -> 1011 = 11
    }
}
