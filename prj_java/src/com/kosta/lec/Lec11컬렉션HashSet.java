package com.kosta.lec;
import java.util.HashSet;
import java.util.ArrayList;
// ***************************************
// Set : 중복 X, 순서보장 X
// ***************************************
public class Lec11컬렉션HashSet {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add("abc");
		hs.add(10);
		hs.add('A');
		hs.add('A');
		hs.add('A');
		System.out.println(hs);
		
		// 수정불가, 기존의 값을 지우고 신규값으로 입력
		// abc --> zzz
		hs.remove("abc");
		hs.add("zzz");
		System.out.println("수정 후 : "+hs);
		
		hs.remove('A');
		System.out.println("HashSet :\t" + hs);
		
		
		
//		hs.clear();
//		System.out.println(hs);
		
		
		ArrayList al = new ArrayList(hs);
		System.out.println("ArrayList :\t" + al);
		
		
		
		
	}

}
