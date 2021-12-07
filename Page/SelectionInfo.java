package Page;

import static Page.LoginPage.user;
import static Page.StartPage.start;

import static Page.SelectSeatPage.room;
import static Page.SelectSeatPage.seatNum;
import static Page.SelectSeatPage.select_seat;
import static Page.SelectTimeTablePage.select_time;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Page.JoinPage;
import Page.LoginPage;
import Page.StartPage;
import Page.LoginPage.ImagePanel;
import Page.LoginPage.Listener;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextPane;

public class SelectionInfo extends JFrame  implements Runnable{

   private JPanel contentPane, panel, subtitle_panel, flower_img_panel, textID_panel, textPASS_panel;
   private JTextField field_id,  field_pass;
   private JLabel textID, textPASS, title;
   private JButton btn_Login;
   private Thread thread;
   String select_num;
   
   Font font_12 = new Font("Cafe24SsurroundAir", Font.BOLD, 12); 
   Font font_20 = new Font("Cafe24SsurroundAir", Font.BOLD, 20);
   Font font_30 = new Font("Cafe24SsurroundAir", Font.PLAIN, 30);
   
   SelectionInfo(){
      super("스터디카페 예약 프로그램 [STUDY US]");
      init();
     
      
//      Calendar cal = Calendar.getInstance();
//        
//        
//        String now = cal.get(Calendar.YEAR)+"년"+
//                (cal.get(Calendar.MONTH)+1)+"월"+
//                cal.get(Calendar.DATE)+"일"+
//                cal.get(Calendar.HOUR)+"시"+
//                cal.get(Calendar.MINUTE)+"분"+
//                cal.get(Calendar.SECOND)+"초";
//        
//        System.out.println(now);
       if(thread == null){
               //this의 의미는 Runnable이 구현된 객체를 뜻함(DigitalClock)
               thread = new Thread(this);
               thread.start();
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
         
         /* 요소를 전부 붙일 메인 panel */
         panel = new JPanel();
         panel.setBackground(Color.WHITE);
         contentPane.add(panel, BorderLayout.CENTER);
         panel.setLayout(null);
         
         /* 상단 바 panel */
         subtitle_panel = new JPanel();
         subtitle_panel.setLayout(null);
         subtitle_panel.setBackground(new Color(255,255,255));
         subtitle_panel.setForeground(new Color(211, 211, 211));
         subtitle_panel.setBorder(new LineBorder(new Color(215,176,212), 30, true));
         subtitle_panel.setBounds(0, 0, 1274, 52);
         panel.add(subtitle_panel);
         
         /* 상단 바 문구 */
         title = new JLabel("STUDY US");
         title.setForeground(new Color(255, 255, 255));
         title.setFont(new Font("Century Gothic", Font.PLAIN, 25));
         title.setBounds(22, 6, 440, 42);
         subtitle_panel.add(title);
         
         /* 상단 바 꽃 이미지 */
         flower_img_panel = new JPanel();
         flower_img_panel.setBounds(130, 12, 40, 30);
         subtitle_panel.add(flower_img_panel);
         flower_img_panel.setLayout(null);
           
         ImagePanel flowerimg = new ImagePanel(new ImageIcon("./img/resizeflower.png").getImage());
         flower_img_panel.add(flowerimg);
        
         /* 선택 정보 제목 & 패널 */
          JPanel SelInfo_title_panel = new JPanel();
        SelInfo_title_panel.setBounds(101, 80, 196, 39);
        SelInfo_title_panel.setLayout(null);
        SelInfo_title_panel.setBorder(new LineBorder(new Color(127,114,165), 30, true));
        panel.add(SelInfo_title_panel);
      
        JLabel SelInfo_title_text = new JLabel("선택 정보");
        SelInfo_title_text.setHorizontalAlignment(SwingConstants.CENTER);
        SelInfo_title_text.setForeground(Color.WHITE);
        SelInfo_title_text.setFont(font_20);
        SelInfo_title_text.setBounds(31, 7, 139, 25);
        SelInfo_title_panel.add(SelInfo_title_text);
      
         JPanel SelInfo_panel = new JPanel();
        SelInfo_panel.setBackground(Color.WHITE);
        SelInfo_panel.setBorder(new LineBorder(new Color(127,114,165), 1, true));
        SelInfo_panel.setBounds(72, 96, 1109, 590);
        SelInfo_panel.setLayout(null);
        panel.add(SelInfo_panel);
          
      
       /* 선택한 시간제 출력 */
       JPanel SelTime_panel = new JPanel();
       SelTime_panel.setBorder(new LineBorder(new Color(255,223,132), 30, true));
       SelTime_panel.setBackground(Color.WHITE);
        SelTime_panel.setBounds(350, 203, 153, 33);// 세로 - 30 가로 +10
        SelInfo_panel.add(SelTime_panel);
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
        SetSeltime_label.setBounds(534, 203, 274, 33);
        SelInfo_panel.add(SetSeltime_label);
        
        
      
        /* 선택한 좌석 출력 */
        JPanel SelSeat_panel = new JPanel();
        SelSeat_panel.setBorder(new LineBorder(new Color(240, 128, 128), 30, true));
        SelSeat_panel.setBackground(Color.WHITE);
        SelSeat_panel.setBounds(350, 270, 153, 33);
        SelInfo_panel.add(SelSeat_panel);
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
        SelSeat_label.setBounds(534, 270, 274, 33);
        SelInfo_panel.add(SelSeat_label);


        /* 결제 & 취소 버튼 */
        JButton btn_sumit = new JButton("결제");
        btn_sumit.setForeground(Color.WHITE);
        btn_sumit.setBounds(805, 400,  105, 33);
        btn_sumit.setBorderPainted(false);
        btn_sumit.setBackground(new Color(53,69,98));
        SelInfo_panel.add(btn_sumit);
        btn_sumit.addActionListener(new Listener(this));
         
        JButton btn_cancel = new JButton("취소");
        btn_cancel.setForeground(Color.WHITE);
         btn_cancel.setBounds(690, 400, 105, 33);
         btn_cancel.setBorderPainted(false);   
         btn_cancel.setBackground(new Color(53,69,98));
         btn_cancel.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                new StartPage(); // LoginPage 실행
                setVisible(false); // 창 안보이게 하기
             }
          });
        SelInfo_panel.add(btn_cancel);
        
   }   
   /* 결제 버튼 클릭 이벤트 */
	class Listener implements ActionListener{
		
		int sec;
		JFrame frame;
		
		public Listener(JFrame f) {
			frame = f;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
		
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/STUDY_US";
				String id = "root";
				String pw = "111111";
				Connection conn = DriverManager.getConnection(url, id, pw);
		
				Statement stmt = conn.createStatement(); 
				String sql1 =  "insert into seat(id, room, seat_num, use_chk) values('"+user.getId()+"', '"+room+"', "+Integer.parseInt(seatNum)+", 'true');"; 
				stmt.executeUpdate(sql1);
		
				String sql2 = "SELECT * FROM time WHERE period= '"+select_time+"'";
				Statement stmt2 = conn.createStatement(); 
				ResultSet rs = stmt.executeQuery(sql2); //결과를 담을 ResultSet 생성 후 결과 담기
				
				while(rs.next()) {
					sec = rs.getInt("sec");
					break;
				}
				
				SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd/hh/mm/ss");
			    Date today = new Date();
				System.out.println(date.format(today));
				   
				String sql3 = "update user set selected_time=?, sec=?, selected_seat=?, start_date=? where id=?";
				PreparedStatement pstmt = null;
				
				pstmt = conn.prepareStatement(sql3.toString());
				pstmt.setString(1, select_time);
				pstmt.setInt(2, sec);
				pstmt.setString(3, select_seat);
				pstmt.setString(4, date.format(today));
				pstmt.setString(5, user.getId());
				
				int cnt = pstmt.executeUpdate();
				conn.close();
				
				JOptionPane.showMessageDialog(frame, "결제되었습니다"); 	
				
				new MyPage();
				setVisible(false);
			
			}catch(Exception ee) {
				System.out.println("실패");
			}
		 }
	}
   /* 패널에 그림 올리기 클래스 (꽃 이미지) */
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
   
      
   public static void main(String[] args) {
      new SelectionInfo();
   }


@Override
public void run() {
   // TODO Auto-generated method stub
   
}
}
