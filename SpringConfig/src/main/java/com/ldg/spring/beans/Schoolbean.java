package com.ldg.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@SuppressWarnings("unused")
@Component
public class Schoolbean {
	
	private Teacherbean teacherBean;
	private Studentbean studentBean;
	
	public Schoolbean(){
		System.out.println("we are creating an Schoolbean object");
	}

	@Autowired
	public void setTeacherbean(Teacherbean teacherBean) {
		System.out.println("Setting a reference for Teacherbean");
		this.teacherBean = teacherBean;
	}

	@Autowired
	public void setStudentbean(Studentbean studentBean) {
		System.out.println("Setting a reference for Studentbean");
		this.studentBean = studentBean;
	}
}
