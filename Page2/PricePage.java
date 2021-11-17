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

	private JPanel contentPane, panel;
	
	PricePage() {
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
		
		JPanel subtitle_panel = new JPanel();
		subtitle_panel.setLayout(null);
		subtitle_panel.setForeground(new Color(211, 211, 211));
		subtitle_panel.setBorder(new LineBorder(new Color(192, 192, 192), 30, true));
		subtitle_panel.setBounds(0, 0, 1286, 52);
		panel.add(subtitle_panel);
		
		JLabel lblNewLabel = new JLabel("STUDY US");
		lblNewLabel.setBounds(27, 4, 440, 42);
		subtitle_panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		
		JPanel pricetitle_panel = new JPanel();
		pricetitle_panel.setBorder(new LineBorder(Color.LIGHT_GRAY, 30, true));
		pricetitle_panel.setBounds(156, 62, 196, 39);
		panel.add(pricetitle_panel);
		pricetitle_panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\uAC00\uACA9 \uC548\uB0B4");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(56, 7, 105, 25);
		pricetitle_panel.add(lblNewLabel_1);
		
		JPanel price_panel = new JPanel();
		price_panel.setBounds(30, 78, 449, 657);
		panel.add(price_panel);
		price_panel.setBackground(new Color(233,233,233));
		price_panel.setBorder(new LineBorder(new Color(233, 233, 233), 3, true));
		price_panel.setLayout(null);
		
		JPanel hourtitle_panel = new JPanel();
		hourtitle_panel.setBorder(null);
		hourtitle_panel.setBackground(new Color(216,216,216));
		hourtitle_panel.setBounds(34, 33, 124, 35);
		price_panel.add(hourtitle_panel);
		hourtitle_panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("\uB2F9\uC77C \uC774\uC6A9\uAD8C");
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(22, 7, 93, 25);
		hourtitle_panel.add(lblNewLabel_2);
		
		JPanel hours_panel1 = new JPanel();
		hours_panel1.setBackground(Color.WHITE);
		hours_panel1.setBounds(49, 89, 90, 30);
		price_panel.add(hours_panel1);
		hours_panel1.setLayout(null);
		
		JLabel hours_text1 = new JLabel("2\uC2DC\uAC04");
		hours_text1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1.setBounds(26, 6, 37, 20);
		hours_panel1.add(hours_text1);
		
		JPanel hours_panel2 = new JPanel();
		hours_panel2.setLayout(null);
		hours_panel2.setBackground(Color.WHITE);
		hours_panel2.setBounds(140, 89, 90, 30);
		price_panel.add(hours_panel2);
		
		JLabel hours_text1_1 = new JLabel("4\uC2DC\uAC04");
		hours_text1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1_1.setBounds(25, 6, 37, 20);
		hours_panel2.add(hours_text1_1);
		
		JPanel hours_panel3 = new JPanel();
		hours_panel3.setLayout(null);
		hours_panel3.setBackground(Color.WHITE);
		hours_panel3.setBounds(231, 89, 90, 30);
		price_panel.add(hours_panel3);
		
		JLabel hours_text1_2 = new JLabel("6\uC2DC\uAC04");
		hours_text1_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1_2.setBounds(24, 6, 37, 20);
		hours_panel3.add(hours_text1_2);
		
		JPanel hours_panel4 = new JPanel();
		hours_panel4.setLayout(null);
		hours_panel4.setBackground(Color.WHITE);
		hours_panel4.setBounds(323, 89, 90, 30);
		price_panel.add(hours_panel4);
		
		JLabel hours_text1_3 = new JLabel("8\uC2DC\uAC04");
		hours_text1_3.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1_3.setBounds(25, 6, 37, 20);
		hours_panel4.add(hours_text1_3);
		
		JPanel hours_panel1_1 = new JPanel();
		hours_panel1_1.setLayout(null);
		hours_panel1_1.setBackground(Color.WHITE);
		hours_panel1_1.setBounds(49, 122, 90, 30);
		price_panel.add(hours_panel1_1);
		
		JLabel hours_text1_4 = new JLabel("3,000\uC6D0");
		hours_text1_4.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1_4.setBounds(21, 6, 52, 20);
		hours_panel1_1.add(hours_text1_4);
		
		JPanel hours_panel2_1 = new JPanel();
		hours_panel2_1.setLayout(null);
		hours_panel2_1.setBackground(Color.WHITE);
		hours_panel2_1.setBounds(140, 122, 90, 30);
		price_panel.add(hours_panel2_1);
		
		JLabel hours_text1_1_1 = new JLabel("5,000\uC6D0");
		hours_text1_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1_1_1.setBounds(19, 6, 53, 20);
		hours_panel2_1.add(hours_text1_1_1);
		
		JPanel hours_panel3_1 = new JPanel();
		hours_panel3_1.setLayout(null);
		hours_panel3_1.setBackground(Color.WHITE);
		hours_panel3_1.setBounds(231, 122, 90, 30);
		price_panel.add(hours_panel3_1);
		
		JLabel hours_text1_2_1 = new JLabel("7,000\uC6D0");
		hours_text1_2_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1_2_1.setBounds(18, 6, 54, 20);
		hours_panel3_1.add(hours_text1_2_1);
		
		JPanel hours_panel4_1 = new JPanel();
		hours_panel4_1.setLayout(null);
		hours_panel4_1.setBackground(Color.WHITE);
		hours_panel4_1.setBounds(323, 122, 90, 30);
		price_panel.add(hours_panel4_1);
		
		JLabel hours_text1_3_1 = new JLabel("8,000\uC6D0");
		hours_text1_3_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1_3_1.setBounds(18, 6, 53, 20);
		hours_panel4_1.add(hours_text1_3_1);
		
		JPanel hourtitle_panel_1 = new JPanel();
		hourtitle_panel_1.setLayout(null);
		hourtitle_panel_1.setBorder(null);
		hourtitle_panel_1.setBackground(new Color(216, 216, 216));
		hourtitle_panel_1.setBounds(34, 175, 124, 35);
		price_panel.add(hourtitle_panel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("\uAE30\uAC04\uC81C");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(41, 7, 43, 25);
		hourtitle_panel_1.add(lblNewLabel_2_1);
		
		JPanel hours_panel1_4 = new JPanel();
		hours_panel1_4.setLayout(null);
		hours_panel1_4.setBackground(Color.WHITE);
		hours_panel1_4.setBounds(49, 231, 90, 30);
		price_panel.add(hours_panel1_4);
		
		JLabel hours_text1_7 = new JLabel("1\uC77C");
		hours_text1_7.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1_7.setBounds(34, 6, 22, 20);
		hours_panel1_4.add(hours_text1_7);
		
		JPanel hours_panel1_1_1 = new JPanel();
		hours_panel1_1_1.setLayout(null);
		hours_panel1_1_1.setBackground(Color.WHITE);
		hours_panel1_1_1.setBounds(49, 264, 90, 30);
		price_panel.add(hours_panel1_1_1);
		
		JLabel hours_text1_4_1 = new JLabel("15,000\uC6D0");
		hours_text1_4_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1_4_1.setBounds(15, 6, 69, 20);
		hours_panel1_1_1.add(hours_text1_4_1);
		
		JPanel hours_panel2_4 = new JPanel();
		hours_panel2_4.setLayout(null);
		hours_panel2_4.setBackground(Color.WHITE);
		hours_panel2_4.setBounds(140, 231, 90, 30);
		price_panel.add(hours_panel2_4);
		
		JLabel hours_text1_1_4 = new JLabel("1\uC8FC");
		hours_text1_1_4.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1_1_4.setBounds(33, 6, 22, 20);
		hours_panel2_4.add(hours_text1_1_4);
		
		JPanel hours_panel2_1_1 = new JPanel();
		hours_panel2_1_1.setLayout(null);
		hours_panel2_1_1.setBackground(Color.WHITE);
		hours_panel2_1_1.setBounds(140, 264, 90, 30);
		price_panel.add(hours_panel2_1_1);
		
		JLabel hours_text1_1_1_1 = new JLabel("45,000\uC6D0");
		hours_text1_1_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1_1_1_1.setBounds(18, 6, 59, 20);
		hours_panel2_1_1.add(hours_text1_1_1_1);
		
		JPanel hours_panel3_1_1 = new JPanel();
		hours_panel3_1_1.setLayout(null);
		hours_panel3_1_1.setBackground(Color.WHITE);
		hours_panel3_1_1.setBounds(231, 264, 90, 30);
		price_panel.add(hours_panel3_1_1);
		
		JLabel hours_text1_2_1_1 = new JLabel("90,000\uC6D0");
		hours_text1_2_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1_2_1_1.setBounds(16, 6, 60, 20);
		hours_panel3_1_1.add(hours_text1_2_1_1);
		
		JPanel hours_panel3_4 = new JPanel();
		hours_panel3_4.setLayout(null);
		hours_panel3_4.setBackground(Color.WHITE);
		hours_panel3_4.setBounds(231, 231, 90, 30);
		price_panel.add(hours_panel3_4);
		
		JLabel hours_text1_2_4 = new JLabel("2\uC8FC");
		hours_text1_2_4.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1_2_4.setBounds(32, 6, 22, 20);
		hours_panel3_4.add(hours_text1_2_4);
		
		JPanel hours_panel4_2 = new JPanel();
		hours_panel4_2.setLayout(null);
		hours_panel4_2.setBackground(Color.WHITE);
		hours_panel4_2.setBounds(323, 231, 90, 30);
		price_panel.add(hours_panel4_2);
		
		JLabel hours_text1_3_2 = new JLabel("4\uC8FC");
		hours_text1_3_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1_3_2.setBounds(33, 6, 22, 20);
		hours_panel4_2.add(hours_text1_3_2);
		
		JPanel hours_panel4_1_1 = new JPanel();
		hours_panel4_1_1.setLayout(null);
		hours_panel4_1_1.setBackground(Color.WHITE);
		hours_panel4_1_1.setBounds(323, 264, 90, 30);
		price_panel.add(hours_panel4_1_1);
		
		JLabel hours_text1_3_1_1 = new JLabel("150,000\uC6D0");
		hours_text1_3_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1_3_1_1.setBounds(11, 6, 72, 20);
		hours_panel4_1_1.add(hours_text1_3_1_1);
		
		JPanel hourtitle_panel_1_1 = new JPanel();
		hourtitle_panel_1_1.setLayout(null);
		hourtitle_panel_1_1.setBorder(null);
		hourtitle_panel_1_1.setBackground(new Color(216, 216, 216));
		hourtitle_panel_1_1.setBounds(34, 321, 124, 35);
		price_panel.add(hourtitle_panel_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("\uC815\uC561\uAD8C");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel_2_1_1.setBounds(41, 7, 43, 25);
		hourtitle_panel_1_1.add(lblNewLabel_2_1_1);
		
		JPanel hours_panel1_4_1 = new JPanel();
		hours_panel1_4_1.setLayout(null);
		hours_panel1_4_1.setBackground(Color.WHITE);
		hours_panel1_4_1.setBounds(49, 377, 90, 30);
		price_panel.add(hours_panel1_4_1);
		
		JLabel hours_text1_7_1 = new JLabel("50\uC2DC\uAC04");
		hours_text1_7_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1_7_1.setBounds(21, 6, 50, 20);
		hours_panel1_4_1.add(hours_text1_7_1);
		
		JPanel hours_panel1_1_1_1 = new JPanel();
		hours_panel1_1_1_1.setLayout(null);
		hours_panel1_1_1_1.setBackground(Color.WHITE);
		hours_panel1_1_1_1.setBounds(49, 410, 90, 30);
		price_panel.add(hours_panel1_1_1_1);
		
		JLabel hours_text1_4_1_1 = new JLabel("70,000\uC6D0");
		hours_text1_4_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1_4_1_1.setBounds(15, 6, 69, 20);
		hours_panel1_1_1_1.add(hours_text1_4_1_1);
		
		JPanel hours_panel2_4_1 = new JPanel();
		hours_panel2_4_1.setLayout(null);
		hours_panel2_4_1.setBackground(Color.WHITE);
		hours_panel2_4_1.setBounds(140, 377, 90, 30);
		price_panel.add(hours_panel2_4_1);
		
		JLabel hours_text1_1_4_1 = new JLabel("100\uC2DC\uAC04");
		hours_text1_1_4_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1_1_4_1.setBounds(18, 6, 53, 20);
		hours_panel2_4_1.add(hours_text1_1_4_1);
		
		JPanel hours_panel2_1_1_1 = new JPanel();
		hours_panel2_1_1_1.setLayout(null);
		hours_panel2_1_1_1.setBackground(Color.WHITE);
		hours_panel2_1_1_1.setBounds(140, 410, 90, 30);
		price_panel.add(hours_panel2_1_1_1);
		
		JLabel hours_text1_1_1_1_1 = new JLabel("120,000\uC6D0");
		hours_text1_1_1_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1_1_1_1_1.setBounds(6, 6, 78, 20);
		hours_panel2_1_1_1.add(hours_text1_1_1_1_1);
		
		JPanel hours_panel3_4_1 = new JPanel();
		hours_panel3_4_1.setLayout(null);
		hours_panel3_4_1.setBackground(Color.WHITE);
		hours_panel3_4_1.setBounds(231, 377, 90, 30);
		price_panel.add(hours_panel3_4_1);
		
		JLabel hours_text1_2_4_1 = new JLabel("150\uC2DC\uAC04");
		hours_text1_2_4_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1_2_4_1.setBounds(17, 6, 53, 20);
		hours_panel3_4_1.add(hours_text1_2_4_1);
		
		JPanel hours_panel3_1_1_1 = new JPanel();
		hours_panel3_1_1_1.setLayout(null);
		hours_panel3_1_1_1.setBackground(Color.WHITE);
		hours_panel3_1_1_1.setBounds(231, 410, 90, 30);
		price_panel.add(hours_panel3_1_1_1);
		
		JLabel hours_text1_2_1_1_1 = new JLabel("170,000\uC6D0");
		hours_text1_2_1_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1_2_1_1_1.setBounds(7, 6, 76, 20);
		hours_panel3_1_1_1.add(hours_text1_2_1_1_1);
		
		JPanel hourtitle_panel_1_1_1 = new JPanel();
		hourtitle_panel_1_1_1.setLayout(null);
		hourtitle_panel_1_1_1.setBorder(null);
		hourtitle_panel_1_1_1.setBackground(new Color(255, 183, 183));
		hourtitle_panel_1_1_1.setBounds(34, 463, 124, 35);
		price_panel.add(hourtitle_panel_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("\uB8F8 \uC885\uB958");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel_2_1_1_1.setBounds(38, 7, 53, 25);
		hourtitle_panel_1_1_1.add(lblNewLabel_2_1_1_1);
		
		JPanel hours_panel1_4_1_1 = new JPanel();
		hours_panel1_4_1_1.setLayout(null);
		hours_panel1_4_1_1.setBackground(Color.WHITE);
		hours_panel1_4_1_1.setBounds(49, 519, 133, 45);
		price_panel.add(hours_panel1_4_1_1);
		
		JLabel hours_text1_7_1_1 = new JLabel("\uAC1C\uC778\uB8F8(1\uC778) 2\uC2DC\uAC04");
		hours_text1_7_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1_7_1_1.setBounds(6, 6, 121, 39);
		hours_panel1_4_1_1.add(hours_text1_7_1_1);
		
		JPanel hours_panel1_1_1_1_1 = new JPanel();
		hours_panel1_1_1_1_1.setLayout(null);
		hours_panel1_1_1_1_1.setBackground(Color.WHITE);
		hours_panel1_1_1_1_1.setBounds(49, 567, 133, 30);
		price_panel.add(hours_panel1_1_1_1_1);
		
		JLabel hours_text1_4_1_1_1 = new JLabel("5,000\uC6D0");
		hours_text1_4_1_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1_4_1_1_1.setBounds(44, 6, 51, 20);
		hours_panel1_1_1_1_1.add(hours_text1_4_1_1_1);
		
		JPanel hours_panel1_4_1_1_1 = new JPanel();
		hours_panel1_4_1_1_1.setLayout(null);
		hours_panel1_4_1_1_1.setBackground(Color.WHITE);
		hours_panel1_4_1_1_1.setBounds(183, 519, 161, 45);
		price_panel.add(hours_panel1_4_1_1_1);
		
		JLabel hours_text1_7_1_1_1 = new JLabel("\uD68C\uC758\uB8F8(4-6\uC778) 5\uC2DC\uAC04");
		hours_text1_7_1_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1_7_1_1_1.setBounds(9, 6, 143, 39);
		hours_panel1_4_1_1_1.add(hours_text1_7_1_1_1);
		
		JPanel hours_panel1_1_1_1_1_1 = new JPanel();
		hours_panel1_1_1_1_1_1.setLayout(null);
		hours_panel1_1_1_1_1_1.setBackground(Color.WHITE);
		hours_panel1_1_1_1_1_1.setBounds(183, 567, 161, 30);
		price_panel.add(hours_panel1_1_1_1_1_1);
		
		JLabel hours_text1_4_1_1_1_1 = new JLabel("6,000\uC6D0");
		hours_text1_4_1_1_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hours_text1_4_1_1_1_1.setBounds(53, 6, 51, 20);
		hours_panel1_1_1_1_1_1.add(hours_text1_4_1_1_1_1);
		
		JPanel pricetitle_panel_1 = new JPanel();
		pricetitle_panel_1.setLayout(null);
		pricetitle_panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY, 30, true));
		pricetitle_panel_1.setBounds(779, 62, 189, 39);
		panel.add(pricetitle_panel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uB8F8 \uC548\uB0B4");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(62, 7, 74, 25);
		pricetitle_panel_1.add(lblNewLabel_1_1);
		
		JPanel price_panel_1 = new JPanel();
		price_panel_1.setBackground(Color.WHITE);
		price_panel_1.setLayout(null);
		price_panel_1.setBorder(new LineBorder(new Color(233, 233, 233), 3, true));
		price_panel_1.setBounds(491, 79, 760, 657);
		panel.add(price_panel_1);
		
		JLabel maintitle = new JLabel("\uBA54\uC778\uC2E4 (\uC624\uD508)");
		maintitle.setFont(new Font("±¼¸²", Font.BOLD, 25));
		maintitle.setBounds(31, 69, 174, 47);
		price_panel_1.add(maintitle);
		
		JLabel maintitle_1 = new JLabel("\uC624\uD508\uB418\uC5B4\uC788\uC5B4 \uC790\uC720\uB86D\uAC8C \uD65C\uC6A9 \uAC00\uB2A5\uD55C \uAE30\uBCF8\uC801\uC778 \uB8F8\uC785\uB2C8\uB2E4.");
		maintitle_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		maintitle_1.setBounds(31, 108, 361, 47);
		price_panel_1.add(maintitle_1);
		
		/*ÆÐ³Î¿¡ ±×¸²À» ¿Ã·ÁÁÖ´Â Å¬·¡½º
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
			} */
		
		
		JPanel main_img_panel = new JPanel();
		main_img_panel.setBounds(411, 42, 310, 180);
		
		price_panel_1.add(main_img_panel);
		main_img_panel.setLayout(null);
		
		JPanel main_img_panel_1 = new JPanel();
		main_img_panel_1.setLayout(null);
		main_img_panel_1.setBounds(31, 235, 310, 180);
		price_panel_1.add(main_img_panel_1);
		
		JLabel maintitle_2 = new JLabel("\uAC1C\uC778\uC2E4");
		maintitle_2.setFont(new Font("±¼¸²", Font.BOLD, 25));
		maintitle_2.setBounds(389, 281, 174, 47);
		price_panel_1.add(maintitle_2);
		
		JLabel maintitle_1_1 = new JLabel("1\uC778\uC2E4\uB85C \uC774\uB8E8\uC5B4\uC838\uC788\uC5B4 \uC870\uC6A9\uD558\uACE0 \uD504\uB77C\uC774\uBE57\uD55C \uB8F8\uC785\uB2C8\uB2E4.");
		maintitle_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		maintitle_1_1.setBounds(389, 320, 361, 47);
		price_panel_1.add(maintitle_1_1);
		
		JLabel maintitle_3 = new JLabel("\uD68C\uC758\uC2E4");
		maintitle_3.setFont(new Font("±¼¸²", Font.BOLD, 25));
		maintitle_3.setBounds(31, 461, 174, 47);
		price_panel_1.add(maintitle_3);
		
		JLabel maintitle_1_2 = new JLabel("4~6\uC778\uC2E4\uB85C \uC774\uB8E8\uC5B4\uC838\uC788\uB294 \uB2E4\uC778\uC6D0 \uB8F8\uC785\uB2C8\uB2E4.");
		maintitle_1_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		maintitle_1_2.setBounds(31, 500, 361, 47);
		price_panel_1.add(maintitle_1_2);
		
		JPanel main_img_panel_2 = new JPanel();
		main_img_panel_2.setLayout(null);
		main_img_panel_2.setBounds(411, 434, 310, 180);
		price_panel_1.add(main_img_panel_2);
	}
	
		
		
	/*	ImagePanel mainroom = new ImagePanel(new ImageIcon("./img/mainroom.png").getImage()); //ÀÌ¹ÌÁö ³Ö±â
		mainroom.setBounds(0, 90, 501, 379);
        getContentPane().add(mainroom);
        mainroom.setLayout(null); */
        
        
        

	

public static void main(String[] args) {
	/*EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				PricePage frame = new PricePage();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});*/
	}
}
