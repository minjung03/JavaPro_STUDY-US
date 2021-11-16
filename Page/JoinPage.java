package Page;

import java.awt.BorderLayout;
import java.awt.Color;
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

public class JoinPage extends JFrame {
	
	private JPanel contentPane, panel;
	private JTextField field_id,  field_pass, field_name;
	private JLabel textID, textPASS, textNAME;
	private JButton btn_Join;
	
	JoinPage(){
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
		
		field_id = new JTextField();
		field_id.setBackground(SystemColor.inactiveCaptionBorder);
		field_id.setBounds(242, 376, 357, 47);
		panel.add(field_id);
		field_id.setColumns(10);
		
		field_pass = new JTextField();
		field_pass.setBackground(SystemColor.inactiveCaptionBorder);
		field_pass.setColumns(10);
		field_pass.setBounds(242, 446, 357, 47);
		panel.add(field_pass);
		
		field_name = new JTextField();
		field_name.setBackground(SystemColor.inactiveCaptionBorder);
		field_name.setHorizontalAlignment(SwingConstants.LEFT);
		field_name.setColumns(10);
		field_name.setBounds(242, 512, 357, 47);
		panel.add(field_name);
		
		JLabel textID = new JLabel("ID");
		textID.setFont(new Font("굴림", Font.PLAIN, 30));
		textID.setBounds(189, 376, 30, 47);
		panel.add(textID);
		
		JLabel textPASS = new JLabel("PASSWORD");
		textPASS.setFont(new Font("굴림", Font.PLAIN, 30));
		textPASS.setBounds(56, 446, 195, 47);
		panel.add(textPASS);
		
		textNAME = new JLabel("NAME");
		textNAME.setFont(new Font("굴림", Font.PLAIN, 30));
		textNAME.setBounds(134, 514, 105, 47);
		panel.add(textNAME);
		
		btn_Join = new JButton("가입하기");
		btn_Join.setBounds(502, 596, 97, 23);
		panel.add(btn_Join);
		btn_Join.addActionListener(new Listener(this));
		
	}
	class Listener implements ActionListener{
		JFrame frame;
		public Listener(JFrame f) {
			frame = f;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(e.getActionCommand());
			
			String id = field_id.getText();
			System.out.println(id);
			
			String pass = field_pass.getText();
			System.out.println(pass);
			
			String name = field_name.getText();
			System.out.println(name);
			
			JOptionPane.showMessageDialog(frame, id+" "+pass+" "+name);
		}
	}
	
	public static void main(String[] args) {
		new JoinPage();
	}

}
