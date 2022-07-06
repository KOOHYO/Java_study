package com.iu.control;

import java.util.Scanner;

public class Control1_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드로부터, 국어, 영어, 수학 점수를 차례로 입력
		// 총점과 평균을 계산
		// 평균이 90점 이상이면 우등상 수상 출력
		// 모든 학생들은 졸업 출력
		
		// 2. 평균이 90점 이상이면 A학점 출력
		//    평균이 80점 이상이면 B학점 출력
		//    평균이 70점 이상이면 C학점 출력
		//    평균이 60점 이상이면 D학점 출력
		//    그외 나머지는 F학점 출력
		Scanner sc = new Scanner(System.in);
		
		int ko = 0;
		int eg = 0;
		int ma = 0;
		int result = 0;
		int result2 = 0;
		
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		System.out.println("국어 점수를 입력하세요");
		ko = sc.nextInt();
		System.out.println("영어 점수를 입력하세요");
		eg = sc.nextInt();
		System.out.println("수학 점수를 입력하세요");
		ma = sc.nextInt();
		
		result = ko + eg + ma;
		result2 = result/3;
		
		if(result2>=90) {
			System.out.println(name+" 은(는) A학점 입니다 우등상 수상");
		}
		
		
		if(result2>=80 && result2<90) {
			System.out.println(name+" 은(는) B학점 입니다");
		}
		
		if(result2>=70 && result2<80) {
			System.out.println(name+" 은(는) c학점 입니다");
		}
		
		if(result2>=60 && result2<70) {
			System.out.println(name+" 은(는) B학점 입니다");
		}
		
		if(result<60) {
			System.out.println(name+" 은(는) F학점 입니다");
		}
		
		System.out.println(name+" 은(는) 졸업");
				
		
	}

}
