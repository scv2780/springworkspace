package com.yedam.app.dept.service;

import java.util.List;
import java.util.Map;

public interface DeptService {
	// 부서 전체조회
	public List<DeptVO> findAll();
	// 부서 단건조회
	public DeptVO findByDepartmentId(DeptVO deptVO);
	// 부서 등록
	public int addDeptInfo(DeptVO deptVO);
	// 부서 수정
	public Map<String, Object> modifyDeptInfo(DeptVO deptVO);
	// 부서 삭제
	public Map<String, Object> removeDeptInfo(int deptId);
	
}
