package com.iu.array;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// 변수 선언 공식
		// 데이터타입 변수명;
		//String name;
		//Scanner sc;
		int age = 30;//main Method를 Stack에 올리고 Stack에 값이 저장
		
		// 배열 선언 공식
		// 모을려고 하는 데이터타입 [] 변수명;
		int [] nums = new int [3];// nums는 int 타입이 아니다 변수명앞에 바로 데이터타입인데 대괄호가있어서
		//new(Heap 영역에) int [3](4바이트 영역을 3개 만들어라) Stack에는 주소가저장(Reference 타입), Heap영역에 값이 저장
		char [] names = new char[20];
		
		nums[1] = age;
		nums[2] = 50;
		nums[0] = 10;
		
		names[0] = 'z';
		names[1] = '한';
		System.out.println(age);
		System.out.println(nums);
		System.out.println(nums[1]);
		System.out.println(nums[0]);
		System.out.println(nums[2]);
		System.out.println(names[0]);
		System.out.println(names[1]);

	}

}
