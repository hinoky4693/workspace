package com.kosta.lec;

import java.util.Scanner;

public class Quiz03주소록 {

	public static void main(String[] args) {
		
		// 참조타입 String --> 기본타입 int
		// int res = (int) str; // 불가능

		
//		String --> int
//		int numAge = Integer.parseInt(age);
		
		
		
		Scanner sc = new Scanner(System.in);
		
		String name = " ";
		String pnum = " ";
		
		while (!name.equalsIgnoreCase("exit")) {
			System.out.print("이름 : ");
			name = sc.nextLine();
			
			System.out.print("전화번호 : ");
			pnum = sc.nextLine();
			
			System.out.println("이름 : "+name+"\t"+"전화번호 : "+ pnum);
		}

		
		

	}

}
