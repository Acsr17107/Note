package ch08.sec11.exam01;

public class Car {
	//�ʵ�
	Tire tire1 = new HankookTire();
	Tire tire2 = new HankookTire();
	
	//�޼ҵ�
	void run() {
		tire1.roll();
		tire2.roll();
	}
}