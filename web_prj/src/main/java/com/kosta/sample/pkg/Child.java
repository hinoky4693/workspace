package com.kosta.sample.pkg;

// *****************************************************************
// 오버 라이딩(over riding)
// (상속 관계)에서 부모 메서드를 재사용(선언부는 같고 바디부는 다를 수도 있다)하는 것.
// 접근 제어자	: protected 부모	<= 자식 public 또는 protected
// 예외 		: 부모 예외 		>= 자식 예외
// *****************************************************************
class MyParent {
	protected int myPrint(String name, int age) 
	{
		System.out.println("부모"+name);
		return age;
	}
}
public class Child extends MyParent {
	// 굳이 복붙해서 오버리아딩 타이핑 한 이유 --> 바디부를 바꾸겠다.
	// *****************************************************************
	// 아래 myPrint 메서드를 주석처리하면 부모 myPrint가 호출된다.
	// *****************************************************************
//	private int myPrint(String name, int age) {		// 에러 : 접근 제어자는 범위가 작아질 수 없다.
	protected int myPrint(String name, int age) {
		System.out.println("자식"+name);
		System.out.println(1111);
		return age;
	}

	
	public static void main(String[] args) {
		Child c = new Child();
		c.myPrint("홍길동", 20);
		

	}

}
