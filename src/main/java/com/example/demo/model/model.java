package com.example.demo.model;

public class model {
private int rolno;
private String name;
private String Dept;
private long phone;
public int getRolno() {
	return rolno;
}
public void setRolno(int rolno) {
	this.rolno = rolno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return Dept;
}
public void setDept(String dept) {
	Dept = dept;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
@Override
public String toString() {
	return "model [rolno=" + rolno + ", name=" + name + ", Dept=" + Dept + ", phone=" + phone + "]";
}


}
