package com.iu.control;

import java.util.Scanner;

public class Control3_ex1 {
	public static void main(String[] args) {
		//국어, 영어, 수학 입력
		//총점 평균 계산
		//평균 90점 이상이면 A
		//평균 80점 이상이면 B
		//평균 70점 이상이면 C
		//평균 60점 이상이면 D
		//그 외는 F
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요");
		int ko = sc.nextInt();
		System.out.println("영어 점수를 입력하세요");
		int eg = sc.nextInt();
		System.out.println("수학 점수를 입력하세요");
		int ma = sc.nextInt();
		
		int result = ko+eg+ma;
		double result2 = result/3;
		
		if(result2>=90) {
			System.out.println("A입니다");
		}else if(result2>=80 && result2<90) {
			System.out.println("B입니다");
		}else if(result2>=70 && result2<80) {
			System.out.println("C입니다");
		}else if(result2>=60 && result2<80) {
			System.out.println("D입니다");
		}else{
			System.out.println("F입니다");
		}
		
	}
}
