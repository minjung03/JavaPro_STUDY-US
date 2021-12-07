package Page2;

import static Page2.LoginPage.user;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Page2.LoginPage.ImagePanel;
import Page2.LoginPage.Listener;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextArea;

import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class SelectTimeTablePage extends JFrame implements ItemListener {
   
   public static String select_time;
   private JPanel contentPane, panel, subtitle_panel, flower_img_panel;
   private JLabel title;
   String coupon, time;
   
   Font font_20 = new Font("Cafe24SsurroundAir", Font.BOLD, 20);
   Font font_12 = new Font("Cafe24SsurroundAir", Font.BOLD, 12);
   Font font_14 = new Font("Cafe24SsurroundAir", Font.BOLD, 14);
   Font font_16 = new Font("Cafe24SsurroundAir", Font.BOLD, 16);

   public SelectTimeTablePage() {
	   super("스터디카페 예약 프로그램 [STUDY US]"); 
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
      

      /* 시간제 선택 배경 패널 */
      JPanel timetable_title_panel = new JPanel();
      timetable_title_panel.setBounds(101, 85, 196, 39);   
      timetable_title_panel.setBackground(new Color(255,255,255));
      panel.add(timetable_title_panel);
      timetable_title_panel.setLayout(null);
      timetable_title_panel.setBorder(new LineBorder(new Color(127,114,165), 30, true));

      JLabel timetable_title_text = new JLabel("시간제 선택");
      timetable_title_text.setForeground(Color.WHITE);
      timetable_title_text.setFont(font_20);
      timetable_title_text.setBounds(45, 7, 110, 25);
      timetable_title_panel.add(timetable_title_text);
      
      
      /* 시간제 목록 배경 패널 */
      JPanel timetable_panel = new JPanel();
      timetable_panel.setBackground(Color.WHITE);
      timetable_panel.setBorder(new LineBorder(new Color(127,114,165), 1, true));
      timetable_panel.setBounds(72, 96, 1109, 590);
      panel.add(timetable_panel);
      timetable_panel.setLayout(null);
      

      /* 이용권 이름 & 이용권 배경 패널 */
      int width_Default = 173;
      
      JPanel coupon_name_p[] = new JPanel[4];
      JLabel coupon_name_l[] = new JLabel[4];
      String[] cou_text = { "당일 이용권", "정액권", "기간제", "기타" };
      
      for (int i = 0; i < 4; i++) {
         coupon_name_p[i] = new JPanel();
         coupon_name_p[i].setLayout(null);
         coupon_name_p[i].setBackground(new Color(215,176,212));
         // coupon_name_p[i].setBorder(new LineBorder (new Color(215,176,212), 30, true));
         timetable_panel.add(coupon_name_p[i]);
         
         coupon_name_p[i].setBounds(width_Default, 90, 124, 35);
         width_Default += 236;
          
         coupon_name_l[i] = new JLabel(cou_text[i]);
         coupon_name_l[i].setForeground(Color.WHITE);
         coupon_name_l[i].setFont(font_14);
         coupon_name_p[i].add(coupon_name_l[i]);
      }
      coupon_name_l[0].setBounds(23, 7, 93, 25);
      coupon_name_l[1].setBounds(40, 7, 53, 25);
      coupon_name_l[2].setBounds(40, 7, 43, 25);
      coupon_name_l[3].setBounds(46, 7, 29, 25);
      
      
      /* 이용권 시간 목록 라디오 버튼 */
      ButtonGroup group = new ButtonGroup();
      JRadioButton radio_time[] = new JRadioButton[13];
      String[] rdo_text = { "2시간", "4시간", "6시간", "8시간", "50시간", "100시간", "150시간", "1일", "1주", "2주", "4주", "회의룸 5시간", "개인실 3시간" };

      for (int i = 0; i < 13; i++) {
         radio_time[i] = new JRadioButton(rdo_text[i]);
         radio_time[i].setFont(font_16);
         radio_time[i].setBackground(Color.white);
         radio_time[i].addItemListener(this); // 이벤트 호출
         group.add(radio_time[i]);
         timetable_panel.add(radio_time[i]);
      }

      int height_Default = 160;
      for (int i = 0; i < 4; i++) {
         radio_time[i].setBounds(192, height_Default, 86, 23);
         height_Default += 70;
      }

      height_Default = 165;
      for (int i = 4; i < 7; i++) {
         radio_time[i].setBounds(425, height_Default, 109, 23);
         height_Default += 70;
      }

      height_Default = 165;
      for (int i = 7; i < 11; i++) {
         radio_time[i].setBounds(675, height_Default, 86, 23);
         height_Default += 70;
      }

      height_Default = 165;
      for (int i = 11; i < 13; i++) {
         radio_time[i].setBounds(885, height_Default, 142, 50);
         height_Default += 70;
      }

      
      /* 가격표 버튼 */
      JButton btn_Price = new JButton("가격표 보기");
      btn_Price.setForeground(Color.WHITE);
      btn_Price.setFont(font_12);
      btn_Price.setBorderPainted(false);	//테두리 없애기
      btn_Price.setBounds(820, 500, 105, 33);
      btn_Price.setBackground(new Color(53,69,98));       
      timetable_panel.add(btn_Price);  

      btn_Price.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            new PricePage(); // JoinPage 실행
            setVisible(false); // 창 안보이게 하기
         }   
      });

      
      /* 선택 완료 버튼 */
      JButton btn_Chk = new JButton("선택 완료");
      btn_Chk.setForeground(Color.WHITE);
      btn_Chk.setFont(font_12);
      btn_Chk.setBorderPainted(false);	//테두리 없애기
      btn_Chk.setBounds(938, 500, 105, 33);
      btn_Chk.setBackground(new Color(53,69,98));       
      timetable_panel.add(btn_Chk);  

      btn_Chk.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            new SelectSeatPage(); // JoinPage 실행
            setVisible(false); // 창 안보이게 하기
         }
      });

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
      new SelectTimeTablePage();
   }

   /* 선택된 라디오 벼튼 텍스트 값 가져오기 */
   public void itemStateChanged(ItemEvent e) {
      JRadioButton jb = (JRadioButton) e.getSource();
      if (jb.isSelected()) {
    	  select_time = jb.getText();
      }
   } 
}