package com.textile_app.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class register
{
@Id()
@GeneratedValue(strategy=GenerationType.AUTO)
 int userid;

@Column
String username;
@Column
String email;
@Column
String password;
public boolean isEnabled() {
	return Enabled;
}
public void setEnabled(boolean enabled) {
	Enabled = enabled;
}
@Column
String address;
@Column
private boolean Enabled;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public String getaddress() {
	return address;
}
public void setaddress(String address) {
	this.address = address;
}
}