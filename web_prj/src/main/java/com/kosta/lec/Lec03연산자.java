package com.kosta.lec;

public class Lec03연산자 {
	
	// 여기는 변수, 메서드만 올 수 있음.
	
	
	
	// main 메서드 : 진입점
	public static void main(String[] args) {
		
		// 실행 구문(ex : system.out.~~)들은 메서드 안에서 하는 것
		boolean status = true;
//		System.out.println(!status); // 부정
		
		int num = 3;
//		System.out.println(++num);	// 증감연산
		
		num = 5;
//		System.out.println(num/2);	// 몫
//		System.out.println(num%2);	// 나머지
		
		// 대입연산자
		int a = 10;
		int res = a + 5;
//		System.out.println(res);
		
		int b = 10;
//		b = b + 5;
		b += 5;
//		System.out.println(b);
		
		// 비교연산 같다 ==, 다르다 !=
		int num1 = 10;
		int num2 = 20;
		if (num1 == num2) {
//			System.out.println("다르다");
		}
		else {
//			System.out.println("같다");
		}
		
		
		// 삼항연산
		// ____타입 변수 = (조건식) ? ____ : ____ ;
		String ans = (num1 != num2) ? "다르다" : "같다";
//		System.out.println(ans);
		
		char grade = 'C';
//		grade	A : 90
//				B : 80
//				C : 70
		int ans2 = (grade == 'A') ? 90 : (grade == 'B') ? 80 : (grade == 'C') ? 70 : (grade == 'D') ? 60 : 0;
//		System.out.println(ans2);
		
		// 상수는 대문자 변수명 사용
		// 초기화 값을 넣으면 이후 재할당(다른 값 넣기) 불가.
		// final 예약어는 이후 값 변경 불가를 의미.
		final int MAX = 100;
//		MAX = 200; // 재할당 시도 ---> 에러
		
		
		// 증감(전위)
		int i = 5;
		int j = 0;
		j = ++i;	// i 값을 ++ 한 후에 j에 넣는다.
//		System.out.println(i + "," + j);
		
		
		// 증감(후위)
		int k = 5;
		int m = 0;
		m = k++;	// k 값을 m에 넣은 후에 k값에 ++해준다.
//		System.out.println(m + "," + k);

		
//		byte c = (byte)a + b;	// 에러 -> a만 byte형, b는 int
//		byte c = (byte)(a + b);	// OK -> a+b를 괄호 해줘야 함.
		
		byte b1 = 10;
		byte b2 = 20;
//		byte res2 = b1 + b2; // 에러
		byte res2 = (byte)(b1 + b2);
		int res3 = (byte)b1 + b2;
		
		// 비트연산 1, 0 비교연산
		// &(and) |(or) ^(xor)
		
		// 논리연산 true, false 비교
		// &&(and) ||(or)
		
//      -------------------------------------------------------------		
// 		문제. 삼항 연산 양수, 음수, 0 출력		
		int quiz1_num = 10;
		String quiz1_ans = (quiz1_num>0) ? "양수" : (quiz1_num < 0) ? "음수" : "0"; 
//		System.out.println(quiz1_ans);
//		System.out.println((quiz1_num>0) ? "양수" : (quiz1_num < 0) ? "음수" : "0");


//      -------------------------------------------------------------
// 		문제. 백의 자리 이하를 버리는 코드 
		int quiz2_num = 456;
		int quiz2_ans = (quiz2_num / 100) * 100;
		System.out.println(quiz2_ans);
		
		
		
		
		
		
	}

}
