
interface MyFunction { 			// �Լ��� �������̽�
	int calc(int x, int y); 	// ���ٽ����� ������ �߻� �޼ҵ�
}

public class LambdaEx1 {
	public static void main(String[] args) {
		MyFunction add = (x, y) -> { return x + y; };	// ���ٽ�
		MyFunction minus = (x, y) -> x - y;	// ���ٽ�. {}�� return ����
		MyFunction gop = (x, y) -> x * y;
		MyFunction na = (x, y) -> x / y;
		MyFunction mod = (x, y) -> x % y;

		System.out.println(add.calc(1, 2));		// �� ���ϱ�
		System.out.println(minus.calc(1, 2)); 	// �� ���ϱ�
		System.out.println(gop.calc(1, 2));		// �� ���ϱ�
		System.out.println(na.calc(1, 2));		// �� ���ϱ�
		System.out.println(mod.calc(1, 2));		// ������ ���ϱ�
		
	}
}
