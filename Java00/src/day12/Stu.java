package day12;

/*
 	학생의 이름, java, db, html, js, css, 총점, 평균
 	을 저장할 클래스를 만들고
 	5학생의 데이터를 입력해서 출력하세요.
 	단, 변수는 은닉화 시키세요.
 	
 */
public class Stu {
	private String name;
	private int java;
	private int db;
	private int html;
	private int js;
	private int css;
	private int total;
	private double avg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
	}
	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	public int getJs() {
		return js;
	}
	public void setJs(int js) {
		this.js = js;
	}
	public int getCss() {
		return css;
	}
	public void setCss(int css) {
		this.css = css;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public Stu() {
		
	}
	public Stu(String name) {
		this.name = name;
		setRandom();
		toPrint();
	}
	
	public void setRandom() {

				java = (int)(Math.random()*41 + 60);
				db = (int)(Math.random()*41 + 60);
				html = (int)(Math.random()*41 + 60);
				js = (int)(Math.random()*41 + 60);
				css = (int)(Math.random()*41 + 60);
				setTotal(java + db + html + js + css);
				setAvg(total / 5.);
				
			}
	
	public void toPrint() {
				
				System.out.println(java + " | " + db + " | " + html + " | " + js + " | " + css + " | " + getTotal() + " | " + getAvg());
	}
}
