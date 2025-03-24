package pro0324;

abstract class Animal {
	//1. �Ӽ�
	protected String name;
	
	//2. ������
	Animal() {}
	Animal(String name) {
		this.name = name;
	}
	
	//3. �޼ҵ�
	//abstract
	abstract void move();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}



public class Eagle extends Animal {
	//1. �Ӽ�
	private String home;
	
	//2. ������
	Eagle() {}
	Eagle(String name, String home) {
		super(name);
		this.home = home;
	}
	
	//3. �޼ҵ�
	@Override
	void move() {
		System.out.println("������ ���ư���.");	
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
}


class Tiger extends Animal {
	//1. �Ӽ�
	private int age;
	
	//2. ������
	Tiger() {}
	Tiger(String name, int age) {
		super(name);
		this.age = age;
	}
	
	//3. �޼ҵ�
	@Override
	void move() {
		System.out.println("�� �߷� �̵��Ѵ�.");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

