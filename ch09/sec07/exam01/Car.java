package ch09.sec07.exam01;

public class Car {
	//�ʵ忡 Tire ��ü ����
	private Tire tire1 = new Tire();
	
	//�ʵ忡 �͸� �ڽ� ��ü ����
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("�ͺ� �ڽ� Tire ��ü 1�� �������ϴ�.");
		}
	};
	
	//�޼ҵ�(�ʵ� �̿�)
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	//�޼ҵ�(���� ���� �̿�)
	public void run2() {
		//���� ������ �͸� �ڽ� ��ü ����
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("�͸� �ڽ� Tire ��ü 2�� �������ϴ�.");
			}
		};
		tire.roll();
	}
	
	//�޼ҵ�(�Ű����� �̿�)
	public void run3(Tire tire) {
		tire.roll();
	}
}