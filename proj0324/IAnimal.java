package proj0324;

public interface IAnimal {
	void eat(); // abstract �޼ҵ�
}

//

class ICat implements IAnimal {
	@Override
	public void eat() {
		System.out.println("������ �����Ѵ�.");	
	}
}

//

class ITiger extends Animal implements IAnimal {
	@Override
	public void eat() {
		System.out.println("������� ��ƸԴ´�.");
	}

	@Override
	void move() {
		System.out.println("�� �߷� �̵��Ѵ�.");
	}
}