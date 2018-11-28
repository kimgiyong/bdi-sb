package com.example.demo.vo;

import org.springframework.stereotype.Component;

@Component
public class JapanVO {

	private Integer jpnum;
	private String jpname;
	private String jpdesc;
	public Integer getJpnum() {
		return jpnum;
	}
	public void setJpnum(Integer jpnum) {
		this.jpnum = jpnum;
	}
	public String getJpname() {
		return jpname;
	}
	public void setJpname(String jpname) {
		this.jpname = jpname;
	}
	public String getJpdesc() {
		return jpdesc;
	}
	public void setJpdesc(String jpdesc) {
		this.jpdesc = jpdesc;
	}
	@Override
	public String toString() {
		return "JapanVO [jpnum=" + jpnum + ", jpname=" + jpname + ", jpdesc=" + jpdesc + "]";
	}
	
	
}
