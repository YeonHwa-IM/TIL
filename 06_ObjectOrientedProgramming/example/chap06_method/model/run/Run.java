package com.kh.example.chap06_method.model.run;

import com.kh.example.chap06_method.model.vo.Trainee;

public class Run {
	public static void main(String[] args) {
		Trainee tt = new Trainee("�ڽſ�");// ����
		System.out.println(tt.inform());
		
		// ����ҰԿ�
		// ������ 20
		
		Trainee.setScore(20);
		System.out.println(tt.inform());
		
		double score = Trainee.getScore();
		System.out.println(score);
		
		// Ŭ���� G
		tt.setClassRoom('G');
		System.out.println(tt.inform());
		System.out.println(tt.getClassRoom());
		
	}

}
