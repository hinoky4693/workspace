package com.kosta.lec;

public abstract class Lec07추상자식2 extends Lec07추상{

	// 부모가 추상클래스, 자식도 추상클래스
	// 반드시 추상메서드를 오버라이딩 할 필요 없다
	
	public static void main(String[] args) {
		Lec07추상자식 c = new Lec07추상자식();
		c.normalMethod(); // 자식은 일반클래스라서 부모 메서드 사용 가능
		
//		Lec07추상자식2 c2 = new Lec07추상자식2();
//		normalMethod(); // 자식도 추상클래스라서 부모 메서드 사용 xx
		
	}

}
