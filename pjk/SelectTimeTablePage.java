package pjk;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelectTimeTablePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectTimeTablePage frame = new SelectTimeTablePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SelectTimeTablePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 800);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
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
		
		JPanel hourstitle_panel = new JPanel();
		hourstitle_panel.setLayout(null);
		hourstitle_panel.setBorder(null);
		hourstitle_panel.setBackground(new Color(216, 216, 216));
		hourstitle_panel.setBounds(173, 74, 124, 35);
		timetable_panel.add(hourstitle_panel);
		
		JLabel hourstitle_text = new JLabel("\uB2F9\uC77C \uC774\uC6A9\uAD8C");
		hourstitle_text.setForeground(Color.WHITE);
		hourstitle_text.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		hourstitle_text.setBounds(23, 7, 93, 25);
		hourstitle_panel.add(hourstitle_text);
		
		JPanel passtitle_panel = new JPanel();
		passtitle_panel.setLayout(null);
		passtitle_panel.setBorder(null);
		passtitle_panel.setBackground(new Color(216, 216, 216));
		passtitle_panel.setBounds(409, 74, 124, 35);
		timetable_panel.add(passtitle_panel);
		
		JLabel passtitle_text = new JLabel("\uC815\uC561\uAD8C");
		passtitle_text.setForeground(Color.WHITE);
		passtitle_text.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		passtitle_text.setBounds(40, 7, 53, 25);
		passtitle_panel.add(passtitle_text);
		
		JPanel periodtitle_panel = new JPanel();
		periodtitle_panel.setLayout(null);
		periodtitle_panel.setBorder(null);
		periodtitle_panel.setBackground(new Color(216, 216, 216));
		periodtitle_panel.setBounds(650, 74, 124, 35);
		timetable_panel.add(periodtitle_panel);
		
		JLabel periodtitle_text = new JLabel("\uAE30\uAC04\uC81C");
		periodtitle_text.setForeground(Color.WHITE);
		periodtitle_text.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		periodtitle_text.setBounds(40, 7, 43, 25);
		periodtitle_panel.add(periodtitle_text);
		
		JPanel othertitle_panel = new JPanel();
		othertitle_panel.setLayout(null);
		othertitle_panel.setBorder(null);
		othertitle_panel.setBackground(new Color(216, 216, 216));
		othertitle_panel.setBounds(861, 74, 124, 35);
		timetable_panel.add(othertitle_panel);
		
		JLabel othertitle_text = new JLabel("\uAE30\uD0C0");
		othertitle_text.setForeground(Color.WHITE);
		othertitle_text.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		othertitle_text.setBounds(50, 7, 29, 25);
		othertitle_panel.add(othertitle_text);
		
		JCheckBox hours_chckbx2 = new JCheckBox("2\uC2DC\uAC04");
		hours_chckbx2.setBackground(Color.WHITE);
		hours_chckbx2.setFont(new Font("±¼¸²", Font.BOLD, 20));
		hours_chckbx2.setBounds(190, 180, 86, 23);
		timetable_panel.add(hours_chckbx2);
		
		JCheckBox hours_chckbx4 = new JCheckBox("4\uC2DC\uAC04");
		hours_chckbx4.setFont(new Font("±¼¸²", Font.BOLD, 20));
		hours_chckbx4.setBackground(Color.WHITE);
		hours_chckbx4.setBounds(190, 283, 86, 23);
		timetable_panel.add(hours_chckbx4);
		
		JCheckBox hours_chckbx6 = new JCheckBox("6\uC2DC\uAC04");
		hours_chckbx6.setFont(new Font("±¼¸²", Font.BOLD, 20));
		hours_chckbx6.setBackground(Color.WHITE);
		hours_chckbx6.setBounds(190, 387, 86, 23);
		timetable_panel.add(hours_chckbx6);
		
		JCheckBox hours_chckbx8 = new JCheckBox("8\uC2DC\uAC04");
		hours_chckbx8.setFont(new Font("±¼¸²", Font.BOLD, 20));
		hours_chckbx8.setBackground(Color.WHITE);
		hours_chckbx8.setBounds(190, 500, 86, 23);
		timetable_panel.add(hours_chckbx8);
		
		JCheckBox pass_chckbx50 = new JCheckBox("50\uC2DC\uAC04");
		pass_chckbx50.setFont(new Font("±¼¸²", Font.BOLD, 20));
		pass_chckbx50.setBackground(Color.WHITE);
		pass_chckbx50.setBounds(418, 180, 109, 23);
		timetable_panel.add(pass_chckbx50);
		
		JCheckBox pass_chckbx100 = new JCheckBox("100\uC2DC\uAC04");
		pass_chckbx100.setFont(new Font("±¼¸²", Font.BOLD, 20));
		pass_chckbx100.setBackground(Color.WHITE);
		pass_chckbx100.setBounds(418, 283, 109, 23);
		timetable_panel.add(pass_chckbx100);
		
		JCheckBox pass_chckbx150 = new JCheckBox("150\uC2DC\uAC04");
		pass_chckbx150.setFont(new Font("±¼¸²", Font.BOLD, 20));
		pass_chckbx150.setBackground(Color.WHITE);
		pass_chckbx150.setBounds(418, 387, 109, 23);
		timetable_panel.add(pass_chckbx150);
		
		JCheckBox period_chckbx1d = new JCheckBox("1\uC77C");
		period_chckbx1d.setFont(new Font("±¼¸²", Font.BOLD, 20));
		period_chckbx1d.setBackground(Color.WHITE);
		period_chckbx1d.setBounds(669, 180, 86, 23);
		timetable_panel.add(period_chckbx1d);
		
		JCheckBox period_chckbx1w = new JCheckBox("1\uC8FC");
		period_chckbx1w.setFont(new Font("±¼¸²", Font.BOLD, 20));
		period_chckbx1w.setBackground(Color.WHITE);
		period_chckbx1w.setBounds(669, 283, 86, 23);
		timetable_panel.add(period_chckbx1w);
		
		JCheckBox period_chckbx4w = new JCheckBox("4\uC8FC");
		period_chckbx4w.setFont(new Font("±¼¸²", Font.BOLD, 20));
		period_chckbx4w.setBackground(Color.WHITE);
		period_chckbx4w.setBounds(670, 504, 86, 23);
		timetable_panel.add(period_chckbx4w);
		
		JCheckBox period_chckbx2w = new JCheckBox("2\uC8FC");
		period_chckbx2w.setFont(new Font("±¼¸²", Font.BOLD, 20));
		period_chckbx2w.setBackground(Color.WHITE);
		period_chckbx2w.setBounds(667, 387, 86, 23);
		timetable_panel.add(period_chckbx2w);
		
		JCheckBox other_chckbxpersonal = new JCheckBox("\uAC1C\uC778\uB8F8");
		other_chckbxpersonal.setFont(new Font("±¼¸²", Font.BOLD, 20));
		other_chckbxpersonal.setBackground(Color.WHITE);
		other_chckbxpersonal.setBounds(883, 180, 102, 23);
		timetable_panel.add(other_chckbxpersonal);
		
		JCheckBox other_chckbxmeeting = new JCheckBox("\uD68C\uC758\uB8F8");
		other_chckbxmeeting.setFont(new Font("±¼¸²", Font.BOLD, 20));
		other_chckbxmeeting.setBackground(Color.WHITE);
		other_chckbxmeeting.setBounds(883, 283, 102, 23);
		timetable_panel.add(other_chckbxmeeting);
		
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
	}
}
