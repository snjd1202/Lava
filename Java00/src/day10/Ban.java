package day10;

/*
 	 ���� 1]

	���� ������, �ѷ�, ���̸� ������ Ŭ������ �����,
	�� Ŭ���� ��ü 10���� �迭�� ������ �迭�� ���� 
	�� ����� �ʱ�ȭ�ϰ� 
	����ϼ���.
	 
 */
public class Ban {

	int ban;
	double dool;
	double nul;
	
	public void setVal(int no) {
		ban = no;
		
		// ����
		nul = ban * ban * 3.14;
		
		// �ѷ�
		dool = ban * 2 * 3.14;
	}
	
	//���
	public void toPrint() {
		System.out.println("������ : "+ ban + " ���� : " +  nul + " �ѷ� : " + dool+"\n--------------------------------");
	}
	

}
