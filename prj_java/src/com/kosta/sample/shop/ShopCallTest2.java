//package com.kosta.sample.shop;
//
////-------------------------------------------
//class User { 
//	public String getUserName(String uid) {
//		//DB 조회 select ename from emp where userid = 'uid';
//		return "홍길동";
//	}
//	
//	public int orderByUser(Order o, int price) {
//		//런타임 시 타입체크 : isInstance()   o.isInstance(MemberOrder)  ????
//		//컴파일 시 타입체크 : instanceof     o instanceof MemberOrder
//		int res = o.order(1000);
//		return res;	 
//	}
//}	
//
//// -------------------------------------------
//class Member extends User { 
//	//메서드
//}
//
////--------------------------------------------
//class Guest  extends User { 
//	//메서드
//}
////-------------------------------------------
//
//
//
//class Order { 
//	private final int ORDER_POINT = 100;   //값 변경 불가, 직접 접근 불가
//	public int getOrderPoint() {
//		return this.ORDER_POINT;
//	}
//	public int order(int price){
//		// 1. DB
//		// 2. 상품조회
//		// 3. 기관계 연동
//		int res = 0;
//		return res;
//	}
//}
////--------------------------------------------
//class MemberOrder extends Order {
//	@Override
//	public int order(int price){
//		super.order(price);
//		// 1. DB
//		// 2. 상품조회
//		// 3. 기관계 연동
//		int res = price + getOrderPoint() + (int)(price*0.1);
//		return res;
//	}
//}
////--------------------------------------------
//class GuestOrder  extends Order {
//	@Override
//	public int order(int price){
//		super.order(price);
//		// 1. DB
//		// 2. 상품조회
//		// 3. 기관계 연동
//		int res = price + getOrderPoint();
//		return res;
//	}
//	
//}
////--------------------------------------------
//
//public class ShopCallTest2 {
//	public static void main(String[] args) {
//		User u = new User();
//		int mRes = u.orderByUser(new MemberOrder(), 1000);
//		System.out.println("회원구매:" + mRes);
//		
//		int gRes = u.orderByUser(new GuestOrder() , 1000);
//		System.out.println("비회원구매:" + gRes);
//		
//	}
//
//}
