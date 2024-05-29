package com.kosta.sample.shop;
import java.util.Scanner;

public class Student {
	private String major;
	private int id;
	
	// 학과 세터
	void setMajor(String major) {
		this.major = major;
	}
	
	// 학과 게터
	String getMajor() {
		return this.major+" 학과";
	}
	
	// 학과 세터
	void setId(int id) {
		this.id = id;
	}
	
	// 학과 게터
	int getId(){
		return this.id;
	}

	
	
	
	public static void main(String[] args) {
		Student st = new Student();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("========= 회원가입 =========");
		System.out.println("학과 입력 : ");
		
		String major1 = sc.next();
		st.setMajor(major1);

		
		System.out.println("학번 입력 : ");
		int id1	= sc.nextInt();
		st.setId(id1);
		sc.close();
		
		System.out.println(st.getMajor());;
		System.out.println(st.getId());
		
	}

}
