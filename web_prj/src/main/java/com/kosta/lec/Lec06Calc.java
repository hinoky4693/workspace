package com.kosta.lec;

public class Lec06Calc {
	
	// void 메서드는 return이 없다.
	// void res = myPrint("hello"); <-- 에러
	// 			  myprint("hello"); <-- 정상
	public static void myPrint(String prm) {
		System.out.println(prm);
	}
	
	public static String add(String x, String y) {
		String addRes = x+y;
		return addRes;
	}
	
	public int mul(int a, int b) {
		int mulRes = a * b;
		return mulRes;
	}
	
	public static void main(String[] args) {
		Lec06Calc obj = new Lec06Calc();

		myPrint("Hello, World!");
		
		
		String addAns = add("ABC","DE");
		int mulAns = obj.mul(2, 8);
		
		System.out.println(addAns);
		System.out.println(mulAns);

	}

}
