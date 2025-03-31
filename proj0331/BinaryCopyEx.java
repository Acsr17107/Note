package proj0331;

import java.io.*;

public class BinaryCopyEx {

	public static void main(String[] args) {
		// ���� 8-10 : ���̳ʸ� ���� ����
		
		File src = new File("C:\\Users\\313\\Hedgehuk.png");		// ���� ���� ���
		File dest = new File("C:\\Users\\313\\Test\\Test_1.png");	// ���� �� ���� ���
		int c;
		
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();		// ���� �� �ݱ�
			
			System.out.println(src.getPath()+ "�� " + dest.getPath()+ "�� �����Ͽ����ϴ�");	// ���� ����

		} catch (IOException e) {
			System.out.println("���� ���� ����");
		}
	}
}
