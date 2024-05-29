package com.kosta.lec;

// *****************************************
// abstract		: 	 추상(일반 메서드(공통), 추상 메서드[반드시 각자 구현]) 
// interface 	: 완전추상(			   추상 메서드)
//  - 변수 	: static final 상수만을 갖는다.
//  - 메서드 	: abstract 추상 메서드만을 갖는다.
//  - [인터페이스]다중상속 가능	: 자식inter extends 부모인터1, 부모인터2, ...
//  - [클래스]단일상속만 가능	: 자식class extends 부모class
//
// 인터페이스는 [공통의 메서드]를 모아두고 부모 역할을 하려는 것이 목적.
// 인터페이스는 main()을 만들 수 없다 == 실행의 목적이 아님 == 부모가 되려는 목적
// *****************************************

public interface Lec07인터페이스 extends 인터페이스부모1, 인터페이스부모2 {
//	public void add() {} --> 바디가 있는 메서드는 절대 사용 불가.
	public double  PI = 3.14159; // --> public static final double PI = 3.14159
	
	public void add(); // --> public abstract void add();
}

interface 인터페이스부모1 {
	public void inter1ParentMethod1();
	public void inter1ParentMethod2();
}

interface 인터페이스부모2 {
	public void inter2ParentMethod1();	
}