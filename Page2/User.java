package Page2;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class User extends JFrame{
	
	private String name = "";
	private String id = "";
	private String pass = "";
	private String time_chk = "";
	private String selected_time = "";
	private String selected_seat = "";

	
	public User(String name, String id, String pass)
		throws HeadlessException {
		super();
		this.name = name;
		this.id = id;
		this.pass = pass;
	}
	
	public User() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getTime_chk() {
		return time_chk;
	}
	public void setTime_chk(String time_chk) {
		this.time_chk = time_chk;
	}
	public String getSelected_time() {
		return selected_time;
	}
	public void setSelected_time(String selected_time) {
		this.selected_time = selected_time;
	}
	public String getSelected_seat() {
		return selected_seat;
	}
	public void setSelected_seat(String selected_seat) {
		this.selected_seat = selected_seat;
	}
	
}