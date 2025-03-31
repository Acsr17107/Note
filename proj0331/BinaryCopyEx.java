package proj0331;

import java.io.*;

public class BinaryCopyEx {

	public static void main(String[] args) {
		// 예제 8-10 : 바이너리 파일 복사
		
		File src = new File("C:\\Users\\313\\Hedgehuk.png");		// 원본 파일 경로
		File dest = new File("C:\\Users\\313\\Test\\Test_1.png");	// 복사 할 파일 경로
		int c;
		
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();		// 끝난 후 닫기
			
			System.out.println(src.getPath()+ "를 " + dest.getPath()+ "로 복사하였습니다");	// 복사 성공

		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}
}
