package day06;

/*
 	���� 3]
	int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
	�̶�� �迭�� �غ��ϰ�, 
	79456���� �غ�� ȭ������� ����� �� ������ ȭ������� �� ���� �ʿ�����
	������ ������ �迭�� �����, ����ϴ� ���α׷��� �ۼ��ϼ���.
 */
import java.util.*;
public class Ex03 {

	public static void main(String[] args) {
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
		int[] no = new int[8];
		int mn = 79456;
		
		for(int i = 0; i < 8; i++) {
			no[i] = mn / coin[i];
			mn = mn % coin[i];
				System.out.println(coin[i] +" : "+ no[i]);
			}

			
		}

	}
