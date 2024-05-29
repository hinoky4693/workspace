package com.kosta.sample.pkg;

// 패키지 = 폴더
// 유사한 기능을 하는 클래스들의 묶음.
// 예약어로 패키지명 사용 불가.
// import 패키지.패키지.*(클래스명);
// 동일한 패키지 내 클래스는 import 안한다.
import com.kosta.sample.pkg.DelDel;


class Parent{
	public Parent() {
		System.out.println("Parent() 생성자 호출");
	}
	
	
	public Parent(String name){
		System.out.println("Parent(String name) 생성자 호출");
	}
	
}

public class DelCall extends Parent {
	public DelCall() {
		super("ABC");
		System.out.println("DelCall() 기본 생성자 호출");
	}
	public DelCall(int a) {
		// *****************************************************************
		// 자식의 생성자를 호출할 때 상속은 있는데 부모의 생성자 호출이 없을 경우
		// 컴파일러가 기본 부모 생성자(super();) 키워드를 붙여준다.
		// *****************************************************************
		// super();	// extends Parent --> 부모의 기본 생성자.
		System.out.println("DelCall(int a) 생성자 호출");
	}
	
	
	public static void main(String[] args) {
		DelCall me = new DelCall();		//Parent(String name) 생성자 호출
										//DelCall() 생성자 호출
		
		DelCall me2 = new DelCall(5);	//Parent() 생성자 호출
										//DelCall(int a) 생성자 호출		
		
		// 남의 클래스를 가져다 사용할 경우
		// 1. 패키지가 다른 경우, import 패키지.패키지.DelDel;
		// 2. 메모리에 올려야 실행 가능 == DelDel 클래스의 생성자 부터 확인
		// 3. DelDel 클래스의 생성자로 d = new 생성자(); --> d.메서드() 사용
		
		DelDel d = new DelDel();
		d.myPrint();					// ddd
	}

}
