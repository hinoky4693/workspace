package com.kosta.lec;

// 컴파일 에러
// 런타임 에러
//		- Exception : 예외
//		- Error		: 에러
//
// 예외 처리 하는 이유?
//	의도치 않은 문제가 발생 했을 때, 프로그램을 정상적으로 끝까지 돌려보려는 목적
//
// try{
//		//[정상]TODO
//	} catch(Exception e){
//		//[예외]처리부
//	} catch(Exception e){
//	} finally {
//		[정상][예외] 무조건 실행
//	}




public class Lec08예외 {

	public static void main(String[] args) {
		
		
		int res = 0;		
		try {
			// 코드라인
			System.out.println("1. try");
			int num = 100;
			res = num / 0;		// -> 문제 코드
			
			int[] arr = new int[3];
			
			for (int i=0;i<arr.length;i++) {
				arr[i] = i+1;
			}
			System.out.println(arr[6]);	// -> 문제 코드
			
			
		} catch(ArrayIndexOutOfBoundsException e){
			// 예외가 발생했을 경우
			System.out.println("2. catch");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getClass());
			// 개발자 예외처리부 코드라인
			
		} catch(ArithmeticException e) {
			// 예외가 발생했을 경우
			System.out.println("3. catch");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getClass());
			// 개발자 예외처리부 코드라인
			
		} catch(Exception e) {
			// 예외가 발생했을 경우
			System.out.println("4. catch");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getClass());
			// 개발자 예외처리부 코드라인
			
		}
		System.out.println();
		System.out.println(res);
		System.out.println("----done----");

	}

}
