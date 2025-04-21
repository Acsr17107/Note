import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;

public class StudentApp extends JFrame {
    ArrayList<Student> studentList = new ArrayList<Student>();

    // 생성자
    public StudentApp() {
        this.setTitle("학생관리 시스템");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setLayout(new GridLayout(6, 2));

        JTextField inName = new JTextField("");
        JTextField inHb = new JTextField("");
        JTextField inDept = new JTextField("");
        JTextField inGwa = new JTextField("");

        JButton btnIn = new JButton("입력");
        JButton btnCancel = new JButton("취소");
        JButton btnSave = new JButton("조회 및 파일저장");
        JButton btnSearch = new JButton("이름으로 검색");

        this.add(new JLabel("이름"));
        this.add(inName);
        this.add(new JLabel("학번"));
        this.add(inHb);
        this.add(new JLabel("학과"));
        this.add(inDept);
        this.add(new JLabel("과목"));
        this.add(inGwa);
        this.add(btnIn);
        this.add(btnCancel);
        this.add(btnSave);
        this.add(btnSearch);

        // 입력 버튼
        btnIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strName = inName.getText();
                String strHb = inHb.getText();
                String strDept = inDept.getText();
                String strGwa = inGwa.getText();
                // 새로운 Student 객체 생성 후, studentList에 추가
                Student newStudent = new Student(strName, strHb, strDept, strGwa);
                studentList.add(newStudent);
                System.out.println(strName + " 입력 완료");
            }
        });

        // 취소 버튼
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inName.setText("");
                inHb.setText("");
                inDept.setText("");
                inGwa.setText("");
            }
        });

        // 조회 및 저장 버튼
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter fout = new FileWriter("c:\\본인학번.txt");
                    for (Student student : studentList) {
                        fout.write(student.getName() + "," + student.getHb() + "," + student.getDept() + "," + student.getGwamok() + "\n");
                        System.out.println(student);
                    }
                    System.out.println("파일 저장 완료");
                    fout.close();

                } catch (IOException e1) {
                    e1.printStackTrace();
                    System.out.println("파일 저장 에러");
                }
            }
        });

        // 이름으로 검색 버튼
        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchName = inName.getText().trim();
                boolean found = false;

                // studentList에서 이름으로 학생 검색
                for (Student student : studentList) {
                    if (student.getName().equals(searchName)) {
                        inHb.setText(student.getHb());
                        inDept.setText(student.getDept());
                        inGwa.setText(student.getGwamok());
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    JOptionPane.showMessageDialog(null, "해당 이름의 학생 정보를 찾을 수 없습니다.");
                }
            }
        });

        this.setSize(400, 300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new StudentApp();
    }
}
