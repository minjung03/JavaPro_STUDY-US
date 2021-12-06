package Page;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class StartPage extends JFrame {

   public static long start;
   private JPanel contentPane, main_panel, view_panel, PricePage_panel;
   private JButton btn_login, btn_join;
   private JLabel title, sub_title;

   // 폰트적용
   Font font_75 = new Font("Cafe24SsurroundAir", Font.PLAIN, 75); // 첫화면 제목 폰트
   Font font_12 = new Font("Cafe24SsurroundAir", Font.BOLD, 12);
   Font font_17 = new Font("Cafe24SsurroundAir", Font.BOLD, 17);

   StartPage() {
      super("스터디카페 예약 프로그램 [STUDY US]");
      start = System.currentTimeMillis(); //시작하는 시점 계산
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
      main_panel = new JPanel();
      main_panel.setBackground(Color.WHITE);
      contentPane.add(main_panel, BorderLayout.CENTER);
      main_panel.setLayout(null);

      /* 서브 타이틀 */
      sub_title = new JLabel("스터디 카페 관리 프로그램");
      sub_title.setFont(font_17);
      sub_title.setForeground(new Color(53, 69, 98));
      sub_title.setHorizontalAlignment(SwingConstants.LEFT);
      sub_title.setBounds(360, 140, 624, 175);// 624
      main_panel.add(sub_title);

      /* 메인 타이틀 */
      title = new JLabel("STUDY US");
      title.setFont(font_75);
      title.setForeground(new Color(255, 255, 255));
      title.setHorizontalAlignment(SwingConstants.CENTER);
      title.setBounds(330, 256, 624, 175);// 624
      main_panel.add(title);

      /* 타이틀 배경 */
      view_panel = new JPanel();
      view_panel.setBackground(new Color(255, 255, 255));
      view_panel.setBounds(330, 250, 624, 175);
      // view_panel.setLayout(null);
      view_panel.setBorder(new LineBorder(new Color(237, 197, 214), 90, true));
      main_panel.add(view_panel);

      /* 버튼 로그인 */
      btn_login = new JButton("로그인");
      btn_login.setFont(font_12);
      btn_login.setForeground(Color.WHITE);
      btn_login.setBorderPainted(false); // 테두리 없애기
      btn_login.setBounds(840, 460, 105, 33);
      btn_login.setBackground(new Color(53, 69, 98));
      main_panel.add(btn_login);

      btn_login.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            new LoginPage(); // LoginPage 실행
            setVisible(false); // 창 안보이게 하기
         }
      });

      /* 버튼 회원가입 */
      btn_join = new JButton("회원가입");
      btn_join.setFont(font_12);
      btn_join.setForeground(Color.WHITE);
      btn_join.setBorderPainted(false);
      btn_join.setBackground(new Color(53, 69, 98));
      btn_join.setBounds(717, 460, 105, 33);
      // btn_join.setBounds(850, 501, 97, 28);
      main_panel.add(btn_join);

      ImageIcon PricePageImg = new ImageIcon("./img/resizequestion-mark.png");
      JButton PricePage = new JButton(PricePageImg);
      PricePage.setBorderPainted(false); // 버튼 테두리 설정해제
      PricePage.setBounds(1165, 45, 60, 60);
      PricePage.setPreferredSize(new Dimension(60, 60)); // 버튼 크기 지정
      PricePage.setContentAreaFilled(false);
      main_panel.add(PricePage);

      PricePage.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            new PricePage();
            setVisible(false);
         }
      });

      btn_join.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            new JoinPage();
            setVisible(false);
         }
      });
   }

   public static void main(String[] args) {
      new StartPage();
   }
}