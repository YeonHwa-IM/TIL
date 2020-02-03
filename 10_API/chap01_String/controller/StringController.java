package com.kh.example.chap01_String.controller;

import java.util.StringTokenizer;

public class StringController {
	public void method1() {
		//�ڹٸ� ��Ʈ���� �־�� �ּҰ��� ���غ���. 1,2  �� 3�� �ּҰ��� �ٸ� ���� �����ϱ�.
		String str1 ="java";
		String str2 ="java";
		String str3 = new String("java");
		
//		str1 == str2; ���ڿ��� ���Ҷ���  �ּҰ��� ���ϱ� ������ �̷��� �ϸ�ȵȴ�.

		System.out.println("str1�� str2�� �ּҴ� ������? : "+ (str1 == str2));
		System.out.println("str1�� str3�� �ּҴ� ������? : "+ (str1 == str3));
		/*str1�� str2�� �ּҴ� ������? : true
		  str1�� str3�� �ּҴ� ������? : false*/
		
		System.out.println("str1�� hachCode : " + str1.hashCode());
		System.out.println("str2�� hachCode : " + str1.hashCode());
		System.out.println("str3�� hachCode : " + str1.hashCode());
		/*hashCode() ������Ʈ Ŭ���� �ȿ� �ְ�, 
		str1�� hachCode : 3254818
		str2�� hachCode : 3254818
		str3�� hachCode : 3254818*/
		
		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str1));
		System.out.println("str2�� ���ּҰ� : " + System.identityHashCode(str2));
		System.out.println("str3�� ���ּҰ� : " + System.identityHashCode(str3));
		/*
		str1�� ���ּҰ� : 366712642
		str2�� ���ּҰ� : 366712642
		str3�� ���ּҰ� : 1829164700
		 * */
		
		//java�� �Է��Ͽ����� ��Ʈ���� ��Ʈ�� Ǯ�̶�� ���� ���� �Էµǰ�, 1,2�� �װ��� ������
		//java�� �ּҰ��� �����Ѵ�. 3�� new�����ڸ� ����ؼ�  �� ������ �����Ǳ⶧���� �����ϴ� 
		//�ּҰ��� ���� �ٸ���.
		
		str2 += "oracle";
		System.out.println("str1�� str2�� �ּҴ� ���� ��? : " +(str1 == str2));
		//str1�� str2�� �ּҴ� ���� ��? : false
		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str1));
		System.out.println("str2�� ���ּҰ� : " + System.identityHashCode(str2));
		System.out.println("str3�� ���ּҰ� : " + System.identityHashCode(str3));
		/* 
		str1�� ���ּҰ� : 366712642
		str2�� ���ּҰ� : 2018699554
		str3�� ���ּҰ� : 1829164700
		 */
	}
	public void method2() {
		//StringBuffer Test
		// ����ؼ� ���� �����ؾ� �Ҷ� String���� ��� ���� ���� ����� ���� ��ġ�� �ٲ��ֱ� ������
		// ������ �÷��Ͱ� ��� �������ϴ� ������ ����(�Һ��̶�� Ư¡ ����)
		// ������ ���� �б⸸ �ϴ� ��쿡�� �Һ� Ŭ������ String Ŭ������ �����ϰ�����.
		// �����ؾ��ϴ� ���� ���� ��� StringBuffer�� StringBuilder�� �ϴ°� �� ȿ������.

		StringBuffer buffer1 = new StringBuffer();
		System.out.println("�ʱ� buffer1�� ���뷮 : " + buffer1.capacity());
		//�ʱ� buffer1�� ���뷮 : 16
		System.out.println("buffer1�� ����ִ� �������� ���� : " + buffer1.length());
		//buffer1�� ����ִ� �������� ���� : 0

		System.out.println();

		StringBuffer buffer2 = new StringBuffer(100);
		System.out.println("�ʱ� buffer2�� ���뷮 : " + buffer2.capacity());
		System.out.println("buffer2�� ����ִ� ���� ���� ���� : "+buffer2.length());
		/*
		 �ʱ� buffer2�� ���뷮 : 100
		buffer2�� ����ִ� ���� ���� ���� : 0
		 */
		
		System.out.println();
		
		StringBuffer buffer3 = new StringBuffer("abc");
		System.out.println("�ʱ� buffer3�� ���뷮 : " + buffer3.capacity());
		System.out.println("buffer3�� ����ִ� ���� ���� ���� : "+buffer3.length());
		/*
		 �ʱ� buffer3�� ���뷮 : 19 ���� ���뷮 16�� abc�� �� ���� +3�� 19�� ���´�. 
		 buffer3�� ����ִ� ���� ���� ���� : 3 ���� ���� ���̰� abc�� �� �ֱ⶧���� 3�� ���´�.
		*/
		System.out.println();
		//������ ������ ������Ѵ�.
				
		StringBuilder builder = new StringBuilder("abc");
		System.out.println("�ʱ� builder�� ���뷮 : " + builder.capacity());
		System.out.println("builder�� ����ִ� ���� ���� ���� : "+builder.length());
		/*
		�ʱ� builder�� ���뷮 : 19
		builder�� ����ִ� ���� ���� ���� : 3 
		 */
		
		//Ŭ������ �ٸ��� ���� �޼ҵ尡 ���ٱ⶧���� ���ۿ� ������ �������� �����带 �����ϴ��� �ƴϳ��̴�.
		
		
		builder.append("abc");
		System.out.println("abc �߰� ���� builder : " + builder);
		System.out.println("abc �߰� ���� builder �뷮 : " + builder.capacity());
		System.out.println("abc �߰� ���� builder ���� : " + builder.length());
		
		/*
		abc �߰� ���� builder : abcabc
		abc �߰� ���� builder �뷮 : 19
		abc �߰� ���� builder ���� : 6
		*/
		
		builder.append("def");
		System.out.println("def �߰� ���� builder : "+ builder);
		System.out.println("def �߰� ���� builder �뷮 : " + builder.capacity());
		System.out.println("def �߰� ���� builder ���� : " + builder.length());
		/*
		def �߰� ���� builder : abcabcdef
		def �߰� ���� builder �뷮 : 19
		def �߰� ���� builder ���� : 9
		 */
		
		// abc�� def�� ���ļ� ���ٸ�?
		builder.append("abc").append("def"); //�޼ҵ�ü�̴� : �޼ҵ� �ڿ� .�޼ҵ� �ϴ� ���� �޼ҵ� ü�̴��̶�� �Ѵ�.
		//������ ���� �ȿ� �ִ�. ������� ��ȯ���� ��Ʈ�������̴�.
		//��Ʈ������ �޼ҵ��� ������  "builder.append("abc")" �����̴�. �׷��Ƿ� �� �ڿ� .append("def")�� �����ִ�.
		builder.append("ghi").toString().equals("abcdefghi");
//		---------------------            -------------------
//		StringBuilder                     ���� ��Ʈ�� Ŭ�����̱⶧���� ������ ����� �����ϴ�!
//		-------------------------------- �տ� �ִ� ��ȯ���� �����Ŀ� ���� �ڿ� ��� �޼ҵ�ü���� �����Ҽ��ִ°��̴�.
//		          String
//		
		System.out.println("abc, def �߰� ���� builder : " + builder);
		System.out.println("abc, def �߰� ���� builder �뷮 : " + builder.capacity());
		System.out.println("abc, def �߰� ���� builder ���� : "+ builder.length());
		
		System.out.println();
		
		//�߰��� �߰� �غ���
		
		builder.insert(2, "zzz");
		System.out.println("�ε���2�� zzz�߰� ���� builder : " + builder);
	//�ε���2�� zzz�߰� ���� builder : abzzzcabcdef
		
		System.out.println();
		
		//�Ϻ� ���� �غ���
		
		builder.delete(2, 5); //start <= �ε��� < end
		System.out.println("�ε���2���� �ε���5���� ���� ���� builder : " + builder);
	//�ε���2���� �ε���5���� ���� ���� builder : abcabcdef

		System.out.println();
		
		//�Ųٷ� ����غ���
		
		builder.reverse();
		System.out.println("reverse ���� builder : "+ builder);
		//reverse ���� builder : fedcbacba
	
		System.out.println();
	
		StringBuilder sb = new StringBuilder("abc");
		sb = sb.append("zzz").insert(2, "yy").reverse().delete(1, 3);
//	            abczzz         abyyczzz       zzzcyyba      zcyyba (1��3�� ����)
		
		System.out.println(sb);
		//zcyyba
	}
	public void method3() {
		String str = "Hello World";
		
		//1. charAt(int index):char
		//String�� index���� char��ȯ
		char ch = str.charAt(4);
		System.out.println(ch);
		//o
		
		//2. concat(String str):String
		// 	�Ű������� ���� ���� ���� String�� ���� �̾���� ��(String)�� ��ȯ
		
		String concatStr = str.concat("!!!");
		System.out.println("concatStr : "+concatStr);
		//concatStr : Hello World!!!
		
		str += "!!!"; //�̷��Ե� �Ҽ��ִ�.
		System.out.println(str);
		//Hello World!!!
		
		//3. equals():boolean
		System.out.println("concatStr.equals(str) : " + concatStr.equals(str));
		//concatStr.equals(str) : true
		
		//4. substring(int beginIndex):String
		//	 substring(int beginIndex, int endIndex):String
		// String�� �Ϻθ� ��ȯ - �Ű������� �ϳ���, �� �ε������� ������ ��ȯ
		// 				  - �Ű������� �ΰ���, �����ε��� <= ���� < �� �ε��� ����
		
		System.out.println("str.substring(6) : " + str.substring(6));
		//str.substring(6) : World!!! 6������� ������ �� ��ȯ�ض�.
		System.out.println("str.substring(0,5) : "+ str.substring(0,5));
		//str.substring(0,5) : Hello 0���� 5 �̸����� ��ȯ�ض�.
		
		//5. replace(char oldChar, char newChar):String
		//	���� char�� ���ο� char�� ��ü�Ͽ� ��ȯ
		System.out.println("str.replace('l', 'e') : "+ str.replace('l','e'));
		//str.replace('l', 'e') : Heeeo Wored!!! //l�� e�� �ٲپ���.
		
		//6. toUpperCase()/toLowerCase():String
		// ��� �빮�ڷ� Ȥ�� �ҹ��ڷ� �ٲ� ��ȯ
		System.out.println("str.toUpperCase() : "+ str.toUpperCase());
		System.out.println("str.toLowerCase() : "+ str.toLowerCase());
		//str.toUpperCase() : HELLO WORLD!!!
		//str.toLowerCase() : hello world!!!
		//ex. yes or no �� ������ٶ� ��.
		
		//7. equalsIgnoreCase():boolean
		// ��ҹ��� ������ �ʰ� ��.
		String str2 = "Wonderful";
		String str3 = "wonderful";
		System.out.println("str2.equals(str3) : " + str2.equals(str3));
		System.out.println("str3.equalsIgnoreCase(str3) : " + str2.equalsIgnoreCase(str3));
		//str2.equals(str3) : false
		//str3.equalsIgnoreCase(str3) : true
		//ex. �ݺ��� ��� ���Ҷ�
		
		//8. trim():String
		//  ��/�ڿ� �ִ� ����(�� ����)�� ������ ���ڿ� ��ȯ
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
		// 		���ڿ��� �и��Ͽ� �迭�� ��� ��ȯ
		String splitStr = "java, Oracle, JDBC, Front, Server, Framwork";
		String[] splitArr = splitStr.split(", ");
		System.out.println("�и��� ���ڿ� ����(split) : "+ splitArr.length);
		//�и��� ���ڿ� ����(split) : 6
		
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
		
		//���� for��(for-each��)
		for(String s : splitArr) { // ó������ ������ �ڵ����� ����. �÷��ǵ� �����ִ�. 
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
		//split()�� StringTokenizer�� ������
		
		String str = ("Java, Oracle, JDBC, Front, Server, Framework");
		StringTokenizer stObj = new StringTokenizer(str, ", ");
		System.out.println("�и��� ���ڿ� ���� : " + stObj.countTokens());
		while(stObj.hasMoreTokens()) {
			System.out.println(stObj.nextToken());
		}
		System.out.println("���� ���� ���� ���ڿ� ���� : "+ stObj.countTokens());
		//���� ���� ���� ���ڿ� ���� : 0
		
		//1. �и��� ���ڿ��� String[]�� ó���ϰ� ������ split()�޼ҵ�
		//	  �и��� ���ڿ��� ��ü�� ó���ϰ� ������ StringTokenizerŬ���� 
		
		System.out.println();
		
		String str2 = "Apple, Banana-Cream*Dessert#Egg Fruits";
		StringTokenizer stObj2 = new StringTokenizer(str2, ", -*#");
		System.out.println("�и��� ���ڿ� ���� : "+ stObj2.countTokens());
		//�и��� ���ڿ� ���� : 6
		
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
		
		//2. split()�޼ҵ��� �����ڴ� 1��������
		//StringTokenizerŬ������ �����ڴ� ������
	}
}
