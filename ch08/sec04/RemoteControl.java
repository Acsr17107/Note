package ch08.sec04;

public interface RemoteControl {
	//��� �ʵ�
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ�
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}