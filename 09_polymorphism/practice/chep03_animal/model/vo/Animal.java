package practice3.model.vo;

public abstract class Animal {
	private String name;
	private String kinds;
	
	protected Animal() {}
	protected Animal(String name, String kinds) {
		this.name=name;
		this.kinds=kinds;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getKinds() {
		return kinds;
	}
	public void setKinds(String kinds) {
		this.kinds=kinds;
	}
	
	@Override
	public String toString() {
		return "���� �̸���"+name+"�̰�, "+"������ " + kinds+"�Դϴ�.";
	}
	
	public abstract void speak();
}
