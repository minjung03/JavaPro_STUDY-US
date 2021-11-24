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

public class SeatPage extends JFrame {

	private JPanel contentPane, panel, panel2, seattable_panel;
	private JTextField field_pass;
	private JLabel textID, textPASS, title;
	private JTable table;
	
	SeatPage(){		
		super("½ºÅÍµðÄ«Æä ¿¹¾à ÇÁ·Î±×·¥ [STUDY US]");
		init();
	}
	
	public final void init() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setResizable(false); //»çÀÌÁî º¯°æ ºÒ°¡´É
		setVisible(true); //º¸ÀÌ°Ô ÇÒÁö ¿©ºÎ
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
		
		JLabel seattable_title_text = new JLabel("ÁÂ¼®¼±ÅÃ");
		seattable_title_text.setHorizontalAlignment(SwingConstants.CENTER);
		seattable_title_text.setForeground(Color.WHITE);
		seattable_title_text.setFont(new Font("¡¾¨ù¢¬©÷", Font.PLAIN, 20));
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
	      
	      JLabel label_mainRoom = new JLabel("¸ÞÀÎ½Ç");
	      label_mainRoom.setHorizontalAlignment(SwingConstants.CENTER);
	      label_mainRoom.setBounds(258, 62, 57, 15);
	      seattable_panel.add(label_mainRoom);
	      
	  	  SeatSetting();

	      
	      JPanel panel2 = new JPanel();
	      panel2.setBackground(Color.BLACK);
	      panel2.setBounds(836, 54, 78, 2);
	      seattable_panel.add(panel2);
	      
	      JLabel label_meetingRoom = new JLabel("È¸ÀÇ½Ç");
	      label_meetingRoom.setHorizontalAlignment(SwingConstants.CENTER);
	      label_meetingRoom.setBounds(847, 62, 57, 15);
	      seattable_panel.add(label_meetingRoom); 
	      
	      MeetingSetting();
	      
	      
	      JPanel panel3 = new JPanel();
	      panel3.setBackground(Color.BLACK);
	      panel3.setBounds(884, 243, 78, 2);
	      seattable_panel.add(panel3);
	      
	      JLabel label_privateRoom = new JLabel("°³ÀÎ½Ç");
	      label_privateRoom.setHorizontalAlignment(SwingConstants.CENTER);
	      label_privateRoom.setBounds(895, 251, 57, 15);
	      seattable_panel.add(label_privateRoom);
	      
	      PrivateSetting();
	      
	      
	      JButton btn_Chk = new JButton("¼±ÅÃ ¿Ï·á");
			btn_Chk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new SelectionInfo();
					 setVisible(false);  // Ã¢ ¾Èº¸ÀÌ°Ô ÇÏ±â 
				}
			});
			btn_Chk.setForeground(Color.WHITE);
			btn_Chk.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
			btn_Chk.setBackground(Color.BLACK);
			btn_Chk.setBounds(941, 531, 97, 28);
			seattable_panel.add(btn_Chk);      
		
	}
	
	public void PrivateSetting() {
		
		JLabel priroomNum_1 = new JLabel("1");
		priroomNum_1.setHorizontalAlignment(SwingConstants.LEFT);
		priroomNum_1.setForeground(Color.WHITE);
		priroomNum_1.setFont(new Font("±¼¸²", Font.BOLD, 15));
		priroomNum_1.setBounds(966, 250, 19, 15);
	    seattable_panel.add(priroomNum_1);
	    
	      JButton btn_PR1_chk = new JButton("\uC0AC\uC6A9\uAC00\uB2A5");
	      btn_PR1_chk.setBackground(SystemColor.controlHighlight);
	      btn_PR1_chk.setForeground(Color.WHITE);
	      btn_PR1_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 11));
	      btn_PR1_chk.setBounds(960, 242, 78, 84);
	      seattable_panel.add(btn_PR1_chk);
	           
	      
	      
	      JLabel priroomNum_2 = new JLabel("2");
	      priroomNum_2.setHorizontalAlignment(SwingConstants.LEFT);
	      priroomNum_2.setForeground(Color.WHITE);
	      priroomNum_2.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      priroomNum_2.setBounds(966, 344, 19, 15);
	      seattable_panel.add(priroomNum_2);
	      
	      JButton btn_PR2_chk = new JButton("\uC0AC\uC6A9\uAC00\uB2A5");
	      btn_PR2_chk.setBackground(SystemColor.controlHighlight);
	      btn_PR2_chk.setForeground(Color.WHITE);
	      btn_PR2_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 11));
	      btn_PR2_chk.setBounds(960, 336, 78, 84);
	      seattable_panel.add(btn_PR2_chk);
	      
	      
	      
	      JLabel priroomNum_3 = new JLabel("3");
	      priroomNum_3.setHorizontalAlignment(SwingConstants.LEFT);
	      priroomNum_3.setForeground(Color.WHITE);
	      priroomNum_3.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      priroomNum_3.setBounds(966, 438, 19, 15);
	      seattable_panel.add(priroomNum_3);
	      
	      JButton btn_PR3_chk = new JButton("\uC0AC\uC6A9\uAC00\uB2A5");
	      btn_PR3_chk.setBackground(SystemColor.controlHighlight);
	      btn_PR3_chk.setForeground(Color.WHITE);
	      btn_PR3_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 11));
	      btn_PR3_chk.setBounds(960, 430, 78, 84);
	      seattable_panel.add(btn_PR3_chk);
	      
	      
	      JLabel priroomNum_4 = new JLabel("4");
	      priroomNum_4.setHorizontalAlignment(SwingConstants.LEFT);
	      priroomNum_4.setForeground(Color.WHITE);
	      priroomNum_4.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      priroomNum_4.setBounds(876, 438, 19, 15);
	      seattable_panel.add(priroomNum_4);
	      
	      JButton btn_PR4_chk = new JButton("»ç¿ë°¡´É");
	      btn_PR4_chk.setBackground(SystemColor.controlHighlight);
	      btn_PR4_chk.setForeground(Color.WHITE);
	      btn_PR4_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 11));
	      btn_PR4_chk.setBounds(870, 430, 78, 84);
	      seattable_panel.add(btn_PR4_chk);
	      
	      
	      JLabel priroomNum_5 = new JLabel("5");
	      priroomNum_5.setHorizontalAlignment(SwingConstants.LEFT);
	      priroomNum_5.setForeground(Color.WHITE);
	      priroomNum_5.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      priroomNum_5.setBounds(783, 438, 19, 15);
	      seattable_panel.add(priroomNum_5);
	      
	      JButton btn_PR5_chk = new JButton("»ç¿ë°¡´É");
	      btn_PR5_chk.setBackground(SystemColor.controlHighlight);
	      btn_PR5_chk.setForeground(Color.WHITE);
	      btn_PR5_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 11));
	      btn_PR5_chk.setBounds(777, 430, 78, 84);
	      seattable_panel.add(btn_PR5_chk);
	      
	      
	      JLabel priroomNum_6 = new JLabel("6");
	      priroomNum_6.setHorizontalAlignment(SwingConstants.LEFT);
	      priroomNum_6.setForeground(Color.WHITE);
	      priroomNum_6.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      priroomNum_6.setBounds(692, 439, 19, 15);
	      seattable_panel.add(priroomNum_6);
	      
	      JButton btn_PR6_chk = new JButton("»ç¿ë°¡´É");
	      btn_PR6_chk.setBackground(SystemColor.controlHighlight);
	      btn_PR6_chk.setForeground(Color.WHITE);
	      btn_PR6_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 11));
	      btn_PR6_chk.setBounds(686, 431, 78, 84);
	      seattable_panel.add(btn_PR6_chk);
	     	        
	}
	
	public void MeetingSetting() {
		
		JLabel meetingroomNum_1 = new JLabel("1");
	      meetingroomNum_1.setHorizontalAlignment(SwingConstants.LEFT);
	      meetingroomNum_1.setForeground(Color.WHITE);
	      meetingroomNum_1.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      meetingroomNum_1.setBounds(733, 100, 25, 24);
	      seattable_panel.add(meetingroomNum_1);
	      
	      JLabel meetingroomNum_2 = new JLabel("2");
	      meetingroomNum_2.setHorizontalAlignment(SwingConstants.LEFT);
	      meetingroomNum_2.setForeground(Color.WHITE);
	      meetingroomNum_2.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      meetingroomNum_2.setBounds(897, 100, 25, 24);
	      seattable_panel.add(meetingroomNum_2);
	      

	      JButton btn_MR1_chk = new JButton("»ç¿ë°¡´É");
	      btn_MR1_chk.setBackground(SystemColor.controlHighlight);
	      btn_MR1_chk.setForeground(Color.WHITE);
	      btn_MR1_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 12));
	      btn_MR1_chk.setBounds(720, 92, 154, 131);
	      seattable_panel.add(btn_MR1_chk);
	      
	      JButton btn_MR2_chk = new JButton("»ç¿ë°¡´É");
	      btn_MR2_chk.setBackground(SystemColor.controlHighlight);
	      btn_MR2_chk.setForeground(Color.WHITE);
	      btn_MR2_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 12));
	      btn_MR2_chk.setBounds(884, 92, 154, 131);
	      seattable_panel.add(btn_MR2_chk);
	      
	      
	}
	
	public void SeatSetting() {
		
	     
		JLabel[] SeatNum = new JLabel[18];
		String num = "1";
		for(int i=0; i<18; i++) {
			SeatNum[i] = new JLabel(num);
			SeatNum[i].setFont(new Font("±¼¸²", Font.BOLD, 15));
			SeatNum[i].setForeground(Color.WHITE);
			SeatNum[i].setHorizontalAlignment(SwingConstants.CENTER);
		      
			int num_set = Integer.valueOf(num);
			num_set++;
			num = String.valueOf(num_set);
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
		
		
		
		JButton[] btn_seat = new JButton[18];
		for(int i=0; i<18; i++) {
			btn_seat[i] = new JButton("»ç¿ë°¡´É");
			btn_seat[i].setBackground(SystemColor.controlHighlight);
			btn_seat[i].setForeground(Color.WHITE);
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
	public void actionPerformed(ActionEvent e) {

	}
	
	   public static void main(String[] args) {
	      new SeatPage();
	   }
}
