package ch07.sec11;

public sealed class Person permits Employee, Manager {
	//�ʵ�
	public String name;
	
	//�޼ҵ�
	public void work() {
		System.out.println("�ϴ� ���� �������� �ʾҽ��ϴ�.");
	}
}