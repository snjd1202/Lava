package day11;

/*
 	���� 2]
 		�� Ŭ������ �л� �� ���� 
 		�̸�, java, oracle, html, javascript,jsp, spring�� ������ ����� Ŭ�����̴�.
 		�� Ŭ������ ��ü�� �� �� �����͸� �Է� �޾Ƽ� �� ������ ����� �ǰ�
 		Ŭ������ �����ϼ���.
 		
 		��, �����Ͱ� �Է��� �ȵ� ���
 		�̸��� "�ڱ�ȣ"�� �ϰ�
 		������ �����ϰ� ���ǰ� �ϼ���. 
 */
public class Score {
	String name;
	int java, oracle, html, javascript, jsp, spring, total;
	double avg;
	
	public Score() {
		this("�ڱ�ȣ");
	}
	
	public Score(String name) {
//		this.name = name;
//		setJumsu();
//		setTotal();
//		setAvg();
//		this(name,(int)(Math.random() * (100-1+1)+1), (int)(Math.random() * (100-1+1)+1),
//				(int)(Math.random() * (100-1+1)+1), (int)(Math.random() * (100-1+1)+1),
//				(int)(Math.random() * (100-1+1)+1), (int)(Math.random() * (100-1+1)+1)
//				);
//		this(name, getJumsu(),getJumsu(),getJumsu(),getJumsu(),getJumsu(),getJumsu());
		/*
		 	getJumsu() �Լ��� �� Ŭ������ ����̰�
		 	�� �Լ��� ����� �� �ִ� ������
		 	�� Ŭ������ ��ü�� �� ���Ŀ� ��� �����ϴ�.
		 	
		 	���� �� �Լ��� ���ٸ� �Ӽ��� ���� �����ϰ� �Ǹ�
		 	���� �޸𸮿� �÷����� ���� ���°�
		 	������ �Լ����� ȣ���� �� ���� ���±� ������ ����� �� ����
		 	
		 	�� �Լ��� ���� ����ؾ߰ڴٸ���
		 	�� �Լ��� �̸� �޸𸮿� �÷��ָ� �� ���̴�.
		 	�̶� ����� �� �ִ� �Ӽ���
		 		"static"
		 	�Ӽ��̴�.
		 */
	}	
	public Score(String name, int java, int oracle, int html, int javascript, int jsp, int spring) {
		this.name = name;
		this.java = java;
		this.oracle = oracle;
		this.html = html;
		this.javascript = javascript;
		this.jsp = jsp;
		this.spring = spring;
		setJumsu();
		setTotal();
		setAvg();
	}	
	
	public void setJumsu() {
		java = (int)(Math.random() * (100-1+1)+1);
		oracle = (int)(Math.random() * (100-1+1)+1);
		html = (int)(Math.random() * (100-1+1)+1);
		javascript = (int)(Math.random() * (100-1+1)+1);
		jsp = (int)(Math.random() * (100-1+1)+1);
		spring = (int)(Math.random() * (100-1+1)+1);
		
	}
	
	public void setTotal() {
		this.total = java + oracle + html + javascript + jsp + spring;
	}
	
	public void setAvg() {
		this.avg = this.total / 6.;
	}
	
	public void toPrint() {
		
//		System.out.println(name +" | "+ java+" | "+ oracle+" | "+ html+" | "+ javascript+" | "+ jsp+" | "+ spring);
		System.out.printf("%4s : %1s | %1s | %1s | %1s | %1s | %1s |  %1s | %1s\n",name, java, oracle, html, javascript, jsp, spring, total, avg);
		System.out.println();
	}
	
}
