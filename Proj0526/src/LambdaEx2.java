
interface MyFunction2 { 	// �Լ��� �������̽�
	int calc2(int x); 		// ���ٽ����� ������ �߻� �޼ҵ�
}

public class LambdaEx2 {
	public static void main(String[] args) {
		MyFunction2 square = x -> x * x;
		System.out.println(square.calc2(2));
		
	}
}
