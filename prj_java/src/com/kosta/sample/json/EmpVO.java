package com.kosta.sample.json;

public class EmpVO {
	//property --> 값을 다루는 변수
	private int empno;
	private String ename;
	private int sal;
	

	public EmpVO() {}
	
	// 마우스 우클릭 > source > Generate constructor using fields ...
	public EmpVO(int empno, String ename, int sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
	// 마우스 우클릭 > source > Generate getter and setter ...
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}

	// Object toString()을 오버라이딩
	@Override
	public String toString() {
		return "EmpVO [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
//	public int getEmpno() {
//		return this.empno;
//	}
//	
//	public void setEmpno(int empno) {
//		this.empno = empno;
//	}
//	
//	public String getEname() {
//		return this.ename;
//	}
//	
//	public void setEname(String ename) {
//		this.ename = ename;
//	}
//	
//	public int getSal() {
//		return this.sal;
//	}
//	
//	public void setSal(int sal) {
//		this.sal = sal;
//	}
	
	
}
