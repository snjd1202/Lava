package day12;

/*
 * 	데이터를 넘겨주기 위한 클래스 (VO class (ValueOf class),DTO class)
 * 	변수의 접근지정자는 반드시 private으로 한다.
 * 	데이터를 세팅하고 내보내는 함수를 반드시 지정해야한다 public 으로 
 * 	위 두개가 세트로 되어야한다.
 */
public class Emp {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private String hiredate;
	private double sal;
	private double comm;
	private int deptno;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	/*
	// 데이터 대입해주는 함수
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	// 데이터 반환해주는 함수
	public int getEmpno() {
		return empno;
	}
	*/
	
}
