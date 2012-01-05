package com.hascode.tutorial;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class DemoBean {
	public String output() {
		return "It is " + new Date().toString();
	}
}
