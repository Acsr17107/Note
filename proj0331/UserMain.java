package proj0331;

import java.io.*;
import java.util.*;

public class UserMain {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> userList = new ArrayList<>(); // User 객체 저장 리스트
        String outputFile = "./UserOutput.txt";

        // 사용자 입력 반복
        while (true) {
            System.out.print("이름을 입력하세요 (그만 입력 시 종료): ");
            String name = scanner.nextLine();
            if (name.equals("그만")) {
                break; // 입력 종료
            }
            System.out.print("나이를 입력하세요: ");
            int age = scanner.nextInt();
            scanner.nextLine();  // 개행 문자 처리
            
            // User 객체 생성 후 리스트에 추가
            User user1 = new User(name, age);
            userList.add(user1);
        }
        
        // 파일에 User 리스트 저장
        try (BufferedWriter bout = new BufferedWriter(new FileWriter(outputFile))) {
            for (User user : userList) {
                System.out.println(user.toString()); // 콘솔 출력
                bout.write(user.toString());
                bout.newLine(); // 개행 문자 추가
            }
            System.out.println("입력한 정보가 " + outputFile + " 파일에 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 저장 중 오류가 발생했습니다: " + e.getMessage());
            scanner.close(); // Scanner 닫기
        }
    }
}
