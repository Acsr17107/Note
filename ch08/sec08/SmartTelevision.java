package ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable {
	//turnOn() �߻� �޼ҵ� �������̵�
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	//turnoff() �߻� �޼ҵ� �������̵�
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	
	//search() �߻� �޼ҵ� �������̵�
	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}
}