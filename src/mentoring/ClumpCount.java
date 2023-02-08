package mentoring;

public class ClumpCount {

	public static void main(String[] args) {

		System.out.println(countClumps(new int[] { 1, 2, 2, 3, 4, 4 }));

	}

	public static int countClumps(int[] nums) {
		int clumpCount = 0;

		if (nums == null || nums.length < 2) {
			return 0;
		}

		for (int x = 0; x < nums.length - 1; x++) {

			boolean isCounted = false;
			for (int y = x + 1; y < nums.length; y++) {
				System.out.println("x = " + x + " ; y = " + y);

				if (nums[x] == nums[y] && !isCounted) {
					System.out.println("first IF");
					clumpCount++;
					isCounted = true;
					continue;
				}

				if (nums[x] != nums[y] || y == nums.length - 1) {
					System.out.println("second IF");
					x = y - 1;
					break;
				}
			}

		}

		return clumpCount;
	}

}
