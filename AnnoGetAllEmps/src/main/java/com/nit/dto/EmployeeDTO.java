package com.nit.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable{
  private int empSrno;
  private int empId;
  private String empName;
  private String empJob;
  private float empSal;
  private int deptno;
public EmployeeDTO() {
	super();
}
public EmployeeDTO(int empSrno, int empId, String empName, String empJob, float empSal, int deptno) {
	super();
	this.empSrno = empSrno;
	this.empId = empId;
	this.empName = empName;
	this.empJob = empJob;
	this.empSal = empSal;
	this.deptno = deptno;
}
public int getEmpSrno() {
	return empSrno;
}
public void setEmpSrno(int empSrno) {
	this.empSrno = empSrno;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
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
public float getEmpSal() {
	return empSal;
}
public void setEmpSal(float empSal) {
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
	return "EmployeeDTO [empSrno=" + empSrno + ", empId=" + empId + ", empName=" + empName + ", empJob=" + empJob
			+ ", empSal=" + empSal + ", deptno=" + deptno + "]";
}
  
}
