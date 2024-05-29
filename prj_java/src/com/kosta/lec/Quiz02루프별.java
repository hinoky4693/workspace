package com.kosta.lec;

public class Quiz02루프별 {

	public static void main(String[] args) {
		
		// ★찍기이이~~
//		------------------------------------------------------
//		★★★★★
		
//		for(int i=0; i<5;i++) {
//			System.out.print("★");
//		}
//		------------------------------------------------------		
//		★
//		★
//		★
//		★
//		★
		
//		for(int i=0; i<5;i++) {
//			System.out.println("★");
//		}
//		------------------------------------------------------
//		★★★★★
//		★★★★★
//		★★★★★
//		★★★★★
//		★★★★★

//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				System.out.print("★");
//			}
//			System.out.println();
//		}
//		------------------------------------------------------		
//		★
//		★★
//		★★★
//		★★★★
//		★★★★★
		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<(i+1);j++) {
//				System.out.print("★");
//			}
//			System.out.println();
//		}
//		------------------------------------------------------
		
//		★★★★★
//		★★★★
//		★★★
//		★★
//		★
		
//		for(int i=0;i<5;i++) {
//			for(int j=5;j>i;j--) {
//				System.out.print("★");
//			}
//			System.out.println();
//		}
//		------------------------------------------------------
		
//		    ★
//		   ★★
//		  ★★★
//		 ★★★★
//		★★★★★
		
//		for(int i=0;i<5;i++) {
//			// 공백찍기
//			for(int j=4;j>i;j--) {
//				System.out.print(" ");
//			}
//			// 별찍기
//			for(int k=0;k<i+1;k++) {
//				System.out.print("★");
//			}
//			System.out.println();
//		}
		
		// 다른 풀이
//		for(int i = 4; i > -1; i--) {
//			for(int j = 0; j < 5; j++) {
//				if(j < i) {
//					System.out.print(" ");
//				} else {
//					System.out.print("★");
//				}
//			}
//			System.out.println();
//		}
//		------------------------------------------------------
		
//		    ★
//		   ★★★
//		  ★★★★★
//		 ★★★★★★★
//		★★★★★★★★★
		
//		for(int i=0;i<5;i++) {
//			for(int j=4;j>i;j--) {
//				System.out.print(" ");
//			}
//			for(int k=0;k<=i*2;k++) {
//				System.out.print("★");
//			}
//			System.out.println();
//		}
		// 다른 풀이
//		int star = 1;
//		for(int i = 0; i < 5; i++) {
//			for(int j = 4; j > i; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < star; k+=1) {
//				System.out.print("*");
//			}
//			star = star + 2;
//			System.out.println();
//		}
		
//		int MAX = 5;
//		int half = MAX-1;
//		for(int i = MAX; i > 0; --i) {
//			for(int j = 0; j < MAX * 2; ++j) {
//				int start = half - i;
//				int end = half + i;
//				//
//				if(start < j && j < end) System.out.print("*");
//				else System.out.print(" ");
//			}
//			System.out.print("\n");
//		}
//		System.out.println();


//		int num = 15; // 센터 별찍기
//		for (int i = 0; i < num; i++)
//		{
//			for (int j = 0; j < num - i - 1; j++) //빈칸출력
//			{
//				System.out.print(' ');
//			}
//			
//			for (int k = 0; k < 2 * i + 1; k++) // 각 행은 2N+1개 만큼 출력
//			{
//				System.out.print('*');
//			}
//			System.out.println("");
//		}
//		
//		System.out.println();
//		System.out.println("리버스 센터 별찍기");
//		
//		for (int i = 0 ; i < num; i++) //리버스 센터 별찍기
//		{
//			for (int j = 0; j  < i; j++) //빈칸출력
//			{
//				System.out.print(' ');
//			}
//			
//			for (int k = 0; k  < 2 * (num - i) - 1; k++) //별출력
//			{
//				System.out.print('*');
//			}
//			System.out.println("");
//		}
		
//		int count = 1;
//		int max = 5;
//		for(int c=0;c<max; c++) {
//			for(int a =max; a>count/2; a--) System.out.print(" ");
//			for(int a =0; a<count; a++) System.out.print("*");
//			count+=2;
//			System.out.print("\n");
//		}
//		for(int c=0;c<max+1; c++) {
//			for(int a =count; a>0; a--) System.out.print("*");
//			for(int a =max; a>count/2; a--) System.out.print(" ");
//			count-=2;
//			System.out.print("\n");
//		}
		
//		------------------------------------------------------
		// 1~20까지 정수 중 2 또는 3의 배수가 아닌 수들의 총 합
		
//		int ans = 0;
//		for(int i=1;i<=20;i++) {
//			if (i%2 != 0) {
//				if(i%3 != 0) {
////					System.out.print(i+", ");
//					ans+=i;
//				}
//			}
//		}
		
//		System.out.println("합 : " + ans);

		// 다른 풀이
//		int tsum=0;
//		for (int i=1; i<=20; i++) {
//			if( (i%2!=0) && (i%3!=0)) {
//				tsum += i;
//			}
//		}
//			
//		
//		System.out.println(tsum);
//		------------------------------------------------------
//		// 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이 100이상인지
		
//		int ans = 0;
//		int ans2 = 0;
//		for(int i=0;ans<100;i++) {
//			if (i%2!=0) {
//				ans += i;
//				System.out.print("+"+i);
//			}
//			else {
//				ans -= i;
//				System.out.print(-i);
//			}
//			
//			ans2 = i;
//		}
//		System.out.println();
//		System.out.println(ans2);

		// 다른 풀이
//		int tsum = 0;
//		int num = 1;
//		while(tsum < 100) {
//			if (num%2==1) {
//				tsum += num;
//			} else {
//				tsum -= num;
//			}
//			
//			num++;
//		}
//		System.out.println(num - 1);
		
//		------------------------------------------------------
		// 다음의 for문을 while문으로 변경
		
//		for(int i=0; i<=5; i++) {
//			for(int j=0; j<=i; j++)
//				System.out.print("*");
//			System.out.println();
//		}
//		
//		
//		int i = 0;
//		while(i<=5) {
//			
//			int j = 0;
//			while(j<=i) {
//				System.out.print("★");
//				j++;
//			}
//			System.out.println();
//			i++; 
//		}
//		------------------------------------------------------
		//두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력

//		for(int i=1;i<=6;i++) {
//			for(int j=1;j<=6;j++) {
//				if (i+j == 6) {
//					System.out.println("("+ i +", "+ j + ")");
//				}
//			}
//		}	
//		------------------------------------------------------
		// 회문 (뒤로 읽어도 똑같은 수)
//		int number = 13131;
//		int tmp = number;
//		int result = 0; 
//		while (tmp != 0) {
//		    int digit = tmp % 10; 
//		    result = result * 10 + digit; 
//		    tmp /= 10; 
//		}
//		if (number==result) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
//	
		int x=10,y=20,z;
		z = add(x,y);
		System.out.println(z);
		
	}
	static int add(int a, int b) {
		return (a+b);
	}
}
