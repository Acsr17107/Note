package ch08.sec02;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		
		//rc ������ Television ��ü�� ����
		rc = new Television();
		rc.turnOn();
		
		//rc ������ Audio ��ü�� ����(��ü��Ŵ)
		rc = new Audio();
		rc.turnOn();
	}
}