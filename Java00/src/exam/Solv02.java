package exam;

import java.util.*;

import javax.swing.JOptionPane;
public class Solv02 {

	public Solv02() {
		String str = "President Trump said Sunday that the federal government��s guidelines for social distancing would last until April 30, backing down from his previous comments that he hoped the country could go back to work by Easter.\r\n He had clashed with public health experts around the country when he suggested that the guidelines ? which urge people to stay at home and not to gather in groups of more than 10 - might be relaxed by April 12. His announcement on Sunday indicated that he had backed down from that suggestion.";
		/*
		 	����]
		 		���� ��κ��� ���� ���ڿ� ��ü�� �����ϴ� ����� ����.
		 		�����ϴ� �۾��� �ϴ� �Լ����� ���� ����� ��ȯ�ϴ� ��ɸ� ������ �ִ�.
		 */
		String tmp = str.replaceAll(",","").replaceAll("\\.","").replaceAll("\\?","").replaceAll("-","").replaceAll("\n","");
		
//		System.out.println(tmp);
		
		// ���� �ܾ ������ �������� ArrayList�� ����
		// StringTokenizer
		StringTokenizer token = new StringTokenizer(tmp);
		
		// ���� ������ �������� �߷��� ����� ���۸޸𸮿� ������ �Ǿ������Ƿ� �ϳ��� ������ ������
		// ����� ArrayList�� ����� ���������� �ʾƵ� ����� �����Ƿ� �״�� ����.
		
		// ArrayList�����
		ArrayList list = new ArrayList();
		
		//token���� �ϳ��� ������ ä������.
		while(token.hasMoreTokens()) { // ���� ���۸޸𸮿� ���� �����Ͱ� �����ִ�?
			list.add(token.nextToken());
		}
		
		// ����غ���
		for(Object obj : list) {
			System.out.println((String) obj);
		}
		
		// ���� ����Ʈ�� ����ִ� �ܾ���� ���̸� �̾Ƽ�
		// ���� �� �ܾ��� ���̿� �ܾ ����Ѵ�.
		
		// ���� ���� �� �ܾ��� ���̿� �ܾ ������ ������ �����
		int len = 0;
		String word="";
		for(int i = 0; i < list.size(); i++) {
			String daneo = (String)list.get(i);
			int gilee = ((String)list.get(i)).length();
			
			if(len < gilee) {
				len = gilee;
				word = daneo;
			}
		}
		
		// ���� ���� �� �ܾ��� ���̿� �ܾ ������ �Ǿ����� ���������.
		JOptionPane.showMessageDialog(null, "���� �� �ܾ��� ���� : " + len + "\n" + "���� �� �ܾ� : " + word);
	}

	public static void main(String[] args) {
		new Solv02();
	}

}
