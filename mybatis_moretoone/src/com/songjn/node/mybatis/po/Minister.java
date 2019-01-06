package com.songjn.node.mybatis.po;
/**
 * 
* @ClassName: Minister
* @Description: TODO(多对一关系，部长类)
* @author songjn
* @date 2018-9-11 下午05:07:36
*
 */
public class Minister {
	private int mid;
	private String mname;//部长名字
	private Country country;
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
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
		return "Minister [country=" + country + ", mid=" + mid + ", mname="
				+ mname + "]";
	}

}
