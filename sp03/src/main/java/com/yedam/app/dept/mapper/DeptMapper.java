package com.yedam.app.dept.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.app.dept.service.DeptVO;

public interface DeptMapper {
	// 부서 전체조회
		public List<DeptVO> selectDeptAll();
	// 부서 단건조회
		public DeptVO selectDept(DeptVO deptvo);
	// 부서 등록
		public int insertDept(DeptVO deptvo);
	// 부서 수정
		public int updateDept(@Param("deptId") int departmentId,
							  @Param("dept") DeptVO deptvo);
	// 부서 삭제
		public int deleteDept(int departmentId);
}
