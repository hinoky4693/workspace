package com.kosta.lec;

public class Lec05배열 {

	public static void main(String[] args) {
		
		// 배열(array) : 타입이[같은] 변수 [여러개]를 사용
		// 변수 선언
//		int num1;
//		System.out.println(num1); // 선언 후 초기화 없이 사용하면 에러
//		int num1 = 10;
//		System.out.println(num1);
//		
//		
//		
		// 배열 선언
//		int[] num;
//		기본값(default)로 초기화
//		System.out.println(num);
//		int[] num = new int[3];
//		System.out.println(num[0]);	// 배열의 접근은 인덱스(index) 0부터 시작.
//		System.out.println(num[1]);
//		System.out.println(num[2]);
//		
//		System.out.println("num.length : " + num.length);
//		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i]);
//		}
//		
		// 이 둘은 괜찮은데 밑에 둘은 에러뜸. 이유? new안해줘서!
//		int [] numArr = {10,20,30};
//		int[] numArr = new int[3];
//		
		// 선언 후 라인바꿈 후 값을 초기화하면 에러 -> new 없음!!
//		int[] numArr1;
//		numArr2 = {10,20,30};
//		
		// 이렇게 고쳐 줘야 돌아감.
//		int[] numArr3 = {10,20,30};
//		int[] numArr4 = new int[] {10,20,30};
//		
		// 제일 많이 사용하는 둘.
//		int[] numArr5 = new int[3];
//		int[] numArr6 = {10,20,30};
//		
//		int[] dan = new int[9];
//		// int[] dan2 = {2,4,6,8};
//		// int[] dan3 = new int[] {2,4,6,8};
//		int[] gob = new int[9];
//		
//		for(int i=0;i<dan.length;i++) {
//			dan[i] = i+1;
//
//
//				System.out.println(dan[i]+"단");
//				for(int j=0;j<gob.length;j++) {
//					gob[j] = j+1;
//					System.out.println(dan[i]+"X"+gob[j]+" = "+dan[i]*gob[j]);
//				}
//		}
//		
		// 다차원 1차[] 2차[][] 3차[][][] ... n차[][][]...[]
		// 2행3렬
//		int[][] score = new int[2][3];
//		
//		
//		int[][] score = new int[][]{	{100,70,80},
//								 		{99,88,77}
//									};
//		
//		for(int i=0;i<2;i++) {
//			System.out.println("학생"+(i+1));
//			for(int j=0;j<3;j++) {
//				System.out.print("과목 "+(j+1)+": "+score[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println(score.length);		// score[x][y] x의 길이
//		System.out.println(score[0].length);	// score[x][y] y의 길이
//		
//		
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[0].length;j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
//		
//		// 2 3 4
//		int[][][] score2 = new int[2][3][4];
//		
//		
//		
//		for(int i=0;i<score2.length;i++) {
//			for(int j=0;j<score2[i].length;j++) {
//				for(int k=0;k<score2[i][j].length;k++) {
//					System.out.print(score2[i][j][k]);
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
//		
//		
//		-------------------------------------------------------------------
//		문제. 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을
//		고르고 그 이유를 설명하시오.
//
//		int[] arr[];						// 됨.	근데 최악. 나눠가지게 하지 마라.
//		int[] arr = {1,2,3,};				// 됨.	마지막에 ,가 있긴한데 돌아가긴함. 웬만하면 빼라.
//		int[] arr = new int[5];				// 됨.   FM
//		int[] arr = new int[5] {1,2,3,4,5}; // 안됨. 뒤에 new int[]{1,2,3,4,5}로 바꿔줘야됨.
//		int arr[5];							// 안됨. 5 저기들어가면 안됨.
//		int[] arr[] = new int[3][]; 		// 됨.	하나씩 나눠 가진 이차배열에 마지막은 가변배열.
//		
//		-------------------------------------------------------------------		
//		문제. 총합
//		int[] arr = {10, 20, 30, 40, 50};
//		int sum = 0;
//		/* (1) . 알맞은 코드를 넣어 완성하시오 */
//		System.out.println("sum="+sum);
//
//		
//		sum = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
//		System.out.println("sum="+sum);
//		
//		sum=0;
//		for(int i=0;i<arr.length;i++) {
//			sum += arr[i];
//		}
//		System.out.println("sum="+sum);
//		
//		-------------------------------------------------------------------
//		문제. 총합, 평균
//		int[][] arr = { { 5, 5, 5, 5, 5},
//						{10,10,10,10,10},
//						{20,20,20,20,20},
//						{30,30,30,30,30}
//						};
//		int total = 0;
//		float average = 0;
//		
//		
//		/* (1) . 알맞은 코드를 넣어 완성하시오 */
//		System.out.println("total="+total);
//		System.out.println("average="+average);
//		
//		int count = 0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				total += arr[i][j];
//				count++;
//			}
//		}
//		average = (float)total/count;
//		
//		System.out.println("total="+total);
//		System.out.println("average="+average);		
//
//		-------------------------------------------------------------------
//		문제. 2680원 잔돈 거슬러주기(큰 금액 동전을 우선적으로 거슬러주기)
//		
//		int[] coinUnit = {500, 100, 50, 10};
//		int money = 2680;
//		System.out.println("money="+money);
//		for(int i=0;i<coinUnit.length;i++) {
//		/*
//		(1) . 알맞은 코드를 넣어 완성하시오
//		*/
//		}
//
//
//		for(int i=0;i<coinUnit.length;i++) {
//			System.out.println(coinUnit[i]+"원 : "+money/coinUnit[i]);
//			money = money - (money/coinUnit[i])*coinUnit[i];
//		}
//		
//		int res = 0;
//		for(int i=0;i<coinUnit.length;i++) {
//			res = money/coinUnit[i];
//			System.out.println(coinUnit[i]+"원 : "+res+"개");
//			money = money - coinUnit[i]*res;
//		}
		
//		-------------------------------------------------------------------
//		문제. ASCII 코드 만들기
//		1. 32~126까지
//		2. int inputNum = 65; 하면 'A' 나오게 코딩
//		3. char inputChar = 'A'
//		4. String inputStr = "ABC"
		
		char[] ascii = new char[95];
		
		for(int i=0;i<95;i++) {
			ascii[i] = (char)(i+32);
			System.out.println(ascii[i]+" "+(i+32));
		}
		
		int inputNum	=65;
		char inputChar	='T';
		String inputStr = "ABC";

		
		System.out.println(ascii[inputNum-32]);
		
		int caster = (int)inputChar;		
		System.out.println(caster);
		
//		*******************************************************************
//		charAt(1); String 찢어서 1번째 있는거 뭐냐
//		ex) String inputStr = "2AP";
//			inputStr.charAt(0) -> 2;
//			inputStr.charAt(1) -> 2;
//			inputStr.charAt(2) -> 2;
//		*******************************************************************
		for(int i=0;i<inputStr.length();i++) {
			char c = inputStr.charAt(i);
			System.out.print(c);
			System.out.println(" "+(int)c);
		}
		
//		System.out.println((int)c);
		for (int i =32; i<=126; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (int i =32; i<=126; i++) {
		System.out.print((char)i + "\t");
		}
		System.out.println();
		
		
		
//		String str1 = "abc";
//		String str2 = new String("abc");
//		char data[] = {'a','b','c'};
//		String str3 = new String(data);
//		String str4 = new String(data);
//		String str5 = new String(new char[] {'a','b','c' });
//	
//	
		// charAt(i) : str  -> char
		// 문자열 String을 char 하나하나씩 찢어줌.
		inputStr = "ABC";
		for(int i=0;i<inputStr.length();i++) {
			char c = inputStr.charAt(i);
			System.out.println(c+","+ (int)c);	
		}
		
		// toCharArray(str) --> char[]
		// 문자열 String을 배열로 바꿔줌. 
		char[] carr = inputStr.toCharArray();
		for(int i=0; i<carr.length;i++) {
			System.out.println(carr[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
