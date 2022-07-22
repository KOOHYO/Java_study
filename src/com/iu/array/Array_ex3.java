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
			int [] totalStudent = null;
			String [] studentInfo = null;//이름
			int [] studentCount = null;//번호
			int [] studentKors = null;//국어
			int [] studentEgls = null;//영어
			int [] studentMath = null;//수학
			int [] totals = null;//총점
			int [] totalc = null;//평균
			
			totalStudent = new int[num];
			studentInfo = new String[totalStudent.length];//이름
			studentCount = new int [totalStudent.length];//번호
			studentKors = new int [totalStudent.length];//국어
			studentEgls = new int [totalStudent.length];//영어
			studentMath = new int [totalStudent.length];//수학
			totals = new int [totalStudent.length];//총점
			totalc = new int [totalStudent.length];//평균
			
			for(int i=0; i<totalStudent.length; i++) {
				System.out.println(i+1+". 이름을 입력하세요");
				studentInfo[i] = sc.next();
				System.out.println(i+1+". 번호를 입력하세요");
				studentCount[i] = sc.nextInt();
				System.out.println(i+1+". 국어점수를 입력하세요");
				studentKors[i] = sc.nextInt();
				System.out.println(i+1+". 영어점수를 입력하세요");
				studentEgls[i] = sc.nextInt();
				System.out.println(i+1+". 수학점수를 입력하세요");
				studentMath[i] = sc.nextInt();
			}
			
			
			//2. 학생 정보 조회
			//	 - 모든 학생의 이름, 번호, 총점, 평균 출력
			System.out.println("2. 학생 정보 조회");
			for(int i=0; i<totalStudent.length; i++) {
				System.out.println("\n 이름 : "+studentInfo[i]);
				System.out.print(" 번호는 : "+studentCount[i]);
				System.out.print(" 국어점수: "+studentKors[i]);
				System.out.print(" 영어점수: "+studentEgls[i]);
				System.out.print(" 수학점수:  "+studentMath[i]);
				totals[i]+=studentKors[i]+studentEgls[i]+studentMath[i];
				System.out.println(" 총점  :"+totals);
				totalc[i] = totals[i]/num;
				System.out.println(" 평균  : "+totalc);
			}
			//3. 학생 정보 검색
			//	 - 검색할 학생의 번호를 입력
			//	 - 입력한 번호와 일치하는 학생의 모든 정보 출력
			//	 - 일치하는 번호가 없으면 없는 학생이다 출력
			System.out.println("3. 학생 정보 검색");	
			System.out.println("학생의 번호를 입력하세요");
			num = sc.nextInt();
			boolean flag = true;
			for (int i=0; i<totalStudent.length; i++) {
				if(num == studentCount[i]) {
					System.out.println("\n 이름 : "+studentInfo[i]);
					System.out.print(" 번호는 : "+studentCount[i]);
					System.out.print(" 국어점수: "+studentKors[i]);
					System.out.print(" 영어점수: "+studentEgls[i]);
					System.out.print(" 수학점수:  "+studentMath[i]);
					totals[i]+=studentKors[i]+studentEgls[i]+studentMath[i];
					System.out.println(" 총점  :"+totals);
					totalc[i] = totals[i]/num;
					System.out.println(" 평균  : "+totalc);
					flag = true;
					break;
				}
			}
			
			if(flag) {
				System.out.println("일치하는 학생 정보가 없습니다");
			}

			//4. 학생 정보 삭제
			//	 - 삭제할 학생의 번호를 입력
			//	 - 입력한 번호와 일치하는 학생의 정보를 삭제(배열을 한칸 삭제)
			//	 - 일치하는 번호가 없으면 없는 학생이다 출력
			System.out.println("4. 학생 정보 삭제");
			System.out.println("삭제할 학생의 번호를 입력해 주세요");
			num = sc.nextInt();
			boolean delete = true;
			String [] studentInfocp = null;//이름
			int [] studentCountcp = null;//번호
			int [] studentKorscp = null;//국어
			int [] studentEglscp = null;//영어
			int [] studentMathcp = null;//수학
			int [] totalscp = null;//총점
			int [] totalccp = null;//평균
			for(int i=0; i<totalStudent.length; i++) {
				if(num == studentCount[i]) {
					delete = true;
					break;
				}
			}
			if(delete) {
				studentInfocp = new String [totalStudent.length-1];//이름
				studentCountcp = new int [studentInfocp.length];//번호
				studentKorscp = new int [studentInfocp.length];//국어
				studentEglscp = new int [studentInfocp.length];//영어
				studentMathcp = new int [studentInfocp.length];//수학
				totalscp = new int [studentInfocp.length];//총점
				totalccp = new int [studentInfocp.length];
				int index = 0;
				for(int j=0; j<totalStudent.length; j++) {
					if(j==index) {
						continue;
					}
					studentInfocp[index]=studentInfo[j];
					studentCountcp[index]=studentCount[j];
					studentKorscp[index]=studentKors[j];
					studentEglscp[index]=studentEgls[j];
					studentMathcp[index]=studentMath[j];
					totalscp[index]=totals[j];
					totalccp[index]=totalc[j];
					index++;
				}
				studentInfo=studentInfocp;
				studentCount=studentCountcp;
				studentKors=studentKorscp;
				studentEgls=studentEglscp;
				studentMath=studentMathcp;
				totals=totalscp;
				totalc=totalscp;
			}else {
				System.out.println("일치하는 학생 정보 없음");
			}
			//5. 학생 정보 추가
			//	 - 이름, 번호, 국어, 영어, 수학
			System.out.println("5. 학생 정보 추가");
			System.out.println("추가할 학생 정보를 입력해 주세요");
			String [] studentInfocp = new String [totalStudent.length+1];
			int [] studentCountcp = new int [studentInfocp.length];//번호
			studentKorscp = new int [studentInfocp.length];//국어
			studentEglscp = new int [studentInfocp.length];//영어
			studentMathcp = new int [studentInfocp.length];//수학
			totalscp = new int [studentInfocp.length];//총점
			totalccp = new int [studentInfocp.length];
			
			//6. 프로그램 종료
			System.out.println("6. 프로그램 종료");
			
		}
		

	}

}
