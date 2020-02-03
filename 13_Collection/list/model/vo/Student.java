package com.kh.example.list.model.vo;

public class Student implements Comparable<Student> {
	// - name:String
	// - score:int
	
	//+ Student()
	//+ Student(name:String, score:int)
	
	//+getter/setter
	//+toString():String
	
	private String name;
	private int score;
	
	public Student() {}
	
	public Student(String name, int score) {
		this.name=name;
		this.score=score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getScore() {
		return score;
		}
	public void setScore(int score) {
		this.score=score;
	}
	
	@Override
	public String toString() {
		return name + "("+ score+"��)";
	}
	
	// ������� �ؽ��ڵ� �������̵� ���ֱ�  // ������� �ؽ��ڵ尡 ���ƾ��ϴ� �Ծ��� �־ �ΰ��� �����ؾ� ���� �ִ�.
	@Override
	public int hashCode() {
		 final int prime = 31; // �Ҽ� 31�� �������µ� ������ ��ǻ�Ͱ� ���������� ����ϱ� ����鼭 ������ ũ��. 
		 int result =1;
		 result = prime * result + ((name == null) ? 0 : name.hashCode()); // �̸��� 0�̸� ? 0�� , �ƴϸ� �ؽ��ڵ带 ������.
		 result = prime * result + score;
		 return result;
	} // �ؽ��ڵ� �������ϴ¹��� ������ �������ϴ� ����� �پ��ϴ�.
	  //��Ŭ�������� �����ϴ� ��� ����ϰ���. �ٸ� ����� �ִٸ� ����ص� �����ϴ�.
	
	@Override
	public boolean equals(Object obj) {  // ��Ʃ��Ʈ��� ��ü�� �ּҰ����� �Ѿ�� obj�� ���ϰڴ�. �����Ҳ��� ������ �ƴ����� ���ؾ��Ѵ�.
		if(this == obj) {//�𽺴� �� �ڽ��� ���ϴ� ���۷����� �������� �Ű������� ���� ���̴�.
			return true; // ��(��Ʃ��Ʈ)�� obj�� �����ֳ�? �´�. // �������� ������ ������ ������ ��ȯ�ϰԵǸ� �ؿ��ִ� �� �����ʴ´�.
		}	
		if(obj == null) { //obj�� null�̳�?�� ���̾�.  �׷��� �ƴ϶�� �Ѱ� 
			return false;
		}
		if(getClass() != obj.getClass()) { //getClass��  �� Ŭ������ ���� ������ ���� �޼ҵ�
			return false; // �� ������ obj�� ������ �ٸ���?�ϸ� Ʋ���ٶ�� ��.
		} 
	
	// �ʵ�� ���ϱ�(�̸�, ���ھ�)
		//(������) �̸��� �� ��Ʈ���� Ŭ������ �ΰ��� ���� ���Ѵ�.������ ���ϰ� ���Ѵ�.
		Student other = (Student)obj; //����ȯ /�θ�� �ڽ��� �����������ϱ� Ȯ���ϱ� ���ؼ� / ���³��� ��Ʃ��Ʈ ��ü�� �ٸ����� ���ڴ�. 
		if(name == null) { //�� �̸��� ���϶�  �ϰ� ���� �̸��� ���� �ƴҶ� �޽�.
			if(other.name != null) { 
				return false;
			}
		}else if(!name.equals(other.name)) { // ���� ���� �̸��� ���� �ƴѵ�,  �� �̸��� ���̸��̶� ���� �ʴ�? �޽�.
			return false;
		}
		//(�⺻ �ڷ����� ���) ���ھ�� ��  
		if(score != other.score) {  
			return false;
		}
		return true; // �̰�찡 �� �ɸ��� ������ �츮 �Ȱ���.
	}

//	@Override // ���ø���Ʈ �����Ŀ� ... �������̵� ����
//	public int compareTo(Object o) {
//		return 0;
//	}

	@Override // Comparable<Student> ���ְ� �ѹ��� �������̵����ָ� ... �׸��� ��Ʃ��Ʈ�� ���ؼ��� ���ı����� ����ű⶧���� �������� ������
	public int compareTo(Student o) {
		// �̸��� ���ؼ� �������� ����
		// �̸� ==> String  �׷��ٸ� ��Ʈ���� ���ؼ� �������� ��������.
		// => String�� ���� �������� ����.  �̶�°� �̹� ��Ʈ��Ŭ�������� ������ �Ǿ� �ִ�. �׷� ��Ʈ���� �ִ� ������� ���� �� ~!
		
		String otherName = o.getName();
		
		/* ��������
		 * ����� ���� ��ȯ���� : int ���̴�.
		 * ����ü�� �񱳴��� ������ 0�� ��ȯ�ϰ�, 
		 * ����ü�� �񱳴�󺸴� ũ�� 1�� ��ȯ�ϰ� 
		 * ����ü�� �񱳴�󺸴� ������ -1�� ��ȯ �ϰ� �Ǿ� �ִ�. 
		 * */
		
		return name.compareTo(otherName); 
	}	// �׷� �ٽ� �÷��� ������ ���ư��� ����Ʈ �غ��� ���ĵ� ����� �����ִ�.
		// �������� ������ �Ϸ��� -name ���ָ�ȴ�.
		//return -name.compareTo(otherName); // ���������� ���̳ʽ��� ���̸� �ȴ�.
	
	
	
}
