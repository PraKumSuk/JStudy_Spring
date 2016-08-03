/**
 * 
 */
package com.spk;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * @author M1025703
 * MAPPER CLASS IS USED TO MAP INPUT AND OUTPUT VARIABLES
 * SO THAT THE INTERMEDIATE VALUES CAN BE MAPPED TO ANY APP
 * DEFINED DATA TYPES, HOWEVER WHILE INTERACTING WITH DB
 * THE ATTRIBUTES/TYPES DOES NOT CHANGE
 */
public class StudentMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student student = new Student();
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));
		return student;
	}

}
