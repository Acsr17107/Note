package ch09.sec07.exam02;

public class HomeExample {
	public static void main(String[] args) {
		//Home ��ü ����
		Home home = new Home();
		
		//�͸� ���� ��ü�� ���Ե� �ʵ� ���
		home.use1();
		
		//�͸� ���� ��ü�� ���Ե� ���� ���� ���		
		home.use2();
				
		//�͸� ���� ��ü�� ���Ե� �Ű����� ���
		home.use3(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("������ �մϴ�.");
			}
			@Override
			public void turnOff() {
				System.out.println("������ ���ϴ�.");
			}
		});
	}
}