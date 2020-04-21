package com.enjoy.cap8.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author hs
 *
 */
public class Bird {
	
	@Value(value = "小鸟")
	private String name;
	@Value("${bird.age}")
	private Integer age;
	
	
	public Bird() {
		// TODO Auto-generated constructor stub
	}
	
	public Bird(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}



	@Override
	public String toString() {
		return "Bird [name=" + name + ", age=" + age + "]";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	

}
