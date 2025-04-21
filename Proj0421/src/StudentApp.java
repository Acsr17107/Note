import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;

public class StudentApp extends JFrame {
    ArrayList<Student> studentList = new ArrayList<Student>();

    // ������
    public StudentApp() {
        this.setTitle("�л����� �ý���");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setLayout(new GridLayout(6, 2));

        JTextField inName = new JTextField("");
        JTextField inHb = new JTextField("");
        JTextField inDept = new JTextField("");
        JTextField inGwa = new JTextField("");

        JButton btnIn = new JButton("�Է�");
        JButton btnCancel = new JButton("���");
        JButton btnSave = new JButton("��ȸ �� ��������");
        JButton btnSearch = new JButton("�̸����� �˻�");

        this.add(new JLabel("�̸�"));
        this.add(inName);
        this.add(new JLabel("�й�"));
        this.add(inHb);
        this.add(new JLabel("�а�"));
        this.add(inDept);
        this.add(new JLabel("����"));
        this.add(inGwa);
        this.add(btnIn);
        this.add(btnCancel);
        this.add(btnSave);
        this.add(btnSearch);

        // �Է� ��ư
        btnIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strName = inName.getText();
                String strHb = inHb.getText();
                String strDept = inDept.getText();
                String strGwa = inGwa.getText();
                // ���ο� Student ��ü ���� ��, studentList�� �߰�
                Student newStudent = new Student(strName, strHb, strDept, strGwa);
                studentList.add(newStudent);
                System.out.println(strName + " �Է� �Ϸ�");
            }
        });

        // ��� ��ư
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inName.setText("");
                inHb.setText("");
                inDept.setText("");
                inGwa.setText("");
            }
        });

        // ��ȸ �� ���� ��ư
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter fout = new FileWriter("c:\\�����й�.txt");
                    for (Student student : studentList) {
                        fout.write(student.getName() + "," + student.getHb() + "," + student.getDept() + "," + student.getGwamok() + "\n");
                        System.out.println(student);
                    }
                    System.out.println("���� ���� �Ϸ�");
                    fout.close();

                } catch (IOException e1) {
                    e1.printStackTrace();
                    System.out.println("���� ���� ����");
                }
            }
        });

        // �̸����� �˻� ��ư
        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchName = inName.getText().trim();
                boolean found = false;

                // studentList���� �̸����� �л� �˻�
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
                    JOptionPane.showMessageDialog(null, "�ش� �̸��� �л� ������ ã�� �� �����ϴ�.");
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
