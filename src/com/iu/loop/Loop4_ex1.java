package com.iu.loop;

public class Loop4_ex1 {

	public static void main(String[] args) {
		
		//분 과 초 입력 받음
		//ex) 1, 15
		
		for(int m=0; m<60; m++) {
			
			for(int s=0; s<60; s++) {
				System.out.println(m+"분 :" + s + "초");
			}
			
		}

	}

}
