package com.shared;

import java.io.Serializable;

public class addscheme implements Serializable {
public String name;
public String authenticate;
public String getAuthenticate() {
	return authenticate;
}
public void setAuthenticate(String authenticate) {
	this.authenticate = authenticate;
}
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
public String content;

}
