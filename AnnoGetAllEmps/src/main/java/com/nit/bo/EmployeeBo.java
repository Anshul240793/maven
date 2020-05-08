package com.nit.bo;

public class EmployeeBo {
	private int empNo;
	private String empName;
	private String empJob;
	private double empSal;
	private int deptno;

	public EmployeeBo() {
		super();
	}

	public EmployeeBo(int empNo, String empName, String empJob, double empSal, int deptno) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empJob = empJob;
		this.empSal = empSal;
		this.deptno = deptno;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpJob() {
		return empJob;
	}

	public void setEmpJob(String empJob) {
		this.empJob = empJob;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "EmployeeBo [empNo=" + empNo + ", empName=" + empName + ", empJob=" + empJob + ", empSal=" + empSal
				+ ", deptno=" + deptno + "]";
	}

}
