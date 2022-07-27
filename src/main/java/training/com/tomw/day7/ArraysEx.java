package training.com.tomw.day7;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		int nums[] = { 5, 3, 7, 3, 5, 7, 8, 21, 4 };

		Arrays.sort(nums);

		for (int num : nums) {
			System.out.println(num);
		}

		int index = Arrays.binarySearch(nums, 8);
		System.out.println(index);

	}

}
