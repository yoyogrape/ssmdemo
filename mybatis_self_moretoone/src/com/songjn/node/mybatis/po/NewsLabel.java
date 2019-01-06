package com.songjn.node.mybatis.po;

public class NewsLabel {
	private Integer id;
	private String name;
	private NewsLabel parent;
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
	public NewsLabel getParent() {
		return parent;
	}
	public void setParent(NewsLabel parent) {
		this.parent = parent;
	}
	@Override
	public String toString() {
		return "NewsLabel [id=" + id + ", name=" + name + ", parent=" + parent
				+ "]";
	}
	
}
