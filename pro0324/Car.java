package pro0324;

public class Car {
	//1.속성, 변수
	protected String color;
	protected int speed;
	
	//2.생성자
	Car() {}
	Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	//3.할일, 메소드
	//Car 속도올리기
	void upSpeed(int value) {
		speed = speed + value;
		if (speed > 200)
			speed = 200;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
