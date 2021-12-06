package Page;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

import java.awt.Color;
import java.awt.Button;
import javax.swing.JTable;


public class AdminShowSeat extends JFrame {

	public static String select_seat;
	private JPanel contentPane, panel, panel2, seattable_panel;
	private JTextField field_pass;
	private JLabel textID, textPASS, title;
	private JTable table;
	JLabel[] SeatNum = new JLabel[18];
	String select_num;
	
	AdminShowSeat(){		
		super("스터디카페 예약 프로그램 [STUDY US]");
		init();
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
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel subtitle_panel = new JPanel();
		subtitle_panel.setLayout(null);
		subtitle_panel.setForeground(new Color(211, 211, 211));
		subtitle_panel.setBorder(new LineBorder(new Color(192, 192, 192), 30, true));
		subtitle_panel.setBounds(0, 0, 1286, 52);
		panel.add(subtitle_panel);
		
		JLabel subtitle_text = new JLabel("STUDY US");
		subtitle_text.setForeground(Color.WHITE);
		subtitle_text.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		subtitle_text.setBounds(27, 4, 440, 42);
		subtitle_panel.add(subtitle_text);
		
		JPanel seattable_title_panel = new JPanel();
		seattable_title_panel.setBounds(101, 96, 196, 39);
		
		panel.add(seattable_title_panel);
		seattable_title_panel.setLayout(null);
		seattable_title_panel.setBorder(new LineBorder(new Color(184,184,184), 30, true));
		
		JLabel seattable_title_text = new JLabel("좌석선택");
		seattable_title_text.setHorizontalAlignment(SwingConstants.CENTER);
		seattable_title_text.setForeground(Color.WHITE);
		seattable_title_text.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		seattable_title_text.setBounds(31, 7, 139, 25);
		seattable_title_panel.add(seattable_title_text);
		
		seattable_panel = new JPanel();
		seattable_panel.setBackground(Color.WHITE);
		seattable_panel.setBorder(new LineBorder(new Color(192, 192, 192), 3, true));
		seattable_panel.setBounds(72, 96, 1109, 590);
		panel.add(seattable_panel);
		seattable_panel.setLayout(null);
	
	      
	      
	      JPanel panel_bar = new JPanel();
	      panel_bar.setBackground(SystemColor.control);
	      panel_bar.setBounds(553, 123, 2, 369);
	      seattable_panel.add(panel_bar);
	      
	      
	      JPanel panel1 = new JPanel();
	      panel1.setBackground(Color.BLACK);
	      panel1.setBounds(247, 54, 78, 2);
	      seattable_panel.add(panel1);
	      
	      JLabel label_mainRoom = new JLabel("메인실");
	      label_mainRoom.setHorizontalAlignment(SwingConstants.CENTER);
	      label_mainRoom.setBounds(258, 62, 57, 15);
	      seattable_panel.add(label_mainRoom);
	      
	  	  SeatSetting();
	      
	      JPanel panel2 = new JPanel();
	      panel2.setBackground(Color.BLACK);
	      panel2.setBounds(836, 54, 78, 2);
	      seattable_panel.add(panel2);
	      
	      JLabel label_meetingRoom = new JLabel("회의실");
	      label_meetingRoom.setHorizontalAlignment(SwingConstants.CENTER);
	      label_meetingRoom.setBounds(847, 62, 57, 15);
	      seattable_panel.add(label_meetingRoom); 
	      
	      MeetingSetting();
	      
	      JPanel panel3 = new JPanel();
	      panel3.setBackground(Color.BLACK);
	      panel3.setBounds(884, 243, 78, 2);
	      seattable_panel.add(panel3);
	      
	      JLabel label_privateRoom = new JLabel("개인실");
	      label_privateRoom.setHorizontalAlignment(SwingConstants.CENTER);
	      label_privateRoom.setBounds(895, 251, 57, 15);
	      seattable_panel.add(label_privateRoom);
	      
	      PrivateSetting();	      
	      
	      JButton btn_Chk = new JButton("선택 완료");
			btn_Chk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {	
					new SelectionInfo();
					 setVisible(false);  // 창 안보이게 하기 
				}
			});
			btn_Chk.setForeground(Color.WHITE);
			btn_Chk.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
			btn_Chk.setBackground(Color.BLACK);
			btn_Chk.setBounds(941, 531, 97, 28);
			seattable_panel.add(btn_Chk);      
		
	}	
	public void PrivateSetting() {
		
		
		String num = "1";
		int width_Default = 966;
		int height_Default = 250;
		
		JLabel[] privateNum = new JLabel[6];
		for(int i=0; i<6; i++) {
			privateNum[i] = new JLabel(num);
			privateNum[i].setHorizontalAlignment(SwingConstants.LEFT);
			privateNum[i].setForeground(Color.WHITE);
			privateNum[i].setFont(new Font("굴림", Font.BOLD, 15));
		    seattable_panel.add(privateNum[i]);
		    
			if(i<3) {
				privateNum[i].setBounds(width_Default, height_Default, 19, 15);
				height_Default+=94;
			}
			else if(i==3) {
				privateNum[i].setBounds(876, 438, 19, 15);
			}
			else if(i==4) {
				privateNum[i].setBounds(783, 438, 19, 15);
			}
			else if(i==5) {
				privateNum[i].setBounds(692, 439, 19, 15);
			}
			
			int num_set = Integer.valueOf(num);
			num_set++;
			num = String.valueOf(num_set);
		}
		
		height_Default = 242;
		JButton[] btn_private = new JButton[6];
		for(int i=0; i<6; i++) {
			btn_private[i] = new JButton("사용가능");
			btn_private[i].setBackground(SystemColor.controlHighlight);
			btn_private[i].setForeground(Color.WHITE);
			btn_private[i].setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 11));
	
			if(i<3) {
				btn_private[i].setBounds(960, height_Default, 78, 84);
				height_Default+=94;
			}
			else if(i==3) {
				btn_private[i].setBounds(870, 430, 78, 84);
			}
			else if(i==4) {
				btn_private[i].setBounds(777, 430, 78, 84);
			}
			else if(i==5) {
				btn_private[i].setBounds(686, 431, 78, 84);   	        
			}
	        seattable_panel.add(btn_private[i]);
		}
	
	}
	
	public void MeetingSetting() {

		  String num = "1";
		  int width_Defalut = 733;
		  
	      JLabel[] MettingSeatNum = new JLabel[2];
			for(int i=0; i<2; i++) {
				MettingSeatNum[i] = new JLabel(num);
				MettingSeatNum[i].setFont(new Font("굴림", Font.BOLD, 15));
				MettingSeatNum[i].setForeground(Color.WHITE);
				MettingSeatNum[i].setHorizontalAlignment(SwingConstants.LEFT);
				MettingSeatNum[i].setBounds(width_Defalut, 100, 25, 24);
				width_Defalut -= 164;
			      
				int num_set = Integer.valueOf(num);
				num_set++;
				num = String.valueOf(num_set);
				
		        seattable_panel.add(MettingSeatNum[i]);
			}
	      
	      
	      JButton[] btn_Metting = new JButton[2];
	      width_Defalut = 720;
	      for(int i=0; i<2; i++) {
	    	  btn_Metting[i] = new JButton("사용가능");
	    	  btn_Metting[i].setBackground(SystemColor.controlHighlight);
	    	  btn_Metting[i].setForeground(Color.WHITE);
	    	  btn_Metting[i].setBounds(width_Defalut, 92, 154, 131);
	    	  btn_Metting[i].setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 12));
		      seattable_panel.add(btn_Metting[i]);
	    	  width_Defalut += 164;
	      }
	 
	      
	}
	
	public void SeatSetting() {
		
		String[] num = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18"};
	
		/*for(int i=0; i<18; i++) {
			SeatNum[i] = new JLabel(num[i]);
			SeatNum[i].setFont(new Font("굴림", Font.BOLD, 15));
			SeatNum[i].setForeground(Color.WHITE);
			SeatNum[i].setHorizontalAlignment(SwingConstants.CENTER);
		}
		
		int label_height = 102;
		for(int i=0; i<6; i++) {
			SeatNum[i].setBounds(101, label_height, 13, 15);
		      label_height+=72;
		}
		
		label_height = 102;
		for(int i=6; i<12; i++) {
			SeatNum[i].setBounds(240, label_height, 13, 15);
   	        label_height+=72;
		      
		     // SeatNum_10.setBounds(239, 318, 25, 15);
		}
		
		label_height = 102;
		for(int i=12; i<18; i++) {
			SeatNum[i].setBounds(379, label_height, 25, 15);
   	        label_height+=72;
		}
		for(int i=0; i<18; i++) {
			seattable_panel.add(SeatNum[i]);
		}
		*/
		JButton[] btn_seat = new JButton[18];
		for(int i=0; i<18; i++) {
			btn_seat[i] = new JButton(num[i]);
			btn_seat[i].setBackground(SystemColor.controlHighlight);
			btn_seat[i].setForeground(Color.WHITE);
						
			btn_seat[i].addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		        	 JButton btn_num = (JButton)e.getSource();
		        	 // btn_num.setBackground(new Color(191,79,81));
		        	 // btn_num.setText("사용중");
		        	 
		        	 for(int i=1; i<=18; i++) {
		        		btn_seat[i-1].setBackground(SystemColor.controlHighlight);
			 			if(Integer.parseInt(btn_num.getText()) == i) {
			 				btn_num.setBackground(new Color(117,151,183));
			 				select_seat = "메인실 "+btn_num.getText()+"번 좌석";
			 			}
		        	 }
		        	 System.out.println(select_seat);
		          }
		     });
			
		}
		
		int height_Default = 92;
		for(int i=0; i<6; i++) {			
			btn_seat[i].setBounds(91, height_Default, 127, 62);
			height_Default+=72;
		}
		
		height_Default = 92;
		for(int i=6; i<12; i++) {
		    btn_seat[i].setBounds(230, height_Default, 127, 62);		
			height_Default+=72;
		}
		
		height_Default = 92;
		for(int i=12; i<18; i++) {
		    btn_seat[i].setBounds(369, height_Default, 127, 62);
			height_Default+=72;
		}
		
		for(int i=0; i<18; i++) {	
			seattable_panel.add(btn_seat[i]);
		}
	}
	

   public static void main(String[] args) {
      new AdminShowSeat();
   }
   
   
}
