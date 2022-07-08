package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex2 {

	public static void main(String[] args) {
		//FPS
		//총알 : 
		//탄창 : 30발, 3개
		
		//1. 단발 2. 점사 방아쇠 한번에 3발씩
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번 단발 2번 점사");
		int check = sc.nextInt();
		
		
		if(check==1) {
			for(int mag=1; mag<4; mag++) {
				System.out.println();
				for(int shot=1; shot<31;shot++) {
					System.out.println("탄창 :"+mag+" 총알 :"+shot+" 탕");
//					if(c==) {
//						system.out.print(", ");
//					}
				}
			}
			
		}else if(check==2){
			for(int mag=1; mag<4; mag++) {
				System.out.println();
				for(int shot=1; shot<11; shot++) {
					System.out.println("탄창 :"+mag+" 총알 :"+shot+" 탕탕탕");
				}
			}
		}else {
			System.out.println("잘못 입력하셨습니다");
		}
//		int select=sc.nextInt();
//		
//		int inc = 3;
//		String sount="타타탕";
//		if(select==1) {
//			inc=1;
//			sound="탕";
//		}
//		
//		for(int b=0; b<30; b=b+inc) {
//			System.out.println(sound);
//		}
		
		
//		int select=sc.nextInt();
//		int count=10;
//		String sount="타타탕";
//		if(select==1) {
//			count=30;
//			sound="탕";
//		}
//		for(int b=0; b<count; b++) {
//			
//		}
		
		
	}

}
