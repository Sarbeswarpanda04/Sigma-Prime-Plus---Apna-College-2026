import java.util.ArrayList;
public class ContainerWithMostWater {

	// Brute-force approach: O(n^2)
	public static int storeWaterBruteForce(ArrayList<Integer> height) {
		int maxWater = 0;

		for (int i = 0; i < height.size(); i++) {
			for (int j = i + 1; j < height.size(); j++) {
				int ht = Math.min(height.get(i), height.get(j));
				int width = j - i;
				int currentWater = ht * width;
				maxWater = Math.max(maxWater, currentWater);
			}
		}

		return maxWater;
	}

	// Two-pointer approach: O(n)
	public static int storeWaterOptimized(ArrayList<Integer> height) {
		int lp = 0;
		int rp = height.size() - 1;
		int maxWater = 0;

		while (lp < rp) {
			int ht = Math.min(height.get(lp), height.get(rp));
			int width = rp - lp;
			int currentWater = ht * width;
			maxWater = Math.max(maxWater, currentWater);

			if (height.get(lp) < height.get(rp)) {
				lp++;
			} else {
				rp--;
			}
		}

		return maxWater;
	}

	public static void main(String[] args) {
		ArrayList<Integer> height = new ArrayList<>();
		height.add(1);
		height.add(8);
		height.add(6);
		height.add(2);
		height.add(5);
		height.add(4);
		height.add(8);
		height.add(3);
		height.add(7);

		System.out.println("Max Water (Brute Force): " + storeWaterBruteForce(height));
		System.out.println("Max Water (Optimized): " + storeWaterOptimized(height));
	}
}
