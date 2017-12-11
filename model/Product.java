package com.textile_app.model;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity

public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	int pid;
	@Column
	String pname;

@Column
String brand;

@Column
String avail;


@Column
int pprice;


@Column
String pdesc;

@Transient

MultipartFile pimage;

public int getPid() {
	return pid;
}

public void setPid(int pid) {
	this.pid = pid;
}

public String getPname() {
	return pname;
}

public void setPname(String pname) {
	this.pname = pname;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getAvail() {
	return avail;
}

public void setAvail(String avail) {
	this.avail = avail;
}

public int getPprice() {
	return pprice;
}

public void setPprice(int pprice) {
	this.pprice = pprice;
}

public String getPdesc() {
	return pdesc;
}

public void setPdesc(String pdesc) {
	this.pdesc = pdesc;
}

public MultipartFile getPimage() {
	return pimage;
}

public void setPimage(MultipartFile pimage) {
	this.pimage = pimage;
}


}



