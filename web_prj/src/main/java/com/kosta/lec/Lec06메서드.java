package com.kosta.lec;

public class Lec06메서드 {

	public static void main(String[] args) {
		System.out.println("main");
		
		 // 메서드 호출 == 메서드를 가져다 쓰겠다.
		main(7); // static method -- static method
		
		
		// add(1,8); --------------- 에러 static method -- method
		// add 메서드에 static 붙이기.
		// 클래스 참조변수(new).add()
		Lec06메서드 rv = new Lec06메서드();
		int callRes = rv.add(1,8); 
//		int callRes = 9;
		System.out.println(callRes);
		
		System.out.println(rv.add(1,8));	// 비추!! 변수에 담아라.
		
	}
	
	
	public int add(int a, int b) {
		int res = a + b;
		return res;
	}
	
	// 메서드 정의(준비)
	public static void main(int args)		// ---- 헤더
	{										// ---- 바디 between { and }
		System.out.println("오버로딩 main");
	
	}

}
