package edu.ict.ex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ict.ex.service.DeptService;
import edu.ict.ex.service.EmpService;
import edu.ict.ex.vo.EmpVO;

@RestController
@RequestMapping("/emps")
public class RestEmpController {

	@Autowired
	private EmpService empService;

	
	@Autowired 
	private DeptService DeptSevice;
	 

	@GetMapping("/list")
	public List<EmpVO> list() {

		System.out.println("list()..");


		return empService.getList();
	}

	

}