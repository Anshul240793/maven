package com.nit.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.bo.EmployeeBo;
import com.nit.dao.IEmpDao;
import com.nit.dto.EmployeeDTO;
@Service
public class EmployeeServiceImpl implements IEmployeeService{
	@Autowired
	private IEmpDao dao;

	@Override
	public List<EmployeeDTO> getAllEmps() {
		List<EmployeeDTO> listEmpDto=new ArrayList<EmployeeDTO>();

		List<EmployeeBo> listEmpBo=null;
		listEmpBo=dao.findAllEmployees();
		listEmpBo.forEach(empBo->{
			EmployeeDTO empDTO=new EmployeeDTO();
			BeanUtils.copyProperties(empBo, empDTO);
			 empDTO.setEmpSrno(listEmpDto.size()+1);
			listEmpDto.add(empDTO);
		});
		return listEmpDto;
	}

}
