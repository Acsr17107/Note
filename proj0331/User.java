package proj0331;

public class User {
	// 1. �Ӽ�
	private String name;
    private int age;

    // 2. ������
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 3. �޼ҵ� source -> generate toString()
    @Override
    public String toString() {
        return "User [�̸� = " + name + ", ���� =" + age + "]";
    }
    
    // 3. �޼ҵ� source -> generate getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
