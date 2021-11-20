package mysql_Studyus_table;
import java.sql.*;

public class userTable {

	public static void main(String[] args) {
		try {
			// Class.forName("org.git.mm.mysql.Driver");// 1. jdbc 드라이브 연결
			Class.forName("com.mysql.cj.jdbc.Driver"); // 로 변경이 됨
			System.out.println("드라이브 연결이 잘됨");

			String url = "jdbc:mysql://localhost:3306/STUDY_US";
			String id = "root";
			String pw = "111111";
		
	
			Connection conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB 연결성공");

			String sql = "CREATE TABLE USER(";
			sql+="name varchar(10), ";
			sql+="id varchar(20) primary key, ";
			sql+="pass varchar(20),";
			sql+="regular_chk varchar(5) );";
			
			Statement stmt = conn.createStatement(); 
			
			stmt.execute(sql);
	
			System.out.println("테이블 생성!");
			
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
			
			// 최초 1번만 성공, 2번 이상 시도에는 이미 테이블이 존재하여 실패가 뜬다*
			
		}catch(ClassNotFoundException e) {
			System.out.println("로딩실패");
			
		}catch(SQLException e) {
			System.out.println("테이블 생성 실패");
		}
	}
}

