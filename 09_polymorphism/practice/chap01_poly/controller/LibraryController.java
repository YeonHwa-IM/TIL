package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	private Member mem = null;
	int count1= 0;
	
	private Book[] bList = new Book[5];
	
	{
		bList[0] = new CookBook("�������� ����", "������", "tvN", true);
		bList[1] = new AniBook("�ѹ� �� �ؿ�", "��Ƽ", "�����", 19);
		bList[2] = new AniBook("������ ���ǽ�", "����", "japan", 12);
		bList[3] = new CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false);
		bList[4] = new CookBook("������ �� �����غ�", "������", "�ұ�å", true);
		}
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public Member myinfo() {
		return mem;
		
	}
	public Book[] selectAll() {
		return bList;
	
	}
	public Book[] searchBook(String keyword) {
		Book[] b = new Book[5];
		int count = 0;
		for(int i = 0; i< b.length; i++) {
			if(bList[i].getTitle().contains(keyword)) { //������ ��.
				b[count] = bList[i];//b�� [i]��� �Ǹ� ������������ ���� null �� �ɰǵ�.. 
				count++;
			}
		}
		return b;
	}
	public int rentBook(int index) {
		int result = 0;
		if(bList[index] instanceof AniBook) {
			if(((AniBook) bList[index]).getAccessAge() > mem.getAge()) {
				result =1;
			}
		}else if(bList[index] instanceof CookBook) {
			if(((CookBook) bList[index]).getCoupon() == true) {
				mem.setCouponCount(++count1);
				//mem.setCouponCount(mem.getCouponCount()+1); �̷��Ե� ������.
				result =2;
			}
		}
		return result;
	}
		
}
