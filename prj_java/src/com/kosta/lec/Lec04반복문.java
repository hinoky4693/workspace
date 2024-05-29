package com.kosta.lec;

public class Lec04반복문 {

	public static void main(String[] args) {
		
//		*******************************************************		
//		초기화 int i = 0;
//		조건문 i <= 3;
//		증감문 i++; //	i = i + 1; i += 1; i++;
		
//		for (초기화; 조건문; 증감문){
//			 todo;
//			 
//		}
		
//		초기화;
//		while (조건문) {
//			todo;
//			증감문;
//		}
			
//		초기화;
//		do {
//			todo;			
//			증감문;
//		} while(조건문)
		
// 		********************************************************	
		 
		
//		for (int i = 0; i <= 3; i++){
//			System.out.println(i);
//
//		}
		
		
//		int i = 0;
//		초기화;
//		while (조건문) {
//			증감문;
			// todo
//		}
		
//		while (i <= 3) {
//			System.out.println(i);
//			i++;
//		}

//		int i = 0;
//		초기화;
//		do {
//			증감문;
//			// todo
//		} while(조건문)
		
//		do {
//			System.out.println(i);
//			i++;
//		} while (i <= 3);
//		------------------------------------------------------------
//		문제. 0부터 시작해서 0 2 4 6 8 출력하는 프로그램 작성 
		
		// for
//		for(int i = 0; i <= 8; i += 2) {
//			System.out.print(i + " ");
//		}
//		
//		System.out.println();
//		
//		// while
//		int i = 0;
//		while(i <= 8) {
//			System.out.print(i + " ");
//			i += 2;
//		}
//		
//		System.out.println();
//		
//		// do while
//		i = 0;
//		do {
//			System.out.print(i + " ");
//			i += 2;
//		} while (i <= 8);
//		
		
		// 중첩 루프문(구구단)
		// 2 4 6단 *2 *4 *6 *8
//		for(int i=2; i<=6; i+=2) {
//			System.out.println(i+"단");
//			for(int j=2; j<=8; j+=2) {
//				System.out.println(i+"X"+j+"="+i*j);
//			}
//		}
//		
		
		// 가로 진행 구구단?
		for(int i=2; i<=6; i+=2) {
			System.out.print(i+"단"+ "\t");
		}
		for(int j=2; j<=8; j+=2) {
			System.out.println();
			for(int k=2; k<=6; k+=2) {
				System.out.print(k+"X"+j+"="+k*j+"\t");
			}
			
		}
		
	
	}
}

