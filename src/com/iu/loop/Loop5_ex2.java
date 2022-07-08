package com.iu.loop;

import java.util.Random;
import java.util.Scanner;

public class Loop5_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
//		nestInt(정수) : 0 부터 입력한 정수 미만 범위에서 무작위 정수를 뽑아줌
//		int num = random.nextInt(10);//0부터 안에 숫자만큼의 범위안에 랜덤으로 숫자가나옴
//		System.out.println(num);
		
		//0 : 가위
		//1 : 주먹
		//2 : 보
		
		//사용자가 하나를 입력
		//컴퓨터가 하나를 뽑아서 비교
		//사용자가 이길 경우만 종료
		//비기거나 지면 다시 실행한다
		boolean check=true;
		
		while(check) {
			System.out.println("0 : 가위 1 : 바위 2 : 보 를 입력하시오");
			int you = sc.nextInt();
			int com = random.nextInt(3); 
			System.out.println("You : "+you+" com : "+com);

			if(com==0&&you==2) {
				you=-1;
			}
			
			if(com==2&&you==0) {
				com=-1;
			}
			
			if(com<you) {
				System.out.println("You Win!!");
			}else if(com == you) {
				System.out.println("Even!!");
			}else {
				System.out.println("Com Win!!");
			}
		}
		
			
	}			
			
}