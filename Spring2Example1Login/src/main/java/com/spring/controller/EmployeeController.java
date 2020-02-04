package com.spring.controller;
import javax.servlet.http.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletResponse;
import com.spring.service.EmployeeManager;

public class EmployeeController implements Controller {
private EmployeeManager employeeManager;

public EmployeeManager getEmployeeManager() {
	return employeeManager;
}

public void setEmployeeManager(EmployeeManager employeeManager) {
	this.employeeManager = employeeManager;
}
public ModelAndView handleRequest(HttpServletRequest arg0,HttpServletResponse arg1)throws Exception
{
	System.out.println("in EmployeeController");
	ModelAndView mv=new ModelAndView("employeelist");
	mv.addObject("employeelist",this.employeeManager.getEmployeeList());
	return mv;
}


}
