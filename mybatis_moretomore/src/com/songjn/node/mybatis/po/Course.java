package com.songjn.node.mybatis.po;

public class Course {
	private int cid;
	private String cname;
	private Student students;
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
	public Student getStudents() {
		return students;
	}
	public void setStudents(Student students) {
		this.students = students;
	}
	@Override
	public String toString() {//û�����ѧ������ֹ�ڴ������
		return "Course [cid=" + cid + ", cname=" + cname + "]";
	}
	
}
