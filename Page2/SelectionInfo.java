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
import javax.swing.JTextPane;

public class SelectionInfo extends JFrame {

   private JPanel contentPane, panel;
   private JButton btn_cancel, btn_sumit;
   
   SelectionInfo(){
      
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
      
      JLabel seattable_title_text = new JLabel("선택 정보");
      seattable_title_text.setHorizontalAlignment(SwingConstants.CENTER);
      seattable_title_text.setForeground(Color.WHITE);
      seattable_title_text.setFont(new Font("±¼¸²", Font.PLAIN, 20));
      seattable_title_text.setBounds(31, 7, 139, 25);
      seattable_title_panel.add(seattable_title_text);
      
      JPanel seattable_panel = new JPanel();
      seattable_panel.setBackground(Color.WHITE);
      seattable_panel.setBorder(new LineBorder(new Color(192, 192, 192), 3, true));
      seattable_panel.setBounds(72, 96, 1109, 590);
      panel.add(seattable_panel);
      seattable_panel.setLayout(null);
      

         
         JLabel label_setTime = new JLabel("선택한 시간제가 보여집니다..");
         label_setTime.setHorizontalAlignment(SwingConstants.LEFT);
         label_setTime.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 20));
         label_setTime.setBackground(Color.YELLOW);
         label_setTime.setBounds(513, 233, 274, 33);
         seattable_panel.add(label_setTime);
         
         JLabel label_setSeat = new JLabel("선택한 좌석/룸이 보여집니다..");
         label_setSeat.setHorizontalAlignment(SwingConstants.LEFT);
         label_setSeat.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 20));
         label_setSeat.setBackground(Color.YELLOW);
         label_setSeat.setBounds(513, 300, 274, 33);
         seattable_panel.add(label_setSeat);
         
         
         
         JPanel panel_1 = new JPanel();
         panel_1.setBorder(new LineBorder(new Color(255, 228, 196), 30, true));
         panel_1.setBackground(Color.WHITE);
         panel_1.setBounds(321, 233, 153, 33);
         seattable_panel.add(panel_1);
         panel_1.setLayout(null);
         
         JLabel label_time_text = new JLabel("선택한 시간제");
         label_time_text.setForeground(Color.WHITE);
         label_time_text.setBounds(3, 10, 146, 17);
         panel_1.add(label_time_text);
         label_time_text.setHorizontalAlignment(SwingConstants.CENTER);
         label_time_text.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 14));

         
         JPanel panel_1_1 = new JPanel();
         panel_1_1.setBorder(new LineBorder(new Color(240, 128, 128), 30, true));
         panel_1_1.setBackground(Color.WHITE);
         panel_1_1.setBounds(321, 300, 153, 33);
         seattable_panel.add(panel_1_1);
         panel_1_1.setLayout(null);
         
         JLabel label_seat_text = new JLabel("선택한 좌석");
         label_seat_text.setHorizontalAlignment(SwingConstants.CENTER);
         label_seat_text.setForeground(Color.WHITE);
         label_seat_text.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 14));
         label_seat_text.setBounds(3, 9, 146, 17);
         panel_1_1.add(label_seat_text);
         
         
      
         
         btn_sumit = new JButton("결제");
         btn_sumit.setForeground(Color.WHITE);
         btn_sumit.setBackground(Color.BLACK);
         btn_sumit.setBounds(805, 391, 127, 40);
         btn_sumit.setBorder(new LineBorder(new Color(0, 0, 0), 2, true)); 
         seattable_panel.add(btn_sumit);
         
         btn_cancel = new JButton("취소");
         btn_cancel.setForeground(Color.WHITE);
         btn_cancel.setBackground(Color.BLACK);
         btn_cancel.setBounds(666, 391, 127, 40);
         btn_cancel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true)); 
         seattable_panel.add(btn_cancel);
               
         
      
   }      
      public static void main(String[] args) {
         new SelectionInfo();
      }
}