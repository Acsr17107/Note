package proj0331;

import java.io.*;
import java.util.*;

public class FileWriterEx {
	
	public static void main(String[] args) {
		
		// �ܼ�â�� �Է��� ���� ������ ���� ��ο� ����.
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		
		try {
			fout = new FileWriter("C:\\Users\\313\\Test\\Text_1.txt");
			
			while(true) {	// (�ݺ���) ���� �Է¹޾� ����
				String line = scanner.nextLine();
				if(line.length() == 0)
					break;
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("����� ����");
		}
		scanner.close();
	}
}
