package db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CrazyDBManager {
	// * 1、声明数据库URL地址，及数据库用户名和密码
	private static final String URL = "jdbc:mysql://localhost/crazydiom";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	// * 2、加载驱动程序  将其设计为一个静态块
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("驱动加载失败！");
		}
	}

	// * 3、通过DriverManager建立数据库连接，返回一个连接
	public static Connection getCon() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			System.err.println("数据库连接错误！");
		}
		return con;
	}
	// * 8、释放关闭资源：con、pstatement、resultSet
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
