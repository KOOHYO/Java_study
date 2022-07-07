package com.iu.loop;

import java.util.Scanner;

public class Loop1_ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1. 1번 대문자, 2번 소문자
		//	 1번이면 A - Z 출력
		//	 2번이면 a - z 출력
		
		System.out.println("1번 대문자, 2번 소문자");
		int b = sc.nextInt();
		
//		int a=97;
//		int j=123;
//		
//		if(b==1){
//			a=65;
//			j=91;
//		}
//		for(int c=a; c<j; c++) {
//			System.out.println((char)c);
//			}
		
		switch(b) {
		case 2:
			for(int i=97; i<123; i++) {
			System.out.println((char)i);		
			}
			break;
		case 1:
			for(int i=65; i<91; i++) {
			System.out.println((char)i);		
			}
			break;
		default:
			System.out.println("1번과 2번이 아닌 다른 숫자입니다");
			break;
		}
			
		
		//2. 1-10까지의 합 구하기
		int result=0;
		
		for(int i=1; i<11; i++) {
			result+=i;
		}
		System.out.println(result);
		
		//3. ID, PW입력해서 로그인 판단
		//	 최대 5번까지 시도 가능
		//	 로그인이 성공하면 그 즉시 종료
		int yId=1234; // 회원가입시 입력한 ID
		int yPw=5678; // 회원가입시 입력한 PW
		boolean check=false;
		
		int count=0;
		for(count=0; count<5; count++) {
			System.out.println("아이디를 입력하세요");
			int id=sc.nextInt();
			System.out.println("비밀번호를 입력하세요");
			int pw=sc.nextInt();
			
			if(id==yId && pw==yPw) {
				System.out.println("로그인 했습니다");
				check=!check;
				count=1000;
			}else {
				System.out.println("아이디와 패스워드가 맞지 않습니다");
			}

		}
		
		//1. 로그인이 성공
		//2. 로그인이 5번 전부 실패
		
		//if(check){
		//	System.out.println("게임 시작");
		//}else {
		//	System.out.println("은행 방문");
		//}
		
		
		if(count==5) {
			System.out.println("아이디와 비밀번호를 찾으세요");
		}else {
		System.out.println("프로그램을 시작합니다");
		
	}
}
}