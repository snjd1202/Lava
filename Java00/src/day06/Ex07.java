package day06;

/*
 	���� 7]
	���ڿ��� �Է¹޾Ƽ� 
	���ڹ迭�� ���ڿ��� �̷�� ���ڸ� ���������� �����ϼ���.
	
	����]
		���ڿ��� Ư����ġ�� ���ڸ� �������ִ� �Լ�
		
		���ڿ�.charAt(��ġ��);
		
		���ڿ��� ���̸� ��ȯ���ִ� �Լ�
		
			���ڿ�.length(); 
		
		��ȯ���� ����
 */
import java.util.*;
public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���. : ");
		String str = sc.nextLine();
		
		char arr[] = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {

			arr[i] = str.charAt(i);

		}
		System.out.println(Arrays.toString(arr));
		

	}

}
