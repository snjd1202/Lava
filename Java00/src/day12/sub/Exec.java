package day12.sub;

/*
	Figure Ŭ������ �����ϰ�
	��ӹ޾Ƽ� �ﰢ��, �簢��, ���� Ŭ������ ������ ��
	
	1-3������ ������ �����ϰ� 10�� ���� 
	1�� ��� �ﰢ��
	2�� ��� �簢��
	3�� ��� ��
	�� �迭�� �ְ�
	����ϼ���.
*/
public class Exec {
	

	public Exec() {
		// Figure �迭 �����
		Figure[] f = new Figure[10];
		
		
		// ������ �����
		for(int i = 0; i < 10; i++) {
			int no = (int)(Math.random()*(3-1+1)+1);	// �ﰢ,�簢,�� �������� ���� �Լ�
			
			/*
			int no1 = (int)(Math.random()*(10-5+1)+5);	// width �� �����ϰ� ���� �Լ�
			int no2 = (int)(Math.random()*(10-5+1)+5);	// height �� �����ϰ� ���� �Լ�
			
			if(no == 1) {		
				f[i] = new Tri(no1,no2);	// ������ ������ Figure �迭�� �ﰢ����(width, height) �ֱ�
				
			} else if(no == 2) {
				f[i] = new Squa(no1,no2);	// �迭�� �簢���� �ֱ�
				
			} else {
				f[i] = new Cir(no1);		// �迭�� �������� �ֱ�
			}
			*/
			
			switch(no) {
			case 1:
				f[i] = new Tri(getArr());	// ������ ������ Figure �迭�� �ﰢ����(width, height) �ֱ�
				break;
			case 2:
				f[i] = new Squa(getArr());	// ������ ������ Figure �迭�� �ﰢ����(width, height) �ֱ�
				break;
			case 3:
				f[i] = new Cir(getArr());	// ������ ������ Figure �迭�� �ﰢ����(width, height) �ֱ�
				break;
			}
			
		}
		
	}
		
	public int[] getArr(){
		int[] arr = new int[2];
		for(int i=0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*20+1);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		new Exec();
	}

}
