package com.iu.control;

import java.util.Scanner;

public class Control1_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if문 한번만 쓰고 짝수 홀수 나오게
		// 실제로도 많이쓰인다고 함
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		String result="홀수 입니다.";
		
		System.out.println("정수를 입력 하세요");
		num = sc.nextInt();
		
		
		
		if(num%2==0 ) {
			result="짝수 입니다";
		}

		System.err.println(result);
		
	}

}
