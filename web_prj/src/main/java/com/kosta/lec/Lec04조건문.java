package com.kosta.lec;

public class Lec04조건문 {

	public static void main(String[] args) {
		
//		if()
		
//		int score = 10;
//		if (score >= 90) {
//			System.out.println("A");
//		}
		
//	    if()....  	else if()....
//		int score = 10;
//		if (score >= 90) {
//			System.out.println("A");
//		} else if (score >= 80) {
//			System.out.println("B");
//		} else if (score >= 70) {
//			System.out.println("C");
//		}
		
		
//		if()....	else()....
		
//		int score = 10;
//		if (score>=90) {
//			System.out.println("A");
//		} else {
//			System.out.println("F");
//		}

//		if()....  	else if().... 	else .... 
//		int score = 10;
//		if (score >= 90) {
//			System.out.println("A");
//		} else if (score >=80) {
//			System.out.println("B");
//		} else if (score >=70) {
//			System.out.println("C");
//		} else if (score >=60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}
		
		
		
//		System.out.println("---done---");
		
		
		// switch
		
		int score = 70;
		switch (score) {
		case 90:
			System.out.println("A");
			break;
		case 80:
			System.out.println("B");
			break;
		case 70:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
		}
		
		char grade = ' ';
		switch (score) {
			case 90: grade = 'A';
				 	 break;
			case 80: grade = 'B';
					 break;
			case 70: grade = 'C';
					 break;
			default: grade = 'F';
		}
		System.out.println(grade);
		
		// and &&
		// or ||
//		where job = 'CLERK' and sal > 2000;

//		age 10 ~ 19 10 m 0   f 0
//		age 20 ~ 29 20 m 100 f 0
//		age 30 ~ 39 30 m 0   f 0
//		gen = 'm'  'f' , "잘못 입력하셨습니다."
		
		int age = 19;
		char gen = 'm';

		if(age >= 10 && age < 20 && gen == 'm') {
			System.out.println(50);
		} else if (age >= 20 && age < 30 && gen == 'm') {
			System.out.println(100);
		} else if (age >= 30 && age < 40 && gen == 'm') {
			System.out.println(0);
		} else if (age >= 10 && age < 20 && gen == 'f') {
			System.out.println(0);
		} else if (age >= 20 && age < 30 && gen == 'f') {
			System.out.println(0);
		} else if (age >= 30 && age < 40 && gen == 'f') {
			System.out.println(0);
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		if(gen == 'm') {
			
		} else {
			
		}
		
		if(age >= 10 && age < 20) {
			
		} else if (age >= 20 && age < 30) {
			
		} else if (age >= 30 && age < 40) {
			
		}
		
		
		
	}
}