package com.render.To_Do_List.dto;

public class Listt {
	
	private String name;
	private String email;
	private String password;
	private String gender;
	private String task;
	private String taskStatus;
	private long phone;
	
	public Listt() {
		super();
	}
	
	public Listt(String task) {
		super();
		this.task = task;
	}
	
	public Listt(String name, String email, String task,String taskStatus) {
		super();
		this.name = name;
		this.email = email;
		this.task = task;
		this.taskStatus=taskStatus;
	}
	
	public Listt(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public Listt(String name, String email, String password, String gender, long phone) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.phone = phone;
	}
	
	
	
	

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	@Override
	public String toString() {
		return "Listt [name=" + name + ", email=" + email + ", task=" + task + "]";
	}

	
	
	
}
