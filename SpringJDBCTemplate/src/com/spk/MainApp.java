/**
 * 
 */
package com.spk;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author M1025703
 *
 */
public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
		System.out.println("------Records Creation--------" );
	    studentJDBCTemplate.create("Bara", 11);
	    studentJDBCTemplate.create("Puha", 2);
	    studentJDBCTemplate.create("Yayan", 15);
	    
	    
	    System.out.println("------Listing Multiple Records--------" );
	    List<Student> students = studentJDBCTemplate.listStudents();
	    for (Student record : students) {
	    	System.out.print("ID : " + record.getId() );
	    	System.out.print(", Name : " + record.getName() );
	    	System.out.println(", Age : " + record.getAge());
	    }

	    System.out.println("----Updating Record with ID = 2 -----" );
	    studentJDBCTemplate.update(2, 99);
	    
	    System.out.println("----Listing Record with ID = 2 -----" );
	    Student student = studentJDBCTemplate.getStudent(2);
	    System.out.print("ID : " + student.getId() );
	    System.out.print(", Name : " + student.getName() );
	    System.out.println(", Age : " + student.getAge());
	    
	    System.out.println("----Delete Record with ID = 12 -----" );
	    studentJDBCTemplate.delete(new Integer(12));

	}
}
