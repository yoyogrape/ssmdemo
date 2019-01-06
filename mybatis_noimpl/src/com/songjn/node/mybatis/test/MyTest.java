package com.songjn.node.mybatis.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.ls.LSException;

import com.songjn.node.mybatis.dao.IStudentDao;
import com.songjn.node.mybatis.po.Student;
import com.songjn.node.mybatis.utils.MybatisUtils;

/**
 * ȥ��daoimplʵ����Ĵ���
 */
public class MyTest {
	private IStudentDao dao;
	private SqlSession session;

	@Before
	public void before() {
		session = MybatisUtils.getSqlSession();
		dao = session.getMapper(IStudentDao.class);
	}

	@After
	public void after() {
		if (session != null) {
			session.close();
		}
	}

	@Test
	public void add() {// ִ�в��뷽��
		dao.insertStudnet(new Student("С��", 12, 98));
		session.commit();
	}

	@Test
	public void addChche() {// ִ�в��룬����ǰid=null�������id=�ǿա�
		dao.insertStudnetCacheId(new Student("С��3333", 14, 12));
		// ִ�в���ǰ��Student=Student [age=14, id=0, name=С��3333, score=12.0]
		// ִ�в�����Student=Student [age=14, id=27, name=С��3333, score=12.0]
		session.commit();
	}

	@Test
	public void del() {
		dao.deleteStudentById(36);
		session.commit();
	}

	@Test
	public void update() {
		Student student = new Student("����", 12, 77);
		student.setId(29);
		dao.updateStudent(student);
	}

	@Test
	public void select() {
		List<Student> list = dao.selectAllStudnets();
		for (Student student : list) {
			System.out.println(student);
		}
	}

	//����ֵ��map�Ĳ�ѯ
	@Test
	public void selectMap() {
		Map<String, Object> map = dao.selectAllStudnetsMap();
		System.out.println(map.get("xixi"));
	}

	//ͨ��id��ѯ
	@Test
	public void selectById() {
		System.out.println(dao.selectStudnetById(3));
	}
	//ͨ�����ֲ�ѯ
	@Test
	public void selectByName() {
		List<Student> list = dao.selectStudnetsByName("С");
		for (Student student : list) {
			System.out.println(student);
		}
	}
	//��������ѯ
	@Test
	public void selectByConditions() {
		Student stian=new Student("����", 28, 87);//3�������߳ɼ���
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("nameCon", "ge");//1����������ge�ġ�
		map.put("ageCon", 18);//2���������18��
		map.put("tianqi", stian);
		List<Student> list = dao.selectByConditions(map);
		for (Student student : list) {
			System.out.println(student);
		}
	}
	//��̬sql<if>ʵ��
	@Test
	public void selectDynamicSqlByIf() {
		//Student student=new Student("", 0, 87);//һ���������ɼ�>87
		//Student student=new Student("", 28, 87);//��������:����>28���ɼ�>87
		Student student=new Student("��", 30, 87);//��������:�������>28���ɼ�>87

		List<Student> list = dao.selectDynamicSqlByIf(student);
		for (Student s : list) {
			System.out.println(s);
		}
	}
	//��̬sql<where>ʵ��
	@Test
	public void selectDynamicSqlByWhere() {
		//Student student=new Student("", 0, 87);//һ���������ɼ�>87
		//Student student=new Student("", 28, 87);//��������:����>28���ɼ�>87
		Student student=new Student("��", 30, 87);//��������:�������>28���ɼ�>87
		
		List<Student> list = dao.selectDynamicSqlByWhere(student);
		for (Student s : list) {
			System.out.println(s);
		}
	}
	//<choose>��ǩ��ʹ��
	@Test
	public void selectDynamicSqlByChoose() {
		//Student student=new Student("", 0, 87);//һ���������ɼ�>87
		Student student=new Student("", 28, 87);//��������:����>28���ɼ�>87
		//Student student=new Student("��", 30, 87);//��������:�������>28���ɼ�>87
		
		List<Student> list = dao.selectDynamicSqlByChoose(student);
		for (Student s : list) {
			System.out.println(s);
		}
	}
	//<foreach>��ǩ��ʹ��(����)
	@Test
	public void selectDynamicSqlByForeach() {
		//int [] ids={1,3,4};
		int [] ids={};
		List<Student> list = dao.selectDynamicSqlByForeach(ids);
		for (Student s : list) {
			
			System.out.println(s);
		}
	}
	//<foreach>��ǩ��ʹ�ã�list���ϣ�
	@Test
	public void selectDynamicSqlByForeach2() {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(4);
		List<Student> studnets = dao.selectDynamicSqlByForeach2(list);
		for (Student s : studnets) {
			System.out.println(s);
		}
	}
	//<foreach>��ǩ��ʹ�ã�list�Զ������ͼ��ϣ�
	@Test
	public void selectDynamicSqlByForeach3() {
		List<Student> list=new ArrayList<Student>();
		list.add(new Student("ll",12,70));
		list.add(new Student("ss",12,80));
		List<Student> studnets = dao.selectDynamicSqlByForeach3(list);
		for (Student s : studnets) {
			System.out.println(s);
		}
	}
	//<sql>:sqlƬ�ε�ʹ��
	@Test
	public void selectDynamicSqlByForeach4() {
		List<Student> list=new ArrayList<Student>();
		list.add(new Student("ll",12,70));
		list.add(new Student("ss",12,80));
		List<Student> studnets = dao.selectDynamicSqlByForeach4(list);
		for (Student s : studnets) {
			System.out.println(s);
		}
	}
	
}
