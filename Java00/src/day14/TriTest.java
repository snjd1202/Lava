package day14;

import javax.swing.JOptionPane;
/*
		문제 2]
	삼각형 클래스를 작성하고
	
	삼각형 클래스의 밑변과 높이를 입력해서 객체를 만들도록 작성하고
	만약 
		밑변이 같으면 같은 삼각형이 되도록 
	equals 함수, toString()를 오버라이드 하고,
	테스트 하세요.
	
	입력은 JOptionPane 소속의 함수로 처리하고
	출력도 같은 소속의 함수로 처리하세요.
	추가로 예외처리도 해주세요.
*/
public class TriTest {

	int width, width2;
	int height, height2;
	public TriTest() {
		String no1 = JOptionPane.showInputDialog("밑변의 길이를 넣으세요.");
		String no2 = JOptionPane.showInputDialog("높이의 길이를 넣으세요.");
		String no3 = JOptionPane.showInputDialog("밑변의 길이를 넣으세요.");
		String no4 = JOptionPane.showInputDialog("높이의 길이를 넣으세요.");
		try {
			width = Integer.parseInt(no1);
			height = Integer.parseInt(no2);
			width2 = Integer.parseInt(no3);
			height2 = Integer.parseInt(no4);
			
			Tri t1 = new Tri(width, height);
			Tri t2 = new Tri(width2, height2);
			
			String semo = (t1.equals(t2))?("같은 삼각형입니다."): ("다른 삼각형입니다.");
			JOptionPane.showMessageDialog(null,"*** 1번 삼각형 ***\n\t" + t1.toString());
			JOptionPane.showMessageDialog(null,"*** 2번 삼각형 ***\n\t" + t2.toString());
			JOptionPane.showMessageDialog(null,"1번과 2번 삼각형은 " + ((t1.equals(t2))?("같은 삼각형입니다."): ("다른 삼각형입니다.")));
			
		} catch (Exception e){
			
			e.printStackTrace();
		}
		
		
		
		
	}
	public static void main(String[] args) {
		new TriTest();
	}

}
