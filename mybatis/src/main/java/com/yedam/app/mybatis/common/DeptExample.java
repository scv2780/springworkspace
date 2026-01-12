package com.yedam.app.mybatis.common;

import java.util.List;

import com.yedam.app.mybatis.mapper.DeptMapper;
import com.yedam.app.mybatis.mapper.DeptMapperImpl;
import com.yedam.app.mybatis.service.DeptVO;

public class DeptExample {
	private static DeptMapper deptMap = new DeptMapperImpl();
	
	public static void main(String[] args) {
		//selectAll();
		//selectInfo();
		//insertInfo();
		//updateInfo();
		//deleteInfo();

	}
	public static void selectAll() {
		List<DeptVO> list = deptMap.selectAll();
		for(DeptVO dept : list) {
			System.out.println(dept);
		}
	}
	public static void selectInfo() {
		DeptVO dept = new DeptVO();
		dept.setDepartmentId(10);
		
		DeptVO findVO = deptMap.selectInfo(dept);
		System.out.println(findVO);
	}
	public static void insertInfo() {
		DeptVO deptVO = new DeptVO();
		deptVO.setDepartmentName("Hong");
		
		int result = deptMap.insertInfo(deptVO);
		System.out.println(result);
	}
	public static void updateInfo() {
		DeptVO dept = new DeptVO();
		dept.setDepartmentId(440);
		dept.setDepartmentName("Kil-dong");
		
		int result = deptMap.updateInfo(dept);
		System.out.println(result);
	}
	public static void deleteInfo() {
		int result = deptMap.deleteInfo(440);
		System.out.println(result);
	}
}
