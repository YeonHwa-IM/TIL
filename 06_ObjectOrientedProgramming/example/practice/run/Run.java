package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee ee = new Employee();
		ee.setEmpNo(100);
		ee.setEmpName("ȫ�浿");
		ee.setDept("������");
		ee.setJob("����");
		ee.setAge(25);
		ee.setGender('��');
		ee.setSalary(2500000);
		ee.setBonusPoint(0.05);
		ee.setPhone("010-1234-5678");
		ee.setAddress("����� ������");
		
		System.out.println(ee.getEmpNo());
		System.out.println(ee.getempName());
		System.out.println(ee.getDept());
		System.out.println(ee.getJob());
		System.out.println(ee.getAge());
		System.out.println(ee.getGender());
		System.out.println(ee.getSalary());
		System.out.println(ee.getBonusPoint());
		System.out.println(ee.getPhone());
		System.out.println(ee.getAderess());
	}

}
