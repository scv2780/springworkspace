package com.yedam.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yedam.app.emp.mapper.EmpMapper;
import com.yedam.app.emp.service.EmpVO;

@SpringBootTest // jUnit 환경에서도 IoC 컨테이너를 사용가능
class Sp03ApplicationTests {
	@Autowired // 필드주입, 테스트 환경에서만 씀
	private EmpMapper empMapper;
	
	//@Test
	void contextLoads() {
		assertNotNull(empMapper);
	}
	
	// 전체조회
	//@Test
	void selectAll() {
		List<EmpVO> list = empMapper.selectEmpAll();
		for(EmpVO emp : list) {
			System.out.println(emp);
		}
		assertFalse(list.isEmpty());
	}
	
	// 단건조회
	//@Test
	void selectOne() {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(100);
		
		EmpVO findVO = empMapper.selectEmp(empVO);
		System.out.println(findVO);
		assertEquals("King", findVO.getLastName()); // 예상값, 실제값
	}
	
	// 등록
	//@Test
	void insertOne() {
		EmpVO empVO = new EmpVO();
		empVO.setLastName("Hong");
		empVO.setEmail("kdHong@google.com");
		empVO.setHireDate(new Date());
		empVO.setJobId("IT_PROG");
		
		int result = empMapper.insertEmp(empVO);
		assertEquals(1, result);
	}
	
	// 수정
	//@Test
	void updateOne() {
		EmpVO empVO = new EmpVO();
		empVO.setLastName("Kang");
		empVO.setHireDate(new Date());
		
		int result = empMapper.updateEmp(212, empVO);
		assertEquals(1, result);
	}
	
	// 삭제
	@Test
	void deleteOne() {
		int result = empMapper.deleteEmp(212);
		assertEquals(1, result);
	}

}
