package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	//실습문제 1
	/*사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
	단, 입력한 수는 1보다 크거나 같아야 합니다.
	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
	
	ex.
	1이상의 숫자를 입력하세요 : 4 
	1 2 3 4 
	
	1이상의 숫자를 입력하세요 : 0
	1 이상의 숫자를 입력해주세요.
	*/
	
	public void practice1() {
	Scanner sc = new Scanner(System.in);
	int num = 0;
	while(1>num) {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		if(1<=num) {
			for(int i=1; i<=num; i++) {
				System.out.print(i +" ");
			}
			}else if(1>num) {
				System.out.println("1이상의 숫자를 입력해주세요.");
		}
	}
	}
	//실습문제 2
	/*위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
	“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
	
	ex.
	1이상의 숫자를 입력하세요 : 4
	1 2 3 4 
	
	1이상의 숫자를 입력하세요 : 0
	
	1 이상의 숫자를 입력해주세요.
	1이상의 숫자를 입력하세요 : 8
	
	1 2 3 4 5 6 7 8 
	*/
	
	public void practice2() {
	Scanner sc = new Scanner(System.in);
	int num = 0;
	while(1>num) {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		if(1<=num) {
			for(int i=1; i<=num; i++) {
				System.out.print(i +" ");
			}
			}else if(1>num) {
				System.out.println("1이상의 숫자를 입력해주세요.");
		}
	}
	
	}
	//실습문제 3
	/*사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
	단, 입력한 수는 1보다 크거나 같아야 합니다.
	ex.
	1이상의 숫자를 입력하세요 : 4
	4 3 2 1 
	
	1이상의 숫자를 입력하세요 : 0
	1 이상의 숫자를 입력해주세요.
	*/

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		int num=0;
		while(1>num) {
			System.out.print("1이상의 숫자를 입력하세요. : ");
			num = sc.nextInt();
			
			if(1<=num) {
				for(int i=num; i>=1 ; i--) {
					System.out.print(i + " ");
				}
				}else if(1>num) {
					System.out.println("1이상의 숫자를 입력해주세요.");
										
				}
			}
		}
	
		
		

	//실습문제 4
	
	/*
	 위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
	“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
	
	1이상의 숫자를 입력하세요 : 4
	4 3 2 1 
	
	1이상의 숫자를 입력하세요 : 0
	1 이상의 숫자를 입력해주세요.
	
	1이상의 숫자를 입력하세요 : 8
	8 7 6 5 4 3 2 1
	 */
	public void practice4() {
		{
			Scanner sc = new Scanner(System.in);
			int num=0;
			while(1>num) {
				System.out.print("1이상의 숫자를 입력하세요. : ");
				num = sc.nextInt();
				
				if(1<=num) {
					for(int i=num; i>=1 ; i--) {
						System.out.print(i + " ");
					}
					}else if(1>num) {
						System.out.println("1이상의 숫자를 입력해주세요.");
											
					}
				}
			}
	}
	//실습문제 5
	/*1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
	ex.
	정수를 하나 입력하세요 : 8
	1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36*/
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i;
			if(i<8) {
				System.out.print(i + " + ");
			}else if(i == 8) {
				System.out.print(i + " = " + sum);
			}
		}
	}
	
	
//정훈씨가 알려준 풀이
//	//1	
//		Scanner sc = new Scanner(System.in);
//	//2
//		System.out.print("정수를 하나 입력하세요 : ");
//		int num = sc.nextInt();
//	//3	
//		int sum=0;//정수 합계를 담을 공간 만들기.
//	//4
//		for(int i=1; i <= num; i++) {
//			if(i == num) {
//				System.out.print(i + " = "); //i가 8이 되었을때 +가 아닌 =을 출력
//			}else {
//			System.out.print(i + " + "); // 1~num까지의 출력.
//			}
//			sum += i; //1~num까지의 정수들의 합 / sum = sum + i /0+=1 1~num까지 더함 
//		}
//		System.out.print(sum);
//	}
	
	//실습문제 6
	
	/*
	 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
	ex.
	첫 번째 숫자 : 8 	첫 번째 숫자 : 	4 	첫 번째 숫자 : 9
	두 번째 숫자 : 4 	두 번째 숫자 : 	8 	두 번째 숫자 : 0
	4 5 6 7 		8 4 5 6 7 8 	1 이상의 숫자를 입력해주세요.
	*/
	public void practice6() {
	//실습문제 7 //** 문제풀이
	/*위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
	“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요
	ex.
	첫 번째 숫자 : 8 	첫 번째 숫자 : 4 	첫 번째 숫자 : 9
	두 번째 숫자 : 4 	두 번째 숫자 : 8 	두 번째 숫자 : 0
	4 5 6 7 8 		4 5 6 7 8 		1 이상의 숫자를 입력해주세요.
	
	첫 번째 숫자 : 6
	두 번째 숫자 : 2
	2 3 4 5 6		*/
		Scanner sc =new Scanner(System.in);

		System.out.print("첫번째 숫자 : ");
		int first = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int end = sc.nextInt();
		
		int max =0;
		int min =0;
		
		if(first < end) {
			max=end;
			min=first;
			
		}else if(first > end) {
			max=first;
			min=end;
		}
		
		if(1<min) {
			for(int i=min; min<=max; min++) {
				System.out.print(min + " ");
			}
			}else if(1>min) {
			System.out.println("1이상의 숫자를 입력해 주세요.");
				
			}
			System.out.println();
		}
	
	
	public void practice7() {
		Scanner sc =new Scanner(System.in); //임연화풀이
//		int max =0;
//		int min =0;
	while(true) {	
		System.out.print("첫번째 숫자 : ");
		int first = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int end = sc.nextInt();
		
		 int max =0;
		 int min =0;
		
		if(first < end) {
			max=end;
			min=first;
			
		}else if(first > end) {
			max=first;
			min=end;
		}
		
		if(1<min) {
			for(int i=min; min<=max; min++) {
				System.out.print(min + " ");
				}break;
				
			}else if(1>min) {
			System.out.println("1이상의 숫자를 입력해 주세요.");
				
			}
			System.out.println();
		}
	}
		
	
// 박신우 쌤 풀이		
//		Scanner sc = new Scanner(System.in);
//		
//	while(true) { 
// 첫번째 숫자 입력부터 재 입력까지 와일로 묶고, 재대로 출력되서 끝나는 포문이 끝나는 부분에 브레이크 걸어준다.
//		
//		System.out.print("첫 번재 숫자 : ");
//		int num1 = sc.nextInt();
//		System.out.print("두 번재 숫자 : ");
//		int num2 = sc.nextInt();
//		
//		if(num1 >= 1 && num2 >= 1) { 
//			
//			int max = 0;
//			int min = 0;
//			
//			if(num1 > num2) {
//				max = num1;
//				min = num2;
//			}else {
//				max = num2;
//				min = num1;
//			}
//			
//			for(int i = min; i <= max; i++) {
//				System.out.print(i + " ");
//			}
//			
//			 break;
//		} else {
//			System.out.println("1 이상의 숫자를 입력해주세요.");
//		}
//	}
//}
	//실습문제 8 / 8~9~10 연계된 문제!
	//사용자로부터 입력 받은 숫자의 단을 출력하세요
	/*ex.
	숫자 : 4
	===== 4단 =====
	4 * 1 = 4
	4 * 2 = 8
	4 * 3 = 12
	4 * 4 = 16
	4 * 5 = 20
	4 * 6 = 24
	4 * 7 = 28
	4 * 8 = 32
	4 * 9 = 36*/
	public void practice8() { //임연화 풀이
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("숫자 : ");
			int dan = sc.nextInt();
			
			if(dan<=9) {
				for(int i=dan; i<=9; i++) {
					System.out.println("====="+ dan +"단 =====");
					for(int su=1; su<=9; su++) {
						System.out.printf("%d * %d = %d%n", i, su, (i*su));
					}
				}
				break;
			}else if(dan > 9) {
				System.out.println("9이하의 숫자를 입력해주세요.");
			}
		}
	}
	//실습문제 9 /8~9~10 연계된 문제!
	/*사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
	단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
	숫자 : 4 숫자 : 10
	===== 4단 ===== 9 이하의 숫자만 입력해주세요.
	===== 5단 =====
	===== 6단 =====
	===== 7단 =====
	===== 8단 =====
	===== 9단 =====
	(해당 단의 내용들은 길이 상 생략)*/
	public void practice9() { //임연화 풀이
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("숫자 : ");
			int dan = sc.nextInt();
			
			if(dan<=9) {
				for(int i=dan; i<=9; i++) {
					System.out.println("====="+ dan +"단 =====");
					for(int su=1; su<=9; su++) {
						System.out.printf("%d * %d = %d%n", i, su, (i*su));
					}
				}
				break;
			}else if(dan > 9) {
				System.out.println("9이하의 숫자를 입력해주세요.");
			}
		}
	}
	
	//실습문제 10  /8~9~10 연계된 문제! //** 문제풀이
	/*위 문제와 모든 것이 동일하나, 9를 초과하는 숫자가 입력됐다면
	“9 이하의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
	숫자 : 4 숫자 : 10
	===== 4단 ===== 9 이하의 숫자만 입력해주세요.
	===== 5단 ===== 숫자 : 8
	===== 6단 ===== ===== 8단 =====
	===== 7단 ===== ===== 9단 =====
	===== 8단 =====
	===== 9단 =====
	(해당 단의 내용들은 길이 상 생략)*/
	public void practice10() { //박신우쌤 풀이
		
		Scanner sc = new Scanner(System.in);
		
	while(true) {	// 반복되어야하는 숫자 입력 부터 띄어쓰기까지 출력완료 후에 브레이크 걸기.
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num <= 9) {
			for(int i = num; i <= 9; i++) {
				System.out.print("==== " + num +"단 ====");
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d%n", i, j, i*j);
				}
				System.out.println();
			}
			
			break;
		}else {
			System.out.println("9이하의 숫자만 입력해주세요.");
		}
	}	
}
	//실습문제 11 /**문제풀이
	/*
	 사용자로부터 시작 숫자와 공차를 입력 받아
	일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
	단, 출력되는 숫자는 총 10개입니다.
	* ‘공차’는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다.
	ex) 2, 7, 12, 17, 22 …
	5 5 5 5 => 여기서 공차는 5
	ex.
	시작 숫자 : 4
	공차 : 3
	4 7 10 13 16 19 22 25 28 31*/
	public void practice11() { //풀이 못했으니 이해하거나 외우기
// 카운터 몰랐기 때문에 임연화 풀이 실패.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("시작 숫자 : ");
//		int start = sc.nextInt();
//		System.out.print("공차 숫자 : ");
//		int num = sc.nextInt();
//		
//		int num1 = num*10+1;
//		
//		for(int i=start; start <= num1; i+=num) {
//			System.out.println(i + " ");
//			
//		}
//	}
// 선생님 풀이
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		System.out.print("공차 : ");
		int num = sc.nextInt();
		
		
		int count = 0; //총 10번이 되었는지 세어주는 변수 , 10번을 셀수있는 변수를 하나 만들자.
		for(int i = start; ; i += num) { //카운트로 셀거기때문에 어디까지라는 조건을 넣지 않음.
			System.out.print(i + " "); // 한번 출력1 , 두번 출력 2, ...출력 10 
			count++;
			
			if(count == 10) { // 만약 카운트가 10번 되었다면 브레이크 걸어준다는 뜻.
				break;
			}
		}		
	}
		
	//실습문제 12 //**문제 풀이
	/*정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
	단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
	exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
	또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
	“0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
	없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
	두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
	[다음 장 출력 예시 참고]
	연산자(+, -, *, /, %) : +
	정수1 : 10
	정수2 : 4
	10 + 4 = 14
	
	
	연산자(+, -, *, /, %) : / 	연산자(+, -, *, /, %) : /
	정수1 : 10 					정수1 : 10
	정수2 : 4 					정수2 : 0
	10 / 4 = 2 					0으로 나눌 수 없습니다. 다시 입력해주세요.
	
	
	연산자(+, -, *, /, %) : ^ 	연산자(+, -, *, /, %) : exit
	정수1 : 10 					프로그램을 종료합니다.
	정수2 : 4
	없는 연산자입니다. 다시 입력해주세요.			*/
	
	public void practice12() {
	//0
		Scanner sc = new Scanner(System.in);
		
	while(true) {	
		
		//1
		System.out.print("연산자(+, -, *, /, %) : ");
		String op = sc.nextLine();
		
		//3
		if(op.equals("exit")) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		
		//1-1
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		// int num1 = Integer.parseInt(sc.nextLine()); 파싱하는 방법
		System.out.print("정수2 : ");
		int num2 = sc.nextInt(); 
		// int num2 = Integer.parseInt(sc.nextLine()); 파싱하는 방법
		
		//** 컨티뉴 이후에 1번 넥트스라인이 여기에 남아있는 줄넘기를 가져가 버려서 그렇다.
		//해결방법1)  1번을 넥스트로 하거나, 
		//해결방법2) 파싱하거나.
		//해결방법3) 정수2에 남아있는 줄바꿈을 가져가는
		//sc.nextLine(); 넥스트 라인을 하나 집어넣기.
		sc.nextLine(); 
		
		//2 나눗셈이면서 
		
		if(op.equals("/") && num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.\n");
			continue;
		}
		//4
		
		switch(op) {
		case "+" :
			System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 + num2));
			break;
		case "-" :
			System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 - num2));
			break;
		case "*" :
			System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 * num2));
			break;
		case "/" :
			System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 / num2));
			break;
		case "%" :
			System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 % num2));
			break;
//5
		default:
			System.out.println("없는 연산자 입니다. 다시 입력해주세요.\n");
		}
	}
		
		
		
		
		
		
	}
	//실습문제 13
	/*
	 * 다음과 같은 실행 예제를 구현하세요.
	ex.
	정수 입력 : 4
	*
	**
	***
	****		*/
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
			  
		for(int i=1; i<=num; i++) { // 1에서 4까지 늘어난다.
			for(int j=1; j<=i; j++) { //1에서 4까지 늘어나며 돈다
				System.out.print("*");
			}
				System.out.println();
	}
	}
	
	
	//실습문제 14
	/*다음과 같은 실행 예제를 구현하세요.
	ex.
	정수 입력 : 4
	****
	***
	**
	*		*/

	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt(); 

		for(int i=1; i<=num; i++) { // 1에서 4까지 늘어난다.
			for(int j =num; j>=i; j--) { //4에서 1까지 줄어들며 돈다.
				System.out.print("*");
			}
				System.out.println();
		}
	}
}

		


