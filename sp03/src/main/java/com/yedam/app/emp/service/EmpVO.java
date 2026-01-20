package com.yedam.app.emp.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor // Mybatis
@AllArgsConstructor
@Builder
@Data
public class EmpVO {
	private Integer employeeId; // PK
	private String firstName;
	private String lastName;    // Not Null
	private String email;		// Not Null
	private String phoneNumber;
	// java.util.Date : yyyy/MM/dd
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date hireDate;		// Not Null
	private String jobId;		// Not Null
	private double salary;		
	private double commissionPct;
	private int managerId;
	private int departmentId;
}
