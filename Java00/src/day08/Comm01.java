package day08;

/*
 	comm 1]
	"Pengsoo good!"
	�̶�� ���ڿ��� �� ���ھ�������
	�迭�� �����ϰ�
	�ϳ��� ������ ����ϼ���.

 */
import java.util.*;
import javax.swing.*;
public class Comm01 {

	public static void main(String[] args) {
		String str = "Pengsoo good!";
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);	
		}
		System.out.println(Arrays.toString(arr));

	}

}
