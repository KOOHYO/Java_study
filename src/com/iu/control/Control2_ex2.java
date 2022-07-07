package com.iu.control;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1-5 사이의 숫자 입력");
		int num = sc.nextInt();//1-5;
		System.out.println("알파벳을 입력");
		char ch = sc.next().charAt(0);
		
		ch =(char)(ch+num);
		int result = ch+num;
		ch = (char)result;
		
		//소문자가 범위를 벗어났을 때
		if(result>'z') {//프리미티브타입끼리는 자동타입변환 가능
			result = result - 'z'-1; //아스키코드표를 보고 문자 대신 숫자를 대입
			result = 'a'+result;
		}
		
		//대문자가 범위를 벗어났을 때
		if(result>'Z' && result<'a') {
			result = result - 'Z'-1;
			result = 'A'+result;
		}
		
		
		System.out.println("ch : "+ch);
		
		// num:1 ch:a 출력 b
		// num:2 ch:a 출력 c
		// num:1 ch:z 출력 a
		// num:2 ch:z 출력 b

		
		//study edition
		//home edition

		
	}

}
