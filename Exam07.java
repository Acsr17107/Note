package proj0317;

public class Exam07 {

	public static void main(String[] args) {
		Car myCar1 = new Car();
		System.out.println(myCar1.getColor() + ", " + myCar1.getSpeed());
		
		Car myCar2 = new Car("흰색", 0);
		Car myCar3 = new Car("은색", 20);
		Car iuCar  = new Car ("빨간색", 10);
		Car bkCar  = new Car ("파란색", 0);
		System.out.println(iuCar.getColor() + ", " + iuCar.getSpeed());
		
		iuCar.upSpeed(300);
		System.out.println(iuCar.getColor() + ", " + iuCar.getSpeed());
		
		System.out.println("생산된 차의 대수(정적 필드) = => " + Car.carCount);
		System.out.println("생산된 차의 대수(정적 메소드) = => " + Car.currentCarCount());
		System.out.println("차의 최고 제한 속도 = => " + Car.MAXSPEED);
		
		System.out.println("PI의 값 = => " + Math.PI);
		System.out.println("3의 5제곱 = => " + Math.pow(3, 5));
	}
}