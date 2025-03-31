package proj0331;

import java.io.*;
import java.util.*;

public class UserMain {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> userList = new ArrayList<>(); // User ��ü ���� ����Ʈ
        String outputFile = "./UserOutput.txt";

        // ����� �Է� �ݺ�
        while (true) {
            System.out.print("�̸��� �Է��ϼ��� (�׸� �Է� �� ����): ");
            String name = scanner.nextLine();
            if (name.equals("�׸�")) {
                break; // �Է� ����
            }
            System.out.print("���̸� �Է��ϼ���: ");
            int age = scanner.nextInt();
            scanner.nextLine();  // ���� ���� ó��
            
            // User ��ü ���� �� ����Ʈ�� �߰�
            User user1 = new User(name, age);
            userList.add(user1);
        }
        
        // ���Ͽ� User ����Ʈ ����
        try (BufferedWriter bout = new BufferedWriter(new FileWriter(outputFile))) {
            for (User user : userList) {
                System.out.println(user.toString()); // �ܼ� ���
                bout.write(user.toString());
                bout.newLine(); // ���� ���� �߰�
            }
            System.out.println("�Է��� ������ " + outputFile + " ���Ͽ� ����Ǿ����ϴ�.");
        } catch (IOException e) {
            System.out.println("���� ���� �� ������ �߻��߽��ϴ�: " + e.getMessage());
            scanner.close(); // Scanner �ݱ�
        }
    }
}
