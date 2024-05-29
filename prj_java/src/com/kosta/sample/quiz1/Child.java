package com.kosta.sample.quiz1;



public class Child extends Parent{
	private int[] scores = new int[3];
//	int[] scores = new int[] {0,0,0};
//	int[] scores = {0,0,0};
	
	public Child() {
		super();
	}
	
	public Child(int kor, int eng, int math) {
		super(kor,eng,math);
		scores[0] = kor;
		scores[1] = eng;
		scores[2] = math;
		new Parent(scores);
	}
	
	public Child(int[] ss) {
		super(ss);
	}

}
