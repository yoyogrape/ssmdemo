package com.songjn.node.DI.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**  
 * @author songjn 
 * @date Sep 1, 2018 - 11:48:41 PM  
 * @desc IOC����ע---���ϵ�ע��
 * 
 * Map��Properties����
 * map�ļ�ֵ����obj
 * Properties�ļ�ֵ��String
 */
public class Some {
	private School[] schools;
	private String[] myStrs;
	private List<String> myList;
	private Set<String> mySet;
	private Map<String,Object> myMap;
	private Properties myProes;
	
	public void setSchools(School[] schools) {
		this.schools = schools;
	}
	public void setMyStrs(String[] myStrs) {
		this.myStrs = myStrs;
	}
	public void setMyList(List<String> myList) {
		this.myList = myList;
	}
	public void setMySet(Set<String> mySet) {
		this.mySet = mySet;
	}
	public void setMyMap(Map<String, Object> myMap) {
		this.myMap = myMap;
	}
	public void setMyProes(Properties myProes) {
		this.myProes = myProes;
	}
	@Override
	public String toString() {
		return "Some [schools=" + Arrays.toString(schools) + ", myStrs="
				+ Arrays.toString(myStrs) + ", myList=" + myList + ", mySet="
				+ mySet + ", myMap=" + myMap + ", myProes=" + myProes + "]";
	}
	
}
