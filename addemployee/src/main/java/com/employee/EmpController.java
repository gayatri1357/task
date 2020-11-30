package com.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

	@Autowired
	EmpDAO empdao;

	@PostMapping("/addemployee")
	public void addEmployee(@RequestBody Emp emp) {
		empdao.addEmployee(emp);
	}
}
