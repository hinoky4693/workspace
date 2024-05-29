package com.kosta.lec;

public class Lec06생성자 {
	
	//생성자 함수도 오버로딩 가능하다.
//	public Lec06생성자() { }
//	public Lec06생성자(int userPoint) { }
	
	// 기본 생성자 : ()안에 파라미터가 없다.
	// 클래스 내에 생성자가 하나도 없으면 컴파일러가 기본 생성자를 만들어준다.
//	**********************************************************		
	// this() : 생성자 함수
	// this() : main() 함수에서 사용 불가능. -> static 달려 있어서.
	// 생성자함수() 안에서는 this() 사용 가능. 단, 첫줄에.
//	**********************************************************
	
	public Lec06생성자() {

		// new Lec06생성자(5) == this(5);
		this(5); // 첫 줄에 해야 에러 안남.
		add(1,4);
		mul(5,7);
		System.out.println("매개변수가 없는 생성자");
		new Lec06생성자(5); // 생성자 메서드는 new 해줘야됨. == this(5) 쓸거면 반드시 첫줄에.
	}
	
	public 	      void mul(int n1, int n2) {
		System.out.println("인스턴스 메서드 mul : " + n1 * n2);
	}

	public static void add(int n1, int n2) {
		System.out.println("클래스 메서드 static add : " + n1 + n2);
	}
	
	
	
	int userPoint = 0;	// iv
	// [인스턴스(화) 변수, 전역변수] == [지역변수] 구분을 위해 this 사용.
	// this : 클래스가 인스턴스화 된 주소값을 가지고 있다.
	public Lec06생성자(int userPoint) {
		// 전역변수 = 지역변수
		this.userPoint = userPoint;
		System.out.println(this);
		System.out.println("매개변수가 있는 생성자 : Lec06생성자(int userPoint)");
	}
	
	
	public static void main(String[] args) {
		// 클래스명 참조변수 = new 생성자();
		Lec06생성자 obj = new Lec06생성자(12345);
		System.out.println(obj);
		System.out.println("=======================");
		Lec06생성자 cal = new Lec06생성자();
		System.out.println(cal);
//		**********************************************************
		// static 메서드 안에서는 this 사용 불가.
		// this는 new 생성자함수()를 호출 후에 만들어진 주소를 지칭하는 키워드.
		// 즉, 언제 new 될지 알고 실행시 메모리에 바로 올라가는
		// static 메서드안에서는 사용 불가.
		// 아래 셋 에러가 나는 이유가 같다.
//		**********************************************************
		
//		this();
//		System.out.println(this);
//		System.out.println(iv);
		
		
		
	}

}
