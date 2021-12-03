package Page2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//순번 auto_incremet그거 넣으면 훨씬 조을듯 or for문 i돌려서 찍던지!!
public class UserListPage {
	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	public UserListPage() {
		try {
			String url = "jdbc:mysql://localhost:3306/STUDY_US";
			String id = "root";
			String pw = "111111";

			con = DriverManager.getConnection(url, id, pw);
			System.out.println("DB연결 성공");

			stmt = con.createStatement();
			System.out.println("Statement객체 생성 성공");
			System.out.println();
			
			rs = stmt.executeQuery("select * from user"); // 조회한 결과들을 ResultSet에 rs에 저장한다.
			System.out.print("==user 리스트==");
			while (rs.next()) { // rs.next()를 통해 다음행을 내려갈 수 있으면 true를 반환하고, 커서를 한칸 내린다. 다음행이 없으면 false를 반환한다.
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3)); // getInt(1)은 컬럼의
																										// 1번째 값을 Int형으로
																										// 가져온다. /
																										// getString(2)는
																										// 컬럼의 2번째 값을
																										// String형으로
																										// 가져온다.
			}

			rs.close();
			stmt.close();
			con.close(); // getString(2)는 컬럼의
			// 2번째 값을 String형으로
			// 가져온다.
		} catch (SQLException e) {
			System.out.println("DB연결 실패하거나, SQL문이 틀렸습니다.");
			System.out.print("사유 : " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		new UserListPage();
	}
}