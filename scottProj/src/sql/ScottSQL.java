package sql;

public class ScottSQL {
	public final int SNAME = 1001;
	public final int  SADD = 2001;
	public final int SSAL = 3001;
	
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case SNAME:
			buff.append("SELECT ");
			buff.append("	empno, ename, hiredate, sal ");
			buff.append("FROM ");
			buff.append("	EMP0 ");
			buff.append("WHERE ");
			buff.append("	ename = ? ");
			break;
		case SADD:
			buff.append("INSERT INTO ");
			buff.append("	EMP0( ");
			buff.append("	empno, ename, job, mgr, sal, comm, deptno ");
			buff.append("	) ");
			buff.append("VALUES( ");
			buff.append(" (SELECT NVL(MAX(empno) + 1, 8000) FROM EMP0 WHERE empno <> 9999 ), ");
			buff.append(" ?, ?, ?, ?, ?, ? ");
			buff.append(") ");
			break;
		case SSAL:
			buff.append("UPDATE ");
			buff.append("	EMP0 ");
			buff.append("SET ");
			buff.append("	sal = ? ");
			buff.append("WHERE ");
			buff.append("	empno = ? ");
			break;
		}
		return buff.toString();
	}
}
