package com.yedam.app.dept.web;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yedam.app.dept.service.DeptService;
import com.yedam.app.dept.service.DeptVO;

@Controller
public class DeptController {

	private final DeptService deptService;
	
	DeptController(DeptService deptService) {
		this.deptService = deptService;
	}
	
	// 부서 전체조회
	@GetMapping("deptList")
	public String deptList(Model model) {
		List<DeptVO> list = deptService.findAll();
		
		model.addAttribute("depts", list);
		
		return "dept/list";
	}
	
	// 부서 단건조회
	@GetMapping("deptInfo")
	public String deptInfo(DeptVO deptVO, Model model) {
		DeptVO findVO = deptService.findByDepartmentId(deptVO);
		
		model.addAttribute("dept", findVO);
		
		return "dept/info";
	}
	
	// 부서 등록 - 페이지
	@GetMapping("deptInsert")
	public String deptInsertForm() {
		return "dept/insert";
	}
	
	// 부서 등록 - 처리
	@PostMapping("deptInsert")
	public String deptInsertProcess(DeptVO deptVO) {
		int dId = deptService.addDeptInfo(deptVO);
		return "redirect:deptInfo?departmentId=" + dId;
	}
	
	// 부서 수정 - 페이지
	@GetMapping("deptUpdate")
	public String deptUpdateForm(DeptVO deptVO, Model model) {
		DeptVO findVO = deptService.findByDepartmentId(deptVO);
		
		model.addAttribute("dept", findVO);
		
		return "dept/update";
	}
	
	// 부서 수정 - 수정
	@PostMapping("deptUpdate")
	@ResponseBody
	public Map<String, Object> deptUpdateProcess(@RequestBody DeptVO deptvo) {
		return deptService.modifyDeptInfo(deptvo);
	}
	
	// 부서 삭제
	@GetMapping("deptDelete")
	public String deptDelete(Integer deptId) {
		deptService.removeDeptInfo(deptId);
		return "redirect:deptList";
	}
}
