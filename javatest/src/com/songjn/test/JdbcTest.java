package com.songjn.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	private static String user = "scott";
	private static String password = "orcl";
	private static String url = "jdbc:oracle:thin:@localhost:1521:orcl";

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		// ͨ��������ƻ�ȡ���� (���Ż�)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// �������ӣ��ţ�
		Connection conn = DriverManager.getConnection(url, user, password);
		// SQL��䣨����
		String sql = "insert into student values(3,'hehe',19)";
		// ����Statement���󣨽���װ����
		Statement stat = conn.createStatement();
		// ִ��sql��䣨ж��ִ�в����ؽ����
		int count = stat.executeUpdate(sql);
		// ����ִ�д���
		System.out.println("ִ����" + count + "��");
		// ͣ��������
		stat.close();
		conn.close();
	}
}
