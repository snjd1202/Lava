package day10;

/*
	���� 3]

	�л��� �̸�, ����, ����, ����, ����, �ڵ� ������ ������ �����ϰ�,
	����, ����� ����ؼ� �Է��� Ŭ������ �����ϼ���.
	��, �Է�, �������, ��հ��, ����� �Լ��� ���� ó���ϼ���.
	�׸��� 5���� �л��� �迭�� ���� ��������, �̸��� �Է��ؼ�
	����ϼ���.
*/
public class Stu_01 {

	public static void main(String[] args) {
		String[] name = {
			"�ڱ�ȣ","�ڱ���","��ȫ��","��ҿ�","������"	
		};
		Stu[] ban = new Stu[5];
		for(int i = 0; i < ban.length; i++) {
			ban[i] = new Stu(name[i]);
		}
		
		// ����Ѵ�.
		// ��µ� �ݺ��ؼ� ����ϴ� ����� �Լ��� ȣ�����ָ� �ȴ�.
		for(int i = 0; i < ban.length; i++) {
			ban[i].toPrint();
		}
	}
}