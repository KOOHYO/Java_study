package com.iu.array;

import java.util.Random;
import java.util.Scanner;

public class Array_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		//몬스터 생성
		String [] monsterNames = {"고블린", "오크", "트롤", "골렘"};
		int [] monsterHps = {5, 7, 10, 15};
		
		//캐릭터 이름 설정(마법사)
		System.out.println("캐릭터 이름을 입력해주세요");
		String name = sc.next();
		
		//파이어볼
		int magicPower = 6;
		
		
		//몬스터 파티 생성
		//몬스터 수 입력 (1-4)후
		//1. 입력한 수만큼 몬스터를 랜덤하게 뽑고
		//2. 해당 몬스터의 hp를 뽑아서 
		//출력
		System.out.println("1~4마리까지의몬스터 수를 입력해주세요");
		int count = sc.nextInt();
		String [] monsterPartyNames = new String[count];
		//몬스터의 hp배열 선언
		int [] monsterPartyHps = new int [monsterPartyNames.length];
		
		for (int i=0; i<monsterPartyNames.length; i++) {
			int index = random.nextInt(4);
			monsterPartyNames[i]=monsterNames[index];
			//랜덤으로 뽑힌 몬스터의 몬스터 HP
			monsterPartyHps[i] = monsterHps[index];
		}
		
		for(int i=0; i<monsterPartyNames.length; i++) {
			System.out.print(monsterPartyNames[i]+"의 HP는 : ");
			System.out.println(monsterPartyHps[i]);	
		}
		
		System.out.println("=================================");
		
		int [] monsterPartyTotalHps = new int [monsterPartyNames.length];
		
		for(int i=0; i<monsterPartyTotalHps.length; i++) {
			int damage = random.nextInt(6);
			System.out.println(monsterPartyNames[i]+" 에게 "+damage+" 만큼 피해를 줌");
			monsterPartyTotalHps[i] = monsterPartyHps[i]-damage;
			System.out.println(monsterPartyTotalHps[i]);
		}
		
		//1. 사냥 2. 도망
		//0-6미만의 랜덤한 데미지로 몬스터를 공격//3
		//몬스터를 공격하고 남은 HP
		boolean check = true;
		int death = 0;
		
		while(check) {
				System.out.println("1. 사냥");
				System.out.println("2. 프로그램종료");
				int play = sc.nextInt();
				if(play==1) {
					for(int i=0; i<monsterPartyNames.length; i++) {
						int damage = random.nextInt(magicPower);
						System.out.println(monsterPartyNames[i]+"에게 "+damage+" 피해를 줌");
						monsterPartyHps[i]=monsterPartyHps[i]-damage;
						if(monsterPartyHps[i]<1) {
							death++;
						}
					}
				}else {
					break;
				}
				
				System.out.println("사냥한 몬스터 수 : "+death);
				
			}//while 끝
				
			
	}
		
}


