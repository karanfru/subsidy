package com.shared;

import java.io.Serializable;

public class AdminLog implements Serializable{
public String uname;
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String pass;
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getAuthenticate() {
	return authenticate;
}
public void setAuthenticate(String authenticate) {
	this.authenticate = authenticate;
}
public String authenticate;
}
