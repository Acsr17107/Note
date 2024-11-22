package ch09.sec07.exam02;

public class Home {
	//�ʵ忡 �͸� ���� ��ü ����
	private RemoteControl rc = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
		}
	};
	
	//�޼ҵ�(�ʵ� �̸�)
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	//�޼ҵ�(���� ���� �̿�)
	public void use2() {
		//���� ������ �͸� ���� ��ü ����
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("�������� �մϴ�.");
			}
			@Override
			public void turnOff() {
				System.out.println("�������� ���ϴ�.");
			}
		};
		rc.turnOn();
		rc.turnOff();
	}
	
	//�޼ҵ�(�Ű����� �̿�)
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}	
}