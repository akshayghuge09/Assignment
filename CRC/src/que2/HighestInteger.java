package que2;

public class HighestInteger {

	public static void main(String[] args) {

		int arr[] = { -1, 312, 5, 6, 99, 12, 2 };
		int len = arr.length;
		int max1 = arr[0];
		max1 = highest(arr, len - 1, max1);
		System.out.println(max1);
	}

	private static int highest(int[] arr, int len, int max) {

		if (arr[len] > max) {
			max = arr[len];

		}
		if (len == 0) {
			return max;
		}

		return highest(arr, (len - 1), max);
	}

}
