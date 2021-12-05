package Page;

import static Page.SelectSeatPage.select_seat;
import static Page.SelectTimeTablePage.select_time;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

//순번 auto_incremet그거 넣으면 훨씬 조을듯 or for문 i돌려서 찍던지!!
public class MyPage extends JFrame {
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	private ResultSet rs2;

	JPanel contentPane, panel, subtitle_panel, result_panel, inlist_title_panel;
	JLabel title, inlist_title_text;

	public MyPage() {
		super("스터디카페 예약 프로그램 [STUDY US]");
		init();

	}

	public final void init() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // 사이즈 변경 불가능
		setVisible(true); // 보이게 할지 여부
		setBounds(100, 100, 1300, 800);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		panel = new JPanel(); // 전체 패널
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		subtitle_panel = new JPanel();
		subtitle_panel.setLayout(null);
		subtitle_panel.setForeground(Color.white);
		subtitle_panel.setBorder(new LineBorder(new Color(211, 183, 219), 30, true));
		subtitle_panel.setBounds(0, 0, 1273, 52);
		panel.add(subtitle_panel);

		title = new JLabel("STUDY US");
		title.setForeground(new Color(255, 255, 255));
		title.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		title.setBounds(22, 6, 440, 42);
		subtitle_panel.add(title);

		/* 내 정보 제목 & 패널 */
		JPanel User_title_panel = new JPanel();
		User_title_panel.setBounds(101, 80, 196, 39);
		User_title_panel.setLayout(null);
		User_title_panel.setBorder(new LineBorder(new Color(127, 114, 165), 30, true));
		panel.add(User_title_panel);

		JLabel User_title_text = new JLabel("내 정보");
		User_title_text.setFont(new Font("굴림", Font.PLAIN, 20));
		User_title_text.setHorizontalAlignment(SwingConstants.CENTER);
		User_title_text.setForeground(Color.WHITE);
		User_title_text.setBounds(26, 7, 139, 25);
		User_title_panel.add(User_title_text);

		/* 패널 테두리 */
		JPanel User_panel = new JPanel();
		User_panel.setBackground(Color.WHITE);
		User_panel.setBorder(new LineBorder(new Color(127, 114, 165), 1, true));
		User_panel.setBounds(72, 96, 1109, 590);
		panel.add(User_panel);
		User_panel.setLayout(null);

		JPanel User_img_panel = new JPanel();
		User_img_panel.setBounds(404, 137, 80, 80);
		User_img_panel.setBackground(Color.white);
		User_panel.add(User_img_panel);

		/* 선택한 시간제 출력 */
		JPanel SelTime_panel = new JPanel();
		SelTime_panel.setBorder(new LineBorder(new Color(255, 223, 132), 30, true));
		SelTime_panel.setBackground(Color.WHITE);
		SelTime_panel.setBounds(365, 273, 153, 33);
		User_panel.add(SelTime_panel);
		SelTime_panel.setLayout(null);

		JLabel Seltime_text = new JLabel("선택한 시간제");
		Seltime_text.setForeground(Color.WHITE);
		Seltime_text.setBounds(3, 10, 146, 17);
		SelTime_panel.add(Seltime_text);
		Seltime_text.setHorizontalAlignment(SwingConstants.CENTER);
		Seltime_text.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 14));

		JLabel SetSeltime_label = new JLabel(select_time);
		SetSeltime_label.setHorizontalAlignment(SwingConstants.LEFT);
		SetSeltime_label.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 20));
		SetSeltime_label.setBackground(Color.YELLOW);
		SetSeltime_label.setBounds(513, 273, 274, 33);
		User_panel.add(SetSeltime_label);

		/* 선택한 좌석 출력 */
		JPanel SelSeat_panel = new JPanel();
		SelSeat_panel.setBorder(new LineBorder(new Color(240, 128, 128), 30, true));
		SelSeat_panel.setBackground(Color.WHITE);
		SelSeat_panel.setBounds(365, 340, 153, 33);
		User_panel.add(SelSeat_panel);
		SelSeat_panel.setLayout(null);

		JLabel SelSeat_text = new JLabel("선택한 좌석");
		SelSeat_text.setHorizontalAlignment(SwingConstants.CENTER);
		SelSeat_text.setForeground(Color.WHITE);
		SelSeat_text.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 14));
		SelSeat_text.setBounds(3, 9, 146, 17);
		SelSeat_panel.add(SelSeat_text);

		JLabel SelSeat_label = new JLabel(select_seat);
		SelSeat_label.setHorizontalAlignment(SwingConstants.LEFT);
		SelSeat_label.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 20));
		SelSeat_label.setBackground(Color.YELLOW);
		SelSeat_label.setBounds(513, 340, 274, 33);
		User_panel.add(SelSeat_label);

		/* 주의사항 */

		JLabel caution1 = new JLabel("스터디카페이므로 정숙해주세요.");
		caution1.setHorizontalAlignment(JLabel.CENTER);
		caution1.setFont(new Font("굴림", Font.PLAIN, 15));
		caution1.setForeground(Color.GRAY);
		caution1.setBounds(7, 489, 242, 31);
		User_panel.add(caution1);

		JLabel caution2 = new JLabel("실내에서는 조용히 ! 노트북 자판 소리 주의 ! 핸드폰 무음은 필수 !");
		caution2.setHorizontalAlignment(SwingConstants.CENTER);
		caution2.setForeground(Color.GRAY);
		caution2.setFont(new Font("굴림", Font.PLAIN, 15));
		caution2.setBounds(7, 528, 454, 31);
		User_panel.add(caution2);

		// 패널에 그림을 올려주는 클래스
		class ImagePanel extends JPanel {
			private Image img;

			public ImagePanel(Image img) {
				this.img = img;
				setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
				setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
				setLayout(null);
			}

			public void paintComponent(Graphics g) {
				g.drawImage(img, 3, 0, null);
			}
		}
		JPanel flower_img_panel = new JPanel();
		flower_img_panel.setBounds(130, 12, 40, 30);
		subtitle_panel.add(flower_img_panel);
		flower_img_panel.setLayout(null);

		ImagePanel flowerimg = new ImagePanel(new ImageIcon("./img/resizeflower.png").getImage());
		flower_img_panel.add(flowerimg);

		ImagePanel userimg = new ImagePanel(new ImageIcon("./img/resizeuser.png").getImage());
		User_img_panel.add(userimg);

		/* 뒤로 가기 버튼 */
		ImageIcon backImg = new ImageIcon("./img/back_main_icon.png");
		JButton back = new JButton(backImg);
		back.setContentAreaFilled(false);
		back.setBorderPainted(false); // 버튼 테두리 설정해제
		back.setPreferredSize(new Dimension(30, 30)); // 버튼 크기 지정
		back.setBounds(1225, 16, 20, 20);
		subtitle_panel.add(back);

		try {

			String url = "jdbc:mysql://localhost:3306/STUDY_US";
			String id = "root";
			String pw = "111111";
			Connection conn = DriverManager.getConnection(url, id, pw);

			String sql = "SELECT name, id, pass FROM user"; // ?

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql); // 결과를 담을 ResultSet 생성 후 결과 담기

			while (rs.next()) {
				String user_name = rs.getString("name");
				String user_id = rs.getString("id");
				String user_pw = rs.getString("pass");

				JLabel username = new JLabel(user_name);
				username.setHorizontalAlignment(JLabel.CENTER); // 수평 가운데 정렬
				username.setFont(new Font("굴림", Font.PLAIN, 30));
				username.setBounds(450, 190, 179, 35);
				User_panel.add(username);

				JLabel username2 = new JLabel("님");
				username2.setHorizontalAlignment(JLabel.CENTER); // 수평 가운데 정렬
				username2.setFont(new Font("굴림", Font.PLAIN, 20));
				username2.setBounds(500, 190, 179, 35);
				User_panel.add(username2);
			}
//          int rowcount = 0;
//          int height_Default = 80;   //top여백
//          int index = 0;
//          
//          rs2 = stmt.executeQuery("SELECT COUNT(*) FROM user");
//          if (rs2.next())
//             rowcount = rs2.getInt(1);
//          rs2.close();
//          
//          JLabel userList[] = new JLabel[rowcount];
//          for(int i = 0; i<rowcount; i++) {
//            userList[i] = new JLabel();
//             userList[i].setFont(new Font("굴림", Font.PLAIN, 20));
//             userList[i].setBounds(65, height_Default, 500, 100);
//             height_Default += 30;
//             list_panel.add(userList[i]);
//          }
//          System.out.println(String.valueOf(rowcount));
//
//          rs = stmt.executeQuery("select name from user"); // 조회한 결과들을 ResultSet에 rs에 저장한다.
//          System.out.println("== mypage 리스트==");
//          while (rs.next()) { 
//            System.out.println(rs.getString(1));
//            System.out.println(index); 
//            userList[index].setText(rs.getString(1));
//             list_panel.add(userList[index]);
//             index++;
//          }
//          rs.close();
//          stmt.close();
//          con.close(); 

		} catch (SQLException e) {
			System.out.println("DB연결 실패하거나, SQL문이 틀렸습니다.");
			System.out.print("사유 : " + e.getMessage());
		}

	}

	public static void main(String[] args) {
		new MyPage();
	}
}