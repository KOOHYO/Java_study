package com.iu.control;

public class Control4 {

	public static void main(String[] args) {
		//
		String select="abc";
		
		switch(select) {
		case "aaa":
			System.out.println("1 일때 진행");
			break;
		case "abc":
			System.out.println("2 일때 진행");
			break;
		default:
			System.out.println("그외 나머지 진행");
		//제일 마지막은 break을 써도돼고 안써도 된다
		
		}

	}

}
