package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex1 {

	public static void main(String[] args) {
		
		//분 과 초 입력 받음
		//ex) 1, 15
		Scanner sc = new Scanner(System.in);
		
		System.out.println("분 입력");
		int min = sc.nextInt();
		
		System.out.println("초 입력");
		int sec = sc.nextInt();
		
		boolean flag=false;
		
		for(int m=0; m<60; m++) {
			
			for(int s=0; s<60; s++) {
				System.out.println(m+"분 :" + s + "초");
				if(min==m&&sec==s) {
					flag=!flag;//이 부분이 trus이면 밑에부분도 true가 돼서 나간다, 만약 false면 반복문이 계속 진행된다
					m=60;//밑에 주석을 쓰려고하면 이부분은 지워야한다
					break;
				}
			}
			
//			if(flag) {
//				break;
//			}
			
		}

	}

}
