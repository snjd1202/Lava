package day12;
/**
 *  �� Ŭ������ ����� ������ ������ Ŭ�����̴�.
 * @author �����
 * @since 2020.03.24
 * @version v.1.0
 *
 */
public class People {
	// �� Ŭ������ �ּҷϿ� ����� ����� ������ ����� �뵵�� Ŭ�����̴�.
	// ���� ����� �������� ����� �������� ��������� �Ѵ�.
	String name, addr, tel, mail, birthday, gen, cop;
	
	// �� Ŭ������ ��ü�� �� ���� 
	// ��� ������ ��� �غ�Ǽ� �ԷµǸ� ���� ���� ���� ���� ���̴�.
	// �׷��� � ������ �⺻������ ������ �Ǿ���� ������ ������ ���̴�.
	
	// ������ �Լ� ����
	// �⺻������ �Լ�
	public People() {
		
	}
	
	// ȸ���̸��� �⺻���� ������ ���� ȸ���̸� �ȳ־ �ȴٸ�  cop ��
	public People(String name, String tel, String mail, String gen, String birthday, String addr) {
		this("Increpas", name, tel, mail, gen, birthday, addr);
	}
	
	public People(String cop, String name, String tel, String mail, String gen, String birthday, String addr) {
		this.cop = cop;
		this.name = name;
		this.tel = tel;
		this.mail = mail;
		this.gen = gen;
		this.birthday = birthday;
		this.addr = addr;
	}
	
}
