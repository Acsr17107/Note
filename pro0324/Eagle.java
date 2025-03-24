package pro0324;

abstract class Animal {
	//1. 속성
	protected String name;
	
	//2. 생성자
	Animal() {}
	Animal(String name) {
		this.name = name;
	}
	
	//3. 메소드
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
	//1. 속성
	private String home;
	
	//2. 생성자
	Eagle() {}
	Eagle(String name, String home) {
		super(name);
		this.home = home;
	}
	
	//3. 메소드
	@Override
	void move() {
		System.out.println("날개로 날아간다.");	
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
}


class Tiger extends Animal {
	//1. 속성
	private int age;
	
	//2. 생성자
	Tiger() {}
	Tiger(String name, int age) {
		super(name);
		this.age = age;
	}
	
	//3. 메소드
	@Override
	void move() {
		System.out.println("네 발로 이동한다.");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

