package com.yedam.app.common;

public class RestaurantExample {

	public static void main(String[] args) {
		Chef chef = new Chef();
		// 생성자
		Restaurant res = new Restaurant(chef);
		res.run();
		
		// 세터
		Restaurant sec = new Restaurant();
		sec.setChef(chef);
		res.run();

	}

}
