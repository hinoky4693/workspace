package com.kosta.lec;

public class Lec07추상자식 extends Lec07추상 {
	// *******************************************************************
	// The type Lec07추상자식
	// (must implement the inherited abstract method Lec07추상.absMethod())
	// 
	// Lec07추상.absMethod();
	// 부모 클래스에 있는 추상 메서드를 반드시 오버라이딩 해라!!
	// *******************************************************************
	//
	public void absMethod() {
		System.out.println("Child absMethod() call : 반드시!!! 오버라이딩 바디 완성");
	}
	public void absMethod2() {}
	public void absMethod3() {}
	public void absMethod4() {}
	
	public void normalMethod() {
		System.out.println("ovovovovovovovov");
		System.out.println("Child normalMethod() call : 옵션!! 오버라이딩 바디 완성" );
	}
	
	
	public static void main(String[] args) {
		// 인스턴스 생성 불가(new 못함)
//		Lec07추상 p = new Lec07추상(); 
//		p.normalMethod();
//		p.absMethod();
		// 자식 인스턴스 생성() 상속되었기 때문에 부모 메서드 호출 가능
		Lec07추상자식 c = new Lec07추상자식();
		c.normalMethod();
		c.absMethod();	// -> 오버라이딩 된 자식 메서드 호출.
		
		
		
//		Lec07추상.staticMethod();
		staticMethod();
		
		System.out.println("Child main 실행");

	}

}
