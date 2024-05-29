package com.kosta.lec;

public class Lec07접근제어자Same {
	public int samePublicPoint = 100;

	protected int sameProtectedPoint = 222;
	
	protected static int sameProtectedPoint_Static = 222;
	
	int sameDefaultPoint = 333;
	
	private int samePrivatePoint = 444;
	
	public int getSamePriavatePoint() {	// readOnly
		return this.sameDefaultPoint;
	}
}
