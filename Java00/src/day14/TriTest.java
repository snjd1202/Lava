package day14;

import javax.swing.JOptionPane;
/*
		���� 2]
	�ﰢ�� Ŭ������ �ۼ��ϰ�
	
	�ﰢ�� Ŭ������ �غ��� ���̸� �Է��ؼ� ��ü�� ���鵵�� �ۼ��ϰ�
	���� 
		�غ��� ������ ���� �ﰢ���� �ǵ��� 
	equals �Լ�, toString()�� �������̵� �ϰ�,
	�׽�Ʈ �ϼ���.
	
	�Է��� JOptionPane �Ҽ��� �Լ��� ó���ϰ�
	��µ� ���� �Ҽ��� �Լ��� ó���ϼ���.
	�߰��� ����ó���� ���ּ���.
*/
public class TriTest {

	int width, width2;
	int height, height2;
	public TriTest() {
		String no1 = JOptionPane.showInputDialog("�غ��� ���̸� ��������.");
		String no2 = JOptionPane.showInputDialog("������ ���̸� ��������.");
		String no3 = JOptionPane.showInputDialog("�غ��� ���̸� ��������.");
		String no4 = JOptionPane.showInputDialog("������ ���̸� ��������.");
		try {
			width = Integer.parseInt(no1);
			height = Integer.parseInt(no2);
			width2 = Integer.parseInt(no3);
			height2 = Integer.parseInt(no4);
			
			Tri t1 = new Tri(width, height);
			Tri t2 = new Tri(width2, height2);
			
			String semo = (t1.equals(t2))?("���� �ﰢ���Դϴ�."): ("�ٸ� �ﰢ���Դϴ�.");
			JOptionPane.showMessageDialog(null,"*** 1�� �ﰢ�� ***\n\t" + t1.toString());
			JOptionPane.showMessageDialog(null,"*** 2�� �ﰢ�� ***\n\t" + t2.toString());
			JOptionPane.showMessageDialog(null,"1���� 2�� �ﰢ���� " + ((t1.equals(t2))?("���� �ﰢ���Դϴ�."): ("�ٸ� �ﰢ���Դϴ�.")));
			
		} catch (Exception e){
			
			e.printStackTrace();
		}
		
		
		
		
	}
	public static void main(String[] args) {
		new TriTest();
	}

}
