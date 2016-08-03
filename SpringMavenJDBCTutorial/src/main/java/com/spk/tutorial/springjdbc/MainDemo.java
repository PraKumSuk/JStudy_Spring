/**
 * 
 */
package com.spk.tutorial.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spk.tutorial.springjdbc.bean.Department;
import com.spk.tutorial.springjdbc.dao.DepartmentDAO;

/**
 * @author M1025703
 *
 */
public class MainDemo {
	 
	  public static void main(String[] args) throws Exception {
	      ApplicationContext context = new ClassPathXmlApplicationContext(
	              "spring-module.xml");
	 
	      DepartmentDAO deptDAO = (DepartmentDAO) context
	              .getBean("departmentDAO");
	 
	      List<Department> depts = deptDAO.queryDepartment();
	 
	      for (Department dept : depts) {
	          System.out.println("Dept ID " + dept.getDeptId());
	          System.out.println("Dept No " + dept.getDeptNo());
	          System.out.println("Dept Name " + dept.getDeptName());
	      }
	  }
	 
	}