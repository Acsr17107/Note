package proj0317;

public class Exam06 {
	static int var = 100;
	public static void main(String[] args) {
		int num1 = 100, num2 = 0;
		try {
			System.out.println(num1 / num2);
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("0으로 나누지 마세요.");
		}
	}
}