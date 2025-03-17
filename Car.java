package proj0317;
//���赵
public class Car {
	//1.�Ӽ�, �ʵ�, ����
	private String color;	//����
	private int speed;	//�ӵ�
	
	
	//static ��ü 1���� ����� ��
	static int carCount;
	final static int MAXSPEED = 200;
	final static int MINSPEED = 0;
	
	static int currentCarCount() {
		return carCount;
	}
	
	
	//2.������
	Car() { }	//2-1. �⺻������
	Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
		carCount ++;
	}
	
	
	//3.����, ���, �޼ҵ�
	//�ӵ��ø���
	int upSpeed(int value) {
		speed = speed + value;
		if (speed > 200)
			speed = 200;
		return speed;
	}
	
	//�ӵ�������
	int downSpeed(int value) {
		speed = speed - value;
		if (speed < 0)
			speed = 0;
		return speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}