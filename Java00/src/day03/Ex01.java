package day03;

import java.util.*;
public class Ex01 {
	/*
	 	1 ~ 100������ ���� �� ���� �����ϰ� ���� 
	 	�� ���� ū ������ ���ʷ� ��µǰ� �ϼ���.
	 	�� ������ 4���� �ѱ��� ������. 
	 */

	public Ex01() {
		abc();
	}
	
	public void abc() {
		
			// �� ������ �����ϰ� �����.
			int max = (int)(Math.random()*(100 - 1 + 1) + 1);
			int mid = (int)(Math.random()*(100 - 1 + 1) + 1);
			int min = (int)(Math.random()*(100 - 1 + 1) + 1);
			// �ӽú����� �����.
			int tmp = 0;
			
			// ���ؼ� ó���Ѵ�.
			if(max >= mid) {
				// max > mid
				if(mid >= min) { // max > mid > min
					// ���� ����
				} else { // min > mid
					// max�� min �� ��Һ񱳰� �ƴϵ� ����
					if(max >= min) { // max > min > mid
						tmp = mid;
						mid = min;
						min = tmp;
					} else { // min > max > mid
						tmp = max;
						max = min;
						min = tmp;
						
						tmp = mid;
						mid = min;
						min = tmp;
					}
				}
			} else {
				// mid > max
				
				if(mid >= min) { // mid > max & min
					if(max > min) { // mid > max >min
						tmp = max;
						max = mid;
						mid = tmp;
					} else { // mid > min > max
						tmp = max;
						max = mid;
						mid = tmp;
						
						tmp = mid;
						mid = min;
						min = tmp;
					}
				} else { // min > mid > max
					tmp = max;
					max = min;
					min = tmp;
				}
			}
			
			// ����Ѵ�.
			System.out.print("max : " + max + " | ");
			System.out.print("mid : " + mid + " | ");
			System.out.print("min : " + min + " ");
			System.out.println((max >= mid)&&(mid >= min));
			
		}
		
	
	public static void main(String[] args) {
		new Ex01();

	}

}
