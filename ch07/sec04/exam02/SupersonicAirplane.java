package ch07.sec04.exam02;

public class SupersonicAirplane extends Airplane {
	//��� ����
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	//���� �ʵ� ����
	public int flyMode = NORMAL;
	
	//�޼ҵ� ������
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("������ �����մϴ�.");
		} else {
			//Airplane ��ü�� flt() �޼ҵ� ȣ��
			super.fly();
		}
	}
}