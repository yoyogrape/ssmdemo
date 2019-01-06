package com.songjn.node.mybatis.po;

import java.util.Set;

public class NewsLabel {
	private Integer id;
	private String name;
	private Set<NewsLabel> child;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<NewsLabel> getChild() {
		return child;
	}
	public void setChild(Set<NewsLabel> child) {
		this.child = child;
	}
	@Override
	public String toString() {
		return "NewsLabel [child=" + child + ", id=" + id + ", name=" + name
				+ "]";
	}
	
}
