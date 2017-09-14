package com.example.demo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.google.gson.JsonObject;

@Component
@ConfigurationProperties(prefix = "author")
public class AuthorProperties {
	private String name;
	private String sex;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("{name: %s, sex: %s, age: %d}", name, sex, age);
	}
	
	public String toJsonString() {
		JsonObject jsonObj = new JsonObject();
		jsonObj.addProperty("name", name);
		jsonObj.addProperty("sex", sex);
		jsonObj.addProperty("age", age);
		
		return jsonObj.toString();
	}
}
