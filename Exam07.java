package proj0317;

public class Exam07 {

	public static void main(String[] args) {
		Car myCar1 = new Car();
		System.out.println(myCar1.getColor() + ", " + myCar1.getSpeed());
		
		Car myCar2 = new Car("���", 0);
		Car myCar3 = new Car("����", 20);
		Car iuCar  = new Car ("������", 10);
		Car bkCar  = new Car ("�Ķ���", 0);
		System.out.println(iuCar.getColor() + ", " + iuCar.getSpeed());
		
		iuCar.upSpeed(300);
		System.out.println(iuCar.getColor() + ", " + iuCar.getSpeed());
		
		System.out.println("����� ���� ���(���� �ʵ�) = => " + Car.carCount);
		System.out.println("����� ���� ���(���� �޼ҵ�) = => " + Car.currentCarCount());
		System.out.println("���� �ְ� ���� �ӵ� = => " + Car.MAXSPEED);
		
		System.out.println("PI�� �� = => " + Math.PI);
		System.out.println("3�� 5���� = => " + Math.pow(3, 5));
	}
}