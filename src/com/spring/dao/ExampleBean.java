package com.spring.dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("singleton")
public class ExampleBean {
	public ExampleBean(){
		System.out.println("实例化ExampleBean");
	}
	public void excute(){
		System.out.println("执行ExampleBean处理");
	}
	@PostConstruct
	public void init(){
		System.out.println("初始化ExampleBean对象");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("销毁ExampleBean对象");
	}
	
}
