package ch08.sec11.exam01;

public class CarExample {
	public static void main(String[] args) {
		//�ڵ��� ��ü ����
		Car myCar = new Car();
		
		//run() �޼ҵ� ����
		myCar.run();
		
		//Ÿ�̾� ��ü ��ü
		myCar.tire1 = new KumhoTire();
		myCar.tire2 = new KumhoTire();
		
		//run() �޼ҵ� ����(������: ���� ����� �ٸ�)
		myCar.run();
	}
}