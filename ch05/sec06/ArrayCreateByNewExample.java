package ch05.sec06;

public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		//�迭 ���� ����� �迭 ����
		int[] arr1 = new int[3];
		//�迭 �׸��� �ʱⰪ ���
		for(int i=0; i<3; i++) {
			System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
		}
		System.out.println();
		//�迭 �׸��� �� ����
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		//�迭 �׸��� ���� �� ���
		for(int i=0; i<3; i++) {
			System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
		}
		System.out.println("\n");
		
		//�迭 ���� ����� �迭 ����
		double[] arr2 = new double[3];
		//�迭 �׸��� �ʱⰪ ���
		for(int i=0; i<3; i++) {
			System.out.print("arr2[" + i + "] : " + arr2[i] + ", ");
		}
		System.out.println();
		//�迭 �׸��� �� ����
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		//�迭 �׸��� ���� �� ���
		for(int i=0; i<3; i++) {
			System.out.print("arr2[" + i + "] : " + arr2[i] + ", ");
		}
		System.out.println("\n");
		
		//�迭 ���� ����� �迭 ����
		String[] arr3 = new String[3];
		//�迭 �׸��� �ʱⰪ ���
		for(int i=0; i<3; i++) {
			System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");
		}
		System.out.println();
		//�迭 �׸��� �� ����
		arr3[0] = "1��";
		arr3[1] = "2��";
		arr3[2] = "3��";
		//�迭 �׸��� ���� �� ���
		for(int i=0; i<3; i++) {
			System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");
		}
	}
}