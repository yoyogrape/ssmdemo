package com.songjn.node.mybatis.po;
/**
 * 
* @ClassName: Minister
* @Description: TODO(һ�Զ��ϵ�������࣬�෽)
* @author songjn
* @date 2018-9-11 ����05:07:36
*
 */
public class Minister {
	private int mid;
	private String mname;//��������
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	@Override
	public String toString() {
		return "Minister [mid=" + mid + ", mname=" + mname + "]";
	}
	
}
