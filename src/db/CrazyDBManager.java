package db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CrazyDBManager {
	// * 1���������ݿ�URL��ַ�������ݿ��û���������
	private static final String URL = "jdbc:mysql://localhost/crazydiom";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	// * 2��������������  �������Ϊһ����̬��
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("��������ʧ�ܣ�");
		}
	}

	// * 3��ͨ��DriverManager�������ݿ����ӣ�����һ������
	public static Connection getCon() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			System.err.println("���ݿ����Ӵ���");
		}
		return con;
	}
	// * 8���ͷŹر���Դ��con��pstatement��resultSet
	public static void closeDB(Connection con, PreparedStatement pStatement,
			ResultSet res) {
		try {
			if (res != null) {
				res.close();
			}
			if (pStatement != null) {
				pStatement.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
