package com.kh.variable;

public class E_PrintMethod {
	
	String str1 = "안녕하세요"; 
	//전역변수: 메소드영역의 str들을 주석하고(=지역변수를 주석하고) 클래스 영역에 str을 만들어주면 아래 두 메소드 영역에 다 반영이 된다.=전역변수
	String str2 = "반갑습니다";
	
	
	
	public void printExample() {
		//지역변수: 메소드 안에 있는 변수
//		String str1 = "안녕하세요";
//		String str2 = "반갑습니다";
		
		System.out.print(str1);
		System.out.print(str2);
		
		
	}



public void printlnExample() {
	//지역변수: 메소드 안에 있는 변수
//	String str1 = "안녕하세요";
//	String str2 = "반갑습니다";
	
	System.out.println(str1);
	System.out.println(str2);
	System.out.println("박신우");
}	

public void printfExample() {
	//안녕하세요, 박신우입니다. 반갑습니다. 를 출력하고자 한다.
	//-------			----------
	//str1				str2	
//	System.out.printf("출력하고자하는 형태", );
	System.out.printf("%s, 박신우입니다. %s.", str1, str2); //문자를 출력하는포메터를 순서대로넣어준다.
	
//반갑습니다. 친하게 지내요.
	System.out.printf("%s, 친하게지내요.", str2);
	
	System.out.println();
	
	//미니문제
	//안녕하세요, 저는 20살 박신우 강사입니다. 만나서 반갑습니다.
	int age = 20;
	String name = "박신우";
	String job = "강사";
	
	System.out.printf("%s. 저는 %d살 %s %s입니다. 만나서 %s.",str1,age,name,job,str2);
	
	

}

}