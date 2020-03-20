package day09;

/*
 	1���� �迭�� 'A' ~ 'E' ���� �ʱ�ȭ ���ִ� �Լ��� �����ؼ�
 	�������� ch�� �ʱ�ȭ�� ���ְ�
 	�빮�ڸ� �Է��ϸ� �ҹ��ڷ� ��ȯ���ִ� �Լ��� ���� 
 	ch�� ���ڸ� �ҹ��ڷ� ��� �����ϼ���.
 	
 	��ȭ�н�]
 		���ڹ迭�� �Է��ϸ� 
 		���ڹ迭�� 'A' ~ 'E' �ʱ�ȭ���ִ� ����� ���� �Լ��� �ۼ��ϰ�,
 		�����ؼ� ����ϼ���.
 */
import javax.swing.*;
import java.util.*;

public class Test03 {
	char[] ch;
	
	public Test03() {
		setCh();
		str(ch);

		for(char c: ch) {
			System.out.printf("%2c | ", c);
		}
		System.out.println();
		
		// �迭�� ��� ������ �ҹ��ڷ� ����������.
		for(int i = 0; i < ch.length; i++) {
			char d = ch[i];
			char e = toSo(d);
			ch[i] = e;
		}
		//�� ��
		for(char c: ch) {
			System.out.printf("%2c | ", c);
		}
	}
	// ���ڹ迭 �ʱ�ȭ ��Ű�� ����� �Լ�
	public void setCh() {
		ch = new char[5];
		for(int i = 0; i < 5; i++) {
			ch[i] = (char)('A' + i);
		}
	}
	// �빮�ڸ� �ҹ��ڷ� ��ȯ���ִ� �Լ�
	public char toSo(char d) {
		char result = (char)(d +('a'-'A'));
		return result;
	}
	// ���ڹ迭 �Է¹޴� �Լ�
	public void str(char[] c) {
		c = new char[5];
		for(int i = 0; i < 5; i++) {
			c[i] = (char)('A' + i);
			System.out.printf("%3s",c[i]);
		}
		}
		
		
	
	public static void main(String[] args) {
		new Test03();
	}

}
