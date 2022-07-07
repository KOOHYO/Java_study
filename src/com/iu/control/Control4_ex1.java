package com.iu.control;

import java.util.Scanner;

public class Control4_ex1 {

	public static void main(String[] args) {
		//국어, 영어, 수학 입력
		//총점 평균 계산
		//평균 90점 이상이면 A
		//평균 80점 이상이면 B
		//평균 70점 이상이면 C
		//평균 60점 이상이면 D
		//그 외는 F
		
		int result2 = 99;

		
		switch(result2/10) {
		case 9:
			System.out.println("A 입니다");
			
			break;
		case 8:
			System.out.println("B 입니다");
			
			break;
		case 7:
			System.out.println("C 입니다");
			
			break;
		case 6:
			System.out.println("D 입니다");
			
			break;
		
		default:
			System.out.println("F입니다");
		}
		
		
	}

}
