package exam;

import javax.swing.JOptionPane;

/*
 	JOptionPane.showInput���� ���ڸ� �Է¹޾Ƽ�
 	�迭�� �����,
 	�迭�� ����� �� �ִ� ������ŭ ���ڸ� �Է¹޾Ƽ� 
 	�� ���ڵ��� ���� �����ִ� ���α׷��� �ۼ��ϼ���.
 	��, ���� ���ϴ� ����� �Լ��� ���� ó���ϼ���.
 */
public class Ex01 {
	
	// �迭 �����
	int[] arr;
	int sum = 0;
	public Ex01() {
		arrNum();
		getSum();
	}
	public void arrNum() {
		// �迭���� ���ڸ� �Է¹���
		String str = JOptionPane.showInputDialog("���ڸ� �Է��ϼ���.");
		int num = Integer.parseInt(str);
		int[] arr = new int[num];
		
		
		// �迭�� ���� �ֱ�
		for(int i = 0; i < arr.length; i++) {
			String str2 = JOptionPane.showInputDialog("�迭�� ���� ���ڸ� �Է��ϼ���.");
			int num2 = Integer.parseInt(str2);
			arr[i] = num2;
			
		}
		int addnum = getSum(arr);
		JOptionPane.showMessageDialog(null, addnum);
	}
	
	public int getSum(int...arr) {
		// ���ڵ��� ��
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			int no = arr[i];
			sum += no;			
		}
		
		return sum;	
	}

	public static void main(String[] args) {	
		new Ex01();
	}

}
