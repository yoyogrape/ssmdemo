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
		// 通过反射机制获取驱动 (建桥机)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 建立连接（桥）
		Connection conn = DriverManager.getConnection(url, user, password);
		// SQL语句（货）
		String sql = "insert into student values(3,'hehe',19)";
		// 创建Statement对象（将货装车）
		Statement stat = conn.createStatement();
		// 执行sql语句（卸货执行并返回结果）
		int count = stat.executeUpdate(sql);
		// 检验执行次数
		System.out.println("执行了" + count + "次");
		// 停车，拆桥
		stat.close();
		conn.close();
	}
}
