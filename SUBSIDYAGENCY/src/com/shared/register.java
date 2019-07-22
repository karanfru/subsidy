package com.shared;

import java.io.Serializable;

public class register implements Serializable {
	public String authenticate;
public String getAuthenticate() {
		return authenticate;
	}
	public void setAuthenticate(String authenticate) {
		this.authenticate = authenticate;
	}
public String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAadhaar() {
	return aadhaar;
}
public void setAadhaar(String aadhaar) {
	this.aadhaar = aadhaar;
}
public String getPan() {
	return pan;
}
public void setPan(String pan) {
	this.pan = pan;
}
public String getFamily() {
	return family;
}
public void setFamily(String family) {
	this.family = family;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String aadhaar;
public String pan;
public String family;
public String uname;
public String pass;

}
