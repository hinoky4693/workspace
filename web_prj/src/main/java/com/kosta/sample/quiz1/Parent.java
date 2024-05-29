package com.kosta.sample.quiz1;

public class Parent {
	
	static int korSum = 0;
	static int engSum = 0;
	static int mathSum = 0;
	
	Parent(){
		System.out.println("국어\t영어\t수학");
		System.out.println("----\t----\t----");
		
	}
	Parent(int kor, int eng, int math){
		this();
//		new Score();
		System.out.println(kor+"\t"+eng+"\t"+math);
		
		korSum+=kor;
		engSum+=eng;
		mathSum+=math;
	}
	
	Parent(int[] score){
		this();
		System.out.println(score[0]+"\t"+score[1]+"\t"+score[2]);
	}
	
	public int[] subjectSum() {
		new Parent();
		int[] hab = new int[3];
		hab[0] = korSum;
		hab[1] = engSum;
		hab[2] = mathSum;
			
		return hab;
	}

	
	
}
