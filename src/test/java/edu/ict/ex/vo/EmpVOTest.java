package edu.ict.ex.vo;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.jupiter.api.Test;

class EmpVOTest {

	@Test
	void testEmpVO() {
		EmpVO empVO = new EmpVO();
		
		empVO.getEmpno();
		empVO.setDeptno(0);
		empVO.getEname();
		empVO.getHiredate();
		empVO.getComm();
		empVO.getJob();
		empVO.getMgr();
		empVO.getSal();
		
		System.out.println(empVO.getComm());
		System.out.println(empVO.getComm());
		System.out.println(empVO.getComm());
		System.out.println(empVO.getComm());
		System.out.println(empVO.getComm());
	}

}
