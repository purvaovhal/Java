package functions_methods;

import java.util.Arrays;

public class ChangeValue {
	public static void main(String[] args) {
		int[] arr = {1, 5, 6, 45, 96};
		changeValue(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void changeValue(int[] nums) {
		nums[0] = 99;
		nums[1] = 15;

	}
}
