package com.iu.array;

public class Array3 {

	public static void main(String[] args) {
		
		int [] nums = new int [3];
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		int [] nums2 = nums;//같은 배열 타입이기 때문에 대입 가능
		System.out.println(nums2[2]);

	}

}
