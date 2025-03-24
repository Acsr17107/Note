package proj0324;

public interface IAnimal {
	void eat(); // abstract 메소드
}

//

class ICat implements IAnimal {
	@Override
	public void eat() {
		System.out.println("생선을 좋아한다.");	
	}
}

//

class ITiger extends Animal implements IAnimal {
	@Override
	public void eat() {
		System.out.println("멧돼지를 잡아먹는다.");
	}

	@Override
	void move() {
		System.out.println("네 발로 이동한다.");
	}
}