package com.textile_app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Supplier {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	int pid;
	
	@Column
	String pName;
	@Column
	String pDes;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	
	public String getpDes() {
		return pDes;
	}
	public void setpDes(String pDes) {
		this.pDes = pDes;
	}
	
}
