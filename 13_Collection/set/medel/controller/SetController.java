package com.kh.example.set.medel.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.kh.example.set.medel.compare.DogComparator;
import com.kh.example.set.medel.vo.Dog;

public class SetController {
	public void doset() {
		Set<Dog> set = new HashSet<Dog>(); // ������ ���� // �����.. ���׸� ���ؼ� ���. dog ���׸��ϰ� ����Ʈ�ϱ�
		
		set.add(new Dog("����", 4.0));
		set.add(new Dog("ȣ��", 4.5));
		set.add(new Dog("����", 8.0));
		System.out.println(set); // ���� ���� ����.
		
		set.add(new Dog("����", 4.0));
		System.out.println(set);//�������ڶ����� �ּҰ��� �ٸ��� ���ϱ� �ȿ� ���� ������ ���ü�� �ߺ������� �ȵǰԲ� ������ֱ� ���ؼ� �ؽ��ڵ�, ������ �������̵����� ����
		
		
		//���������� 1�� �𸣰���~~~~~~
//		Set<String> test = new HashSet<String>(); 
		//�̹� �������̵� �� �ؽ��ڵ�� ����� �ɷ��ְ��ִ�. ����? ����2��?
//		test.add("����1");
//		test.add("����2");
//		test.add("����3");
//		System.out.println(test);
//		test.add("����2");
//		System.out.println(test);
		
		//set�� list�� �����ϱ� �н��Ѵٰ� �Ͻ�.
		//list �𸣰ڴµ���....  �̤�
		//set���� �ε����� ���⶧���� ������ �迭�� ����� Ŭ������ ����.
		
		//��...Ȯ���ϴ� �����̶�µ� �𸣰���^^
		Set<Dog> set2 = new LinkedHashSet<Dog>();//���׸� ���ְ� , ����Ʈ
		set2.add(new Dog("����", 2.1));
		set2.add(new Dog("����", 8.3));
		set2.add(new Dog("�κ�", 5.0));
		set2.add(new Dog("����", 2.1));
		System.out.println(set2);
		//���ڴ� �ߺ� ���� �Ǿ���.
		//[����(2.1kg), ����(8.3kg), �κ�(5.0kg)] ���� �����Ǹ鼭 �ߺ����ŵǴ� ��ũ����Ư¡Ȯ��. 
		//��ũ�� Ư¡Ȯ���ϴ°ſ�����^^...
		
		set2.add(new Dog("����", 6.1));
		set2.add(new Dog("����", 5.2));
		set2.add(new Dog("����", 9.5));
		set2.add(new Dog("����", 12.5));
		System.out.println(set2);
		//[����(2.1kg), ����(8.3kg), �κ�(5.0kg), ����(6.1kg), ����(5.2kg), ����(9.5kg), ����(12.5kg)]
		// �̰� ���Ѱ���?^^.... �׳� �߰��Ѱ�???
		
		//Ʈ���� ����!
		Set<Dog> set3 = new TreeSet<Dog>(set2); // �� �������°� �������ϱ� set2 �Ű������� �־��ֱ�
		System.out.println(set3); 
		// �����ϸ� ������ �ȵǾ� �ִٴ� ������ ����. ���ı����� ���⶧���� ������ �߻�.
		//���۷��� Ȥ�� ���۷����� �� ���ı����� �����ְ���.
		//���� ����.. =>���ø���Ʈ, �������̵��ϰ�, ���׸��ϰ�, �ٽ� �������̵��ϰ� ���� �� �������� ��. 
		
		//[����(5.2kg), �κ�(5.0kg), ����(6.1kg), ����(9.5kg), ����(12.5kg), ����(2.1kg), ����(8.3kg)]
		
		Set<Dog> set4 = new TreeSet<Dog>(new DogComparator());
		set4.add(new Dog("����", 6.1));
		set4.add(new Dog("����", 8.3));
		set4.add(new Dog("�κ�", 5.0));
		set4.add(new Dog("����", 2.1));
		set4.add(new Dog("����", 6.1));
		set4.add(new Dog("����", 5.2));
		set4.add(new Dog("����", 9.5));
		set4.add(new Dog("����", 12.5));
		System.out.println(set4); // �̸� ������������ ������ �������� ���ο� ���ı����� ������.
		//���ο� ���ı����� ����� ���ؼ� ���÷����� ������ Ŭ������ �ϳ� ����������.
		
		// Set<Dog> set4 = new TreeSet<Dog>(new DogComparator()); �� ���� ���� �����ڸ� �־��ָ� .. 
		//[����(2.1kg), �κ�(5.0kg), ����(5.2kg), ����(6.1kg), ����(8.3kg), ����(9.5kg), ����(12.5kg)]
		// ���̰� ��������.���ı����� �����Էθ� �ϰڴٰ� �ؼ� , �������� ���ڸ� ���ְ�, ���̴� ���� �����Զ� ���� ��ü�� �Ǵ��Ͽ� �ڵ� �����Ǿ���.
		//������ �̸��̶� �����Ը� ���� ���ı��� ����ָ� �ȴ�... �̤� ��ƴٰ��....
		//���۷����� else if������ �̸����� ���ƾ� ������ü��°� �˷�����Ѵ�.
		//[����(2.1kg), �κ�(5.0kg), ����(5.2kg), ����(6.1kg), ����(6.1kg), ����(8.3kg), ����(9.5kg), ����(12.5kg)]
		
		
		//��� �̾Ƴ���
		// ��� 1. Set�� Listȭ ��Ű��  : addAll()
		List<Dog> list = new ArrayList<Dog>();// ��Ʈ�� ����� ���� Ÿ�������ϱ�.
		list.addAll(set4);
		System.out.println(list);
		System.out.println(list.get(3));
		//[����(2.1kg), �κ�(5.0kg), ����(5.2kg), ����(6.1kg), ����(6.1kg), ����(8.3kg), ����(9.5kg), ����(12.5kg)]
		//����(6.1kg)

		// ���2. Iterator Ȱ���ϱ� : iterator()
		
		Iterator<Dog> it = set4.iterator(); //���� Ÿ������, ��ƿ ����.
		while(it.hasNext()) {//�������� �ִ��� ���°�. 
			 System.out.println(it.next());//Ÿ���� ���׷� �����ؼ� ��ȯ���� ���׷� ���󰡼� ���ѵǾ��ִ�.
		}	 
		/*����(6.1kg)
		����(2.1kg)
		�κ�(5.0kg)
		����(5.2kg)
		����(6.1kg)
		����(6.1kg)
		����(8.3kg)
		����(9.5kg)
		����(12.5kg)*/
		while(it.hasNext()) {
			System.out.println("re : " + it.next());
		} // �ܹ����̶� �̹� ���� ���־ �о�ð� ����.
		  // ���� ����Ʈ�� ������ �ٲ㼭 ���ͷ����� �̿��ؼ� ���� �о���°� ��ƴ�.
		// ������ �� �����صξ�� �ʿ��� �ϴ� ���ͷ����� �κе� �� ���󰥼��ִ�.
		
	}

}
