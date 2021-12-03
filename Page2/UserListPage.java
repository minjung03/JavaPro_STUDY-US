package Page2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

//순번 auto_incremet그거 넣으면 훨씬 조을듯 or for문 i돌려서 찍던지!!
public class UserListPage extends JFrame{
	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	JPanel contentPane, panel, subtitle_panel, result_panel;
	JLabel title;
	
	public UserListPage() {
		super("스터디카페 예약 프로그램 [STUDY US]");
	      init();
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
				JOptionPane.showMessageDialog(null, rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3), "유저리스트", JOptionPane.PLAIN_MESSAGE);
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

public final void init() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setResizable(false); //사이즈 변경 불가능
		setVisible(true); //보이게 할지 여부
		setBounds(100, 100, 1300, 800);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel(); //전체 패널
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		subtitle_panel = new JPanel();
        subtitle_panel.setLayout(null);
        subtitle_panel.setForeground(new Color(211, 211, 211));
        subtitle_panel.setBorder(new LineBorder(new Color(211,183,219), 30, true));
        subtitle_panel.setBounds(0, 0, 1273, 52);
        panel.add(subtitle_panel);
        
        title = new JLabel("STUDY US");
        title.setForeground(new Color(255, 255, 255));
        title.setFont(new Font("Century Gothic", Font.PLAIN, 25));
        title.setBounds(22, 6, 440, 42);
        subtitle_panel.add(title);
	}	
	
	public static void main(String[] args) {
		new UserListPage();
	}
}