package com.kh.example.chap03_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.example.chap03_assist.part02_object.model.vo.Member;

public class ObjectDAO {
	public void fileSave() {
		//Member 객체배열 3개짜리 만들기
		//user01 pass01 홍길동 hong777@kh.org 25 '남' 1250.7
		//user02 pass02 유관순 you31@kh.org 17 '여' 1221.6
		//user03 pass03 이순신 lee888@kh.org 22 '남' 1234.6
		
//		Member[] mArr = new Member[3];
//		
//		mArr[0] = new Member("user01", "pass01", "홍길동", "hong777@kh.org", 25, '남', 1250.7);
//		mArr[1] = new Member("user02", "pass02", "유관순", "you31@kh.org", 17, '여', 1221.6);
//		mArr[2] = new Member("user03", "pass03", "이순신", "lee888@kh.org", 22, '남', 1234.6);

		
//		//선언과 동시에 초기화
		Member[] mAr = {new Member("user01", "pass01", "홍길동", "hong777@kh.org", 25, '남', 1250.7),
						new Member("user02", "pass02", "유관순", "you31@kh.org", 17, '여', 1221.6),
						new Member("user03", "pass03", "이순신", "lee888@kh.org", 22, '남', 1234.6)
						};
		// 출력해야한다.
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_object_member.txt"));){
			
			for(int i =0; i< mAr.length; i++) {
				oos.writeObject(mAr[i]);
			}
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void fileOpen() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_object_member.txt"));){
			
			Member[] mar = new Member[3];
			
			for(int i = 0; i < mar.length; i++) {
				mar[i] = (Member)ois.readObject();
			}
			
			for(Member m : mar) {
				System.out.println(m);
			}
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}
