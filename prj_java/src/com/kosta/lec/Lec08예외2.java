package com.kosta.lec;

public class Lec08예외2 {

	// ************************************************************************
	public void myPrint() throws ArithmeticException, Exception{
//		try {
			System.out.println("111");
			System.out.println("222");
			// 예외를 만들어 던진다.
			ArithmeticException myExc = new ArithmeticException();
			throw myExc;

//			System.out.println("333");
			
//		} catch(Exception e) {
//			System.out.println("444");
//			System.out.println(e.getClass());
//		} finally {
//			System.out.println("555");
//		}
	}
	
	public static void wait2() throws InterruptedException{
		System.out.println("wait() call");
	}
	
	
	// ************************************************************************	
	public static void main(String[] args) {
		try {
			wait2();
		} catch(InterruptedException ie) {
			System.out.println("잡았음 예외처리함.");
		}
		
		Lec08예외2 t = new Lec08예외2();
		try {
			t.myPrint();
		} catch(ArithmeticException e) {
			System.out.println("잡았음......");
		} catch(Exception e) {
			System.out.println("잡았음......");
		}
		System.out.println("myPrint() call done............");
		
		int res = 0;		

		try {
			// 코드라인
			System.out.println("1. try(산수코드)");
			int num = 100;
			res = num / 0;		// -> 문제 코드
			
		} catch(ArithmeticException e) {
			// 예외가 발생했을 경우
			System.out.println("2. catch");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
		} catch(Exception e) {
			// 예외가 발생했을 경우
			System.out.println("3. catch");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			// 개발자 예외처리부 코드라인
		} finally {
			System.out.println("try-catch-무조건 실행");
		}
		System.out.println();
		try {
			System.out.println("4. try(배열코드)");
			int[] arr = new int[3];
			
			for (int i=0;i<arr.length;i++) {
				arr[i] = i+1;
				System.out.print(arr[i]);
			}
			System.out.println();
			System.out.println(arr[3]);	// -> 문제 코드
		} catch(ArrayIndexOutOfBoundsException e) {
			// 예외가 발생했을 경우
			System.out.println("5. catch");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			// 개발자 예외처리부 코드라인
		} catch(Exception e) {
			// 예외가 발생했을 경우
			System.out.println("6. catch");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			// 개발자 예외처리부 코드라인
			
		} finally {
			System.out.println("try-catch-무조건 실행");
		}
		System.out.println();
		System.out.println(res);
		System.out.println("----done----");

	}

}
