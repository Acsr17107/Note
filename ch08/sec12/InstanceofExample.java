package ch08.sec12;

public class InstanceofExample {
	public static void main(String[] args) {
		//���� ��ü ����
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		//ride() �޼ҵ� ȣ�� �� ���� ��ü�� �Ű������� ����
		ride(taxi);
		System.out.println();
		ride(bus);
	}
	
	//�������̽� �Ű������� ���� �޼ҵ�
	public static void ride(Vehicle vehicle) {
		//���1
		/*if(vehicle instanceof Bus) {
		  Bus bus = (Bus) vehicle;
		  bus.checkFare();
		}*/
		
		//���2
		if(vehicle instanceof Bus bus) {
			bus.checkFare();
		}
		
		vehicle.run();
	}
}