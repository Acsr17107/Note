package ch08.sec11.exam02;

public class DriverExample {
	public static void main(String[] args) {
		//Driver ��ü ����
		Driver driver = new Driver();
		
		//Vehicle ���� ��ü ����
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//�Ű������� ���� ��ü ����(������: ���� ����� �ٸ�)
		driver.drive(bus);
		driver.drive(taxi);
	}
}