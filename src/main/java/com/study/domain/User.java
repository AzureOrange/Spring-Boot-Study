package com.study.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * 实体类
 * 注意Json相关的注解
 */

public class User {

	private int age;
	
	@JsonIgnore
	private String pwd;

	// 别名 和 空字符串不返回
	@JsonProperty("account")
	@JsonInclude(Include.NON_NULL)
	private String phone;

	// 时间格式转换
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale="zh",timezone="GMT+8")
	private Date createTime;

	
	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public User() {
		super();
	}

	public User(int age, String pwd, String phone, Date createTime) {
		super();
		this.age = age;
		this.pwd = pwd;
		
		this.createTime = createTime;
	}

	
	
	
}
