package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.example.list.model.compare.StudentComparator;
import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() { // ��ƿ��Ű���� ����� ��.
		List list1 = new ArrayList(); // �⺻�����ڴ� �ʱ�뷮�� 10
//		 list1.

		List<Student> list = new ArrayList<Student>(3);//���׸� �����ϱ�(����Ʈ)
		//�տ��ִ� ���׸�Ÿ���� ���� �ڿ��ִ� ���׸� Ÿ���� �����Ѵ�.new ArrayList<> �̷��� �̸��� �����ϴ� �� �����Ҽ��� ����.
		//���� ��Ʃ��Ʈ���õ� �͸� ���尡���ϰ� ��
		// ���� ���� �Ұ�ȣ �ȿ� ���ڸ� ������ Ư���� �ʱ�뷮�� ������ ����.
		
		//add(E e): ����Ʈ ���� ������ e �߰�  ���� ����ִ� �޼ҵ�
		
		list.add(new Student("�׽�Ʈ", 0)); 
		list.add(new Student("�����", 60));
		
		System.out.println("list : "+ list);
		
		// �÷��� ���� 1.. ũ���� ������ ����.
		list.add(new Student("������", 90));
		list.add(new Student("����ȣ", 85));
		
		System.out.println("���� list�� ��� element ���� : "+ list.size());
		System.out.println("list : "+ list);
		/*���� list�� ��� element ���� : 4
		list : [�׽�Ʈ(0��), �����(60��), ������(90��), ����ȣ(85��)*/
		// �ƹ� �������� 4���� �뷮�� �ð�, ������ �����Ǿ� ����Ǿ���.
		
		list.add(new Student("���̹�", 66));
		System.out.println("���� list�� ��� element ���� : "+ list.size());
		System.out.println("list : "+ list);
		/*���� list�� ��� element ���� : 5
		list : [�׽�Ʈ(0��), �����(60��), ������(90��), ����ȣ(85��), ���̹�(66��)]*/
		
		//�÷��� ���� 2. �߰�/����/���� ���� ���ó�� ����
		//add(int index, E e) : index���� �ε����� e�߰�
		list.add(0, new Student("�����", 100)); //0���� �ε����� ����� �־��.
		System.out.println("list : "+list);
		
		list.add(3, new Student("���ǰ�", 40));
		System.out.println("list : "+list); // �߰��� �����ϴ�.
		
		//remove(int index) : �ش� index��° ��ü ����
		list.remove(1);
		System.out.println("list : "+list); // 1��° �ε��� ������..
		//list : [�����(100��), �����(60��), ���ǰ�(40��), ������(90��), ����ȣ(85��), ���̹�(66��)]
		
		//remove(Object o) :�ش� object��ü ����
		list.remove(new Student("���ǰ�", 40)); //����������... �ֳĸ�? �ּҰ��� �޶�! 
		System.out.println("list : "+list);
		// �׷��ٸ� ��ü�ּҸ� �˾Ƴ��� ��¼�� �ϸ� ����������.
		// ������Ʈ Ŭ�����ȿ� �ִ� ������޼ҵ��, �ؽ��ڵ� �޼ҵ带 �������̵��ؼ� ������ ����� 	��ü���� new�ؼ� ����ٰ��ص� ������ �ȴ�.
		// ��� �ϳĸ� �ּҰ��� �ƴ� �ȿ� ���ִ� �ʵ尪�� ���Ҽ��ְ� �������Ѵ�.
		//  ��Ʃ��ƮŬ�������� ��Ʃ��Ʈ��� ��ü�� �ּҰ����� �Ѿ�� obj�� �����ְ� ���� �ٽ� ����ϸ� ���ǰ��� ������� Ȯ���Ҽ��ִ�.
		// list : [�����(100��), �����(60��), ������(90��), ����ȣ(85��), ���̹�(66��)]

//���� ��� 1. collections Ŭ���� �̿�
		// �÷����� �̿��Ҷ� �̿��ϱ� ���� �޼ҵ���� ��Ƴ�����.  (����� �Ҷ� ���߾���)
		Collections.sort(list); // ���ı����� ��� �����Ҽ��� ����. // ������ ���� ��Ʈ��~ ����ص� ���������� �ʴ´�.
		System.out.println("�̸� �������� : "+list);		
		//list : [������(90��), �����(60��), �����(100��), ���̹�(66��), ����ȣ(85��)] ���ĵ� ����� �����ִ�.
				
		//�Ѵ� �������̽��̴�.comparable, comparator�� ���ı����� �����ֵ����Ұ��̴�.
		//comparable�� �ڹ�.�� ��Ű�� �̱⶧���� ����Ʈ�� �ʿ����.(��ü���� ���� �ʿ����) **�Ѱ��� (���ظ�) ���ĸ� �����ϴ�.
		//comparator �� �� ��Ű���� �ƴϾ ��ü���� ���� �ʿ��ϰ�, �������� ������ �����ϴ�.
		
		//������ ���� �ֵ��� �������̽��� ��ӹ������̴�.
		
		//����
//		ArrayList<String> strList = new ArrayList<String>();
//		strList.add("����ð�");
//		strList.add("���ɽð�");
//		strList.add("��ٽð�");
//		strList.add("���ð�");
//		strList.add("���ɽð�");
//		strList.add("��ٽð�");
//		strList.add("��ħ�ð�");
//		
//		System.out.println(strList); // ��Ʈ���� ���ı����� �־ �÷����� ���� ���ָ� �ڵ����� ������ �Ǿ���.
//		Collections.sort(strList);
//		System.out.println(strList);
//		
		/*
		[����ð�, ���ɽð�, ��ٽð�, ���ð�, ���ɽð�, ��ٽð�, ��ħ�ð�]
		[���ð�, ����ð�, ���ɽð�, ���ɽð�, ��ٽð�, ��ħ�ð�, ��ٽð�]*/
		
		// �ǽ����� ���׸� ����ϸ鼭 Ǯ��. �÷����� ������ �� Ǯ��

//���� ��� 2. List.sort()�޼ҵ� �̿�
		list.add(new Student("�ں���", 85));
		list.sort(new StudentComparator()); // Ŭ���� ������ش�
		System.out.println("���� �������� : "+list);		
		//���� �������� : [�����(60��), ���̹�(66��), ����ȣ(85��), �ں���(85��), ������(90��), �����(100��)]
		 
		//����ȣ(85��), �ں���(85��) : �ں��谡 ���� ������ �ϰ�ʹٸ�?
		
		//���� �ٸ� �޼ҵ� ����~~~~
		//set(int index, E e) : index���� �ε����� �ִ� ��Ҹ� e�� ����
		list.set(2, new Student("�����", 31));
		System.out.println("list : "+ list); 
		//�ں��谡 ��������� ����
		
		//get(int index) : index��° �ε����� �ִ� ��Ҹ� ������ ��
		Student s =list.get(2);//���׸������� ��Ʃ��Ʈ�� ��ȯ����.
		System.out.println(s);
		System.out.println("list : "+list);
		
		//subList(int index1, int index2) : index1��° �ε������� index2��° �ε������� ����Ʈ��ȯ
		System.out.println("list ���� : "+list.subList(2,5));
		//list ���� : [�����(31��), ����ȣ(85��), ������(90��)]
		
		//contains(Object o) : o�� ����Ʈ�� �����Ѵٸ� true ��ȯ
		//indexOf(Object o) : o�� ����Ʈ�� ��ġ�ϴ� �ε��� ��ȣ ��ȯ, ���ٸ� -1��ȯ
		System.out.println("������, 90�� �ִ°�? : "+list.contains(new Student("������", 90)));
		System.out.println("������, 90�� �ε��� ��ġ��? : "+list.indexOf(new Student("������", 90)));
		System.out.println("�׽�Ʈ, 0�� �ε��� ��ġ��? : "+list.indexOf(new Student("�׽�Ʈ", 0)));
		//������, 90�� �ִ°�? : true
		//������, 90�� �ε��� ��ġ��? : 4
		//�׽�Ʈ, 0�� �ε��� ��ġ��? : -1  //�ε��� ���길 ���� ����Ѵ�. -1 �� �ƴϸ�~ �̷�������... ��������...
		
		//clear() : ����� ��� ��ü�� ����
		// isEmpty : ����Ʈ�� ������� true ��ȯ

		list.clear();
		System.out.println("list : "+list);
		System.out.println("list �� �������? : "+list.isEmpty());
		//list : []
		//list �� �������? : true
		
		
		//����Ʈ ���� ���� ����  ���ϰ� ���߿� �㸹�̾���.  �޼ҵ� Ȱ����� ����.
	}

}
