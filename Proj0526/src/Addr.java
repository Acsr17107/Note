import java.time.LocalDateTime;

public class Addr {
	//�ʵ�
	private String name;				//�̸�
	private String tel;					//��ȭ��ȣ
	private String com;					//ȸ���
	private LocalDateTime createDate;	//�Է½ð�
	
	//������ 2��
	Addr() {}

	public Addr(String name, String tel, String com, LocalDateTime createDate) {
		super();
		this.name = name;
		this.tel = tel;
		this.com = com;
		this.createDate = createDate;
	}
	
	//�޼ҵ� getter, setter, toString()
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCom() {
		return com;
	}

	public void setCom(String com) {
		this.com = com;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Addr [name=" + name + ", tel=" + tel + ", com=" + com + ", createDate=" + createDate + "]";
	}
}
