package Page2;

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
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

//순번 auto_incremet그거 넣으면 훨씬 조을듯 or for문 i돌려서 찍던지!!
public class UserPage extends JFrame {
   private Connection con;
   private Statement stmt;
   private ResultSet rs;
   private ResultSet rs2;

   JPanel contentPane, panel, subtitle_panel, result_panel, inlist_title_panel;
   JLabel title, inlist_title_text;

   public UserPage() {
      super("스터디카페 예약 프로그램 [STUDY US]");
      init();
       
      JPanel list_panel = new JPanel();
      list_panel.setBounds(0, 141, 1286, 590);
      list_panel.setBackground(new Color(245,247,248));
      panel.add(list_panel);
      list_panel.setLayout(null);

      
     

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
      subtitle_panel.setBorder(new LineBorder(new Color(211,183,219), 30, true));
      subtitle_panel.setBounds(0, 0, 1273, 52);
      panel.add(subtitle_panel);

      title = new JLabel("STUDY US");
      title.setForeground(new Color(255, 255, 255));
      title.setFont(new Font("Century Gothic", Font.PLAIN, 25));
      title.setBounds(22, 6, 440, 42);
      subtitle_panel.add(title);
      
      //패널에 그림을 올려주는 클래스
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

			String sql = "SELECT name, id, pass FROM user";		//?

			Statement stmt = conn.createStatement(); 
			ResultSet rs = stmt.executeQuery(sql); //결과를 담을 ResultSet 생성 후 결과 담기
			
			while(rs.next()) {
				String user_name = rs.getString("name");
				String user_id = rs.getString("id");
				String user_pw = rs.getString("pass");
				
				 JLabel list_title = new JLabel(user_name+"님의 페이지");
			      list_title.setHorizontalAlignment(JLabel.CENTER); // 수평 가운데 정렬
			      list_title.setFont(new Font("굴림", Font.PLAIN, 20));
			      list_title.setBounds(595, 90, 150, 24);
			      panel.add(list_title);
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
 
      
      JPanel inlist_title_panel = new JPanel();
      inlist_title_panel.setBounds(0, 143, 1274, 60);
      panel.add(inlist_title_panel);
      inlist_title_panel.setLayout(null);
      inlist_title_panel.setBackground(new Color(211,183,219));
      
      JLabel inlist_title_SelectTime = new JLabel("선택하신 시간");
      inlist_title_SelectTime.setFont(new Font("굴림", Font.PLAIN, 20));
      inlist_title_SelectTime.setForeground(Color.WHITE);
      inlist_title_SelectTime.setBounds(65, 12, 130, 35);
      inlist_title_panel.add(inlist_title_SelectTime);
      
      JLabel inlist_title_CurrentTime = new JLabel("남은 시간");
      inlist_title_CurrentTime.setForeground(Color.WHITE);
      inlist_title_CurrentTime.setFont(new Font("굴림", Font.PLAIN, 20));
      inlist_title_CurrentTime.setBounds(300, 12, 121, 35);
      inlist_title_panel.add(inlist_title_CurrentTime);
      

   }

   public static void main(String[] args) {
      new UserPage();
   }
}