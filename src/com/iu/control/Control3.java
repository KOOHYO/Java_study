package com.iu.control;

import java.util.Scanner;

public class Control3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=10;//지역변수
		
		System.out.println("1-3 숫자 입력");
		int select = sc.nextInt();
		
		if(select == 1) {
			int cout=1;//지역변수 (여기 영역에서만 사용되는 변수, 영역이 끝나면 삭제됨)
			System.out.println(num);
			System.out.println("1 선택");
		}else if(select == 2) {
			int count=1;//여기서 중복선언은 아니다
			System.out.println("2 선택");
		}else {
			int count=1;//세개중 하나만 실행되기 때문에
			System.out.println("3 선택");
		}

		System.out.println(num);
		//System.out.println(count); 이걸 살리고 싶으면 if문 밖에 num이 선언된 영역에 선언하면 살릴 수 있음
		
		
	}

}
