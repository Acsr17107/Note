package ch07.sec08.exam02;

public class DriverExample {
	public static void main(String[] args) {
		//Driver ��ü ����
		Driver driver = new Driver();
		
		//�Ű������� Bus ��ü�� �����ϰ� driver() �޼ҵ� ȣ��
		Bus bus = new Bus();
		driver.drive(bus);
		
		//�Ű������� Bus ��ü�� �����ϰ� driver() �޼ҵ� ȣ��
		Taxi taxi = new Taxi();
		driver.drive(taxi);
	}
}