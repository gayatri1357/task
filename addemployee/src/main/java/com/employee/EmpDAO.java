package com.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void addEmployee(Emp emp) {
		jdbcTemplate.update("insert into emp(id, name,dept)values(?,?,?)",
				new Object[] { emp.getId(), emp.getName(), emp.getDept() });
		// return findEmployeebyId(emp.getId());
	}

}
