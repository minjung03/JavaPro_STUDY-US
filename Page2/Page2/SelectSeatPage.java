package Page2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

import Page2.JoinPage;
import Page2.LoginPage;
import Page2.StartPage;
import Page2.LoginPage.Listener;
//import Page2.SelectTimeTablePage.ImagePanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Button;
import javax.swing.JTable;


public class SelectSeatPage extends JFrame {

	public static String select_seat;
	private JPanel contentPane, panel, panel2, seattable_panel, subtitle_panel, flower_img_panel;
	private JTextField field_pass;
	private JLabel textID, textPASS, title;
	private JTable table;
	JLabel[] SeatNum = new JLabel[18];
	String select_num;

   Font font_20 = new Font("Cafe24SsurroundAir", Font.BOLD, 20);
   Font font_12 = new Font("Cafe24SsurroundAir", Font.BOLD, 12);
   Font font_14 = new Font("Cafe24SsurroundAir", Font.BOLD, 14);
   Font font_16 = new Font("Cafe24SsurroundAir", Font.BOLD, 16);
	
	SelectSeatPage(){		
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
	     
	     
	    /* '좌석 선택' 제목 & 배경 */
		JPanel seattable_title_panel = new JPanel();
		seattable_title_panel.setBounds(101, 80, 196, 39);
		seattable_title_panel.setLayout(null);
		seattable_title_panel.setBackground(new Color(255,255,255));
		seattable_title_panel.setBorder(new LineBorder(new Color(127,114,165), 30, true));
		panel.add(seattable_title_panel);
		
		JLabel seattable_title_text = new JLabel("좌석 선택");
		seattable_title_text.setHorizontalAlignment(SwingConstants.CENTER);
		seattable_title_text.setForeground(Color.WHITE);
		seattable_title_text.setFont(font_20);
		seattable_title_text.setBounds(31, 7, 139, 25);
		seattable_title_panel.add(seattable_title_text);
		
		seattable_panel = new JPanel();
		seattable_panel.setBackground(Color.WHITE);
		seattable_panel.setBorder(new LineBorder(new Color(127,114,165), 1, true));
		seattable_panel.setBounds(72, 96, 1109, 590);
		panel.add(seattable_panel);
		seattable_panel.setLayout(null);
	
	      
	    /* 메인실 표시 & 세팅 */
        JPanel mainromm_bar = new JPanel();
        mainromm_bar.setBackground(Color.BLACK);
        mainromm_bar.setBounds(247, 54, 78, 2);
        seattable_panel.add(mainromm_bar);
      
        JLabel label_mainRoom = new JLabel("메인실");
        label_mainRoom.setHorizontalAlignment(SwingConstants.CENTER);
        label_mainRoom.setBounds(258, 62, 57, 15);
        seattable_panel.add(label_mainRoom);
	
	    SeatSetting();
	    

	    /* 회의실 표시 & 세팅 */
	    JPanel mettingromm_bar = new JPanel();
	    mettingromm_bar.setBackground(Color.BLACK);
	    mettingromm_bar.setBounds(836, 54, 78, 2);
	    seattable_panel.add(mettingromm_bar);
	      
	    JLabel label_meetingRoom = new JLabel("회의실");
	    label_meetingRoom.setHorizontalAlignment(SwingConstants.CENTER);
        label_meetingRoom.setBounds(847, 62, 57, 15);
	    seattable_panel.add(label_meetingRoom); 
	      
	    MeetingSetting();
	      
	      
	    /* 개인실 표시 & 세팅 */
	    JPanel privateromm_bar = new JPanel();
	    privateromm_bar.setBackground(Color.BLACK);
	    privateromm_bar.setBounds(884, 243, 78, 2);
	    seattable_panel.add(privateromm_bar);
	      
	    JLabel label_privateRoom = new JLabel("개인실");
	    label_privateRoom.setHorizontalAlignment(SwingConstants.CENTER);
	    label_privateRoom.setBounds(895, 251, 57, 15);
	    seattable_panel.add(label_privateRoom);
	      
	    PrivateSetting();	  
	    
   
	    /* 선택 완료 버튼 */
        JButton btn_Chk = new JButton("선택 완료");
		btn_Chk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				new SelectionInfo();
				 setVisible(false);  // 창 안보이게 하기 
			}
		});
		btn_Chk.setFont(font_12);
		btn_Chk.setForeground(Color.WHITE);
		btn_Chk.setBackground(Color.BLACK);
		btn_Chk.setBounds(933, 531, 105, 33);
		btn_Chk.setBackground(new Color(53,69,98)); 
		btn_Chk.setBorderPainted(false);
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
		
		JButton[] btn_seat = new JButton[18];
		for(int i=0; i<18; i++) {
			btn_seat[i] = new JButton(num[i] + " 사용가능");
			btn_seat[i].setBackground(new Color(187,226,177));
			btn_seat[i].setForeground(Color.WHITE);
			btn_seat[i].setBorderPainted(false);	
						
			btn_seat[i].addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		        	 
		        	 JButton btn_num = (JButton)e.getSource();
		        	 String nums = btn_num.getText().substring(0, 2);
		        	 int seat_num = Integer.parseInt(nums.trim());
		        	
		        	 for(int i=0; i<18; i++) {
		        		 btn_seat[i].setBackground(new Color(187,226,177));
		        		 
		        		 if(i == seat_num) {
		        			 btn_seat[i-1].setBackground(new Color(117,151,183));
		 	 				 btn_seat[i-1].setText(String.valueOf(seat_num) + " 사용가능");
		 	 				 select_seat = "메인실 "+String.valueOf(seat_num)+"번 좌석";
		 	 			 	 System.out.println(select_seat);
		        		 }
		        	 }
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
      new SelectSeatPage();
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
   
   
}