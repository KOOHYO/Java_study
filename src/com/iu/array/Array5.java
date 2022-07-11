package com.iu.array;

public class Array5 {

	public static void main(String[] args) {
		int [] nums1 = {1, 2, 3};//new int[3];
		System.out.println(nums1.length);
		//얕은 복사 (같은 주소를 바라보고 있다)
		int [] nums2 = nums1;
		System.out.println(nums2.length);
		
		//깊은 복사 (새로운 배열을 만들고 같은 값을 복사함-분리되어있음)
		int [] nums3 = new int [3];
		for(int i=0; i<nums1.length; i++) {
			nums3[i]=nums1[i];
		}
		nums2[0] = 9;
		System.out.println(nums1[0]);
		
		nums3[0] = 100;
		System.out.println(nums1[0]);
		
		System.out.println(nums3.length);
		nums3 = new int [3];
		System.out.println(nums3[0]);
		
	}

}
