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
		return name + "("+ score+"점)";
	}
	
	// 이퀄즈와 해시코드 오버라이딩 해주기  // 이퀄즈와 해시코드가 같아야하는 규약이 있어서 두개다 부합해야 같은 애다.
	@Override
	public int hashCode() {
		 final int prime = 31; // 소수 31을 만들어줬는데 이유는 컴퓨터가 인지했을때 계산하기 쉬우면서 적당히 크다. 
		 int result =1;
		 result = prime * result + ((name == null) ? 0 : name.hashCode()); // 이름이 0이면 ? 0을 , 아니면 해쉬코드를 내놔라.
		 result = prime * result + score;
		 return result;
	} // 해시코드 재정의하는법과 이퀄즈 재정의하는 방법은 다양하다.
	  //이클립스에서 제공하는 방법 사용하겠음. 다른 방법이 있다면 사용해도 가능하다.
	
	@Override
	public boolean equals(Object obj) {  // 스튜던트라는 객체와 주소값으로 넘어온 obj를 비교하겠다. 증명할껀데 같은지 아닌지를 비교해야한다.
		if(this == obj) {//디스는 나 자신을 뜻하는 레퍼런스로 이퀄스의 매개변수와 같은 애이다.
			return true; // 디스(스튜던트)가 obj랑 같은애냐? 맞다. // 이프값이 조건을 만나서 리턴을 반환하게되면 밑에있는 건 읽지않는다.
		}	
		if(obj == null) { //obj가 null이냐?응 널이야.  그러면 아니라고 넘겨 
			return false;
		}
		if(getClass() != obj.getClass()) { //getClass는  내 클래스에 대한 정보를 가진 메소드
			return false; // 내 정보와 obj의 정보는 다르다?하면 틀리다라고 함.
		} 
	
	// 필드와 비교하기(이름, 스코어)
		//(참조형) 이름과 비교 스트링으 클래스라서 널값을 먼저 비교한다.때문에 널하고도 비교한다.
		Student other = (Student)obj; //형변환 /부모는 자식을 받을수없으니까 확장하기 위해서 / 나는나고 스튜던트 객체는 다른데로 가겠다. 
		if(name == null) { //내 이름은 널일때  니가 가진 이름이 널이 아닐때 펄스.
			if(other.name != null) { 
				return false;
			}
		}else if(!name.equals(other.name)) { // 내가 가진 이름이 널이 아닌데,  내 이름과 네이름이랑 같지 않다? 펄스.
			return false;
		}
		//(기본 자료형의 경우) 스코어와 비교  
		if(score != other.score) {  
			return false;
		}
		return true; // 이경우가 다 걸리지 않으면 우리 똑같애.
	}

//	@Override // 임플리먼트 한이후에 ... 오버라이딩 해줌
//	public int compareTo(Object o) {
//		return 0;
//	}

	@Override // Comparable<Student> 해주고 한번더 오버라이딩해주면 ... 그리고 스튜던트에 대해서만 정렬기준을 세울거기때문에 위에꺼는 지워줌
	public int compareTo(Student o) {
		// 이름에 대해서 오름차순 정렬
		// 이름 ==> String  그렇다면 스트링에 대해서 오름차순 정렬하자.
		// => String에 대해 오름차순 정렬.  이라는건 이미 스트링클래스에는 정렬이 되어 있다. 그럼 스트링에 있는 컴페어투 쓰면 됨 ~!
		
		String otherName = o.getName();
		
		/* 이유설명
		 * 컴페어 투는 반환값이 : int 형이다.
		 * 비교주체가 비교대상과 같으면 0을 반환하고, 
		 * 비교주체가 비교대상보다 크면 1을 반환하고 
		 * 비교주체가 비교대상보다 작으면 -1을 반환 하게 되어 있다. 
		 * */
		
		return name.compareTo(otherName); 
	}	// 그럼 다시 컬렉션 숏으로 돌아가서 프린트 해보면 정렬된 모습을 볼수있다.
		// 내림차순 정렬을 하려면 -name 해주면된다.
		//return -name.compareTo(otherName); // 내림차순은 마이너스만 붙이면 된다.
	
	
	
}
