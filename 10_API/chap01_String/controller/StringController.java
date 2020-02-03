package com.kh.example.chap01_String.controller;

import java.util.StringTokenizer;

public class StringController {
	public void method1() {
		//자바를 스트링에 넣어보고 주소값을 비교해보자. 1,2  와 3이 주소값이 다른 이유 이해하기.
		String str1 ="java";
		String str2 ="java";
		String str3 = new String("java");
		
//		str1 == str2; 문자열을 비교할때는  주소값을 비교하기 때문에 이렇게 하면안된다.

		System.out.println("str1과 str2의 주소는 같은가? : "+ (str1 == str2));
		System.out.println("str1과 str3의 주소는 같은가? : "+ (str1 == str3));
		/*str1과 str2의 주소는 같은가? : true
		  str1과 str3의 주소는 같은가? : false*/
		
		System.out.println("str1의 hachCode : " + str1.hashCode());
		System.out.println("str2의 hachCode : " + str1.hashCode());
		System.out.println("str3의 hachCode : " + str1.hashCode());
		/*hashCode() 오브젝트 클래스 안에 있고, 
		str1의 hachCode : 3254818
		str2의 hachCode : 3254818
		str3의 hachCode : 3254818*/
		
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str1));
		System.out.println("str2의 실주소값 : " + System.identityHashCode(str2));
		System.out.println("str3의 실주소값 : " + System.identityHashCode(str3));
		/*
		str1의 실주소값 : 366712642
		str2의 실주소값 : 366712642
		str3의 실주소값 : 1829164700
		 * */
		
		//java를 입력하였을때 스트링은 스트링 풀이라는 곳에 값이 입력되고, 1,2는 그곳에 생선된
		//java의 주소값을 참조한다. 3은 new연산자를 사용해서  힙 영역에 생성되기때문에 참조하는 
		//주소값이 전혀 다르다.
		
		str2 += "oracle";
		System.out.println("str1과 str2의 주소는 같은 가? : " +(str1 == str2));
		//str1과 str2의 주소는 같은 가? : false
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str1));
		System.out.println("str2의 실주소값 : " + System.identityHashCode(str2));
		System.out.println("str3의 실주소값 : " + System.identityHashCode(str3));
		/* 
		str1의 실주소값 : 366712642
		str2의 실주소값 : 2018699554
		str3의 실주소값 : 1829164700
		 */
	}
	public void method2() {
		//StringBuffer Test
		// 계속해서 값을 변경해야 할때 String같은 경우 값이 새로 생기고 참조 위치만 바꿔주기 때문에
		// 가비지 컬렉터가 계속 지워야하는 단점이 있음(불변이라는 특징 때문)
		// 변경이 적고 읽기만 하는 경우에는 불변 클래스인 String 클래스가 용이하겠지만.
		// 변경해야하는 값이 많은 경우 StringBuffer나 StringBuilder로 하는게 더 효율적임.

		StringBuffer buffer1 = new StringBuffer();
		System.out.println("초기 buffer1의 수용량 : " + buffer1.capacity());
		//초기 buffer1의 수용량 : 16
		System.out.println("buffer1에 들어있는 실제값의 길이 : " + buffer1.length());
		//buffer1에 들어있는 실제값의 길이 : 0

		System.out.println();

		StringBuffer buffer2 = new StringBuffer(100);
		System.out.println("초기 buffer2의 수용량 : " + buffer2.capacity());
		System.out.println("buffer2에 들어있는 실제 값의 길이 : "+buffer2.length());
		/*
		 초기 buffer2의 수용량 : 100
		buffer2에 들어있는 실제 값의 길이 : 0
		 */
		
		System.out.println();
		
		StringBuffer buffer3 = new StringBuffer("abc");
		System.out.println("초기 buffer3의 수용량 : " + buffer3.capacity());
		System.out.println("buffer3에 들어있는 실제 값의 길이 : "+buffer3.length());
		/*
		 초기 buffer3의 수용량 : 19 원래 수용량 16에 abc가 더 들어가서 +3된 19가 나온다. 
		 buffer3에 들어있는 실제 값의 길이 : 3 실제 값의 길이가 abc가 들어가 있기때문에 3이 나온다.
		*/
		System.out.println();
		//빌더도 동일한 기능을한다.
				
		StringBuilder builder = new StringBuilder("abc");
		System.out.println("초기 builder의 수용량 : " + builder.capacity());
		System.out.println("builder에 들어있는 실제 값의 길이 : "+builder.length());
		/*
		초기 builder의 수용량 : 19
		builder에 들어있는 실제 값의 길이 : 3 
		 */
		
		//클래스가 다른데 들어가는 메소드가 같다기때문에 버퍼와 빌더의 차이점은 쓰레드를 제공하느냐 아니냐이다.
		
		
		builder.append("abc");
		System.out.println("abc 추가 후의 builder : " + builder);
		System.out.println("abc 추가 후의 builder 용량 : " + builder.capacity());
		System.out.println("abc 추가 후의 builder 길이 : " + builder.length());
		
		/*
		abc 추가 후의 builder : abcabc
		abc 추가 후의 builder 용량 : 19
		abc 추가 후의 builder 길이 : 6
		*/
		
		builder.append("def");
		System.out.println("def 추가 후의 builder : "+ builder);
		System.out.println("def 추가 후의 builder 용량 : " + builder.capacity());
		System.out.println("def 추가 후의 builder 길이 : " + builder.length());
		/*
		def 추가 후의 builder : abcabcdef
		def 추가 후의 builder 용량 : 19
		def 추가 후의 builder 길이 : 9
		 */
		
		// abc와 def를 합쳐서 쓴다면?
		builder.append("abc").append("def"); //메소드체이닝 : 메소드 뒤에 .메소드 하는 것을 메소드 체이닝이라고 한다.
		//어펜드는 빌더 안에 있다. 어펜드의 반환값은 스트링빌드이다.
		//스트링빌드 메소드의 범위는  "builder.append("abc")" 까지이다. 그러므로 그 뒤에 .append("def")가 들어갈수있다.
		builder.append("ghi").toString().equals("abcdefghi");
//		---------------------            -------------------
//		StringBuilder                     같은 스트링 클래스이기때문에 이퀄스 사용이 가능하다!
//		-------------------------------- 앞에 있는 반환값이 뭔지냐에 따라 뒤에 계속 메소드체인을 연결할수있는것이다.
//		          String
//		
		System.out.println("abc, def 추가 후의 builder : " + builder);
		System.out.println("abc, def 추가 후의 builder 용량 : " + builder.capacity());
		System.out.println("abc, def 추가 후의 builder 길이 : "+ builder.length());
		
		System.out.println();
		
		//중간에 추가 해보기
		
		builder.insert(2, "zzz");
		System.out.println("인덱스2에 zzz추가 후의 builder : " + builder);
	//인덱스2에 zzz추가 후의 builder : abzzzcabcdef
		
		System.out.println();
		
		//일부 삭제 해보기
		
		builder.delete(2, 5); //start <= 인덱스 < end
		System.out.println("인덱스2부터 인덱스5까지 삭제 후의 builder : " + builder);
	//인덱스2부터 인덱스5까지 삭제 후의 builder : abcabcdef

		System.out.println();
		
		//거꾸로 출력해보기
		
		builder.reverse();
		System.out.println("reverse 후의 builder : "+ builder);
		//reverse 후의 builder : fedcbacba
	
		System.out.println();
	
		StringBuilder sb = new StringBuilder("abc");
		sb = sb.append("zzz").insert(2, "yy").reverse().delete(1, 3);
//	            abczzz         abyyczzz       zzzcyyba      zcyyba (1번3번 삭제)
		
		System.out.println(sb);
		//zcyyba
	}
	public void method3() {
		String str = "Hello World";
		
		//1. charAt(int index):char
		//String의 index번재 char반환
		char ch = str.charAt(4);
		System.out.println(ch);
		//o
		
		//2. concat(String str):String
		// 	매개변수로 들어온 값을 원래 String의 끝에 이어붙인 값(String)을 반환
		
		String concatStr = str.concat("!!!");
		System.out.println("concatStr : "+concatStr);
		//concatStr : Hello World!!!
		
		str += "!!!"; //이렇게도 할수있다.
		System.out.println(str);
		//Hello World!!!
		
		//3. equals():boolean
		System.out.println("concatStr.equals(str) : " + concatStr.equals(str));
		//concatStr.equals(str) : true
		
		//4. substring(int beginIndex):String
		//	 substring(int beginIndex, int endIndex):String
		// String의 일부를 반환 - 매개변수가 하나면, 그 인덱스부터 끝까지 반환
		// 				  - 매개변수가 두개면, 시작인덱스 <= 문자 < 끝 인덱스 까지
		
		System.out.println("str.substring(6) : " + str.substring(6));
		//str.substring(6) : World!!! 6번재부터 끝까지 다 반환해라.
		System.out.println("str.substring(0,5) : "+ str.substring(0,5));
		//str.substring(0,5) : Hello 0부터 5 미만까지 반환해라.
		
		//5. replace(char oldChar, char newChar):String
		//	지정 char를 새로운 char로 대체하여 반환
		System.out.println("str.replace('l', 'e') : "+ str.replace('l','e'));
		//str.replace('l', 'e') : Heeeo Wored!!! //l을 e로 바꾸었다.
		
		//6. toUpperCase()/toLowerCase():String
		// 모두 대문자로 혹은 소문자로 바꿔 반환
		System.out.println("str.toUpperCase() : "+ str.toUpperCase());
		System.out.println("str.toLowerCase() : "+ str.toLowerCase());
		//str.toUpperCase() : HELLO WORLD!!!
		//str.toLowerCase() : hello world!!!
		//ex. yes or no 로 만들어줄때 등.
		
		//7. equalsIgnoreCase():boolean
		// 대소문자 가리지 않고 비교.
		String str2 = "Wonderful";
		String str3 = "wonderful";
		System.out.println("str2.equals(str3) : " + str2.equals(str3));
		System.out.println("str3.equalsIgnoreCase(str3) : " + str2.equalsIgnoreCase(str3));
		//str2.equals(str3) : false
		//str3.equalsIgnoreCase(str3) : true
		//ex. 반복문 등에서 비교할때
		
		//8. trim():String
		//  앞/뒤에 있는 공백(빈 공간)을 제거한 문자열 반환
		String str4 = "     java";
		String str5 = "java     ";
		String str6 = "     ja  va       ";
		System.out.println(str4 + "| str4.trim() : "+ str4.trim());
		System.out.println(str5 + "| str5.trim() : "+ str5.trim());
		System.out.println(str6 + "| str6.trim() : "+ str6.trim());
		/*
				      java| str4.trim() : java
		java     | str5.trim() : java
		     java       | str6.trim() : java
		     ja  va       | str6.trim() : ja  va
		 */
		
		//9. split(String str):String[]
		// 		문자열을 분리하여 배열에 담아 반환
		String splitStr = "java, Oracle, JDBC, Front, Server, Framwork";
		String[] splitArr = splitStr.split(", ");
		System.out.println("분리된 문자열 개수(split) : "+ splitArr.length);
		//분리된 문자열 개수(split) : 6
		
		for(int i=0; i < splitArr.length; i++) {
			System.out.println(splitArr[i]);
		}
		/*
		java
		Oracle
		JDBC
		Front
		Server
		Framework*/
		
		//향상된 for문(for-each문)
		for(String s : splitArr) { // 처음부터 끝까지 자동으로 돈다. 컬렉션도 들어갈수있다. 
			System.out.println(s);
		}
		/*
		 java
		Oracle
		JDBC
		Front
		Server
		Framework
		 */
	}
	public void method4() {
		//split()과 StringTokenizer의 차이점
		
		String str = ("Java, Oracle, JDBC, Front, Server, Framework");
		StringTokenizer stObj = new StringTokenizer(str, ", ");
		System.out.println("분리된 문자열 개수 : " + stObj.countTokens());
		while(stObj.hasMoreTokens()) {
			System.out.println(stObj.nextToken());
		}
		System.out.println("값을 꺼낸 후의 문자열 개수 : "+ stObj.countTokens());
		//값을 꺼낸 후의 문자열 개수 : 0
		
		//1. 분리한 문자열을 String[]로 처리하고 싶을때 split()메소드
		//	  분리한 문자열을 객체로 처리하고 싶을때 StringTokenizer클래스 
		
		System.out.println();
		
		String str2 = "Apple, Banana-Cream*Dessert#Egg Fruits";
		StringTokenizer stObj2 = new StringTokenizer(str2, ", -*#");
		System.out.println("분리된 문자열 개수 : "+ stObj2.countTokens());
		//분리된 문자열 개수 : 6
		
		while(stObj2.hasMoreTokens()) {
			System.out.println(stObj2.nextToken());
		}
		/*
		Apple
		Banana
		Cream
		Dessert
		Egg
		Fruits*/
		
		//2. split()메소드의 구분자는 1개이지만
		//StringTokenizer클래스의 구분자는 여러개
	}
}
