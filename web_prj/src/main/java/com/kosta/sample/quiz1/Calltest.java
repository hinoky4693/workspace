package com.kosta.sample.quiz1;

public class Calltest {

	public static void main(String[] args) {
		Child sk = new Child(100,90,80);
		new Child(88,77,66);
		new Child(1,3,7);
//		new Sukang(new int[] {100,90,80});
//		new Sukang(new int[] {88,77,66});
		
//		Sukang sk = new Sukang();

		int[] total = sk.subjectSum();
		for(int i=0;i<total.length;i++) {
			System.out.print(total[i]+"\t");
		}

		
		
	}
}
