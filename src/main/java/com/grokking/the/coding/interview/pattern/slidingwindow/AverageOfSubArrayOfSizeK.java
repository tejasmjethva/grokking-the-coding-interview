package com.grokking.the.coding.interview.pattern.slidingwindow;

import java.util.Arrays;

public class AverageOfSubArrayOfSizeK {
	public static double[] findAverages(int k, int[] arr) {
		double[] result = new double[arr.length - k + 1];
		return result;
	}

	public static void main(String[] args) {
		double[] result = AverageOfSubArrayOfSizeK.findAverages(5, new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2});
		System.out.println("Averages of subarray of sizze k: " + Arrays.toString(result));
	}
}
