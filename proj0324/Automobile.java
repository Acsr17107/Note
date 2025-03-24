package proj0324;

public class Automobile extends Car {
	//1.�Ӽ�
	private int seatNum;
	
	//2.������
	Automobile() {} //2-1 �⺻������
	Automobile(String color, int seatNum, int speed) { //2-2 �ʱⰪ ����� ������
		super(color, speed);
		this.seatNum = seatNum;
	}
	
	//3.����, �޼ҵ�
	//Automobile �ӵ��ø���
	void upSpeed(int value) {
		speed = speed + value;
		if (speed > 300)
			speed = 300;
	}
	public int getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
}
