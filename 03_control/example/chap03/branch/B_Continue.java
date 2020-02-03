package com.kh.example.chap03.branch;

public class B_Continue {
	// continue는 반복문 안에서만 사용이 가능하다.
	// continue를 만나면 아랫문장을 실행하지않고,
	// 반복문을 다시 시작함
	// for문의 경우 증감식으로 가고, while문의 경우 조건식으로 감
	
	public void method1() {
		//1~100까지 정수들의 합계를 출력하되 단, 4의 배수는 빼고 계산
		
		//합계 출력 sum 만들어주고, 
		//1~100까지의 조건문 만들어주고
		//단, 들의 예외 조건은 if 만들어주고, 4의 배수 계산식
		//출력 만들어주기
		
		int sum = 0; 
		for(int i=1; i <=100; i++) {
			if(i %4 == 0) {
				continue;
			}
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println();
		System.out.println("sum = " + sum);
	
	
}
	
	
	public void method2() {
		//구구단 출력 : 짝수 단, 짝수 수 빼고 출력
		//홀수만 쭉 출력 
		
				
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("===============" + dan + "단 ==============");
			for(int su = 1; su <= 9; su++) {
				
				if(dan %2 == 0 || su %2 == 0) {
					continue;
				}
				
				System.out.printf("%d * %d = %d%n",dan,su,(dan*su));
				}
						
			System.out.println();
		}
	}
}	
			
			


