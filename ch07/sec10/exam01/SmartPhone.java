package ch07.sec10.exam01;

public class SmartPhone extends Phone {
	//������ ����
	SmartPhone(String owner) {
		//Phone ������ ȣ��
		super(owner);
	}
	
	//�޼ҵ� ����
	void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
}