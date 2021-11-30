package Page;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;

public class SelectTimeTablePage extends JFrame {

   private JPanel contentPane;
   
//   public static void main(String[] args) {
//      EventQueue.invokeLater(new Runnable() {
//         public void run() {
//            try {
//               SelectTimeTablePage frame = new SelectTimeTablePage();
//               frame.setVisible(true);
//            } catch (Exception e) {
//               e.printStackTrace();
//            }
//         }
//      });
//   }

   public SelectTimeTablePage() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
         setResizable(false); //사이즈 변경 불가능
         setVisible(true); //보이게 할지 여부
         setBounds(100, 100, 1300, 800);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      contentPane.setLayout(new BorderLayout(0, 0));
      setContentPane(contentPane);
      
      TextArea ta;
      
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
      
      JPanel timetable_title_panel = new JPanel();
      timetable_title_panel.setBounds(101, 96, 196, 39);
      
      panel.add(timetable_title_panel);
      timetable_title_panel.setLayout(null);
      timetable_title_panel.setBorder(new LineBorder(new Color(184,184,184), 30, true));
      
      JLabel timetable_title_text = new JLabel("\uC2DC\uAC04\uD45C \uC120\uD0DD");
      timetable_title_text.setForeground(Color.WHITE);
      timetable_title_text.setFont(new Font("±¼¸²", Font.PLAIN, 20));
      timetable_title_text.setBounds(45, 7, 105, 25);
      timetable_title_panel.add(timetable_title_text);
      
      JPanel timetable_panel = new JPanel();
      timetable_panel.setBackground(Color.WHITE);
      timetable_panel.setBorder(new LineBorder(new Color(192, 192, 192), 3, true));
      timetable_panel.setBounds(72, 96, 1109, 590);
      panel.add(timetable_panel);
      timetable_panel.setLayout(null);

      
      JPanel coupon_name_p[] = new JPanel[4];
      for(int i=0; i<4; i++) {
         coupon_name_p[i] = new JPanel();
         coupon_name_p[i].setLayout(null);
         coupon_name_p[i].setForeground(Color.WHITE);
         coupon_name_p[i].setBorder(new LineBorder(new Color(192, 192, 192), 30, true));
         timetable_panel.add(coupon_name_p[i]);
      }
      
      JLabel coupon_name_l[] = new JLabel[4];
      String[] cou_text = {"당일 이용권", "정액권", "기간제", "기타"};
      for(int i=0; i<4; i++) {
         coupon_name_l[i] = new JLabel(cou_text[i]);
         coupon_name_l[i].setForeground(Color.WHITE);
         coupon_name_l[i].setFont(new Font("±¼¸²", Font.PLAIN, 14));
         coupon_name_p[i].add(coupon_name_l[i]);
      }
      
      
      
   
      
      
      coupon_name_p[0].setBounds(173, 74, 124, 35);
      
      coupon_name_l[0].setBounds(23, 7, 93, 25);
      
      coupon_name_p[1].setBounds(409, 74, 124, 35);
      coupon_name_l[1].setBounds(40, 7, 53, 25);
      
      
      coupon_name_p[2].setBounds(650, 74, 124, 35);
      
      coupon_name_l[2].setBounds(40, 7, 43, 25);
      
      coupon_name_p[3].setBounds(861, 74, 124, 35);
      coupon_name_l[3].setBounds(46, 7, 29, 25);
      
      
      ButtonGroup group = new ButtonGroup();
      JRadioButton radio_time[] = new JRadioButton[13];
      String[] rdo_text = {"2시간", "4시간", "6시간", "8시간", "50시간", "100시간", "150시간", "1일", "1주", "2주", "4주", "회의룸", "개인실"}; 
      
      for(int i=0; i<13; i++) {
         
         radio_time[i] = new JRadioButton(rdo_text[i]);
         radio_time[i].setFont(new Font("±¼¸²", Font.BOLD, 20));
         radio_time[i].setBackground(Color.white);
         group.add(radio_time[i]);
         timetable_panel.add(radio_time[i]);
      }
      
      int height_Default = 180;
      for(int i = 0; i<4; i++) {
         radio_time[i].setBounds(190, height_Default, 86, 23);
         height_Default+=70;
      }
      
      height_Default = 180;
      for(int i = 4; i<7; i++) {
         radio_time[i].setBounds(418, height_Default, 109, 23);
         height_Default+=70;
      }
   
      
      height_Default = 180;
      for(int i = 7; i<11; i++) {
         radio_time[i].setBounds(669, height_Default, 86, 23);
         height_Default+=70;
      }
   
      height_Default = 180;
      for(int i =11; i<13; i++) {
         radio_time[i].setBounds(883, height_Default, 102, 23);
         height_Default+=70;
      }
   
      
      
      JButton btn_Price = new JButton("\uAC00\uACA9\uD45C \uD655\uC778");
      btn_Price.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      
      btn_Price.setForeground(Color.WHITE);
      btn_Price.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
      btn_Price.setBackground(Color.BLACK);
      btn_Price.setBounds(829, 500, 97, 28);
      timetable_panel.add(btn_Price);
      
      btn_Price.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               new PricePage(); // JoinPage 실행
               setVisible(false);  // 창 안보이게 하기 
            }
         });
            
      
      JButton btn_Chk = new JButton("\uC120\uD0DD \uC644\uB8CC");
      btn_Chk.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      btn_Chk.setForeground(Color.WHITE);
      btn_Chk.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
      btn_Chk.setBackground(Color.BLACK);
      btn_Chk.setBounds(938, 500, 97, 28);
      timetable_panel.add(btn_Chk);
      
      btn_Chk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               new SeatPage(); // JoinPage 실행
               setVisible(false);  // 창 안보이게 하기 
            }
         });
      
      
   }

   
      public static void main(String[] args) {
          new SelectTimeTablePage();
       }
   } 