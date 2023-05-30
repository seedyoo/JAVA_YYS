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
			// Class.forName("com.mysql.cj.jdbc.Driver");
			// Oracle
			Class.forName("oracle.jdbc.OracleDriver");
			
			// DB 에 연결
			// - 연결에 필요한 정보 : URL, id, pw
			// URL : jdbc:mysql://도메인:[PORT]/[스키마]?옵션파라미터
			//     * 내 PC의 IP주소 :  localhost : 127.0.0.1
			// MySQL
			// String url = "jdbc:mysql://localhost:3306/human?serverTimezone=Asia/Seoul&allowPublicKeyRetrieval=true&useSSL=false";
			
			// Oracle
			// jdbc:oracle:thin			- jdbc 드라이버 타입 (thin 타입)
			// @localhost				- 호스트 주소(IP 주소), 내 PC : localhost or 127.0.0.1
			// :1521					- 포트 번호( 1521은 오라클 DB의 기본 포트번호)
			// :xe 또는 :oracle			- SID (서비스 ID)
			// String url = "jdbc:oracle:thin:@localhost:1521:xe";	// 11g
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";	// 12c 이상
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






