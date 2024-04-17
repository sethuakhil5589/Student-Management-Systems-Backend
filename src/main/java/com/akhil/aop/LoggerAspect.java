package com.akhil.aop;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerAspect {
	
	
	private static final Logger logger=LoggerFactory.getLogger(LoggerAspect.class);
	

	@After("execution(* com.akhil.studentsRestController.StudentsRestController.fetchingData (..))")
	public void logMethodCallInFetchMethod(JoinPoint jp) {
		logger.info("\u001B[1m"+"Data Fetched successfully, Control in:"+jp.getSignature().getName()+"\u001B[0m");
	}
	
	@After("execution(* com.akhil.studentsRestController.StudentsRestController.savingData (..))")
	public void logMethodCallInSavingData(JoinPoint jp) {
		logger.info("\u001B[1m"+"Data Saved successfully, Control in:"+jp.getSignature().getName()+"\u001B[0m");
	}
	
	@After("execution(* com.akhil.studentsRestController.StudentsRestController.updateByIdGetMap (..))")
	public void logMethodCallInUpdateByIdGetMap(JoinPoint jp) {
		logger.info("\u001B[1m"+"Control in:"+jp.getSignature().getName()+"\u001B[0m");
	}
	
	@After("execution(* com.akhil.studentsRestController.StudentsRestController.updateByIdPostMap (..))")
	public void logMethodCallInUpdateByIdPostMap(JoinPoint jp) {
		logger.info("\u001B[1m"+"Data Updated successfully, Control in:"+jp.getSignature().getName()+"\u001B[0m");
	}
	
	@After("execution(* com.akhil.studentsRestController.StudentsRestController.deleteById (..))")
	public void logMethodCallDeleteById(JoinPoint jp) {
		logger.info("\u001B[1m"+"Data Deleted successfully, Control in:"+jp.getSignature().getName()+"\u001B[0m");
	}
}
