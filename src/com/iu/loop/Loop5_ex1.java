package com.iu.loop;

import java.util.Scanner;

public class Loop5_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int yId=1234;
		int yPw=5678;
		
		//ID입력, PW입력
		//로그인 판단 로그인이 성공하면 종료
		//실패하면 다시 입력
		
		
		boolean check = true;
		boolean flag = true;
		
		while(check) {
				System.out.println("1. 로그인 하겠습니까?");
				System.out.println("2. 종료 하시겠습니까?");
				int select=sc.nextInt();
			switch(select) {
			case 1 :
				System.out.println("아이디를 입력하시오");
				int id = sc.nextInt();
				System.out.println("비밀번호를 입력하시오");
				int pw = sc.nextInt();
				if(id==yId&&pw==yPw) {
					System.out.println("로그인 성공");
					check=!check;
					flag=!flag;
					System.out.println("게임을 시작하겠습니다");
				}else {
						System.out.println("로그인 실패");
				}
			break;
			default :
				check=!check;

			
			
			}//swith 끝
			
		}//while 끝

		//--------------------------------------------------
		//로그인을 안했으면 프로그램이 종료
		//로그인에 성공했으면 게임 시작
		//RPG
		//시작레벨은 1
		//만랩	  15
		//Gold  : 1000원
		//모든 몬스터의 경험치는 동일
		//1  -> 2  :  3
		//2  -> 3  :  6
		//3  -> 4  :  9
		//4  -> 5  :  12
		//...
		//14 -> 15 :  프로그램 끝
		
		//5렙  달성시 축하금으로 1000Gold 지급
		//10렙 달성시 축하금으로 2000GOld 지급
		//15렙 달성시 축하금으로 3000GOld 지급

		if(check) {//flag true면 로그인 성공, false면 로그인 실패
			System.out.println("게임을 시작합니다");
			int level=1;
			int gold=1000;
			
			for(level=1;level<15;level++) {
			
				if(level%5==0) {
					gold = gold+level/5*1000;
				}
				
				for(int mon=0; mon<level*3; mon++) {
					System.out.println(mon+1+"마리를 사냥했습니다");
				}
				System.out.println("==================");
			}
			
			gold = gold+3000;
			
			System.out.println("최종레벨 : "+level);
			System.out.println("최종Gold : "+gold);
		}
		
		System.out.println("프로그램을 종료 합니다");
		
		
//		int level = 0;
//		int gold = 1000;
//		int monster = 0;
//		
//		while(level<14) {
//			level++;
//			System.out.print("레벨 : "+level+" ");
//			levelUp++;
//			if(levelUp==5) {
//				System.out.println("Gold :"+gold*2);
//			}else if(levelUp==10){
//				System.out.println("Gold :"+gold*3);
//			}else if(levelUp==15){
//				System.out.println("Gold :"+gold*4);
//			}else{
//			System.out.println("Gold :"+gold*4);
//			}
//
//			System.out.print("레벨업 : "+levelUp+" ");
//			ex += 3;
//			System.out.println("경험치 : "+ex+" ");
			
			
		}
}
