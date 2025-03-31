package proj0331;

import java.io.*;
import java.util.*;

public class FileWriterEx {
	
	public static void main(String[] args) {
		
		// 콘솔창에 입력한 글을 지정한 파일 경로에 저장.
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		
		try {
			fout = new FileWriter("C:\\Users\\313\\Test\\Text_1.txt");
			
			while(true) {	// (반복문) 글자 입력받아 저장
				String line = scanner.nextLine();
				if(line.length() == 0)
					break;
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("입출력 오류");
		}
		scanner.close();
	}
}
