package com.rawsanj.restdemo.entity;

public class SearchVO {
	
	private static final long serialVersionUID = 1L;
	private String empid;
	private String nickname;
	private String email;
	private String phone;
	
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	} 
	
	@Override
	public String toString() {
	    // TODO Auto-generated method stub
	    return "<EMPID>"+this.empid+"<NICKNAME>"+nickname+"<email>"+email+"<phone>"+phone;
	}
	

}
