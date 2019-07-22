package com.shared;

import java.io.Serializable;

public class Req implements Serializable {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String name;
	public String content;
	public String Authenticate;
	public String getAuthenticate() {
		return Authenticate;
	}
	public void setAuthenticate(String authenticate) {
		Authenticate = authenticate;
	}

}
