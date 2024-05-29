package com.kosta.lec;

// *****************************************
//	abstract (추상, 미완성)
//	면접 대비:
//	Pclass Cclass1 Cclass2.....
//	  구조적 : 다른 클래스들이 Pclass [자손으로 관리]가 되어질 필요가 있는 경우
//	  기능적 : 다른 클래스들이 Pclass에서 제공되는 (normalMethod() 공통 기능의 메서드)를 사용하되
//			 							(absMethod()일부 메서드)는 [각자가 구현]해야되는 경우
//
//	- 클래스	: 인스턴스 생성 불가(new 못함)
//			: abstract 메서드가 있을 수도 있다.
//			: 부모의 일반 메서드를 사용하고 싶으면 : 자식new.부모일반메서드()
//			: 부모의 추상 메서드를 사용하고 싶으면 : 반드시 오버라이딩 자식new.자식오버라이딩메서드()
//	- 메서드	: 바디가 없는 메서드
// *****************************************



public abstract class Lec07추상 {
	
	public abstract void absMethod(); // -> 추상 메서드
	public abstract void absMethod2();
	public abstract void absMethod3();
	public abstract void absMethod4();
	
	public void normalMethod() {
		System.out.println("Parent normalMethod() call");
	}
	
	public static void staticMethod() {
		System.out.println("Parent staticMethod() call");
	}
	public static void main(String[] args) {
//		Lec07추상 o = new Lec07추상(); // ->인스턴스 생성 불가(new 못함)
//		o.normalMethod();
//		normalMethod();
		
		staticMethod();
		System.out.println("main 실행");

	}

}
