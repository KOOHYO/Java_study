package com.iu.array;

import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
		//학교 성적프로그램 프로그램 종료까지 계속 진행
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while(check) {
			
			//1. 학생 정보 입력
			//	 - 학생 수를 입력
			//	 - 이름, 번호, 국어, 영어, 수학 입력 후 계산 총점, 평균
			System.out.println("1. 학생 정보 입력");
			System.out.println("학생 수를 입력하세요");
			int num = sc.nextInt();
			String [] totalStudent = new String[num];
			String [] studentInfo = new String[totalStudent.length];
			int [] studentCount = new int [totalStudent.length];
			int [] studentKors = new int [totalStudent.length];
			int [] studentEgls = new int [totalStudent.length];
			int [] studentMath = new int [totalStudent.length];
			int [] totals = new int [totalStudent.length];
			int [] totalc = new int [totalStudent.length];
			
			for(int i=0; i<totalStudent.length; i++) {
				System.out.println("이름을 입력하세요");
				studentInfo[i] = sc.next();
				
				System.out.println("번호를 입력하세요");
				studentCount[i] = sc.nextInt();
				
				System.out.println("국어점수를 입력하세요");
				studentKors[i] = sc.nextInt();
				
				System.out.println("영어점수를 입력하세요");
				studentEgls[i] = sc.nextInt();
				
				System.out.println("수학점수를 입력하세요");
				studentMath[i] = sc.nextInt();
			}
			
			//2. 학생 정보 조회
			//	 - 모든 학생의 이름, 번호, 총점, 평균 출력
			System.out.println("2. 학생 정보 조회");
			for(int i=0; i<totalStudent.length; i++) {
				System.out.println("\n 이름은 "+studentInfo[i]);
				System.out.print(" 번호는 "+studentCount[i]);
				System.out.print(" 국어점수는 "+studentKors[i]);
				System.out.print(" 영어점수는 "+studentEgls[i]);
				System.out.print(" 수학점수는 "+studentMath[i]);
				totals[i]+=studentKors[i]+studentEgls[i]+studentMath[i];
				System.out.println(" 총점은 "+totals);
				totalc[i] = totals[i]/num;
				System.out.println(" 평균은 "+totalc);
			}
			//3. 학생 정보 검색
			//	 - 검색할 학생의 번호를 입력
			//	 - 입력한 번호와 일치하는 학생의 모든 정보 출력
			//	 - 일치하는 번호가 없으면 없는 학생이다 출력
			System.out.println("3. 학생 정보 검색");	
			System.out.println("학생의 번호를 입력하세요");
			int num2 = sc.nextInt();
			

			//4. 학생 정보 삭제
			//	 - 삭제할 학생의 번호를 입력
			//	 - 입력한 번호와 일치하는 학생의 정보를 삭제(배열을 한칸 삭제)
			//	 - 일치하는 번호가 없으면 없는 학생이다 출력
			System.out.println("4. 학생 정보 삭제");
			//5. 학생 정보 추가
			//	 - 이름, 번호, 국어, 영어, 수학
			System.out.println("5. 학생 정보 추가");
			//6. 프로그램 종료
			System.out.println("6. 프로그램 종료");
			
		}
		

	}

}
