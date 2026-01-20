package com.yedam.app.aop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.yedam.app.emp.service.EmpVO;

@Aspect // AOP의 설정 
//@Component
public class CommonAspect {
	// 포인트 컷 : 조인포인트 중에서 Advice(횡단관심)이 적용될 메소드 필터
	@Pointcut("execution(* com.yedam..*Impl.*(..))") // 아무타입 패키지 클래스명 아무메서드이름(아무매개변수)
	 public void allpointcut() {}
	
	// Weaving : 포인트 컷 + 타이밍 + Advice(횡단관심)
	@Before("allpointcut()")
	 public void beforeLog(JoinPoint jp) {
	 String methodName = jp.getSignature().getName();
	 EmpVO empVO = (EmpVO) jp.getArgs()[0];
	 System.out.println("[사전처리] beforeLog : " + methodName );
	 System.out.println("[사전처리] beforeLog : " + empVO.toString());
	 }

	@Around("allpointcut()")
	public Object excuteTime(ProceedingJoinPoint joinPoint) throws Throwable {
		String signaterStr = joinPoint.getSignature().toString();
		System.out.println("=== 시작 : " + signaterStr);
		
		// 공통기능
		System.out.println("=== 핵심 기능 후 실행 : " + System.currentTimeMillis());
		try {
			// 비지니스 메소드를 실행
			Object obj = joinPoint.proceed();
			return obj;
		} finally {
			System.out.println("=== 핵심 기능 후 실행 : " + System.currentTimeMillis());
			System.out.println("=== 끝 : " + signaterStr);
		}
	}
}
