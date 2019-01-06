package com.songjn.node.mybatis.po;

import java.util.Set;

public class Country {
	private int cid;
	private String cname;
	private Set<Minister> minister;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Set<Minister> getMinister() {
		return minister;
	}
	public void setMinister(Set<Minister> minister) {
		this.minister = minister;
	}
	@Override
	public String toString() {
		return "Country [cid=" + cid + ", cname=" + cname + ", minister="
				+ minister + "]";
	}
	
}
