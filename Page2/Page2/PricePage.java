package Page2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

public class PricePage extends JFrame {

   private JPanel contentPane;

   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               PricePage frame = new PricePage();
               frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   public PricePage() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
       setResizable(false); //»çÀÌÁî º¯°æ ºÒ°¡´É
       setVisible(true); //º¸ÀÌ°Ô ÇÒÁö ¿©ºÎ
       setBounds(100, 100, 1300, 800);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      contentPane.setLayout(new BorderLayout(0, 0));
      setContentPane(contentPane);
      
      JPanel panel = new JPanel();
      panel.setBackground(Color.WHITE);
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
      
      JPanel pricetitle_panel = new JPanel();
      pricetitle_panel.setBorder(new LineBorder(new Color(211,183,219), 30, true));
      pricetitle_panel.setBounds(156, 62, 196, 39);
      panel.add(pricetitle_panel);
      pricetitle_panel.setLayout(null);
      
      JLabel pricetitle_text = new JLabel("°¡°Ý ¾È³»");
      pricetitle_text.setFont(new Font("±¼¸²", Font.PLAIN, 20));
      pricetitle_text.setForeground(Color.WHITE);
      pricetitle_text.setBounds(56, 7, 105, 25);
      pricetitle_panel.add(pricetitle_text);
      
      JPanel price_panel = new JPanel();	//Å×µÎ¸®
      price_panel.setBounds(30, 78, 449, 657);
      panel.add(price_panel);
      price_panel.setBackground(Color.white);
      price_panel.setBorder(new LineBorder(new Color(211,183,219), 2, true));
      price_panel.setLayout(null);
      
      JPanel hourstitle_panel = new JPanel();
      hourstitle_panel.setBorder(null);
      hourstitle_panel.setBackground(new Color(255, 183, 183));
      hourstitle_panel.setBounds(34, 33, 124, 35);
      price_panel.add(hourstitle_panel);
      hourstitle_panel.setLayout(null);
      
      JLabel hourstitle_text = new JLabel("´çÀÏ ÀÌ¿ë±Ç");
      hourstitle_text.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      hourstitle_text.setForeground(Color.WHITE);
      hourstitle_text.setBounds(22, 7, 93, 25);
      hourstitle_panel.add(hourstitle_text);
      
      JPanel hours_panel_2h = new JPanel();
      hours_panel_2h.setBackground(new Color(245,247,248));		//º¯°æ
      hours_panel_2h.setBounds(49, 89, 90, 30);
      price_panel.add(hours_panel_2h);
      hours_panel_2h.setLayout(null);
      
      JLabel hours_text_2h = new JLabel("2½Ã°£");
      hours_text_2h.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      hours_text_2h.setBounds(26, 6, 37, 20);
      hours_panel_2h.add(hours_text_2h);
      
      JPanel hours_panel_4h = new JPanel();
      hours_panel_4h.setLayout(null);
      hours_panel_4h.setBackground(new Color(245,247,248));
      hours_panel_4h.setBounds(140, 89, 90, 30);
      price_panel.add(hours_panel_4h);
      
      JLabel hours_text_4h = new JLabel("4½Ã°£");
      hours_text_4h.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      hours_text_4h.setBounds(25, 6, 37, 20);
      hours_panel_4h.add(hours_text_4h);
      
      JPanel hours_panel_6h = new JPanel();
      hours_panel_6h.setLayout(null);
      hours_panel_6h.setBackground(new Color(245,247,248));
      hours_panel_6h.setBounds(231, 89, 90, 30);
      price_panel.add(hours_panel_6h);
      
      JLabel hours_text_6h = new JLabel("6½Ã°£");
      hours_text_6h.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      hours_text_6h.setBounds(24, 6, 37, 20);
      hours_panel_6h.add(hours_text_6h);
      
      JPanel hours_panel_8h = new JPanel();
      hours_panel_8h.setLayout(null);
      hours_panel_8h.setBackground(new Color(245,247,248));
      hours_panel_8h.setBounds(323, 89, 90, 30);
      price_panel.add(hours_panel_8h);
      
      JLabel hours_text_8h = new JLabel("8½Ã°£");
      hours_text_8h.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      hours_text_8h.setBounds(25, 6, 37, 20);
      hours_panel_8h.add(hours_text_8h);
      
      JPanel hours_panel_2h_price = new JPanel();
      hours_panel_2h_price.setLayout(null);
      hours_panel_2h_price.setBackground(new Color(245,247,248));
      hours_panel_2h_price.setBounds(49, 122, 90, 30);
      price_panel.add(hours_panel_2h_price);
      
      JLabel hours_text_2h_price = new JLabel("3,000¿ø");
      hours_text_2h_price.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      hours_text_2h_price.setBounds(21, 6, 52, 20);
      hours_panel_2h_price.add(hours_text_2h_price);
      
      JPanel hours_panel_4h_price = new JPanel();
      hours_panel_4h_price.setLayout(null);
      hours_panel_4h_price.setBackground(new Color(245,247,248));
      hours_panel_4h_price.setBounds(140, 122, 90, 30);
      price_panel.add(hours_panel_4h_price);
      
      JLabel hours_text_4h_price = new JLabel("5,000¿ø");
      hours_text_4h_price.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      hours_text_4h_price.setBounds(19, 6, 53, 20);
      hours_panel_4h_price.add(hours_text_4h_price);
      
      JPanel hours_panel_6h_price = new JPanel();
      hours_panel_6h_price.setLayout(null);
      hours_panel_6h_price.setBackground(new Color(245,247,248));
      hours_panel_6h_price.setBounds(231, 122, 90, 30);
      price_panel.add(hours_panel_6h_price);
      
      JLabel hours_text_6h_price = new JLabel("7,000¿ø");
      hours_text_6h_price.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      hours_text_6h_price.setBounds(18, 6, 54, 20);
      hours_panel_6h_price.add(hours_text_6h_price);
      
      JPanel hours_panel_8h_price = new JPanel();
      hours_panel_8h_price.setLayout(null);
      hours_panel_8h_price.setBackground(new Color(245,247,248));
      hours_panel_8h_price.setBounds(323, 122, 90, 30);
      price_panel.add(hours_panel_8h_price);
      
      JLabel hours_text_8h_price = new JLabel("8,000¿ø");
      hours_text_8h_price.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      hours_text_8h_price.setBounds(18, 6, 53, 20);
      hours_panel_8h_price.add(hours_text_8h_price);
      
      JPanel periodtitle_panel = new JPanel();
      periodtitle_panel.setLayout(null);
      periodtitle_panel.setBorder(null);
      periodtitle_panel.setBackground(new Color(255, 183, 183));
      periodtitle_panel.setBounds(34, 175, 124, 35);
      price_panel.add(periodtitle_panel);
      
      JLabel periodtitle_text = new JLabel("±â°£Á¦");
      periodtitle_text.setForeground(Color.WHITE);
      periodtitle_text.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      periodtitle_text.setBounds(41, 7, 43, 25);
      periodtitle_panel.add(periodtitle_text);
      
      JPanel period_panel_1d = new JPanel();
      period_panel_1d.setLayout(null);
      period_panel_1d.setBackground(new Color(245,247,248));
      period_panel_1d.setBounds(49, 231, 90, 30);
      price_panel.add(period_panel_1d);
      
      JLabel period_text_1d = new JLabel("1ÀÏ");
      period_text_1d.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      period_text_1d.setBounds(34, 6, 22, 20);
      period_panel_1d.add(period_text_1d);
      
      JPanel period_panel_1d_price = new JPanel();
      period_panel_1d_price.setLayout(null);
      period_panel_1d_price.setBackground(new Color(245,247,248));
      period_panel_1d_price.setBounds(49, 264, 90, 30);
      price_panel.add(period_panel_1d_price);
      
      JLabel period_text_1d_price = new JLabel("15,000¿ø");
      period_text_1d_price.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      period_text_1d_price.setBounds(15, 6, 69, 20);
      period_panel_1d_price.add(period_text_1d_price);
      
      JPanel period_panel_1w = new JPanel();
      period_panel_1w.setLayout(null);
      period_panel_1w.setBackground(new Color(245,247,248));
      period_panel_1w.setBounds(140, 231, 90, 30);
      price_panel.add(period_panel_1w);
      
      JLabel period_text_1w = new JLabel("1ÁÖ");
      period_text_1w.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      period_text_1w.setBounds(33, 6, 22, 20);
      period_panel_1w.add(period_text_1w);
      
      JPanel period_panel_1w_price = new JPanel();
      period_panel_1w_price.setLayout(null);
      period_panel_1w_price.setBackground(new Color(245,247,248));
      period_panel_1w_price.setBounds(140, 264, 90, 30);
      price_panel.add(period_panel_1w_price);
      
      JLabel period_text_1w_price = new JLabel("45,000¿ø");
      period_text_1w_price.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      period_text_1w_price.setBounds(18, 6, 59, 20);
      period_panel_1w_price.add(period_text_1w_price);
      
      JPanel period_panel_2w_price = new JPanel();
      period_panel_2w_price.setLayout(null);
      period_panel_2w_price.setBackground(new Color(245,247,248));
      period_panel_2w_price.setBounds(231, 264, 90, 30);
      price_panel.add(period_panel_2w_price);
      
      JLabel period_text_2w_price = new JLabel("90,000¿ø");
      period_text_2w_price.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      period_text_2w_price.setBounds(16, 6, 60, 20);
      period_panel_2w_price.add(period_text_2w_price);
      
      JPanel period_panel_2w = new JPanel();
      period_panel_2w.setLayout(null);
      period_panel_2w.setBackground(new Color(245,247,248));
      period_panel_2w.setBounds(231, 231, 90, 30);
      price_panel.add(period_panel_2w);
      
      JLabel period_text_2w = new JLabel("2ÁÖ");
      period_text_2w.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      period_text_2w.setBounds(32, 6, 22, 20);
      period_panel_2w.add(period_text_2w);
      
      JPanel period_panel_4w = new JPanel();
      period_panel_4w.setLayout(null);
      period_panel_4w.setBackground(new Color(245,247,248));
      period_panel_4w.setBounds(323, 231, 90, 30);
      price_panel.add(period_panel_4w);
      
      JLabel period_text_4w = new JLabel("4ÁÖ");
      period_text_4w.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      period_text_4w.setBounds(33, 6, 22, 20);
      period_panel_4w.add(period_text_4w);
      
      JPanel period_panel_4w_price = new JPanel();
      period_panel_4w_price.setLayout(null);
      period_panel_4w_price.setBackground(new Color(245,247,248));
      period_panel_4w_price.setBounds(323, 264, 90, 30);
      price_panel.add(period_panel_4w_price);
      
      JLabel period_text_4w_price = new JLabel("150,000¿ø");
      period_text_4w_price.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      period_text_4w_price.setBounds(11, 6, 72, 20);
      period_panel_4w_price.add(period_text_4w_price);
      
      JPanel passtitle_panel = new JPanel();
      passtitle_panel.setLayout(null);
      passtitle_panel.setBorder(null);
      passtitle_panel.setBackground(new Color(255, 183, 183));
      passtitle_panel.setBounds(34, 321, 124, 35);
      price_panel.add(passtitle_panel);
      
      JLabel passtitle_text = new JLabel("Á¤¾×±Ç");
      passtitle_text.setForeground(Color.WHITE);
      passtitle_text.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      passtitle_text.setBounds(41, 7, 43, 25);
      passtitle_panel.add(passtitle_text);
      
      JPanel pass_panel_50h = new JPanel();
      pass_panel_50h.setLayout(null);
      pass_panel_50h.setBackground(new Color(245,247,248));
      pass_panel_50h.setBounds(49, 377, 90, 30);
      price_panel.add(pass_panel_50h);
      
      JLabel pass_text_50h = new JLabel("50½Ã°£");
      pass_text_50h.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      pass_text_50h.setBounds(21, 6, 50, 20);
      pass_panel_50h.add(pass_text_50h);
      
      JPanel pass_panel_50h_price = new JPanel();
      pass_panel_50h_price.setLayout(null);
      pass_panel_50h_price.setBackground(new Color(245,247,248));
      pass_panel_50h_price.setBounds(49, 410, 90, 30);
      price_panel.add(pass_panel_50h_price);
      
      JLabel pass_text_50h_price = new JLabel("70,000¿ø");
      pass_text_50h_price.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      pass_text_50h_price.setBounds(15, 6, 69, 20);
      pass_panel_50h_price.add(pass_text_50h_price);
      
      JPanel pass_panel_100h = new JPanel();
      pass_panel_100h.setLayout(null);
      pass_panel_100h.setBackground(new Color(245,247,248));
      pass_panel_100h.setBounds(140, 377, 90, 30);
      price_panel.add(pass_panel_100h);
      
      JLabel pass_text_100h = new JLabel("100½Ã°£");
      pass_text_100h.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      pass_text_100h.setBounds(18, 6, 53, 20);
      pass_panel_100h.add(pass_text_100h);
      
      JPanel pass_panel_100h_price = new JPanel();
      pass_panel_100h_price.setLayout(null);
      pass_panel_100h_price.setBackground(new Color(245,247,248));
      pass_panel_100h_price.setBounds(140, 410, 90, 30);
      price_panel.add(pass_panel_100h_price);
      
      JLabel pass_text_100h_price = new JLabel("120,000¿ø");
      pass_text_100h_price.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      pass_text_100h_price.setBounds(6, 6, 78, 20);
      pass_panel_100h_price.add(pass_text_100h_price);
      
      JPanel pass_panel_150h = new JPanel();
      pass_panel_150h.setLayout(null);
      pass_panel_150h.setBackground(new Color(245,247,248));
      pass_panel_150h.setBounds(231, 377, 90, 30);
      price_panel.add(pass_panel_150h);
      
      JLabel pass_text_150h = new JLabel("150½Ã°£");
      pass_text_150h.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      pass_text_150h.setBounds(17, 6, 53, 20);
      pass_panel_150h.add(pass_text_150h);
      
      JPanel pass_panel_150h_price = new JPanel();
      pass_panel_150h_price.setLayout(null);
      pass_panel_150h_price.setBackground(new Color(245,247,248));
      pass_panel_150h_price.setBounds(231, 410, 90, 30);
      price_panel.add(pass_panel_150h_price);
      
      JLabel pass_text_150h_price = new JLabel("170,000¿ø");
      pass_text_150h_price.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      pass_text_150h_price.setBounds(7, 6, 76, 20);
      pass_panel_150h_price.add(pass_text_150h_price);
      
      JPanel roomtytitle_panel = new JPanel();
      roomtytitle_panel.setLayout(null);
      roomtytitle_panel.setBorder(null);
      roomtytitle_panel.setBackground(new Color(255, 183, 183));
      roomtytitle_panel.setBounds(34, 463, 124, 35);
      price_panel.add(roomtytitle_panel);
      
      JLabel roomtytitle_text = new JLabel("·ë Á¾·ù");
      roomtytitle_text.setForeground(Color.WHITE);
      roomtytitle_text.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      roomtytitle_text.setBounds(38, 7, 53, 25);
      roomtytitle_panel.add(roomtytitle_text);
      
      JPanel personalroom_panel = new JPanel();
      personalroom_panel.setLayout(null);
      personalroom_panel.setBackground(new Color(245,247,248));
      personalroom_panel.setBounds(49, 519, 133, 45);
      price_panel.add(personalroom_panel);
      
      JLabel personalroom_text = new JLabel("°³ÀÎ·ë(1ÀÎ) 2½Ã°£");
      personalroom_text.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      personalroom_text.setBounds(6, 6, 121, 39);
      personalroom_panel.add(personalroom_text);
      
      JPanel personalroom_panel_price = new JPanel();
      personalroom_panel_price.setLayout(null);
      personalroom_panel_price.setBackground(new Color(245,247,248));
      personalroom_panel_price.setBounds(49, 567, 133, 30);
      price_panel.add(personalroom_panel_price);
      
      JLabel personalroom_text_price = new JLabel("5,000¿ø");
      personalroom_text_price.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      personalroom_text_price.setBounds(44, 6, 51, 20);
      personalroom_panel_price.add(personalroom_text_price);
      
      JPanel meetingroom_panel = new JPanel();
      meetingroom_panel.setLayout(null);
      meetingroom_panel.setBackground(new Color(245,247,248));
      meetingroom_panel.setBounds(183, 519, 161, 45);
      price_panel.add(meetingroom_panel);
      
      JLabel meetingroom_text = new JLabel("È¸ÀÇ·ë(4~6ÀÎ) 5½Ã°£");
      meetingroom_text.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      meetingroom_text.setBounds(9, 6, 143, 39);
      meetingroom_panel.add(meetingroom_text);
      
      JPanel meetingroom_panel_price = new JPanel();
      meetingroom_panel_price.setLayout(null);
      meetingroom_panel_price.setBackground(new Color(245,247,248));
      meetingroom_panel_price.setBounds(183, 567, 161, 30);
      price_panel.add(meetingroom_panel_price);
      
      JLabel meetingroom_text_price = new JLabel("6,000¿ø");
      meetingroom_text_price.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      meetingroom_text_price.setBounds(53, 6, 51, 20);
      meetingroom_panel_price.add(meetingroom_text_price);
      
      JPanel roomtitle_panel = new JPanel(); 
      roomtitle_panel.setLayout(null);
      roomtitle_panel.setBorder(new LineBorder(new Color(211,183,219), 30, true));
      roomtitle_panel.setBounds(779, 62, 189, 39);
      panel.add(roomtitle_panel);
      
      JLabel roomtitle_text = new JLabel("·ë ¾È³»");
      roomtitle_text.setForeground(Color.WHITE);
      roomtitle_text.setFont(new Font("±¼¸²", Font.PLAIN, 20));
      roomtitle_text.setBounds(62, 7, 74, 25);
      roomtitle_panel.add(roomtitle_text);
      
      JPanel room_panel = new JPanel();
      room_panel.setBackground(Color.WHITE);
      room_panel.setLayout(null);
      room_panel.setBorder(new LineBorder(new Color(211,183,219), 2, true));
      room_panel.setBounds(491, 79, 760, 657);
      panel.add(room_panel);
      
      JLabel maintitle = new JLabel("¸ÞÀÎ½Ç (¿ÀÇÂ)");
      maintitle.setFont(new Font("±¼¸²", Font.BOLD, 25));
      maintitle.setBounds(31, 69, 174, 47);
      room_panel.add(maintitle);
      
      JLabel mainsubtitle = new JLabel("¿ÀÇÂµÇ¾îÀÖ¾î ÀÚÀ¯·Ó°Ô È°¿ë °¡´ÉÇÑ ±âº»ÀûÀÎ ·ëÀÔ´Ï´Ù.");
      mainsubtitle.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      mainsubtitle.setBounds(31, 108, 361, 47);
      room_panel.add(mainsubtitle);
      
      //ÆÐ³Î¿¡ ±×¸²À» ¿Ã·ÁÁÖ´Â Å¬·¡½º
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
      
      JPanel main_img_panel = new JPanel();
      main_img_panel.setBounds(411, 42, 310, 180);
      
      room_panel.add(main_img_panel);
      main_img_panel.setLayout(null);
      
      JPanel personal_img_panel = new JPanel();
      personal_img_panel.setLayout(null);
      personal_img_panel.setBounds(31, 235, 310, 180);
      room_panel.add(personal_img_panel);
      
      JLabel personaltitle = new JLabel("°³ÀÎ½Ç");
      personaltitle.setFont(new Font("±¼¸²", Font.BOLD, 25));
      personaltitle.setBounds(389, 281, 174, 47);
      room_panel.add(personaltitle);
      
      JLabel personalsubtitle = new JLabel("1ÀÎ½Ç·Î ÀÌ·ç¾îÁ®ÀÖ¾î Á¶¿ëÇÏ°í ÇÁ¶óÀÌºøÇÑ ·ëÀÔ´Ï´Ù.");
      personalsubtitle.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      personalsubtitle.setBounds(389, 320, 361, 47);
      room_panel.add(personalsubtitle);
      
      JLabel meetingtitle = new JLabel("È¸ÀÇ½Ç");
      meetingtitle.setFont(new Font("±¼¸²", Font.BOLD, 25));
      meetingtitle.setBounds(31, 461, 174, 47);
      room_panel.add(meetingtitle);
      
      JLabel meetingsubtitle = new JLabel("4~6ÀÎ½Ç·Î ÀÌ·ç¾îÁ®ÀÖ´Â ´ÙÀÎ¿ø ·ëÀÔ´Ï´Ù.");
      meetingsubtitle.setFont(new Font("±¼¸²", Font.PLAIN, 15));
      meetingsubtitle.setBounds(31, 500, 361, 47);
      room_panel.add(meetingsubtitle);
      
      JPanel meeting_img_panel = new JPanel();
      meeting_img_panel.setLayout(null);
      meeting_img_panel.setBounds(411, 434, 310, 180);
      room_panel.add(meeting_img_panel);
      
      JPanel flower_img_panel = new JPanel();
      flower_img_panel.setBounds(130, 12, 40, 30);
      subtitle_panel.add(flower_img_panel);
      flower_img_panel.setLayout(null);

      ImagePanel flowerimg = new ImagePanel(new ImageIcon("./img/resizeflower.png").getImage());
      flower_img_panel.add(flowerimg);

      ImagePanel mainroomImg = new ImagePanel(new ImageIcon("./img/resizemainroom.png").getImage());
      main_img_panel.add(mainroomImg);
      
      ImagePanel personalroomImg = new ImagePanel(new ImageIcon("./img/resizepersonalroom.jpg").getImage());
      personal_img_panel.add(personalroomImg);
      
      ImagePanel meetingroomImg = new ImagePanel(new ImageIcon("./img/resizemeetingroom.jpg").getImage());
      meeting_img_panel.add(meetingroomImg);

   }
}