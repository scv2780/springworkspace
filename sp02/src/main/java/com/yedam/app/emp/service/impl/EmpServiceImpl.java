package com.yedam.app.emp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yedam.app.emp.mapper.EmpMapper;
import com.yedam.app.emp.service.EmpService;
import com.yedam.app.emp.service.EmpVO;

@Service // 비지니스 로직(실제 기능)에 해당하는 객체를 의미
		 // AOP를 적용하는 객체를 의미
public class EmpServiceImpl implements EmpService {
	
	private EmpMapper empMapper;
	
	// 생성자가 하나일 경우 무조건 생성자 주입 @Autowired 필요없음
	public EmpServiceImpl(EmpMapper empMapper) {
		this.empMapper = empMapper;
	}
	
	@Override
	public List<EmpVO> findAll() {
		// 사원전체조회
		return empMapper.selectAll();
	}

}
