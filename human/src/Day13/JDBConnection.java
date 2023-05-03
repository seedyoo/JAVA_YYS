package Day13;

import java.sql.*;

public class JDBConnection {

	public Connection con;
	public Statement stmt;
	public PreparedStatement psmt;
	public ResultSet rs;
	
	// 기본 생성자
	public JDBConnection() {
		
		try {
			// JDBC 드라이버 로드
			// MySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// DB 연결
			String url = "jdbc:mysql://localhost:3306/human?serverTimezone=Asia/Seoul&allowPublicKeyRetrieval=true&useSSL=false";
			String id = "human";
			String pw = "123456";
			
			con = DriverManager.getConnection(url, id, pw);
			
			System.out.println("DB 연결 성공");
			
			
		} catch (Exception e) {
			System.err.println("DB 연결 실패");
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		JDBConnection jc = new JDBConnection();
		
	}
	
	
}
