package ch06.sec07.exam05;

public class Car {
	public static void main(String[] args) {
		//�ʵ� ����
		String company = "�����ڵ���";
		String model;
		String color;
		int maxSpeed;
		
		Car(String model) {
			//20���� ������ ȣ��
			this(model, "����", 250);
		}
		
		Car(String model, String color) {
			//20���� ������ ȣ��
			this(model, color, 250);
		}
		
		Car(String model, String color, int maxSpeed) {
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
	}
}