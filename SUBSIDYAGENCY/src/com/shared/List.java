package com.shared;

import java.io.Serializable;

public class List implements Serializable{
	int n;
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public String[][] getA() {
		return a;
	}
	public void setA(String[][] a) {
		this.a = a;
	}
	String a[][]=new String[n][2];
}
