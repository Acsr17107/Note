package ch08.sec08;

public class MultiInterfaceImplExample {
	public static void main(String[] args) {
		//RemoteControl �������̽� ���� ���� �� ���� ��ü ����
		RemoteControl rc = new SmartTelevision();
		//RemoteControl �������̽��� ����� �߻� �޼ҵ常 ȣ�� ����
		rc.turnOn();
		rc.turnOff();
		//Searchable �������̽� ���� ���� �� ���� ��ü ����
		Searchable searchable = new SmartTelevision();
		//Searchable �������̽��� ����� �߻� �޼ҵ常 ȣ�� ����
		searchable.search("https://www.youtube.com");
	}
}