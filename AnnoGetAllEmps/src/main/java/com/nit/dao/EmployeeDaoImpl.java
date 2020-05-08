package com.nit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.nit.bo.EmployeeBo;
@Repository
public class EmployeeDaoImpl implements IEmpDao{
	private final String GET_EMPS="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP";
	@Autowired
	private JdbcTemplate jt;
	@Override
	public List<EmployeeBo> findAllEmployees() {
		List<EmployeeBo> listEmployeeBo=null;
		System.out.println(jt);
		listEmployeeBo=jt.query(GET_EMPS,  new EmployeeResultSetExtractor());
		return listEmployeeBo;
	}
	//inner class
	private class EmployeeResultSetExtractor implements ResultSetExtractor<List<EmployeeBo>> {

		@Override
		public List<EmployeeBo> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<EmployeeBo> listEmployeeBos=null;
			listEmployeeBos=new ArrayList<EmployeeBo>();
			EmployeeBo bo=null;
			while(rs.next()) {
				bo=new EmployeeBo();
				bo.setEmpNo(rs.getInt("EMPNO"));
				bo.setEmpName(rs.getString("ENAME"));
				bo.setEmpJob(rs.getString("JOB"));
				bo.setEmpSal(rs.getFloat("SAL"));
				bo.setDeptno(rs.getInt("DEPTNO"));
				listEmployeeBos.add(bo);	
			}
			return listEmployeeBos;
		}

	}

}
