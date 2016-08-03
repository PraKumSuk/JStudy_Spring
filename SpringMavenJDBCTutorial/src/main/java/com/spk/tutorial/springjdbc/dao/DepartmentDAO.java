/**
 * 
 */
package com.spk.tutorial.springjdbc.dao;

import java.util.List;

import com.spk.tutorial.springjdbc.bean.Department;

/**
 * @author M1025703
 *
 */
public interface DepartmentDAO {

	public List<Department> queryDepartment() throws Exception ;

}
