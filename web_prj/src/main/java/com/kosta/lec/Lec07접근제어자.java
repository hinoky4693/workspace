package com.kosta.lec;

// 다른 패키지의 클래스를 가져다 사용하려면 반드시 import 해줘야 함.
// 패키지1.패키지2.패키지3.*;		// *.java  *이라는 것은 클래스 위치에 사용해야함.
import com.kosta.other.Lec07접근제어자Other;


// 동일 패키지의 클래스를 가져다 사용할 경우 import 생략
// import com.kosta.lec.Lec07접근제어자Same;

public class Lec07접근제어자 extends Lec07접근제어자Other{

	
	
	// public > protected > default > private;
	
//	int add() {		// default
//		return 0;
//	}
	
	
	public static void main(String[] args) {
		// 같은 패키지 내에서는 private 빼고는 다른 클래스에 있는 모든 변수/ 메서드 사용 가능.	
		Lec07접근제어자Same same = new Lec07접근제어자Same();
		System.out.println(same.samePublicPoint);
		System.out.println(same.sameProtectedPoint);
		System.out.println(same.sameDefaultPoint);
//		System.out.println(same.samePrivatePoint);
		
//		**********************************************************
		// Getter() 메서드
		// private 변수는 외부에서 접근 불가. --> public get____() 함수를 사용해 접근 가능.
//		**********************************************************
		int res = same.getSamePriavatePoint();
		System.out.println(res);
		
//		**********************************************************
		// 다른 패키지 내에서는 private, default 사용 불가.
		// 굳이 사용하겠다 --> protected는 상속된 자식은 사용 가능.
//		**********************************************************
		
		Lec07접근제어자Other other = new Lec07접근제어자Other();
		System.out.println(other.otherPublicPoint);
//		System.out.println(other.otherProtectedPoint); // 패키지가 달라서 xxx
		// 패키지가 다른 클래스의 protected 변수/메서드를 사용하고 싶으면 반드시 상속!!!
		

//		System.out.println(other.otherProtectedPoint); // 상속 해도 에러 xxxx
		
		Lec07접근제어자 my = new Lec07접근제어자(); // 내거로 다시 new 해야됨.
		
		System.out.println(my.otherProtectedPoint);
		
		System.out.println(otherProtectedPoint_Static);
//		System.out.println(my.otherDefaultPoint); // 상속을 받았어도 패키지가 달라서 에러.
//		System.out.println(my.otherPrivatePoint); // 변수가 들어간 클래스 안에서만 사용.
		
		
		

	}

}
