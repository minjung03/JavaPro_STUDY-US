package Page;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class StartPage extends JFrame {
   
   private JPanel contentPane, panel;
   private JButton btn_login, btn_join;
   private JLabel title, sub_title;
    
   //폰트적용
   Font font_75 = new Font("Cafe24SsurroundAir", Font.PLAIN, 75); //첫화면 제목 폰트
   Font font_12 = new Font("Cafe24SsurroundAir", Font.BOLD, 12); 
   Font font_17 = new Font("Cafe24SsurroundAir", Font.BOLD, 17); 
   
   StartPage(){
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
      
      sub_title = new JLabel("스터디 카페 관리 프로그램");
      sub_title.setFont(font_17);
      sub_title.setForeground(new Color(127,114,165));
      sub_title.setHorizontalAlignment(SwingConstants.CENTER);
      sub_title.setBounds(132, 206, 624, 175);//624
      panel.add(sub_title);
      
      title = new JLabel("STUDY US");
      title.setFont(font_75);
      title.setForeground(new Color(127,114,165));
      title.setHorizontalAlignment(SwingConstants.CENTER);
      title.setBounds(132, 266, 624, 175);//624
      panel.add(title);
      
      btn_login = new JButton("로그인");
      btn_login.setFont(font_12);
      btn_login.setForeground(Color.WHITE);
      btn_login.setBorderPainted(false);	//테두리 없애기
      btn_login.setBounds(900, 448, 97, 28);
      btn_login.setBackground(new Color(215,176,212));
      panel.add(btn_login);
      
      btn_login.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            new LoginPage(); // JoinPage 실행
            setVisible(false);  // 창 안보이게 하기 
         }
      });
      btn_join = new JButton("회원가입");
      btn_join.setFont(font_12);
      btn_join.setForeground(Color.WHITE);
      btn_join.setBorderPainted(false);	//테두리 없애기
      btn_join.setBackground(new Color(215,176,212));
      btn_join.setBounds(900, 481, 97, 28);
      panel.add(btn_join);
      
      btn_join.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            new JoinPage(); // JoinPage 실행
            setVisible(false);  // 창 안보이게 하기 
         }
      });
   }
   
   public static void main(String[] args) {
      new StartPage();
   }
}