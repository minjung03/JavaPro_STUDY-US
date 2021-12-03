package Page2;

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

import Page2.JoinPage;
import Page2.LoginPage;
import Page2.StartPage;

import java.awt.Color;
import java.awt.Button;
import javax.swing.JTable;

public class SeatPage extends JFrame {

	private JPanel contentPane, panel, panel2, seattable_panel;
	private JTextField field_pass;
	private JLabel textID, textPASS, title;
	private JTable table;
	
	Font font_10 = new Font("Cafe24SsurroundAir", Font.PLAIN, 10);
	Font font_20 = new Font("Cafe24SsurroundAir", Font.PLAIN, 20);
	
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
        subtitle_panel.setBorder(new LineBorder(new Color(211,183,219), 30, true));
        subtitle_panel.setBounds(0, 0, 1273, 52);
        panel.add(subtitle_panel);
        
        JLabel title = new JLabel("STUDY US");
        title.setForeground(new Color(255, 255, 255));
        title.setFont(new Font("Century Gothic", Font.PLAIN, 25));
        title.setBounds(22, 6, 440, 42);
        subtitle_panel.add(title);
		
		JPanel seattable_title_panel = new JPanel();
		seattable_title_panel.setBounds(101, 96, 196, 39);
		
		panel.add(seattable_title_panel);
		seattable_title_panel.setLayout(null);
		seattable_title_panel.setBorder(new LineBorder(new Color(211,183,219), 30, true));
		
		JLabel seattable_title_text = new JLabel("ÁÂ¼®¼±ÅÃ");
		seattable_title_text.setHorizontalAlignment(SwingConstants.CENTER);
		seattable_title_text.setForeground(Color.WHITE);
		seattable_title_text.setFont(font_20);
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
	      panel1.setBackground(new Color(211,183,219));
	      panel1.setBounds(247, 54, 78, 2);
	      seattable_panel.add(panel1);
	      
	      JLabel label_mainRoom = new JLabel("¸ÞÀÎ½Ç");
	      label_mainRoom.setHorizontalAlignment(SwingConstants.CENTER);
	      label_mainRoom.setBounds(258, 62, 57, 15);
	      seattable_panel.add(label_mainRoom);
	      
	  	  SeatSetting();

	      
	      JPanel panel2 = new JPanel();
	      panel2.setBackground(new Color(211,183,219));
	      panel2.setBounds(836, 54, 78, 2);
	      seattable_panel.add(panel2);
	      
	      JLabel label_meetingRoom = new JLabel("È¸ÀÇ½Ç");
	      label_meetingRoom.setHorizontalAlignment(SwingConstants.CENTER);
	      label_meetingRoom.setBounds(847, 62, 57, 15);
	      seattable_panel.add(label_meetingRoom); 
	      
	      MeetingSetting();
	      
	      
	      JPanel panel3 = new JPanel();
	      panel3.setBackground(new Color(211,183,219));
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
			btn_Chk.setFont(font_10);
			btn_Chk.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
			btn_Chk.setBackground(new Color(211,183,219));
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
		JLabel SeatNum_1 = new JLabel("1");
	      SeatNum_1.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      SeatNum_1.setForeground(Color.WHITE);
	      SeatNum_1.setHorizontalAlignment(SwingConstants.CENTER);
	      SeatNum_1.setBounds(101, 102, 13, 15);
	      seattable_panel.add(SeatNum_1);
	           
	      JLabel SeatNum_2 = new JLabel("2");
	      SeatNum_2.setHorizontalAlignment(SwingConstants.CENTER);
	      SeatNum_2.setForeground(Color.WHITE);
	      SeatNum_2.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      SeatNum_2.setBounds(101, 174, 13, 15);
	      seattable_panel.add(SeatNum_2);
	      	      
	      JLabel SeatNum_3 = new JLabel("3");
	      SeatNum_3.setHorizontalAlignment(SwingConstants.CENTER);
	      SeatNum_3.setForeground(Color.WHITE);
	      SeatNum_3.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      SeatNum_3.setBounds(101, 246, 13, 15);
	      seattable_panel.add(SeatNum_3);
	      
	      JLabel SeatNum_4 = new JLabel("4");
	      SeatNum_4.setHorizontalAlignment(SwingConstants.CENTER);
	      SeatNum_4.setForeground(Color.WHITE);
	      SeatNum_4.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      SeatNum_4.setBounds(101, 318, 13, 15);
	      seattable_panel.add(SeatNum_4);
	      
	      JLabel SeatNum_5 = new JLabel("5");
	      SeatNum_5.setHorizontalAlignment(SwingConstants.CENTER);
	      SeatNum_5.setForeground(Color.WHITE);
	      SeatNum_5.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      SeatNum_5.setBounds(101, 390, 13, 15);
	      seattable_panel.add(SeatNum_5);
	      
	      JLabel SeatNum_6 = new JLabel("6");
	      SeatNum_6.setHorizontalAlignment(SwingConstants.CENTER);
	      SeatNum_6.setForeground(Color.WHITE);
	      SeatNum_6.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      SeatNum_6.setBounds(101, 462, 13, 15);
	      seattable_panel.add(SeatNum_6);	      
	      
	      
	      JButton btn_seat1_chk = new JButton("»ç¿ë°¡´É");
	      btn_seat1_chk.setBackground(SystemColor.controlHighlight);
	      btn_seat1_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 12));
	      btn_seat1_chk.setForeground(Color.WHITE);
	      btn_seat1_chk.setBounds(91, 92, 127, 62);
	      seattable_panel.add(btn_seat1_chk);
	      
	      JButton btn_seat2_chk = new JButton("»ç¿ë°¡´É");
	      btn_seat2_chk.setBackground(SystemColor.controlHighlight);
	      btn_seat2_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 12));
	      btn_seat2_chk.setForeground(Color.WHITE);
	      btn_seat2_chk.setBounds(91, 164, 127, 62);
	      seattable_panel.add(btn_seat2_chk);
	      
	      JButton btn_seat3_chk = new JButton("»ç¿ë°¡´É");
	      btn_seat3_chk.setBackground(SystemColor.controlHighlight);
	      btn_seat3_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 12));
	      btn_seat3_chk.setForeground(Color.WHITE);
	      btn_seat3_chk.setBounds(91, 236, 127, 62);
	      seattable_panel.add(btn_seat3_chk);
	      
	      JButton btn_seat4_chk = new JButton("»ç¿ë°¡´É");
	      btn_seat4_chk.setBackground(SystemColor.controlHighlight);
	      btn_seat4_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 12));
	      btn_seat4_chk.setForeground(Color.WHITE);
	      btn_seat4_chk.setBounds(91, 308, 127, 62);
	      seattable_panel.add(btn_seat4_chk);
	      
	      JButton btn_seat5_chk = new JButton("»ç¿ë°¡´É");
	      btn_seat5_chk.setBackground(SystemColor.controlHighlight);
	      btn_seat5_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 12));
	      btn_seat5_chk.setForeground(Color.WHITE);
	      btn_seat5_chk.setBounds(91, 380, 127, 62);
	      seattable_panel.add(btn_seat5_chk);
	      
	      JButton btn_seat6_chk = new JButton("»ç¿ë°¡´É");
	      btn_seat6_chk.setBackground(SystemColor.controlHighlight);
	      btn_seat6_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 12));
	      btn_seat6_chk.setForeground(Color.WHITE);
	      btn_seat6_chk.setBounds(91, 452, 127, 62);
	      seattable_panel.add(btn_seat6_chk);
	      
	      
	      
	      
	      
	      JLabel SeatNum_7 = new JLabel("7");
	      SeatNum_7.setHorizontalAlignment(SwingConstants.CENTER);
	      SeatNum_7.setForeground(Color.WHITE);
	      SeatNum_7.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      SeatNum_7.setBounds(240, 102, 13, 15);
	      seattable_panel.add(SeatNum_7);
	      
	      JLabel SeatNum_8 = new JLabel("8");
	      SeatNum_8.setHorizontalAlignment(SwingConstants.CENTER);
	      SeatNum_8.setForeground(Color.WHITE);
	      SeatNum_8.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      SeatNum_8.setBounds(240, 174, 13, 15);
	      seattable_panel.add(SeatNum_8);
	      
	      JLabel SeatNum_9 = new JLabel("9");
	      SeatNum_9.setHorizontalAlignment(SwingConstants.LEFT);
	      SeatNum_9.setForeground(Color.WHITE);
	      SeatNum_9.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      SeatNum_9.setBounds(240, 246, 13, 15);
	      seattable_panel.add(SeatNum_9);
	      
	      JLabel SeatNum_10 = new JLabel("10");
	      SeatNum_10.setHorizontalAlignment(SwingConstants.LEFT);
	      SeatNum_10.setForeground(Color.WHITE);
	      SeatNum_10.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      SeatNum_10.setBounds(239, 318, 25, 15);
	      seattable_panel.add(SeatNum_10);
	      
	      JLabel SeatNum_11 = new JLabel("11");
	      SeatNum_11.setHorizontalAlignment(SwingConstants.LEFT);
	      SeatNum_11.setForeground(Color.WHITE);
	      SeatNum_11.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      SeatNum_11.setBounds(240, 390, 19, 15);
	      seattable_panel.add(SeatNum_11);
	      
	      JLabel SeatNum_12 = new JLabel("12");
	      SeatNum_12.setHorizontalAlignment(SwingConstants.LEFT);
	      SeatNum_12.setForeground(Color.WHITE);
	      SeatNum_12.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      SeatNum_12.setBounds(240, 462, 19, 15);
	      seattable_panel.add(SeatNum_12);
	      
	      
	      JButton btn_seat7_chk = new JButton("\uC0AC\uC6A9\uAC00\uB2A5");
	      btn_seat7_chk.setBackground(SystemColor.controlHighlight);
	      btn_seat7_chk.setForeground(Color.WHITE);
	      btn_seat7_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 12));
	      btn_seat7_chk.setBounds(230, 92, 127, 62);
	      seattable_panel.add(btn_seat7_chk);
	      
	      JButton btn_seat8_chk = new JButton("\uC0AC\uC6A9\uAC00\uB2A5");
	      btn_seat8_chk.setBackground(SystemColor.controlHighlight);
	      btn_seat8_chk.setForeground(Color.WHITE);
	      btn_seat8_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 12));
	      btn_seat8_chk.setBounds(230, 164, 127, 62);
	      seattable_panel.add(btn_seat8_chk);
	      
	      JButton btn_seat9_chk = new JButton("\uC0AC\uC6A9\uAC00\uB2A5");
	      btn_seat9_chk.setBackground(SystemColor.controlHighlight);
	      btn_seat9_chk.setForeground(Color.WHITE);
	      btn_seat9_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 12));
	      btn_seat9_chk.setBounds(230, 236, 127, 62);
	      seattable_panel.add(btn_seat9_chk);
	      
	      JButton btn_seat10_chk = new JButton("\uC0AC\uC6A9\uAC00\uB2A5");
	      btn_seat10_chk.setBackground(SystemColor.controlHighlight);
	      btn_seat10_chk.setForeground(Color.WHITE);
	      btn_seat10_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 12));
	      btn_seat10_chk.setBounds(230, 308, 127, 62);
	      seattable_panel.add(btn_seat10_chk);
	      
	      JButton btn_seat11_chk = new JButton("\uC0AC\uC6A9\uAC00\uB2A5");
	      btn_seat11_chk.setBackground(SystemColor.controlHighlight);
	      btn_seat11_chk.setForeground(Color.WHITE);
	      btn_seat11_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 12));
	      btn_seat11_chk.setBounds(230, 380, 127, 62);
	      seattable_panel.add(btn_seat11_chk);
	      
	      JButton btn_seat12_chk = new JButton("\uC0AC\uC6A9\uAC00\uB2A5");
	      btn_seat12_chk.setBackground(SystemColor.controlHighlight);
	      btn_seat12_chk.setForeground(Color.WHITE);
	      btn_seat12_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 12));
	      btn_seat12_chk.setBounds(230, 452, 127, 62);
	      seattable_panel.add(btn_seat12_chk);
	      
	      
	      
	      
	      JLabel SeatNum_13 = new JLabel("13");
	      SeatNum_13.setHorizontalAlignment(SwingConstants.LEFT);
	      SeatNum_13.setForeground(Color.WHITE);
	      SeatNum_13.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      SeatNum_13.setBounds(379, 102, 25, 15);
	      seattable_panel.add(SeatNum_13);
	      
	      JLabel SeatNum_14 = new JLabel("14");
	      SeatNum_14.setHorizontalAlignment(SwingConstants.LEFT);
	      SeatNum_14.setForeground(Color.WHITE);
	      SeatNum_14.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      SeatNum_14.setBounds(379, 174, 25, 15);
	      seattable_panel.add(SeatNum_14);
	      
	      JLabel SeatNum_15 = new JLabel("15");
	      SeatNum_15.setHorizontalAlignment(SwingConstants.LEFT);
	      SeatNum_15.setForeground(Color.WHITE);
	      SeatNum_15.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      SeatNum_15.setBounds(379, 246, 25, 15);
	      seattable_panel.add(SeatNum_15);
	      
	      JLabel SeatNum_16 = new JLabel("16");
	      SeatNum_16.setHorizontalAlignment(SwingConstants.LEFT);
	      SeatNum_16.setForeground(Color.WHITE);
	      SeatNum_16.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      SeatNum_16.setBounds(378, 318, 25, 15);
	      seattable_panel.add(SeatNum_16);
	      
	      JLabel SeatNum_17 = new JLabel("17");
	      SeatNum_17.setHorizontalAlignment(SwingConstants.LEFT);
	      SeatNum_17.setForeground(Color.WHITE);
	      SeatNum_17.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      SeatNum_17.setBounds(379, 390, 19, 15);
	      seattable_panel.add(SeatNum_17);
	      
	      JLabel SeatNum_18 = new JLabel("18");
	      SeatNum_18.setHorizontalAlignment(SwingConstants.LEFT);
	      SeatNum_18.setForeground(Color.WHITE);
	      SeatNum_18.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      SeatNum_18.setBounds(379, 462, 19, 15);
	      seattable_panel.add(SeatNum_18);
	      
	      JButton btn_seat13_chk = new JButton("\uC0AC\uC6A9\uAC00\uB2A5");
	      btn_seat13_chk.setBackground(SystemColor.controlHighlight);
	      btn_seat13_chk.setForeground(Color.WHITE);
	      btn_seat13_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 12));
	      btn_seat13_chk.setBounds(369, 92, 127, 62);
	      seattable_panel.add(btn_seat13_chk);
	      
	      JButton btn_seat14_chk = new JButton("\uC0AC\uC6A9\uAC00\uB2A5");
	      btn_seat14_chk.setBackground(SystemColor.controlHighlight);
	      btn_seat14_chk.setForeground(Color.WHITE);
	      btn_seat14_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 12));
	      btn_seat14_chk.setBounds(369, 164, 127, 62);
	      seattable_panel.add(btn_seat14_chk);
	      
	      JButton btn_seat15_chk = new JButton("\uC0AC\uC6A9\uAC00\uB2A5");
	      btn_seat15_chk.setBackground(SystemColor.controlHighlight);
	      btn_seat15_chk.setForeground(Color.WHITE);
	      btn_seat15_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 12));
	      btn_seat15_chk.setBounds(369, 236, 127, 62);
	      seattable_panel.add(btn_seat15_chk);
	      
	      JButton btn_seat16_chk = new JButton("\uC0AC\uC6A9\uAC00\uB2A5");
	      btn_seat16_chk.setBackground(SystemColor.controlHighlight);
	      btn_seat16_chk.setForeground(Color.WHITE);
	      btn_seat16_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 12));
	      btn_seat16_chk.setBounds(369, 308, 127, 62);
	      seattable_panel.add(btn_seat16_chk);
	      
	      JButton btn_seat17_chk = new JButton("\uC0AC\uC6A9\uAC00\uB2A5");
	      btn_seat17_chk.setBackground(SystemColor.controlHighlight);
	      btn_seat17_chk.setForeground(Color.WHITE);
	      btn_seat17_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 12));
	      btn_seat17_chk.setBounds(369, 380, 127, 62);
	      seattable_panel.add(btn_seat17_chk);
	      
	      JButton btn_seat18_chk = new JButton("\uC0AC\uC6A9\uAC00\uB2A5");
	      btn_seat18_chk.setBackground(SystemColor.controlHighlight);
	      btn_seat18_chk.setForeground(Color.WHITE);
	      btn_seat18_chk.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 12));
	      btn_seat18_chk.setBounds(369, 452, 127, 62);
	      seattable_panel.add(btn_seat18_chk);
	      
	}
	   
	   public static void main(String[] args) {
	      new SeatPage();
	   }
}
