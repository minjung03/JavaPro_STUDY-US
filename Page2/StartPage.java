package Page2;

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
   private JButton btn_login, btn_join, btn_price;
   private JLabel title;
   
   //폰트적용
   Font font1 = new Font("Cafe24SsurroundAir", Font.PLAIN, 70); //첫화면 제목 폰트
   Font font2 = new Font("Cafe24SsurroundAir", Font.BOLD, 10); 
   
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
      
      title = new JLabel("STUDY US");
      title.setFont(font1);
      title.setHorizontalAlignment(SwingConstants.CENTER);
      title.setBounds(132, 296, 624, 175);//624
      panel.add(title);
      
   
      
  
      btn_login = new JButton("로그인");
      btn_login.setFont(font2);
      btn_login.setForeground(Color.WHITE);
      btn_login.setBounds(900, 448, 97, 28);
      btn_login.setBackground(Color.BLACK);
      panel.add(btn_login);
      
      btn_login.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            new LoginPage(); // JoinPage 실행
            setVisible(false);  // 창 안보이게 하기 
         }
      });
      
      
      btn_join = new JButton("회원가입");
      btn_join.setFont(font2);
      btn_join.setForeground(Color.WHITE);
      btn_join.setBackground(Color.BLACK);
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