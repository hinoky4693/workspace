package com.kosta.sample.craw;

public class LombokCallTest {

	public static void main(String[] args) {
		NewsVO nvo = new NewsVO();
		nvo.setTitle("ㅇㅅㅇ");
		String title = nvo.getTitle();

		System.out.println(title);

	}

}
