package com.kosta.lec;

//
/*  */
/**  */
// Access Modifier(접근자)
// public (default) protect private
public class Lec01변수 {
	// 객체	(object)   =~ 인스턴스(instance) : 메모리에 상주
	// 변수	(variable)	: 값
	// 메서드	(method)	: 기능
	// 함수 	(function)	: 생성자함수
	
	
	// 전역변수 : 초기화 안하면 컴파일 시 기본값으로 자동 초기화됨.
	
	
	public static void main(String[] args) {
		// 타입 변수명;			int age; 		변수선언
		// 타입 변수명 = 값; 	int age = 20;	변수선언, 초기화(값최초할당)
		// 					int age = 30;	초기화 후 다른값(할당)
		
		int age = 20;
		
		System.out.println("hello" + age);
		
		long lv = 1000;		// 8byte <-- 4byte 형변환됨
		long lv2 = 1000l;	// 8byte <-- 8byte 이터럴?
		System.out.println(lv+","+lv2);
		
		double dv 	= 3.14;	// 8byte <-- 8byte 
		double dv2 	= 3.14d;// 8byte <-- 8byte
		System.out.println(dv+","+dv2);	// 실수형 기본타입이 double이라 위 두 값 차이 없음.
		
		boolean bv 	= true;
		boolean bv2	= false;
		// 1 --> 4
		System.out.println(bv);
		
		// where ename = 'smith'
		char cv = 'A';			// 문자 한 글자 ''
		String sv = "smith";	// 문자 두 글자 이상은 ""
		System.out.println("abd\n def\t"); // \n : 줄바꿈, \t : 탭
		
//		boolean db;				// 변수 선언만 하고 초기화 하지 않은 상태.
//		System.out.println(db);	// 해당 변수를 사용하려고 할 때, 에러.
		
		boolean db = true;
		System.out.println(db);	// 반드시 초기화 후에 사용해라.
		
//		char cv3 = '';	// 에러
		char cv3 = ' '; // blank
		String str1 = null;				// Ref. 타입의 기본값은 null 주소 할당 X
		String str2 = new String("");	// str 2, str3 같은문법 
		String str3 = "";				//
		
		//**** any type + "문자열" == 문자열
		boolean bv3 = false;			// 결과 :
		System.out.println(bv3);		// bool false
		System.out.println(bv3 + "");	// 문자열 false
		System.out.println(7+7+"");		// 문자열 14
		
		byte b = 127;
//		byte b2 = 128;				//에러 -2^7(-128) ~ 2^7(127)범위를 넘어감.
		System.out.println(b);		//127
		System.out.println(b+1);	//128 1을 더해줘서 int형이 됨.
		
		int res = b+1;					
		System.out.println(res);
		// 큰타입을 작은 타입으로 강제 캐스팅 하지 마세요!!
		byte res2 = (byte)(b+1);		// 1 <-- 4
		System.out.println(res2);		// -128
		
		// 큰 타입을 작은 타입으로 변환하는 경우. 강제 캐스팅을 해줘야함.
		// float(4) <--- double(8)
//		float fv = 3.14;
		
		float fv = (float)3.14;
		System.out.println(fv);
		
		// 작은 타입을 큰 타입으로 변환하는 경우 암묵적 캐스팅
		// double(8) <--- float(4)
//		double d = 1.4e3f;
		double d = (double)1.4e3f;
		
		System.out.println('A'+'B');	// 131
		System.out.println('1'+2);		// 51
		System.out.println('1'+'2');	// 99
		// 문자형은 int 형으로 캐스팅하고 더함.
		// int보다 작은 타입(byte, char, short)의 덧셈은 int형으로 캐스팅하고 더함.
//		System.out.println(true+null);	// null 연산은 오류
		
		byte bb 	= 10;
		char chch	= 'A';
		int ii	 	= 100;
		long ll 	= 1000L;
		
		bb=			(byte)ii;	// 생략 불가 1<-4
		chch = 		(char)bb;	// 생략 불가 type mismatch
		short ss = 	(short)chch;// 생략 불가 type mismatch
		float ff = 	(float)ll;	// 생략 가능 실수형 4 <-- 정수형 8
		ii = 		(int)chch;	// 생략 가능 4 <-- 1
		
		System.out.println();
		
		
	}

}
