package day11;

/*
 	문제 2]
 		이 클래스는 학생 한 명의 
 		이름, java, oracle, html, javascript,jsp, spring의 점수를 기억할 클래스이다.
 		이 클래스가 객체가 될 때 데이터를 입력 받아서 각 변수에 기억이 되게
 		클래스를 정의하세요.
 		
 		단, 데이터가 입력이 안될 경우
 		이름은 "박광호"로 하고
 		성적은 랜덤하게 기억되게 하세요. 
 */
public class Score {
	String name;
	int java, oracle, html, javascript, jsp, spring, total;
	double avg;
	
	public Score() {
		this("박광호");
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
		 	getJumsu() 함수는 이 클래스의 멤버이고
		 	이 함수를 사용할 수 있는 시점은
		 	이 클래스가 객체가 된 이후에 사용 가능하다.
		 	
		 	따라서 이 함수를 별다른 속성이 없이 정의하게 되면
		 	아직 메모리에 올려지지 않은 상태고
		 	생성자 함수에서 호출할 수 없는 상태기 때문에 사용할 수 없다
		 	
		 	이 함수를 굳이 사용해야겠다면은
		 	이 함수를 미리 메모리에 올려주면 될 것이다.
		 	이때 사용할 수 있는 속성이
		 		"static"
		 	속성이다.
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
