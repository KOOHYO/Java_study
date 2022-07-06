package com.iu.control;

import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {
		//월급을 입력
		//1. 정규직 2. 계약직
		//정규직 - 국민연금 1%, 건강보험 1.4%, 고용보험 0.5%, 산재보험 0.7%
		//계약직 - 3.3%
		Scanner sc = new Scanner(System.in);


		System.out.println("월급을 입력하세요");
		int money = sc.nextInt();
		System.out.println("정규직은 1 을쓰시고 계약직은 2를 쓰시오");
		int j = sc.nextInt();
		
		if(j==1) {
			//System.out.println(money-(money*0.01+money*0.14+money*0.005+money*0.007));
			int tax1 = (int)(money*0.01);
			int tax2 = (int)(money*0.14);
			int tax3 = (int)(money*0.005);
			int tax4 = (int)(money*0.007);
			System.out.println(money = money - tax1 - tax2 - tax3 - tax4);
			
		}else {
			//System.out.println(money-(money*0.033));
			int tax5 = (int)(money*0.033);
			System.out.println(money = money - tax5);
			
		}
		
		

	}

}
