package ch08.sec10.exam02;

public class CastingExample {
	public static void main(String[] args) {
		//�������̽� ���� ����� ���� ��ü ����
		Vehicle vehicle = new Bus();
		
		//�������̽��� ���ؼ� ȣ��
		vehicle.run();
		//vehicle,checkFare();   (x)
		
		//���� Ÿ�� ��ȯ �� ȣ��
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
	}
}