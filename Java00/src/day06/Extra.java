package day06;
/*
	 	extra]
	 	1, 1,...
	 	�� �����ϴ� �Ǻ���ġ ������ 10�� ����ϼ���.
	 	
	 	����]
	 		�Ǻ���ġ ����:
	 			���� �� ���� ���� ������ ����...
	 			1,1,2,3,5,...
 */
public class Extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jak = 1;
		int kn = 1;
		System.out.print(jak + ", " + kn +", ");
		for(int i = 0; i < 8; i++) {
			int result = jak + kn;
			jak = kn;
			kn = result;
			System.out.print(kn + ", ");
			
		}
	}

}
