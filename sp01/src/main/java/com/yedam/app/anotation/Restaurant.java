package com.yedam.app.anotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
	// 필드
	private Chef chef;
	
	// 생성자
	@Autowired
	public Restaurant(Chef chef) {
		this.chef = chef;
	}
	
	public Restaurant() {}
	
	// 메소드
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public void run() {
		chef.cooking();
	}
}
