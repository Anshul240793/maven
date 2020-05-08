package com.nit.dao;

import java.util.List;

import com.nit.bo.EmployeeBo;

public interface IEmpDao {
	public List<EmployeeBo> findAllEmployees();

}
