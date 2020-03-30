package exam;

import javax.swing.JOptionPane;

/*
 	JOptionPane.showInput으로 숫자를 입력받아서
 	배열을 만들고,
 	배열이 기억할 수 있는 갯수만큼 숫자를 입력받아서 
 	그 숫자들의 합을 구해주는 프로그램을 작성하세요.
 	단, 합을 구하는 기능은 함수를 만들어서 처리하세요.
 */
public class Ex01 {
	
	// 배열 만들기
	int[] arr;
	int sum = 0;
	public Ex01() {
		arrNum();
		getSum();
	}
	public void arrNum() {
		// 배열갯수 숫자를 입력받을
		String str = JOptionPane.showInputDialog("숫자를 입력하세요.");
		int num = Integer.parseInt(str);
		int[] arr = new int[num];
		
		
		// 배열의 숫자 넣기
		for(int i = 0; i < arr.length; i++) {
			String str2 = JOptionPane.showInputDialog("배열에 넣을 숫자를 입력하세요.");
			int num2 = Integer.parseInt(str2);
			arr[i] = num2;
			
		}
		int addnum = getSum(arr);
		JOptionPane.showMessageDialog(null, addnum);
	}
	
	public int getSum(int...arr) {
		// 숫자들의 합
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
