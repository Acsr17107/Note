package proj0324;

public class Automobile extends Car {
	//1.속성
	private int seatNum;
	
	//2.생성자
	Automobile() {} //2-1 기본생성자
	Automobile(String color, int seatNum, int speed) { //2-2 초기값 만드는 생성자
		super(color, speed);
		this.seatNum = seatNum;
	}
	
	//3.할일, 메소드
	//Automobile 속도올리기
	void upSpeed(int value) {
		speed = speed + value;
		if (speed > 300)
			speed = 300;
	}
	public int getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
}
