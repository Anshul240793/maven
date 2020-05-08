package com.nit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.dto.EmployeeDTO;
import com.nit.service.IEmployeeService;
@Controller
public class EmployeeController {
	@Autowired
	private IEmployeeService empService;

	@RequestMapping("/home.htm")
	public String showWelcome() {
		return "welcome";
	}
    @RequestMapping("/allemps.htm")
	public String processEmps(Map<String,Object> map) {
    	List<EmployeeDTO> listEmpDTO=null;
    	listEmpDTO=empService.getAllEmps();
    	System.out.println("all");
    	map.put("listEmpDTO", listEmpDTO);
		return "show_emps";
	}

}
